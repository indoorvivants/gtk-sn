package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GPollableReturn

/** Return value for various IO operations that signal errors via the return
  * value and not necessarily via a #GError.
  *
  * This enum exists to be able to return errors to callers without having to
  * allocate a #GError. Allocating #GErrors can be quite expensive for regularly
  * happening errors like %G_IO_ERROR_WOULD_BLOCK.
  *
  * In case of %G_POLLABLE_RETURN_FAILED a #GError should be set for the
  * operation to give details about the error that happened.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum PollableReturn(val raw: GPollableReturn):
  /** Generic error condition for when an operation fails.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FAILED extends PollableReturn(GPollableReturn.G_POLLABLE_RETURN_FAILED)

  /** The operation was successfully finished.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OK extends PollableReturn(GPollableReturn.G_POLLABLE_RETURN_OK)

  /** The operation would block.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WOULD_BLOCK
      extends PollableReturn(GPollableReturn.G_POLLABLE_RETURN_WOULD_BLOCK)
end PollableReturn

object PollableReturn:
  def fromRaw(raw: GPollableReturn): PollableReturn =
    raw match
      case GPollableReturn.G_POLLABLE_RETURN_FAILED => PollableReturn.FAILED
      case GPollableReturn.G_POLLABLE_RETURN_OK     => PollableReturn.OK
      case GPollableReturn.G_POLLABLE_RETURN_WOULD_BLOCK =>
        PollableReturn.WOULD_BLOCK
  end fromRaw
end PollableReturn
