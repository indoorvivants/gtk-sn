import rendition.*
import util.boundary.*
import com.indoorvivants.gnome.gir_schema.*

def renderConstantStub(f: AugmentedConstant, msg: FluentErr)(using RenderingContext) =
  scribe.warn(s"Failed to render constnat ${f.name}: ${msg.getMessage}")
  renderComment(f.doc)
  line(s"@annotation.compileTimeOnly(\"${msg.getMessage}\")")
  line(s"private def ${escape(f.name)}() = ???")
  emptyLine()

