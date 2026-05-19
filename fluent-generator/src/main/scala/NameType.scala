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

enum NameType:
  case Interface(typeValue: String)
  case Callback, Alias
  case Record(typeValue: String)
  case Class(typeValue: String)
  case Enumeration(typeValue: String)
  case Bitfield(typeValue: String)
