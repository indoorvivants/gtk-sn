package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GShellError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Error codes returned by shell functions.
  */
enum ShellError(val raw: GShellError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Mismatched or otherwise mangled quoting.
    */
  case BAD_QUOTING extends ShellError(GShellError.G_SHELL_ERROR_BAD_QUOTING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * String to be parsed was empty.
    */
  case EMPTY_STRING extends ShellError(GShellError.G_SHELL_ERROR_EMPTY_STRING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Some other error.
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
