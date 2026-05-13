package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GIOChannelError

/** Error codes returned by #GIOChannel operations.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum IOChannelError(val raw: GIOChannelError):
  /** File too large.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FBIG extends IOChannelError(GIOChannelError.G_IO_CHANNEL_ERROR_FBIG)

  /** Invalid argument.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVAL extends IOChannelError(GIOChannelError.G_IO_CHANNEL_ERROR_INVAL)

  /** IO error.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case IO extends IOChannelError(GIOChannelError.G_IO_CHANNEL_ERROR_IO)

  /** File is a directory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ISDIR extends IOChannelError(GIOChannelError.G_IO_CHANNEL_ERROR_ISDIR)

  /** No space left on device.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOSPC extends IOChannelError(GIOChannelError.G_IO_CHANNEL_ERROR_NOSPC)

  /** No such device or address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NXIO extends IOChannelError(GIOChannelError.G_IO_CHANNEL_ERROR_NXIO)

  /** Value too large for defined datatype.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OVERFLOW
      extends IOChannelError(GIOChannelError.G_IO_CHANNEL_ERROR_OVERFLOW)

  /** Broken pipe.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PIPE extends IOChannelError(GIOChannelError.G_IO_CHANNEL_ERROR_PIPE)

  /** Some other error.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
