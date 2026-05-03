package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GNumberParserError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Error codes returned by functions converting a string to a number.
  */
enum NumberParserError(val raw: GNumberParserError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * String was not a valid number.
    */
  case INVALID
      extends NumberParserError(
        GNumberParserError.G_NUMBER_PARSER_ERROR_INVALID
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * String was a number, but out of bounds.
    */
  case OUT_OF_BOUNDS
      extends NumberParserError(
        GNumberParserError.G_NUMBER_PARSER_ERROR_OUT_OF_BOUNDS
      )
end NumberParserError

object NumberParserError:
  def fromRaw(raw: GNumberParserError): NumberParserError =
    raw match
      case GNumberParserError.G_NUMBER_PARSER_ERROR_INVALID =>
        NumberParserError.INVALID
      case GNumberParserError.G_NUMBER_PARSER_ERROR_OUT_OF_BOUNDS =>
        NumberParserError.OUT_OF_BOUNDS
  end fromRaw
end NumberParserError
