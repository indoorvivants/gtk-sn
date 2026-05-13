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

import NamingPolicy.*

case class NamingPolicy(
    namespaceToPackage: String => String
):
  def namespaceToFluentPackage(name: String) =
    namespaceToPackage(name)

  def namespaceToInternalPackage(name: String) =
    namespaceToPackage(name) + ".internal"

  def fluentName(namespace: String, name: String) =
    namespaceToFluentPackage(namespace) + "." + name

  def internalName(namespace: String, name: String) =
    namespaceToInternalPackage(namespace) + "." + name

  def makeSignalName(name: String) =
    "on" + camelify(name, '-').capitalize

  def makeConstructorName(n: String) =
    n match
      case "new"        => "apply"
      case s"new_$rest" =>
        escape(camelify(rest))
      case other =>
        escape(camelify(other))

end NamingPolicy

inline def namingPolicy(using np: NamingPolicy): NamingPolicy = np

object NamingPolicy:
  def camelify(name: String, sep: Char = '_') =
    val els = name.split(sep).map(_.capitalize)
    els(0) = els(0).toLowerCase()
    els.mkString
