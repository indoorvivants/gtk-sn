package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GIOStatus

/** Statuses returned by most of the #GIOFuncs functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum IOStatus(val raw: GIOStatus):
  /** An error occurred.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ERROR extends IOStatus(GIOStatus.G_IO_STATUS_ERROR)

  /** Success.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NORMAL extends IOStatus(GIOStatus.G_IO_STATUS_NORMAL)

  /** End of file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EOF extends IOStatus(GIOStatus.G_IO_STATUS_EOF)

  /** Resource temporarily unavailable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
