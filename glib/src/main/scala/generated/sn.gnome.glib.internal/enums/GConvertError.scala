package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GConvertError: _CONVERT_ERROR_NO_CONVERSION: Conversion between the requested character sets is not supported. _CONVERT_ERROR_ILLEGAL_SEQUENCE: Invalid byte sequence in conversion input; or the character sequence could not be represented in the target character set. _CONVERT_ERROR_FAILED: Conversion failed for some reason. _CONVERT_ERROR_PARTIAL_INPUT: Partial character sequence at end of input. _CONVERT_ERROR_BAD_URI: URI is invalid. _CONVERT_ERROR_NOT_ABSOLUTE_PATH: Pathname is not an absolute path. _CONVERT_ERROR_NO_MEMORY: No memory available. Since: 2.40 _CONVERT_ERROR_EMBEDDED_NUL: An embedded NUL character is present in conversion output where a NUL-terminated string is expected. Since: 2.56
*/
opaque type GConvertError = CUnsignedInt
object GConvertError extends _BindgenEnumCUnsignedInt[GConvertError]:
  given _tag: Tag[GConvertError] = Tag.UInt
  inline def define(inline a: Long): GConvertError = a.toUInt
  val G_CONVERT_ERROR_NO_CONVERSION = define(0)
  val G_CONVERT_ERROR_ILLEGAL_SEQUENCE = define(1)
  val G_CONVERT_ERROR_FAILED = define(2)
  val G_CONVERT_ERROR_PARTIAL_INPUT = define(3)
  val G_CONVERT_ERROR_BAD_URI = define(4)
  val G_CONVERT_ERROR_NOT_ABSOLUTE_PATH = define(5)
  val G_CONVERT_ERROR_NO_MEMORY = define(6)
  val G_CONVERT_ERROR_EMBEDDED_NUL = define(7)
  def getName(value: GConvertError): Option[String] =
    value match
      case `G_CONVERT_ERROR_NO_CONVERSION` => Some("G_CONVERT_ERROR_NO_CONVERSION")
      case `G_CONVERT_ERROR_ILLEGAL_SEQUENCE` => Some("G_CONVERT_ERROR_ILLEGAL_SEQUENCE")
      case `G_CONVERT_ERROR_FAILED` => Some("G_CONVERT_ERROR_FAILED")
      case `G_CONVERT_ERROR_PARTIAL_INPUT` => Some("G_CONVERT_ERROR_PARTIAL_INPUT")
      case `G_CONVERT_ERROR_BAD_URI` => Some("G_CONVERT_ERROR_BAD_URI")
      case `G_CONVERT_ERROR_NOT_ABSOLUTE_PATH` => Some("G_CONVERT_ERROR_NOT_ABSOLUTE_PATH")
      case `G_CONVERT_ERROR_NO_MEMORY` => Some("G_CONVERT_ERROR_NO_MEMORY")
      case `G_CONVERT_ERROR_EMBEDDED_NUL` => Some("G_CONVERT_ERROR_EMBEDDED_NUL")
      case _ => _root_.scala.None
  extension (a: GConvertError)
    inline def &(b: GConvertError): GConvertError = a & b
    inline def |(b: GConvertError): GConvertError = a | b
    inline def is(b: GConvertError): Boolean = (a & b) == b