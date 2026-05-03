package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GIOStatus

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Statuses returned by most of the #GIOFuncs functions.
  */
enum IOStatus(val raw: GIOStatus):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An error occurred.
    */
  case ERROR extends IOStatus(GIOStatus.G_IO_STATUS_ERROR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Success.
    */
  case NORMAL extends IOStatus(GIOStatus.G_IO_STATUS_NORMAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * End of file.
    */
  case EOF extends IOStatus(GIOStatus.G_IO_STATUS_EOF)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Resource temporarily unavailable.
    */
  case AGAIN extends IOStatus(GIOStatus.G_IO_STATUS_AGAIN)
end IOStatus

object IOStatus:
  def fromRaw(raw: GIOStatus): IOStatus =
    raw match
      case GIOStatus.G_IO_STATUS_ERROR  => IOStatus.ERROR
      case GIOStatus.G_IO_STATUS_NORMAL => IOStatus.NORMAL
      case GIOStatus.G_IO_STATUS_EOF    => IOStatus.EOF
      case GIOStatus.G_IO_STATUS_AGAIN  => IOStatus.AGAIN
  end fromRaw
end IOStatus
