
import com.indoorvivants.gnome.gir_schema.*
import java.nio.file.Paths
import scala.xml.XML
import scalaxb.fromXML
import java.nio.file.Path
import java.nio.file.Files
import scala.jdk.CollectionConverters.*
import scala.reflect.ClassTag
import scalaxb.DataRecord

trait HasDataRecords:
  protected def options: Seq[DataRecord[Any]]
  def collect[T: scala.reflect.ClassTag] =
    val ct = summon[ClassTag[T]]
    options.collect:
      case d if ct.unapply(d.value).isDefined => d.as[T]

  def collectFirst[T: scala.reflect.ClassTag] =
    val ct = summon[ClassTag[T]]
    options.collectFirst:
      case d if ct.unapply(d.value).isDefined => d.as[T]

  def doc = collectFirst[Doc]

  def tpe = collectFirst[Type]
    
