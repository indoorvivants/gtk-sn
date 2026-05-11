import rendition.*
import com.indoorvivants.gnome.gir_schema.*

def renderComment(doc: Doc)(using RenderingContext): Unit =
  val s = doc.mixed.map(_.getClass).toString

  val strings = doc.mixed.collect:
    case dr if dr.key.isEmpty && dr.namespace.isEmpty =>
      dr.value.asInstanceOf[String]

  if strings.nonEmpty then
    line("/**")

    val lines = strings.mkString("\n").linesIterator ++ Iterator(
      "",
      "NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA"
    )
    lines.foreach { l =>
      line(" *  " + l.replace("*/", "").replace("/*", "")) // TAKE THAT
    }
    line(" */")
  end if
end renderComment

def renderComment(doc: Option[Doc])(using RenderingContext): Unit =
  doc.foreach(renderComment)
