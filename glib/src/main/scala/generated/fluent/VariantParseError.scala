package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GVariantParseError

/** Error codes returned by parsing text-format GVariants.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum VariantParseError(val raw: GVariantParseError):
  /** generic error (unused)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FAILED
      extends VariantParseError(GVariantParseError.G_VARIANT_PARSE_ERROR_FAILED)

  /** a non-basic #GVariantType was given where a basic type was expected
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BASIC_TYPE_EXPECTED
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_BASIC_TYPE_EXPECTED
      )

  /** cannot infer the #GVariantType
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CANNOT_INFER_TYPE
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_CANNOT_INFER_TYPE
      )

  /** an indefinite #GVariantType was given where a definite type was expected
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DEFINITE_TYPE_EXPECTED
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_DEFINITE_TYPE_EXPECTED
      )

  /** extra data after parsing finished
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INPUT_NOT_AT_END
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_INPUT_NOT_AT_END
      )

  /** invalid character in number or unicode escape
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_CHARACTER
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_CHARACTER
      )

  /** not a valid #GVariant format string
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_FORMAT_STRING
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_FORMAT_STRING
      )

  /** not a valid object path
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_OBJECT_PATH
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_OBJECT_PATH
      )

  /** not a valid type signature
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_SIGNATURE
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_SIGNATURE
      )

  /** not a valid #GVariant type string
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_TYPE_STRING
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_INVALID_TYPE_STRING
      )

  /** could not find a common type for array entries
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NO_COMMON_TYPE
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_NO_COMMON_TYPE
      )

  /** the numerical value is out of range of the given type
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NUMBER_OUT_OF_RANGE
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_NUMBER_OUT_OF_RANGE
      )

  /** the numerical value is out of range for any type
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NUMBER_TOO_BIG
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_NUMBER_TOO_BIG
      )

  /** cannot parse as variant of the specified type
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TYPE_ERROR
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_TYPE_ERROR
      )

  /** an unexpected token was encountered
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNEXPECTED_TOKEN
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_UNEXPECTED_TOKEN
      )

  /** an unknown keyword was encountered
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN_KEYWORD
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_UNKNOWN_KEYWORD
      )

  /** unterminated string constant
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNTERMINATED_STRING_CONSTANT
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_UNTERMINATED_STRING_CONSTANT
      )

  /** no value given
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VALUE_EXPECTED
      extends VariantParseError(
        GVariantParseError.G_VARIANT_PARSE_ERROR_VALUE_EXPECTED
      )

  /** variant was too deeply nested; #GVariant is only guaranteed to handle
    * nesting up to 64 levels (Since: 2.64)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
