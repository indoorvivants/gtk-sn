package sn.gnome.glib.fluent

import sn.gnome.glib.internal.{GQuark, GError, g_error_free}
import scala.scalanative.unsafe.*

enum GResult[+A]:
  case Error(domain: GQuark, code: Int, message: String)
  case Ok(value: A)

  def getOrThrow() = this match
    case Ok(value)                    => value
    case Error(domain, code, message) =>
      throw GResultException(domain, code, message)

  def toEither: Either[GResultException, A] = this match
    case Ok(value)                    => Right(value)
    case Error(domain, code, message) =>
      Left(new GResultException(domain, code, message))

  def toOption: Option[A] = this match
    case Ok(value)      => Some(value)
    case Error(_, _, _) => None

  def toError: Option[GResultException] = this match
    case Ok(_)                        => None
    case Error(domain, code, message) =>
      Some(new GResultException(domain, code, message))

end GResult

case class GResultException(domain: GQuark, code: Int, message: String)
    extends RuntimeException(s"GResult: $domain: $code - $message")

object GResult:
  inline def wrap[A](inline f: Ptr[Ptr[GError]] => A): GResult[A] =
    val st = stackalloc[Ptr[GError]]()
    val raw = f(st)
    val errorPtr = !st

    if errorPtr != null then
      val err = !errorPtr
      val result = GResult.Error(
        err.domain,
        err.code.value,
        fromCString(err.message.asInstanceOf[CString])
      )
      g_error_free(errorPtr)
      result
    else Ok(raw)
    end if
  end wrap
end GResult
