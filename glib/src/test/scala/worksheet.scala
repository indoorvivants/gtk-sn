import sn.gnome.glib.internal.*
import scalanative.unsafe.*

enum GResult[+A]:
  case Error(domain: GQuark, code: Int, message: String)
  case Ok(value: A)

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

@extern def gdk_pixbuf_loader_new_with_type(
    image_type: CString,
    error: Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]
): Ptr[Byte] = extern

def newLoaderWithType(imageType: CString | String)(using
    Zone
): GResult[Ptr[Byte]] =
  GResult.wrap(st =>
    gdk_pixbuf_loader_new_with_type(__sn_extract_string(imageType), st)
  )
end newLoaderWithType

inline def __sn_extract_string(str: String | CString)(using
    Zone
): CString =
  str match
    case s: String  => toCString(s)
    case s: CString => s
  end match
end __sn_extract_string
