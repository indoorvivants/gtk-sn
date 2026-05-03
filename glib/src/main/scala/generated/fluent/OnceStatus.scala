package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GOnceStatus

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The possible statuses of a one-time initialization function controlled by a
  * #GOnce struct.
  */
enum OnceStatus(val raw: GOnceStatus):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the function has not been called yet.
    */
  case NOTCALLED extends OnceStatus(GOnceStatus.G_ONCE_STATUS_NOTCALLED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the function call is currently in progress.
    */
  case PROGRESS extends OnceStatus(GOnceStatus.G_ONCE_STATUS_PROGRESS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the function has been called.
    */
  case READY extends OnceStatus(GOnceStatus.G_ONCE_STATUS_READY)
end OnceStatus

object OnceStatus:
  def fromRaw(raw: GOnceStatus): OnceStatus =
    raw match
      case GOnceStatus.G_ONCE_STATUS_NOTCALLED => OnceStatus.NOTCALLED
      case GOnceStatus.G_ONCE_STATUS_PROGRESS  => OnceStatus.PROGRESS
      case GOnceStatus.G_ONCE_STATUS_READY     => OnceStatus.READY
  end fromRaw
end OnceStatus
