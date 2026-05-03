package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GErrorType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The possible errors, used in the @v_error field of #GTokenValue, when the
  * token is a %G_TOKEN_ERROR.
  */
enum ErrorType(val raw: GErrorType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * unknown error
    */
  case UNKNOWN extends ErrorType(GErrorType.G_ERR_UNKNOWN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * unexpected end of file
    */
  case UNEXP_EOF extends ErrorType(GErrorType.G_ERR_UNEXP_EOF)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * unterminated string constant
    */
  case UNEXP_EOF_IN_STRING
      extends ErrorType(GErrorType.G_ERR_UNEXP_EOF_IN_STRING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * unterminated comment
    */
  case UNEXP_EOF_IN_COMMENT
      extends ErrorType(GErrorType.G_ERR_UNEXP_EOF_IN_COMMENT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * non-digit character in a number
    */
  case NON_DIGIT_IN_CONST extends ErrorType(GErrorType.G_ERR_NON_DIGIT_IN_CONST)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * digit beyond radix in a number
    */
  case DIGIT_RADIX extends ErrorType(GErrorType.G_ERR_DIGIT_RADIX)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * non-decimal floating point number
    */
  case FLOAT_RADIX extends ErrorType(GErrorType.G_ERR_FLOAT_RADIX)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * malformed floating point number
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
