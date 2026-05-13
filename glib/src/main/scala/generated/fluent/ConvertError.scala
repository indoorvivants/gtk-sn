package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GConvertError

/** Error codes returned by character set conversion routines.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ConvertError(val raw: GConvertError):
  /** Conversion between the requested character sets is not supported.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NO_CONVERSION
      extends ConvertError(GConvertError.G_CONVERT_ERROR_NO_CONVERSION)

  /** Invalid byte sequence in conversion input; or the character sequence could
    * not be represented in the target character set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ILLEGAL_SEQUENCE
      extends ConvertError(GConvertError.G_CONVERT_ERROR_ILLEGAL_SEQUENCE)

  /** Conversion failed for some reason.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FAILED extends ConvertError(GConvertError.G_CONVERT_ERROR_FAILED)

  /** Partial character sequence at end of input.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PARTIAL_INPUT
      extends ConvertError(GConvertError.G_CONVERT_ERROR_PARTIAL_INPUT)

  /** URI is invalid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BAD_URI extends ConvertError(GConvertError.G_CONVERT_ERROR_BAD_URI)

  /** Pathname is not an absolute path.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_ABSOLUTE_PATH
      extends ConvertError(GConvertError.G_CONVERT_ERROR_NOT_ABSOLUTE_PATH)

  /** No memory available. Since: 2.40
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NO_MEMORY extends ConvertError(GConvertError.G_CONVERT_ERROR_NO_MEMORY)

  /** An embedded NUL character is present in conversion output where a
    * NUL-terminated string is expected. Since: 2.56
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EMBEDDED_NUL
      extends ConvertError(GConvertError.G_CONVERT_ERROR_EMBEDDED_NUL)
end ConvertError

object ConvertError:
  def fromRaw(raw: GConvertError): ConvertError =
    raw match
      case GConvertError.G_CONVERT_ERROR_NO_CONVERSION =>
        ConvertError.NO_CONVERSION
      case GConvertError.G_CONVERT_ERROR_ILLEGAL_SEQUENCE =>
        ConvertError.ILLEGAL_SEQUENCE
      case GConvertError.G_CONVERT_ERROR_FAILED        => ConvertError.FAILED
      case GConvertError.G_CONVERT_ERROR_PARTIAL_INPUT =>
        ConvertError.PARTIAL_INPUT
      case GConvertError.G_CONVERT_ERROR_BAD_URI => ConvertError.BAD_URI
      case GConvertError.G_CONVERT_ERROR_NOT_ABSOLUTE_PATH =>
        ConvertError.NOT_ABSOLUTE_PATH
      case GConvertError.G_CONVERT_ERROR_NO_MEMORY    => ConvertError.NO_MEMORY
      case GConvertError.G_CONVERT_ERROR_EMBEDDED_NUL =>
        ConvertError.EMBEDDED_NUL
  end fromRaw
end ConvertError
