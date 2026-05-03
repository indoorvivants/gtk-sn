import com.indoorvivants.gnome.gir_schema.*
import java.nio.file.Paths
import scala.xml.XML
import scalaxb.fromXML
import java.nio.file.Path
import java.nio.file.Files
import scala.jdk.CollectionConverters.*
import scala.reflect.ClassTag
import scalaxb.DataRecord

private def extractParams(
    c: Seq[DataRecord[Any]]
): Seq[Parameter | Instanceu45parameter] =
  c
    .collect:
      case d if d.value.isInstanceOf[Parameters] =>
        d.as[Parameters]
          .parametersoption
          .collect[Parameter | Instanceu45parameter]:
            case d if d.value.isInstanceOf[Parameter] => d.as[Parameter]
            case d if d.value.isInstanceOf[Instanceu45parameter] =>
              d.as[Instanceu45parameter]
    .flatten

extension (c: Constructor) 
  def parameters = extractParams(c.constructoroption)
  def isThrowing = c.throws.exists(_.toString == "1")
  def doc =
    c.constructoroption.collectFirst:
      case d if d.value.isInstanceOf[Doc] => d.as[Doc]

extension (c: Virtualu45method)
  def isThrowing = c.throws.exists(_.toString == "1")
  def parameters: Seq[Parameter | Instanceu45parameter] = extractParams(
    c.virtualu45methodoption
  )
  def instanceParameter: Option[Instanceu45parameter] =
    c.virtualu45methodoption.collectFirst:
      case d if d.value.isInstanceOf[Instanceu45parameter] =>
        d.as[Instanceu45parameter]

  def returnType: Option[Type | ArrayType] = c.virtualu45methodoption
    .collectFirst:
      case d if d.value.isInstanceOf[Returnu45value] => d.as[Returnu45value]
    .flatMap: rv =>
      rv.returnu45valueoption.collectFirst:
        case d if d.value.isInstanceOf[Type]      => d.as[Type]
        case d if d.value.isInstanceOf[ArrayType] => d.as[ArrayType]
end extension


extension (c: FunctionType)
  def isThrowing = c.throws.exists(_.toString == "1")
  def parameters: Seq[Parameter | Instanceu45parameter] = extractParams(
    c.functiontypeoption
  )
  def instanceParameter: Option[Instanceu45parameter] =
    c.functiontypeoption.collectFirst:
      case d if d.value.isInstanceOf[Instanceu45parameter] =>
        d.as[Instanceu45parameter]

  def returnType: Option[Type | ArrayType] = c.functiontypeoption
    .collectFirst:
      case d if d.value.isInstanceOf[Returnu45value] => d.as[Returnu45value]
    .flatMap: rv =>
      rv.returnu45valueoption.collectFirst:
        case d if d.value.isInstanceOf[Type]      => d.as[Type]
        case d if d.value.isInstanceOf[ArrayType] => d.as[ArrayType]
  def doc =
    c.functiontypeoption.collectFirst:
      case d if d.value.isInstanceOf[Doc] => d.as[Doc]
end extension


extension (c: Method)
  def isThrowing = c.throws.exists(_.toString == "1")
  def parameters: Seq[Parameter | Instanceu45parameter] = extractParams(
    c.methodoption
  )
  def instanceParameter: Option[Instanceu45parameter] =
    c.methodoption.collectFirst:
      case d if d.value.isInstanceOf[Instanceu45parameter] =>
        d.as[Instanceu45parameter]

  def returnType: Option[Type | ArrayType] = c.methodoption
    .collectFirst:
      case d if d.value.isInstanceOf[Returnu45value] => d.as[Returnu45value]
    .flatMap: rv =>
      rv.returnu45valueoption.collectFirst:
        case d if d.value.isInstanceOf[Type]      => d.as[Type]
        case d if d.value.isInstanceOf[ArrayType] => d.as[ArrayType]
  def doc =
    c.methodoption.collectFirst:
      case d if d.value.isInstanceOf[Doc] => d.as[Doc]
end extension

extension [T](c: Seq[DataRecord[T]])
  def doc =
    c.collectFirst:
      case d if d.value.isInstanceOf[Doc] => d.as[Doc]

extension (c: Seq[DataRecord[Any]])
  def tpe =
    c.collectFirst:
      case d if d.value.isInstanceOf[Type] => d.as[Type]

extension (c: Parameter | Instanceu45parameter)
  def doc =
    val attrs = c match
      case Parameter(parameteroption, attributes) => parameteroption
      case Instanceu45parameter(instanceu45parameteroption, attributes) => instanceu45parameteroption
    
    attrs.collectFirst:
      case d if d.value.isInstanceOf[Doc] => d.as[Doc]

  def tpe: Option[Type | ArrayType] =
    val data =
      c match
        case p: Parameter            => p.parameteroption
        case p: Instanceu45parameter => p.instanceu45parameteroption

    data.collectFirst:
      case d if d.value.isInstanceOf[Type]      => d.as[Type]
      case d if d.value.isInstanceOf[ArrayType] => d.as[ArrayType]
