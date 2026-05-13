package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GNumberParserError

/** Error codes returned by functions converting a string to a number.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum NumberParserError(val raw: GNumberParserError):
  /** String was not a valid number.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID
      extends NumberParserError(
        GNumberParserError.G_NUMBER_PARSER_ERROR_INVALID
      )

  /** String was a number, but out of bounds.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
