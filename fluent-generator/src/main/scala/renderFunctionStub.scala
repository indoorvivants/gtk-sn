import rendition.*
import util.boundary.*
import com.indoorvivants.gnome.gir_schema.*

def renderFunctionStub(f: FunctionType, msg: FluentErr)(using RenderingContext) =
  scribe.warn(s"Failed to render function ${f.name} (${f.identifier}): ${msg.getMessage}")
  renderComment(f.doc)
  line(s"@annotation.compileTimeOnly(\"${msg.getMessage}\")")
  line(s"private def ${escape(camelify(f.name))}() = ???")
  emptyLine()

