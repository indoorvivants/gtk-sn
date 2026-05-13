import rendition.*
import com.indoorvivants.gnome.gir_schema.*

def renderComment(strings: Seq[String] | String)(using RenderingContext): Unit =
  val lines = strings match
    case s: String        => s.linesIterator.toSeq
    case seq: Seq[String] => seq.iterator.flatMap(_.linesIterator).toSeq

  if lines.nonEmpty then
    line("/**")

    lines.foreach { l =>
      line(" *  " + l.replace("*/", "").replace("/*", "")) // TAKE THAT
    }
    line(" */")
end renderComment

def renderComment(doc: Doc)(using RenderingContext): Unit =
  val s = doc.mixed.map(_.getClass).toString

  val strings =
    doc.mixed
      .collect:
        case dr if dr.key.isEmpty && dr.namespace.isEmpty =>
          dr.value.asInstanceOf[String]
      .flatMap(s => Seq(s, ""))

  if strings.nonEmpty then
    renderComment(
      strings ++ Seq(
        " ",
        " ",
        "NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA"
      )
    )
  end if
end renderComment

def renderComment(doc: Option[Doc])(using RenderingContext): Unit =
  doc.foreach(renderComment)
