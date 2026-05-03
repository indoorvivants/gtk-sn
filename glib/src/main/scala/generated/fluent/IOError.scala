package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GIOError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GIOError is only used by the deprecated functions g_io_channel_read(),
  * g_io_channel_write(), and g_io_channel_seek().
  */
enum IOError(val raw: GIOError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * no error
    */
  case NONE extends IOError(GIOError.G_IO_ERROR_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * an EAGAIN error occurred
    */
  case AGAIN extends IOError(GIOError.G_IO_ERROR_AGAIN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * an EINVAL error occurred
    */
  case INVAL extends IOError(GIOError.G_IO_ERROR_INVAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * another error occurred
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
