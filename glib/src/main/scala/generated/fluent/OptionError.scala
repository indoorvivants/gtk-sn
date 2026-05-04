package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GOptionError

/** Error codes returned by option parsing.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum OptionError(val raw: GOptionError):
  /** An option was not known to the parser. This error will only be reported,
    * if the parser hasn't been instructed to ignore unknown options, see
    * g_option_context_set_ignore_unknown_options().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN_OPTION
      extends OptionError(GOptionError.G_OPTION_ERROR_UNKNOWN_OPTION)

  /** A value couldn't be parsed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BAD_VALUE extends OptionError(GOptionError.G_OPTION_ERROR_BAD_VALUE)

  /** A #GOptionArgFunc callback failed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
