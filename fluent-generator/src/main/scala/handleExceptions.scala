import util.boundary.*
import scala.util.control.NonFatal
import com.indoorvivants.gnome.gir_schema.*

case class FluentErr(
    reason: FluentErrReason,
    context: List[String] = Nil
) extends Exception(
      (if context.nonEmpty then context.mkString("[", "/", "]: ")
       else "") + reason.message,
      reason match
        case FluentErrReason.Exc(exc) => exc
        case _                        => null
    )

inline def raise(reason: FluentErrReason)(using Label[FluentErr]) =
  break(FluentErr(reason))


inline def raiseWith(reason: FluentErrReason.type => FluentErrReason)(using Label[FluentErr]) =
  break(FluentErr(reason(FluentErrReason)))


enum FluentErrReason:
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
      case FluentErrReason.Exc(exc) =>
        exc.getMessage()
      case FluentErrReason.Other(msg) =>
        (msg)
      case FluentErrReason.ClassHasNoCType(nm) =>
        (s"Class [$nm] has no c:type attribute")
      case FluentErrReason.NoGlobalNameFor(nm) =>
        (s"No global name found for $nm")
      case FluentErrReason.UnexpectedClassParent(cls, nm) =>
        (s"Unexpected class parent for $cls: $nm")
      case FluentErrReason.MethodHasNoReturnType(meth) =>
        (s"Method ${meth} has no return type")
      case FluentErrReason.MethodParameterHasNoType(meth, param) =>
        (s"Method ${meth} has no type for parameter $param")
      case FluentErrReason.MethodParameterHasNoName(meth) =>
        (s"Method ${meth} has no name for one of the parameters")
      case FluentErrReason.TypeMissingValue(tpe) =>
        (s"Type $tpe has no @type attribute")
      case FluentErrReason.TargetTypesMissing(meth) =>
        (s"Method ${meth} has no target types")
      case FluentErrReason.ParameterHasNoTargetType(meth, param, idx) =>
        (
          s"Method ${meth} has no target type for parameter $param (index $idx)"
        )
      case FluentErrReason.CannotRenderArrayType(tpe) =>
        (s"Cannot render array type $tpe")
      case FluentErrReason.CannotRenderType(tpe) =>
        (s"Cannot render type $tpe")
    end match
  end message
end FluentErrReason

extension (fe: FluentErr)
  def log(title: String) =
    inline def form(msg: String) =
      title + ": " + msg

    import FluentErrReason.*
    fe.reason match
      case Exc(exc) =>
        scribe.error(form(exc.getMessage()), exc)
      case other =>
        scribe.warn(form(other.message))

end extension

def handleExceptions[T](f: => T)(using l: Label[FluentErr]): T =
  try f
  catch
    case b: Break[FluentErr] if b.label == l => break(b.value)
    case NonFatal(exc)                       =>
      break(FluentErr(FluentErrReason.Exc(exc)))

def inContext[T](ctx: String)(f: => T)(using l: Label[FluentErr]): T =
  import util.boundary, boundary.break

  def updateCtx(err: FluentErr) = err.copy(context =
    ctx :: err.context
  )

  try f
  catch
    case b: Break[FluentErr] if b.label == l =>
      break(updateCtx(b.value))(using l)
    case NonFatal(exc) =>
      break(updateCtx(FluentErr(FluentErrReason.Exc(exc))))
end inContext
