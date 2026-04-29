import util.boundary.*
import scala.util.control.NonFatal
import com.indoorvivants.gnome.gir_schema.Type

enum FluentErr:
  case Exc(exc: Throwable)
  case Other(msg: String)
  case ClassHasNoCType(nm: String)
  case NoGlobalNameFor(nm: String)
  case UnexpectedClassParent(cls: String, nm: GlobalName)
  case MethodHasNoReturnType(meth: String)
  case MethodParameterHasNoType(meth: String, param: Option[String])
  case MethodParameterHasNoName(meth: String)
  case TypeMissingValue(tpe: Type)

extension (fe: FluentErr)
  def log(title: String) =
    inline def warn(msg: String) =
      scribe.warn(title + ": " + msg)

    fe match
      case FluentErr.Exc(exc) =>
        scribe.error(title, exc)
      case FluentErr.Other(msg) =>
        warn(msg)
      case FluentErr.ClassHasNoCType(nm) =>
        warn(s"Class [$nm] has no c:type attribute")
      case FluentErr.NoGlobalNameFor(nm) =>
        warn(s"No global name found for $nm")
      case FluentErr.UnexpectedClassParent(cls, nm) =>
        warn(s"Unexpected class parent for $cls: $nm")
      case FluentErr.MethodHasNoReturnType(meth) =>
        warn(s"Method ${meth} has no return type")
      case FluentErr.MethodParameterHasNoType(meth, param) =>
        warn(s"Method ${meth} has no type for parameter $param")
      case FluentErr.MethodParameterHasNoName(meth) =>
        warn(s"Method ${meth} has no name for one of the parameters")
      case FluentErr.TypeMissingValue(tpe) =>
        warn(s"Type $tpe has no @type attribute")
    end match
end extension

def handleExceptions[T](f: => T)(using l: Label[FluentErr]): T =
  try f
  catch
    case b: Break[FluentErr] if b.label == l => break(b.value)
    case NonFatal(exc)                       => break(FluentErr.Exc(exc))
