package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GErrorType

/** The possible errors, used in the @v_error field of #GTokenValue, when the
  * token is a %G_TOKEN_ERROR.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ErrorType(val raw: GErrorType):
  /** unknown error
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN extends ErrorType(GErrorType.G_ERR_UNKNOWN)

  /** unexpected end of file
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNEXP_EOF extends ErrorType(GErrorType.G_ERR_UNEXP_EOF)

  /** unterminated string constant
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNEXP_EOF_IN_STRING
      extends ErrorType(GErrorType.G_ERR_UNEXP_EOF_IN_STRING)

  /** unterminated comment
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNEXP_EOF_IN_COMMENT
      extends ErrorType(GErrorType.G_ERR_UNEXP_EOF_IN_COMMENT)

  /** non-digit character in a number
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NON_DIGIT_IN_CONST extends ErrorType(GErrorType.G_ERR_NON_DIGIT_IN_CONST)

  /** digit beyond radix in a number
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DIGIT_RADIX extends ErrorType(GErrorType.G_ERR_DIGIT_RADIX)

  /** non-decimal floating point number
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FLOAT_RADIX extends ErrorType(GErrorType.G_ERR_FLOAT_RADIX)

  /** malformed floating point number
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FLOAT_MALFORMED extends ErrorType(GErrorType.G_ERR_FLOAT_MALFORMED)
end ErrorType

object ErrorType:
  def fromRaw(raw: GErrorType): ErrorType =
    raw match
      case GErrorType.G_ERR_UNKNOWN             => ErrorType.UNKNOWN
      case GErrorType.G_ERR_UNEXP_EOF           => ErrorType.UNEXP_EOF
      case GErrorType.G_ERR_UNEXP_EOF_IN_STRING => ErrorType.UNEXP_EOF_IN_STRING
      case GErrorType.G_ERR_UNEXP_EOF_IN_COMMENT =>
        ErrorType.UNEXP_EOF_IN_COMMENT
      case GErrorType.G_ERR_NON_DIGIT_IN_CONST => ErrorType.NON_DIGIT_IN_CONST
      case GErrorType.G_ERR_DIGIT_RADIX        => ErrorType.DIGIT_RADIX
      case GErrorType.G_ERR_FLOAT_RADIX        => ErrorType.FLOAT_RADIX
      case GErrorType.G_ERR_FLOAT_MALFORMED    => ErrorType.FLOAT_MALFORMED
  end fromRaw
end ErrorType
