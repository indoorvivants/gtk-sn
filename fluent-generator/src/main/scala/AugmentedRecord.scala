import com.indoorvivants.gnome.gir_schema.*
import java.nio.file.Paths
import scala.xml.XML
import scalaxb.fromXML
import java.nio.file.Path
import java.nio.file.Files
import scala.jdk.CollectionConverters.*
import scala.reflect.ClassTag
import scalaxb.DataRecord
import scala.util.boundary.Label

case class AugmentedRecord(n: Record, namespace: AugmentedNamespace)
    extends ClassLike:
  export n.*
  override protected def options: Seq[DataRecord[Any]] = n.recordoption

  val cTypeName = n.attributes.get("@type").map(_.as[String])
  def cType(using Label[FluentErr]): String =
    cTypeName
      .getOrElse(n.typeu45name)
    // .getOrElse(raiseWith(_.ClassHasNoCType(n.name)))
end AugmentedRecord
