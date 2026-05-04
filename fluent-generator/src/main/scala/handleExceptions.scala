import util.boundary.*
import scala.util.control.NonFatal
import com.indoorvivants.gnome.gir_schema.*

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
  case TargetTypesMissing(meth: String)
  case ParameterHasNoTargetType(meth: String, param: String, idx: Int)
  case CannotRenderArrayType(tpe: ArrayType)
  case CannotRenderType(tpe: Type)

  def message: String =
    this match
      case FluentErr.Exc(exc) =>
        exc.getMessage()
      case FluentErr.Other(msg) =>
        (msg)
      case FluentErr.ClassHasNoCType(nm) =>
        (s"Class [$nm] has no c:type attribute")
      case FluentErr.NoGlobalNameFor(nm) =>
        (s"No global name found for $nm")
      case FluentErr.UnexpectedClassParent(cls, nm) =>
        (s"Unexpected class parent for $cls: $nm")
      case FluentErr.MethodHasNoReturnType(meth) =>
        (s"Method ${meth} has no return type")
      case FluentErr.MethodParameterHasNoType(meth, param) =>
        (s"Method ${meth} has no type for parameter $param")
      case FluentErr.MethodParameterHasNoName(meth) =>
        (s"Method ${meth} has no name for one of the parameters")
      case FluentErr.TypeMissingValue(tpe) =>
        (s"Type $tpe has no @type attribute")
      case FluentErr.TargetTypesMissing(meth) =>
        (s"Method ${meth} has no target types")
      case FluentErr.ParameterHasNoTargetType(meth, param, idx) =>
        (
          s"Method ${meth} has no target type for parameter $param (index $idx)"
        )
      case FluentErr.CannotRenderArrayType(tpe) =>
        (s"Cannot render array type $tpe")
      case FluentErr.CannotRenderType(tpe) =>
        (s"Cannot render type $tpe")
    end match
end FluentErr

extension (fe: FluentErr)
  def log(title: String) =
    inline def warn(msg: String) =
      scribe.warn(title + ": " + msg)

    fe match
      case FluentErr.Exc(exc) =>
        scribe.error(title, exc)
      case other => 
        warn(other.message)
end extension

def handleExceptions[T](f: => T)(using l: Label[FluentErr]): T =
  try f
  catch
    case b: Break[FluentErr] if b.label == l => break(b.value)
    case NonFatal(exc)                       => break(FluentErr.Exc(exc))
