import rendition.*
import util.boundary.*
import com.indoorvivants.gnome.gir_schema.*

def renderFunctionStub(f: FunctionType, msg: FluentErr)(using RenderingContext) =
  scribe.warn(s"Failed to render function ${f.name}: ${msg.message}")
  renderComment(f.doc)
  line(s"@annotation.compileTimeOnly(\"${msg.message}\")")
  line(s"def ${escape(camelify(f.name))}() = ???")
  emptyLine()

