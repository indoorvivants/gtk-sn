import rendition.*
import com.indoorvivants.gnome.gir_schema.*

def renderComment(doc: Doc)(using RenderingContext): Unit =
  val s = doc.mixed.map(_.getClass).toString

  val strings = doc.mixed.collect:
    case dr if dr.key.isEmpty && dr.namespace.isEmpty =>
      dr.value.asInstanceOf[String]

  line("/**")

  val lines = Iterator("COMMENT FOR THE ORIGINAL C DEFINITION\n") ++ strings.mkString("\n").linesIterator
  lines.foreach { l =>
    line(" *  " + l.replace("*/", "").replace("/*", "")) // TAKE THAT
  }
  line(" */")
end renderComment

def renderComment(doc: Option[Doc])(using RenderingContext): Unit =
  doc.foreach(renderComment)
