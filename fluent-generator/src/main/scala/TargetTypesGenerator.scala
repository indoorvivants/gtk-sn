import scala.meta.{*, given}
import java.nio.file.Path
import java.nio.file.Files
import rendition.*

class TargetTypesGenerator(functionPaths: Seq[Path]):

  def run(outputFile: Path) =
    val parser = dialects.Scala3
    println(outputFile)
    val b = Map.newBuilder[String, (String, Array[(String, String)])]

    functionPaths
      .map(Input.File(_))
      .map(f => parser(f).parse[Source].get)
      .foreach: a =>
        val funcs = analyse(a)
        funcs.foreach: func =>
          b += func.name -> (func.ret, func.params)

    import upickle.default.*
    Files.createDirectories(outputFile.getParent)

    os.write.over(os.Path(outputFile), write(b.result(), indent = 4))
  end run

  case class Function(
      name: String,
      ret: String,
      params: Array[(String, String)]
  )

  def analyse(s: Tree) =
    val funcs = List.newBuilder[Function]

    s.traverse:
      case Pkg(ref, _) =>
        println(ref)
      case f: Defn.Def =>
        val name = f.name.value
        val params = f.paramss.head
        funcs += Function(
          name,
          f.decltpe.map(_.toString).get,
          params.map(p => (p.name.value, p.decltpe.map(_.toString).get)).toArray
        )
    funcs.result()
  end analyse
end TargetTypesGenerator
