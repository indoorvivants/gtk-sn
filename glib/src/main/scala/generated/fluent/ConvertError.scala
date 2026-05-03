package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GConvertError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Error codes returned by character set conversion routines.
  */
enum ConvertError(val raw: GConvertError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Conversion between the requested character sets is not supported.
    */
  case NO_CONVERSION
      extends ConvertError(GConvertError.G_CONVERT_ERROR_NO_CONVERSION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Invalid byte sequence in conversion input; or the character sequence could
    * not be represented in the target character set.
    */
  case ILLEGAL_SEQUENCE
      extends ConvertError(GConvertError.G_CONVERT_ERROR_ILLEGAL_SEQUENCE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Conversion failed for some reason.
    */
  case FAILED extends ConvertError(GConvertError.G_CONVERT_ERROR_FAILED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Partial character sequence at end of input.
    */
  case PARTIAL_INPUT
      extends ConvertError(GConvertError.G_CONVERT_ERROR_PARTIAL_INPUT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * URI is invalid.
    */
  case BAD_URI extends ConvertError(GConvertError.G_CONVERT_ERROR_BAD_URI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pathname is not an absolute path.
    */
  case NOT_ABSOLUTE_PATH
      extends ConvertError(GConvertError.G_CONVERT_ERROR_NOT_ABSOLUTE_PATH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No memory available. Since: 2.40
    */
  case NO_MEMORY extends ConvertError(GConvertError.G_CONVERT_ERROR_NO_MEMORY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An embedded NUL character is present in conversion output where a
    * NUL-terminated string is expected. Since: 2.56
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
