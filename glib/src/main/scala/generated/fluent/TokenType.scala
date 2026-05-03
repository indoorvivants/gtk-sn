package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GTokenType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The possible types of token returned from each g_scanner_get_next_token()
  * call.
  */
enum TokenType(val raw: GTokenType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the end of the file
    */
  case EOF extends TokenType(GTokenType.G_TOKEN_EOF)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a '(' character
    */
  case LEFT_PAREN extends TokenType(GTokenType.G_TOKEN_LEFT_PAREN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a ')' character
    */
  case RIGHT_PAREN extends TokenType(GTokenType.G_TOKEN_RIGHT_PAREN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a '{' character
    */
  case LEFT_CURLY extends TokenType(GTokenType.G_TOKEN_LEFT_CURLY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a '}' character
    */
  case RIGHT_CURLY extends TokenType(GTokenType.G_TOKEN_RIGHT_CURLY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a '[' character
    */
  case LEFT_BRACE extends TokenType(GTokenType.G_TOKEN_LEFT_BRACE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a ']' character
    */
  case RIGHT_BRACE extends TokenType(GTokenType.G_TOKEN_RIGHT_BRACE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a '=' character
    */
  case EQUAL_SIGN extends TokenType(GTokenType.G_TOKEN_EQUAL_SIGN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a ',' character
    */
  case COMMA extends TokenType(GTokenType.G_TOKEN_COMMA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * not a token
    */
  case NONE extends TokenType(GTokenType.G_TOKEN_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * an error occurred
    */
  case ERROR extends TokenType(GTokenType.G_TOKEN_ERROR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a character
    */
  case CHAR extends TokenType(GTokenType.G_TOKEN_CHAR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a binary integer
    */
  case BINARY extends TokenType(GTokenType.G_TOKEN_BINARY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * an octal integer
    */
  case OCTAL extends TokenType(GTokenType.G_TOKEN_OCTAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * an integer
    */
  case INT extends TokenType(GTokenType.G_TOKEN_INT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a hex integer
    */
  case HEX extends TokenType(GTokenType.G_TOKEN_HEX)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a floating point number
    */
  case FLOAT extends TokenType(GTokenType.G_TOKEN_FLOAT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a string
    */
  case STRING extends TokenType(GTokenType.G_TOKEN_STRING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a symbol
    */
  case SYMBOL extends TokenType(GTokenType.G_TOKEN_SYMBOL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * an identifier
    */
  case IDENTIFIER extends TokenType(GTokenType.G_TOKEN_IDENTIFIER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a null identifier
    */
  case IDENTIFIER_NULL extends TokenType(GTokenType.G_TOKEN_IDENTIFIER_NULL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * one line comment
    */
  case COMMENT_SINGLE extends TokenType(GTokenType.G_TOKEN_COMMENT_SINGLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * multi line comment
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
