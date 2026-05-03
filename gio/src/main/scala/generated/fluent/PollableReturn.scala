package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GPollableReturn

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Return value for various IO operations that signal errors via the return
  * value and not necessarily via a #GError.
  *
  * This enum exists to be able to return errors to callers without having to
  * allocate a #GError. Allocating #GErrors can be quite expensive for regularly
  * happening errors like %G_IO_ERROR_WOULD_BLOCK.
  *
  * In case of %G_POLLABLE_RETURN_FAILED a #GError should be set for the
  * operation to give details about the error that happened.
  */
enum PollableReturn(val raw: GPollableReturn):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Generic error condition for when an operation fails.
    */
  case FAILED extends PollableReturn(GPollableReturn.G_POLLABLE_RETURN_FAILED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The operation was successfully finished.
    */
  case OK extends PollableReturn(GPollableReturn.G_POLLABLE_RETURN_OK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The operation would block.
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
