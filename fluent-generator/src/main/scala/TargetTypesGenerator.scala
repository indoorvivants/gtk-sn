import scala.meta.{*, given}
import java.nio.file.Path
import java.nio.file.Files
import rendition.*
import scala.jdk.CollectionConverters.IteratorHasAsScala

import TargetTypes.*

case class TargetTypesJson(
    functions: Seq[Function], // Map[String, (String, Array[(String, String)])],
    structs: Seq[Struct]
) derives upickle.default.ReadWriter

class TargetTypesGenerator(functionPaths: Seq[Path], structsFolders: Seq[Path]):

  def run(outputFile: Path) =
    val parser = dialects.Scala3
    println(outputFile)
    // val b = Map.newBuilder[String, (String, Array[(String, String)])]

    val funcs = Seq.newBuilder[Function]
    val structs = Seq.newBuilder[Struct]

    functionPaths
      .map(Input.File(_))
      .map(f => parser(f).parse[Source].get)
      .foreach: a =>
        funcs ++= analyseFunctions(a)

    val structFiles = structsFolders.toIterator
        .flatMap: path =>
          Files.list(path).iterator().asScala
        .map(Input.File(_))
        .map(f => parser(f).parse[Source].get)
        .foreach: a =>
          structs ++= analyseStructs(a)

    import upickle.default.*
    Files.createDirectories(outputFile.getParent)

    val result = TargetTypesJson(functions = funcs.result(), structs = structs.result())

    os.write.over(os.Path(outputFile), write(result, indent = 4))
  end run

  def analyseStructs(s: Tree) =
    val structs = List.newBuilder[Struct]

    def buildStruct(name: String, t: Defn.Object): Struct =
      val fields = Map.newBuilder[String, String]
      t.traverse:
        case f: Defn.ExtensionGroup =>
          f.body.traverse:
            case d: Defn.Def if !d.name.value.endsWith("_=") =>
              d.decltpe.foreach: tpe =>
                fields += d.name.value -> tpe.toString
      Struct(name, fields.result())

    s.traverse:
      case Pkg(ref, _) =>
        // println(ref)
      case f: Defn.Object if !f.mods.exists(_.isInstanceOf[Mod.Private]) =>
        val name = f.name.value
        structs += buildStruct(name, f)
    structs.result()
  end analyseStructs

  def analyseFunctions(s: Tree) =
    val funcs = List.newBuilder[Function]

    s.traverse:
      case Pkg(ref, _) =>
        // println(ref)
      case f: Defn.Def =>
        val name = f.name.value
        val params = f.paramss.head
        funcs += Function(
          name,
          f.decltpe.map(_.toString).get,
          params.map(p => (p.name.value, p.decltpe.map(_.toString).get)).toArray
        )
    funcs.result()
  end analyseFunctions
end TargetTypesGenerator

