import cats.syntax.all.*
import com.indoorvivants.gnome.gir_schema.*
import rendition.*
import scalaxb.fromXML

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import scala.jdk.CollectionConverters.*
import scala.util.boundary, boundary.*
import scala.xml.XML

import scala.annotation.tailrec
import scribe.LogFeature
import scribe.LogRecord
import decline_derive.*

enum CLI derives CommandApplication:
  case Fluent(
      @Name("gir-files")
      @Help("Location of GIR files")
      girFiles: Path,
      @Name("out")
      @Help("Where to output generated files")
      out: Path,
      @Name("module")
      @Help("Module to render (e.g. gdkpixbuf-2.0)")
      module: String,
      @Name("target-types")
      @Help("Location of JSON file with target types")
      targetTypesLocation: Option[Path],
      @Name("dump-files-list")
      @Help("Dump list of generated files into some location")
      dumpFileList: Option[Path]
  )
  @Name("target-types")
  case TargetTypes(
      @Positional("function-file")
      functions: List[Path],
      out: Path
  )
end CLI

@main def fluentGenerator(args: String*) =
  CommandApplication.parseOrExit[CLI](args) match
    case CLI.TargetTypes(functions, out) =>
      TargetTypesGenerator(functions).run(out)
    case value: CLI.Fluent =>
      val root = os.Path(value.girFiles.toAbsolutePath())
      val target = os.Path(value.out.toAbsolutePath())
      val includeResolver = IncludeResolver(root.toNIO)
      val reader = Reader(includeResolver)
      val targetTypes = value.targetTypesLocation
        .map(TargetTypes.fromFile)
        .getOrElse(TargetTypes.fromResources())

      val repository = reader(value.module)
      val policy = NamingPolicy(
        namespaceToPackage = nm =>
          nm.toLowerCase match
            case "adw" => s"sn.gnome.adwaita"
            case "gtk" => s"sn.gnome.gtk4"
            case "gdk" => s"sn.gnome.gdk4"
            case "gsk" => s"sn.gnome.gsk4"
            case other => s"sn.gnome.$other"
      )

      val streams = RenderingStreams()
      val globalKnowledge =
        GlobalKnowledge(reader, repository, policy, targetTypes)

      renderNamespace(
        r = streams,
        namespace = repository.namespace.get,
        global = globalKnowledge,
        policy = policy
      )

      val nonEmptyFiles = List.newBuilder[os.Path]

      val createTarget =
        var created = false
        () =>
          if !created then
            os.makeDir.all(target)
            created = true

      streams
        .renderMapping()
        .foreach: (relative, contents) =>
          val filePath = target / relative
          if contents.trim.nonEmpty then
            scribe.debug(s"Rendering ${relative}")
            createTarget()
            os.write.over(filePath, contents)
            nonEmptyFiles += filePath
          else scribe.warn(s"Filepath $filePath was empty, not writing to disk")

      value.dumpFileList.foreach: path =>
        os.write.over(
          os.Path(path),
          nonEmptyFiles
            .result()
            .map(_.toNIO.toString)
            .mkString(System.lineSeparator()),
          createFolders = true
        )
        scribe.info(s"List of rendered files was dumped into `$path`")
  end match
end fluentGenerator

def camelify(name: String, sep: Char = '_') =
  val els = name.split(sep).map(_.capitalize)
  els(0) = els(0).toLowerCase()
  els.mkString

def makeSignalName(name: String) =
  "on" + camelify(name, '-').capitalize

def context(args: (String, String)*) =
  args.map(_ + "=" + _).mkString(", ")
