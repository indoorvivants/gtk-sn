import com.indoorvivants.gnome.gir_schema.*
import java.nio.file.Paths
import scala.xml.XML
import scalaxb.fromXML
import java.nio.file.Path
import java.nio.file.Files
import scala.jdk.CollectionConverters.*
import scala.reflect.ClassTag
import scalaxb.DataRecord

case class AugmentedClass(n: Class) extends ClassLike:
  export n.*
  override protected def options: Seq[DataRecord[Any]] = n.classoption

end AugmentedClass
