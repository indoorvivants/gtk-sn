package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GShellError

/** Error codes returned by shell functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ShellError(val raw: GShellError):
  /** Mismatched or otherwise mangled quoting.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BAD_QUOTING extends ShellError(GShellError.G_SHELL_ERROR_BAD_QUOTING)

  /** String to be parsed was empty.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EMPTY_STRING extends ShellError(GShellError.G_SHELL_ERROR_EMPTY_STRING)

  /** Some other error.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FAILED extends ShellError(GShellError.G_SHELL_ERROR_FAILED)
end ShellError

object ShellError:
  def fromRaw(raw: GShellError): ShellError =
    raw match
      case GShellError.G_SHELL_ERROR_BAD_QUOTING  => ShellError.BAD_QUOTING
      case GShellError.G_SHELL_ERROR_EMPTY_STRING => ShellError.EMPTY_STRING
      case GShellError.G_SHELL_ERROR_FAILED       => ShellError.FAILED
  end fromRaw
end ShellError
