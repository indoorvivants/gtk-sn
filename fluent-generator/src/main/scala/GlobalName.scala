import cats.syntax.all.*
import com.indoorvivants.gnome.gir_schema.*
import rendition.*
import scalaxb.fromXML
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import scala.jdk.CollectionConverters.*
import scala.util.boundary
import scala.xml.XML
import boundary.break
import scala.annotation.tailrec
import scala.util.Try

case class GlobalName(
    fluent: String,
    namespace: String,
    short: String,
    effects: List[Effect],
    tpe: NameType
):
  override def toString: String = s"GlobalName[$namespace/$fluent/$tpe]"

object GlobalName:
  def internal(fluent: String, short: String, namespace: String, tpe: NameType)(
      using NamingPolicy
  ) =
    GlobalName(
      fluent,
      namespace,
      short,
      List(
        Effect.RequiresImport(
          summon[NamingPolicy].namespaceToInternalPackage(namespace),
          short
        )
      ),
      tpe
    )
  def fluent(short: String, namespace: String, tpe: NameType)(using
      NamingPolicy
  ) =
    GlobalName(
      short,
      namespace,
      short,
      List(
        Effect.RequiresImport(
          summon[NamingPolicy].namespaceToFluentPackage(namespace),
          short
        )
      ),
      tpe
    )
end GlobalName
