package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GThreadError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Possible errors of thread related functions.
  */
enum ThreadError(val raw: GThreadError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a thread couldn't be created due to resource shortage. Try again later.
    */
  case THREAD_ERROR_AGAIN extends ThreadError(GThreadError.G_THREAD_ERROR_AGAIN)
end ThreadError

object ThreadError:
  def fromRaw(raw: GThreadError): ThreadError =
    raw match
      case GThreadError.G_THREAD_ERROR_AGAIN => ThreadError.THREAD_ERROR_AGAIN
  end fromRaw
end ThreadError
