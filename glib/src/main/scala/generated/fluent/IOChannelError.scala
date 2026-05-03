package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GIOChannelError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Error codes returned by #GIOChannel operations.
  */
enum IOChannelError(val raw: GIOChannelError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File too large.
    */
  case FBIG extends IOChannelError(GIOChannelError.G_IO_CHANNEL_ERROR_FBIG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Invalid argument.
    */
  case INVAL extends IOChannelError(GIOChannelError.G_IO_CHANNEL_ERROR_INVAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * IO error.
    */
  case IO extends IOChannelError(GIOChannelError.G_IO_CHANNEL_ERROR_IO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File is a directory.
    */
  case ISDIR extends IOChannelError(GIOChannelError.G_IO_CHANNEL_ERROR_ISDIR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No space left on device.
    */
  case NOSPC extends IOChannelError(GIOChannelError.G_IO_CHANNEL_ERROR_NOSPC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No such device or address.
    */
  case NXIO extends IOChannelError(GIOChannelError.G_IO_CHANNEL_ERROR_NXIO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Value too large for defined datatype.
    */
  case OVERFLOW
      extends IOChannelError(GIOChannelError.G_IO_CHANNEL_ERROR_OVERFLOW)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Broken pipe.
    */
  case PIPE extends IOChannelError(GIOChannelError.G_IO_CHANNEL_ERROR_PIPE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Some other error.
    */
  case FAILED extends IOChannelError(GIOChannelError.G_IO_CHANNEL_ERROR_FAILED)
end IOChannelError

object IOChannelError:
  def fromRaw(raw: GIOChannelError): IOChannelError =
    raw match
      case GIOChannelError.G_IO_CHANNEL_ERROR_FBIG     => IOChannelError.FBIG
      case GIOChannelError.G_IO_CHANNEL_ERROR_INVAL    => IOChannelError.INVAL
      case GIOChannelError.G_IO_CHANNEL_ERROR_IO       => IOChannelError.IO
      case GIOChannelError.G_IO_CHANNEL_ERROR_ISDIR    => IOChannelError.ISDIR
      case GIOChannelError.G_IO_CHANNEL_ERROR_NOSPC    => IOChannelError.NOSPC
      case GIOChannelError.G_IO_CHANNEL_ERROR_NXIO     => IOChannelError.NXIO
      case GIOChannelError.G_IO_CHANNEL_ERROR_OVERFLOW =>
        IOChannelError.OVERFLOW
      case GIOChannelError.G_IO_CHANNEL_ERROR_PIPE   => IOChannelError.PIPE
      case GIOChannelError.G_IO_CHANNEL_ERROR_FAILED => IOChannelError.FAILED
  end fromRaw
end IOChannelError
