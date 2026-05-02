import java.nio.file.Path

import TargetTypes.*

class TargetTypes private (raw: Map[String, Array[(String, String)]]):
  def getParams(name: String) = raw.get(name)
  def inMethod(name: String): Option[MethodContext] =
    raw.get(name).map(new MethodContext(name, _))

object TargetTypes:
  class MethodContext private[TargetTypes] (
      val name: String,
      params: Array[(String, String)]
  ):
    def getParamType(name: String): Option[String] =
      params.find(_._1 == name).map(_._2)
    def getParamType(idx: Int): Option[String] =
      params.lift(idx).map(_._2)

  def fromFile(path: Path) =
    import upickle.default.*
    new TargetTypes(
      read[Map[String, Array[(String, String)]]](os.read(os.Path(path)))
    )

  def fromResources(name: String = "/target-types.json") =
    import upickle.default.*
    val is = TargetTypes.getClass.getResourceAsStream(name)
    new TargetTypes(read[Map[String, Array[(String, String)]]](is))
end TargetTypes
