import rendition.*
import util.boundary.*
import com.indoorvivants.gnome.gir_schema.*

def renderConstructorStub(f: Constructor, msg: FluentErr)(using
    RenderingContext,
    NamingPolicy
) =
  renderComment(f.doc)
  line(s"@annotation.compileTimeOnly(\"${msg.getMessage}\")")
  line(s"private def ${namingPolicy.makeConstructorName(f.name)}() = ???")
  emptyLine()
