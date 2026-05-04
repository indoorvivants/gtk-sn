package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GOnceStatus

/** The possible statuses of a one-time initialization function controlled by a
  * #GOnce struct.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum OnceStatus(val raw: GOnceStatus):
  /** the function has not been called yet.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOTCALLED extends OnceStatus(GOnceStatus.G_ONCE_STATUS_NOTCALLED)

  /** the function call is currently in progress.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PROGRESS extends OnceStatus(GOnceStatus.G_ONCE_STATUS_PROGRESS)

  /** the function has been called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
