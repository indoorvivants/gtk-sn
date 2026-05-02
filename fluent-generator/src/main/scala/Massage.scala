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

enum Massage:
  case Apply(what: String)
  case Field(what: String)
  case Cast(toWhat: String)
  case InferredCast
  case New(cls: String)
  case Compare(reference: String, ifTrue: String, ifFalse: String)
  case Splat(what: String)
  case Map(name: String, cast: Option[String], rest: Seq[Massage])

  def render(around: String): String =
    this match
      case Map(name, cast, rest) =>
        val folded = rest.foldLeft(name): (cur, m) =>
          m.render(cur)
        s"$around.map${cast.map(t => s"[$t]").getOrElse("")}($name => $folded)"
      case Apply(what)           => s"$what($around)"
      case Field(what)           => s"$around.$what"
      case Cast(what)            => s"$around.asInstanceOf[$what]"
      case InferredCast          => s"$around.asInstanceOf"
      case New(what)             => s"new $what($around)"
      case Compare(ref, tr, fls) => s"(if $around == $ref then $tr else $fls)"
      case Splat(what)           => s"$what*"
end Massage
