import rendition.*
import util.boundary.*
import com.indoorvivants.gnome.gir_schema.*

def renderSignalStub(f: AugmentedSignal, msg: FluentErr)(using
    RenderingContext,
    NamingPolicy
) =
  // scribe.warn(s"Failed to render signal ${f.name} : ${msg.getMessage}")
  renderComment(f.doc)
  line(s"@annotation.compileTimeOnly(\"${msg.getMessage}\")")
  line(s"private def ${namingPolicy.makeSignalName(f.name)} = ???")
  emptyLine()
