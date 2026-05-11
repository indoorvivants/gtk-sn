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

case class NamingPolicy(
    namespaceToPackage: String => String
):
  def namespaceToFluentPackage(name: String) =
    namespaceToPackage(name) + ".fluent"
  def namespaceToInternalPackage(name: String) =
    namespaceToPackage(name) + ".internal"

  def fluentName(namespace: String, name: String) =
    namespaceToFluentPackage(namespace) + "." + name

  def internalName(namespace: String, name: String) =
    namespaceToInternalPackage(namespace) + "." + name
end NamingPolicy

object NamingPolicy:
  inline def apply()(using np: NamingPolicy): NamingPolicy = np
