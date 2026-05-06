
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

  def parameters: Seq[Parameter | Instanceu45parameter] = extractParams(
    options
  )
    
  def returnType: Option[Type | ArrayType] = options
    .collectFirst:
      case d if d.value.isInstanceOf[Returnu45value] => d.as[Returnu45value]
    .flatMap: rv =>
      rv.returnu45valueoption.collectFirst:
        case d if d.value.isInstanceOf[Type]      => d.as[Type]
        case d if d.value.isInstanceOf[ArrayType] => d.as[ArrayType]
