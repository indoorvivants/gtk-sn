package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GThreadError

/** Possible errors of thread related functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ThreadError(val raw: GThreadError):
  /** a thread couldn't be created due to resource shortage. Try again later.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case THREAD_ERROR_AGAIN extends ThreadError(GThreadError.G_THREAD_ERROR_AGAIN)
end ThreadError

object ThreadError:
  def fromRaw(raw: GThreadError): ThreadError =
    raw match
      case GThreadError.G_THREAD_ERROR_AGAIN => ThreadError.THREAD_ERROR_AGAIN
  end fromRaw
end ThreadError
