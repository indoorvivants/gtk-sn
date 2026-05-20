import java.nio.file.Path

import TargetTypes.*

class TargetTypes private (raw: TargetTypesJson):
  val methods = raw.functions.map(f => (f.name, f)).toMap
  val structs = raw.structs.map(f => (f.name, f)).toMap

  def getParams(name: String) = methods.get(name).map(_.params)
  def inMethod(name: String): Option[MethodContext] =
    methods.get(name).map(new MethodContext(name, _))
  def inStruct(name: String): Option[StructContext] =
    structs.get(name).map(new StructContext(name, _))

object TargetTypes:

  class StructContext private[TargetTypes] (
      val name: String,
      struct: Struct
  ):
    def getParamType(name: String): Option[String] =
      struct.fields.get(name)

  class MethodContext private[TargetTypes] (
      val name: String,
      func: Function
  ):
    def getReturnType = func.ret

    def getParamType(name: String): Option[String] =
      func.params.find(_._1 == name).map(_._2)

    def getParamType(idx: Int): Option[String] =
      func.params.lift(idx).map(_._2)
  end MethodContext

  def fromFile(path: Path) =
    import upickle.default.*
    new TargetTypes(
      read[TargetTypesJson](os.read(os.Path(path)))
    )

  def fromResources(name: String = "/target-types.json") =
    import upickle.default.*
    val is = TargetTypes.getClass.getResourceAsStream(name)
    new TargetTypes(read[TargetTypesJson](is))

  case class Function(
      name: String,
      ret: String,
      params: Array[(String, String)]
  ) derives upickle.default.ReadWriter

  case class Struct(
      name: String,
      fields: Map[String, String]
  ) derives upickle.default.ReadWriter

  case class TargetTypesJson(
      functions: Seq[
        Function
      ], // Map[String, (String, Array[(String, String)])],
      structs: Seq[Struct]
  ) derives upickle.default.ReadWriter
end TargetTypes
