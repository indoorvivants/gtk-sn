package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTokenType = CUnsignedInt
object GTokenType extends _BindgenEnumCUnsignedInt[GTokenType]:
  given _tag: Tag[GTokenType] = Tag.UInt
  inline def define(inline a: Long): GTokenType = a.toUInt
  val G_TOKEN_EOF = define(0)
  val G_TOKEN_LEFT_PAREN = define(40)
  val G_TOKEN_RIGHT_PAREN = define(41)
  val G_TOKEN_LEFT_CURLY = define(123)
  val G_TOKEN_RIGHT_CURLY = define(125)
  val G_TOKEN_LEFT_BRACE = define(91)
  val G_TOKEN_RIGHT_BRACE = define(93)
  val G_TOKEN_EQUAL_SIGN = define(61)
  val G_TOKEN_COMMA = define(44)
  val G_TOKEN_NONE = define(256)
  val G_TOKEN_ERROR = define(257)
  val G_TOKEN_CHAR = define(258)
  val G_TOKEN_BINARY = define(259)
  val G_TOKEN_OCTAL = define(260)
  val G_TOKEN_INT = define(261)
  val G_TOKEN_HEX = define(262)
  val G_TOKEN_FLOAT = define(263)
  val G_TOKEN_STRING = define(264)
  val G_TOKEN_SYMBOL = define(265)
  val G_TOKEN_IDENTIFIER = define(266)
  val G_TOKEN_IDENTIFIER_NULL = define(267)
  val G_TOKEN_COMMENT_SINGLE = define(268)
  val G_TOKEN_COMMENT_MULTI = define(269)
  val G_TOKEN_LAST = define(270)
  def getName(value: GTokenType): Option[String] =
    value match
      case `G_TOKEN_EOF` => Some("G_TOKEN_EOF")
      case `G_TOKEN_LEFT_PAREN` => Some("G_TOKEN_LEFT_PAREN")
      case `G_TOKEN_RIGHT_PAREN` => Some("G_TOKEN_RIGHT_PAREN")
      case `G_TOKEN_LEFT_CURLY` => Some("G_TOKEN_LEFT_CURLY")
      case `G_TOKEN_RIGHT_CURLY` => Some("G_TOKEN_RIGHT_CURLY")
      case `G_TOKEN_LEFT_BRACE` => Some("G_TOKEN_LEFT_BRACE")
      case `G_TOKEN_RIGHT_BRACE` => Some("G_TOKEN_RIGHT_BRACE")
      case `G_TOKEN_EQUAL_SIGN` => Some("G_TOKEN_EQUAL_SIGN")
      case `G_TOKEN_COMMA` => Some("G_TOKEN_COMMA")
      case `G_TOKEN_NONE` => Some("G_TOKEN_NONE")
      case `G_TOKEN_ERROR` => Some("G_TOKEN_ERROR")
      case `G_TOKEN_CHAR` => Some("G_TOKEN_CHAR")
      case `G_TOKEN_BINARY` => Some("G_TOKEN_BINARY")
      case `G_TOKEN_OCTAL` => Some("G_TOKEN_OCTAL")
      case `G_TOKEN_INT` => Some("G_TOKEN_INT")
      case `G_TOKEN_HEX` => Some("G_TOKEN_HEX")
      case `G_TOKEN_FLOAT` => Some("G_TOKEN_FLOAT")
      case `G_TOKEN_STRING` => Some("G_TOKEN_STRING")
      case `G_TOKEN_SYMBOL` => Some("G_TOKEN_SYMBOL")
      case `G_TOKEN_IDENTIFIER` => Some("G_TOKEN_IDENTIFIER")
      case `G_TOKEN_IDENTIFIER_NULL` => Some("G_TOKEN_IDENTIFIER_NULL")
      case `G_TOKEN_COMMENT_SINGLE` => Some("G_TOKEN_COMMENT_SINGLE")
      case `G_TOKEN_COMMENT_MULTI` => Some("G_TOKEN_COMMENT_MULTI")
      case `G_TOKEN_LAST` => Some("G_TOKEN_LAST")
      case _ => _root_.scala.None
  extension (a: GTokenType)
    inline def &(b: GTokenType): GTokenType = a & b
    inline def |(b: GTokenType): GTokenType = a | b
    inline def is(b: GTokenType): Boolean = (a & b) == b