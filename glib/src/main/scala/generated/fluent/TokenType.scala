package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GTokenType

/** The possible types of token returned from each g_scanner_get_next_token()
  * call.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum TokenType(val raw: GTokenType):
  /** the end of the file
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EOF extends TokenType(GTokenType.G_TOKEN_EOF)

  /** a '(' character
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LEFT_PAREN extends TokenType(GTokenType.G_TOKEN_LEFT_PAREN)

  /** a ')' character
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RIGHT_PAREN extends TokenType(GTokenType.G_TOKEN_RIGHT_PAREN)

  /** a '{' character
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LEFT_CURLY extends TokenType(GTokenType.G_TOKEN_LEFT_CURLY)

  /** a '}' character
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RIGHT_CURLY extends TokenType(GTokenType.G_TOKEN_RIGHT_CURLY)

  /** a '[' character
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LEFT_BRACE extends TokenType(GTokenType.G_TOKEN_LEFT_BRACE)

  /** a ']' character
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RIGHT_BRACE extends TokenType(GTokenType.G_TOKEN_RIGHT_BRACE)

  /** a '=' character
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EQUAL_SIGN extends TokenType(GTokenType.G_TOKEN_EQUAL_SIGN)

  /** a ',' character
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COMMA extends TokenType(GTokenType.G_TOKEN_COMMA)

  /** not a token
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends TokenType(GTokenType.G_TOKEN_NONE)

  /** an error occurred
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ERROR extends TokenType(GTokenType.G_TOKEN_ERROR)

  /** a character
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CHAR extends TokenType(GTokenType.G_TOKEN_CHAR)

  /** a binary integer
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BINARY extends TokenType(GTokenType.G_TOKEN_BINARY)

  /** an octal integer
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OCTAL extends TokenType(GTokenType.G_TOKEN_OCTAL)

  /** an integer
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INT extends TokenType(GTokenType.G_TOKEN_INT)

  /** a hex integer
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HEX extends TokenType(GTokenType.G_TOKEN_HEX)

  /** a floating point number
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FLOAT extends TokenType(GTokenType.G_TOKEN_FLOAT)

  /** a string
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STRING extends TokenType(GTokenType.G_TOKEN_STRING)

  /** a symbol
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SYMBOL extends TokenType(GTokenType.G_TOKEN_SYMBOL)

  /** an identifier
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case IDENTIFIER extends TokenType(GTokenType.G_TOKEN_IDENTIFIER)

  /** a null identifier
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case IDENTIFIER_NULL extends TokenType(GTokenType.G_TOKEN_IDENTIFIER_NULL)

  /** one line comment
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COMMENT_SINGLE extends TokenType(GTokenType.G_TOKEN_COMMENT_SINGLE)

  /** multi line comment
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COMMENT_MULTI extends TokenType(GTokenType.G_TOKEN_COMMENT_MULTI)
end TokenType

object TokenType:
  def fromRaw(raw: GTokenType): TokenType =
    raw match
      case GTokenType.G_TOKEN_EOF             => TokenType.EOF
      case GTokenType.G_TOKEN_LEFT_PAREN      => TokenType.LEFT_PAREN
      case GTokenType.G_TOKEN_RIGHT_PAREN     => TokenType.RIGHT_PAREN
      case GTokenType.G_TOKEN_LEFT_CURLY      => TokenType.LEFT_CURLY
      case GTokenType.G_TOKEN_RIGHT_CURLY     => TokenType.RIGHT_CURLY
      case GTokenType.G_TOKEN_LEFT_BRACE      => TokenType.LEFT_BRACE
      case GTokenType.G_TOKEN_RIGHT_BRACE     => TokenType.RIGHT_BRACE
      case GTokenType.G_TOKEN_EQUAL_SIGN      => TokenType.EQUAL_SIGN
      case GTokenType.G_TOKEN_COMMA           => TokenType.COMMA
      case GTokenType.G_TOKEN_NONE            => TokenType.NONE
      case GTokenType.G_TOKEN_ERROR           => TokenType.ERROR
      case GTokenType.G_TOKEN_CHAR            => TokenType.CHAR
      case GTokenType.G_TOKEN_BINARY          => TokenType.BINARY
      case GTokenType.G_TOKEN_OCTAL           => TokenType.OCTAL
      case GTokenType.G_TOKEN_INT             => TokenType.INT
      case GTokenType.G_TOKEN_HEX             => TokenType.HEX
      case GTokenType.G_TOKEN_FLOAT           => TokenType.FLOAT
      case GTokenType.G_TOKEN_STRING          => TokenType.STRING
      case GTokenType.G_TOKEN_SYMBOL          => TokenType.SYMBOL
      case GTokenType.G_TOKEN_IDENTIFIER      => TokenType.IDENTIFIER
      case GTokenType.G_TOKEN_IDENTIFIER_NULL => TokenType.IDENTIFIER_NULL
      case GTokenType.G_TOKEN_COMMENT_SINGLE  => TokenType.COMMENT_SINGLE
      case GTokenType.G_TOKEN_COMMENT_MULTI   => TokenType.COMMENT_MULTI
  end fromRaw
end TokenType
