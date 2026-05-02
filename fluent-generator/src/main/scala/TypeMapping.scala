import cats.syntax.all.*
import com.indoorvivants.gnome.gir_schema.*
import rendition.*
import scalaxb.fromXML
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import scala.jdk.CollectionConverters.*
import scala.util.boundary, boundary.*
import scala.xml.XML
import scala.annotation.tailrec
import scribe.LogFeature
import scribe.LogRecord

case class TypeMapping(
    scalaRepr: String,
    effects: List[Effect] = Nil,
    massageIntoUnsafe: List[Massage] = Nil,
    massageFromUnsafe: List[Massage] = Nil
):
  def intoUnsafeForm(ref: String) =
    massageIntoUnsafe.foldLeft(ref): (cur, m) =>
      m.render(cur)

  def fromUnsafeForm(ref: String) =
    massageFromUnsafe.foldLeft(ref): (cur, m) =>
      m.render(cur)

  def withMassageIntoUnsafe(m: Massage*) =
    copy(massageIntoUnsafe = massageIntoUnsafe ++ m)
  def withMassageFromUnsafe(m: Massage*) =
    copy(massageFromUnsafe = massageFromUnsafe ++ m)

  def withEffect(e: Effect*) = copy(effects = effects ++ e)
end TypeMapping

object TypeMapping:
  def apply(rer: String): TypeMapping = TypeMapping(rer, Nil, Nil, Nil)
  def optional(tm: TypeMapping, cast: Option[String] = None) =
    tm.copy(
      scalaRepr = s"Option[${tm.scalaRepr}]",
      massageIntoUnsafe = List(
        Massage.Map("o", cast, tm.massageIntoUnsafe),
        Massage.Field(
          s"getOrElse(null${cast.map(c => s".asInstanceOf[$c]").getOrElse("")})"
        )
      ) ++ Option.when(cast.isEmpty)(Massage.InferredCast).toList,
      massageFromUnsafe = Massage.Apply("Option") :: tm.massageFromUnsafe
    )
end TypeMapping
