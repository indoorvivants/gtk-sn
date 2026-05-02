import java.nio.file.Path

import TargetTypes.*

class TargetTypes private (raw: Raw):
  def getParams(name: String) = raw.get(name).map(_._2)
  def inMethod(name: String): Option[MethodContext] =
    raw.get(name).map(new MethodContext(name, _))

object TargetTypes:
  private type Method = (String, Array[(String, String)])
  private type Raw = Map[String, Method]
  class MethodContext private[TargetTypes] (
      val name: String,
      params: Method
  ):
    def getReturnType = params._1

    def getParamType(name: String): Option[String] =
      params._2.find(_._1 == name).map(_._2)

    def getParamType(idx: Int): Option[String] =
      params._2.lift(idx).map(_._2)
  end MethodContext

  def fromFile(path: Path) =
    import upickle.default.*
    new TargetTypes(
      read[Raw](os.read(os.Path(path)))
    )

  def fromResources(name: String = "/target-types.json") =
    import upickle.default.*
    val is = TargetTypes.getClass.getResourceAsStream(name)
    new TargetTypes(read[Raw](is))
end TargetTypes
