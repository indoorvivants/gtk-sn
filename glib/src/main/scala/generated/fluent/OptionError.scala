package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GOptionError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Error codes returned by option parsing.
  */
enum OptionError(val raw: GOptionError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An option was not known to the parser. This error will only be reported,
    * if the parser hasn't been instructed to ignore unknown options, see
    * g_option_context_set_ignore_unknown_options().
    */
  case UNKNOWN_OPTION
      extends OptionError(GOptionError.G_OPTION_ERROR_UNKNOWN_OPTION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A value couldn't be parsed.
    */
  case BAD_VALUE extends OptionError(GOptionError.G_OPTION_ERROR_BAD_VALUE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A #GOptionArgFunc callback failed.
    */
  case FAILED extends OptionError(GOptionError.G_OPTION_ERROR_FAILED)
end OptionError

object OptionError:
  def fromRaw(raw: GOptionError): OptionError =
    raw match
      case GOptionError.G_OPTION_ERROR_UNKNOWN_OPTION =>
        OptionError.UNKNOWN_OPTION
      case GOptionError.G_OPTION_ERROR_BAD_VALUE => OptionError.BAD_VALUE
      case GOptionError.G_OPTION_ERROR_FAILED    => OptionError.FAILED
  end fromRaw
end OptionError
