import com.indoorvivants.gnome.gir_schema.*
import java.nio.file.Paths
import scala.xml.XML
import scalaxb.fromXML
import java.nio.file.Path
import java.nio.file.Files
import scala.jdk.CollectionConverters.*
import scala.reflect.ClassTag
import scalaxb.DataRecord

case class AugmentedNamespace(n: Namespace):
  export n.*

  def collect[T: scala.reflect.ClassTag] =
    val ct = summon[ClassTag[T]]
    n.namespaceoption.collect:
      case d if ct.unapply(d.value).isDefined => d.as[T]

  lazy val interfaces: Seq[AugmentedInterface] =
    collect[Interface].map(AugmentedInterface(_))

  lazy val enumerations: Seq[Enumeration] =
    collect[Enumeration]

  lazy val bitfields: Seq[Bitfield] =
    collect[Bitfield]

  lazy val aliases: Seq[Alias] =
    collect[Alias]

  lazy val callbacks: Seq[Callback] =
    collect[Callback]

  lazy val records: Seq[Record] =
    collect[Record]

  lazy val classes: Seq[AugmentedClass] =
    collect[Class].map(AugmentedClass(_))
end AugmentedNamespace

trait ClassLike:
  protected def options: Seq[DataRecord[Any]]
  def collect[T: scala.reflect.ClassTag] =
    val ct = summon[ClassTag[T]]
    options.collect:
      case d if ct.unapply(d.value).isDefined => d.as[T]

  lazy val implements: Seq[Implements] =
    collect[Implements]

  lazy val methods: Seq[Method] =
    collect[Method]

  lazy val virtualMethods: Seq[Virtualu45method] =
    collect[Virtualu45method]

  lazy val constructors: Seq[Constructor] =
    collect[Constructor]

  lazy val functions: Seq[FunctionType] =
    collect[FunctionType]

  lazy val signals: Seq[Signal] =
    collect[Signal]
end ClassLike
