package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GVariantParseError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Error codes returned by parsing text-format GVariants.
  */
enum VariantParseError(val raw: GVariantParseError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * generic error (unused)
    */
  case FAILED
      extends VariantParseError(GVariantParseError.G_VARIANT_PARSE_ERROR_FAILED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a non-basic #GVariantType was given where a basic type was expected
    */
  case BASIC_TYPE_EXPECTED
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_BASIC_TYPE_EXPECTED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * cannot infer the #GVariantType
    */
  case CANNOT_INFER_TYPE
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_CANNOT_INFER_TYPE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * an indefinite #GVariantType was given where a definite type was expected
    */
  case DEFINITE_TYPE_EXPECTED
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_DEFINITE_TYPE_EXPECTED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * extra data after parsing finished
    */
  case INPUT_NOT_AT_END
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_INPUT_NOT_AT_END
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * invalid character in number or unicode escape
    */
  case INVALID_CHARACTER
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_CHARACTER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * not a valid #GVariant format string
    */
  case INVALID_FORMAT_STRING
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_FORMAT_STRING
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * not a valid object path
    */
  case INVALID_OBJECT_PATH
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_OBJECT_PATH
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * not a valid type signature
    */
  case INVALID_SIGNATURE
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_SIGNATURE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * not a valid #GVariant type string
    */
  case INVALID_TYPE_STRING
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_TYPE_STRING
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * could not find a common type for array entries
    */
  case NO_COMMON_TYPE
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_NO_COMMON_TYPE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the numerical value is out of range of the given type
    */
  case NUMBER_OUT_OF_RANGE
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_NUMBER_OUT_OF_RANGE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the numerical value is out of range for any type
    */
  case NUMBER_TOO_BIG
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_NUMBER_TOO_BIG
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * cannot parse as variant of the specified type
    */
  case TYPE_ERROR
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_TYPE_ERROR
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * an unexpected token was encountered
    */
  case UNEXPECTED_TOKEN
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_UNEXPECTED_TOKEN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * an unknown keyword was encountered
    */
  case UNKNOWN_KEYWORD
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_UNKNOWN_KEYWORD
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * unterminated string constant
    */
  case UNTERMINATED_STRING_CONSTANT
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_UNTERMINATED_STRING_CONSTANT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * no value given
    */
  case VALUE_EXPECTED
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_VALUE_EXPECTED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * variant was too deeply nested; #GVariant is only guaranteed to handle
    * nesting up to 64 levels (Since: 2.64)
    */
  case RECURSION
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_RECURSION
      )
end VariantParseError

object VariantParseError:
  def fromRaw(raw: GVariantParseError): VariantParseError =
    raw match
      case GVariantParseError.G_VARIANT_PARSE_ERROR_FAILED =>
        VariantParseError.FAILED
      case GVariantParseError.G_VARIANT_PARSE_ERROR_BASIC_TYPE_EXPECTED =>
        VariantParseError.BASIC_TYPE_EXPECTED
      case GVariantParseError.G_VARIANT_PARSE_ERROR_CANNOT_INFER_TYPE =>
        VariantParseError.CANNOT_INFER_TYPE
      case GVariantParseError.G_VARIANT_PARSE_ERROR_DEFINITE_TYPE_EXPECTED =>
        VariantParseError.DEFINITE_TYPE_EXPECTED
      case GVariantParseError.G_VARIANT_PARSE_ERROR_INPUT_NOT_AT_END =>
        VariantParseError.INPUT_NOT_AT_END
      case GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_CHARACTER =>
        VariantParseError.INVALID_CHARACTER
      case GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_FORMAT_STRING =>
        VariantParseError.INVALID_FORMAT_STRING
      case GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_OBJECT_PATH =>
        VariantParseError.INVALID_OBJECT_PATH
      case GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_SIGNATURE =>
        VariantParseError.INVALID_SIGNATURE
      case GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_TYPE_STRING =>
        VariantParseError.INVALID_TYPE_STRING
      case GVariantParseError.G_VARIANT_PARSE_ERROR_NO_COMMON_TYPE =>
        VariantParseError.NO_COMMON_TYPE
      case GVariantParseError.G_VARIANT_PARSE_ERROR_NUMBER_OUT_OF_RANGE =>
        VariantParseError.NUMBER_OUT_OF_RANGE
      case GVariantParseError.G_VARIANT_PARSE_ERROR_NUMBER_TOO_BIG =>
        VariantParseError.NUMBER_TOO_BIG
      case GVariantParseError.G_VARIANT_PARSE_ERROR_TYPE_ERROR =>
        VariantParseError.TYPE_ERROR
      case GVariantParseError.G_VARIANT_PARSE_ERROR_UNEXPECTED_TOKEN =>
        VariantParseError.UNEXPECTED_TOKEN
      case GVariantParseError.G_VARIANT_PARSE_ERROR_UNKNOWN_KEYWORD =>
        VariantParseError.UNKNOWN_KEYWORD
      case GVariantParseError.G_VARIANT_PARSE_ERROR_UNTERMINATED_STRING_CONSTANT =>
        VariantParseError.UNTERMINATED_STRING_CONSTANT
      case GVariantParseError.G_VARIANT_PARSE_ERROR_VALUE_EXPECTED =>
        VariantParseError.VALUE_EXPECTED
      case GVariantParseError.G_VARIANT_PARSE_ERROR_RECURSION =>
        VariantParseError.RECURSION
  end fromRaw
end VariantParseError
