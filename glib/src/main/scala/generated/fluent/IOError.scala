package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GIOError

/** #GIOError is only used by the deprecated functions g_io_channel_read(),
  * g_io_channel_write(), and g_io_channel_seek().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum IOError(val raw: GIOError):
  /** no error
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends IOError(GIOError.G_IO_ERROR_NONE)

  /** an EAGAIN error occurred
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case AGAIN extends IOError(GIOError.G_IO_ERROR_AGAIN)

  /** an EINVAL error occurred
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVAL extends IOError(GIOError.G_IO_ERROR_INVAL)

  /** another error occurred
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN extends IOError(GIOError.G_IO_ERROR_UNKNOWN)
end IOError

object IOError:
  def fromRaw(raw: GIOError): IOError =
    raw match
      case GIOError.G_IO_ERROR_NONE    => IOError.NONE
      case GIOError.G_IO_ERROR_AGAIN   => IOError.AGAIN
      case GIOError.G_IO_ERROR_INVAL   => IOError.INVAL
      case GIOError.G_IO_ERROR_UNKNOWN => IOError.UNKNOWN
  end fromRaw
end IOError
