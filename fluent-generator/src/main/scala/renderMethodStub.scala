import com.indoorvivants.gnome.gir_schema.*
import rendition.*

import scala.util.boundary, boundary.*

def renderMethodStub(f: Method, msg: FluentErr)(using RenderingContext) =
  scribe.warn(s"Failed to render function ${f.name}: ${msg.getMessage}")
  renderComment(f.doc)
  line(s"@annotation.compileTimeOnly(\"${msg.getMessage}\")")
  line(s"private def ${camelify(f.name)}__ = ???")
  emptyLine()

