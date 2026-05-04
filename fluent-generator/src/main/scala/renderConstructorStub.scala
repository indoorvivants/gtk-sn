import rendition.*
import util.boundary.*
import com.indoorvivants.gnome.gir_schema.*

def renderConstructorStub(f: Constructor, msg: FluentErr)(using RenderingContext) =
  scribe.warn(s"Failed to render constructor ${f.name}: ${msg.message}")
  renderComment(f.doc)
  line(s"@annotation.compileTimeOnly(\"${msg.message}\")")
  line(s"def ${escape(f.name)}() = ???")
  emptyLine()

