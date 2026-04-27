package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GNumberParserError: _NUMBER_PARSER_ERROR_INVALID: string was not a valid number _NUMBER_PARSER_ERROR_OUT_OF_BOUNDS: string was a number, but out of bounds
*/
opaque type GNumberParserError = CUnsignedInt
object GNumberParserError extends _BindgenEnumCUnsignedInt[GNumberParserError]:
  given _tag: Tag[GNumberParserError] = Tag.UInt
  inline def define(inline a: Long): GNumberParserError = a.toUInt
  val G_NUMBER_PARSER_ERROR_INVALID = define(0)
  val G_NUMBER_PARSER_ERROR_OUT_OF_BOUNDS = define(1)
  def getName(value: GNumberParserError): Option[String] =
    value match
      case `G_NUMBER_PARSER_ERROR_INVALID` => Some("G_NUMBER_PARSER_ERROR_INVALID")
      case `G_NUMBER_PARSER_ERROR_OUT_OF_BOUNDS` => Some("G_NUMBER_PARSER_ERROR_OUT_OF_BOUNDS")
      case _ => _root_.scala.None
  extension (a: GNumberParserError)
    inline def &(b: GNumberParserError): GNumberParserError = a & b
    inline def |(b: GNumberParserError): GNumberParserError = a | b
    inline def is(b: GNumberParserError): Boolean = (a & b) == b