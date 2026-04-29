package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_buffer_serialize_format_t: _BUFFER_SERIALIZE_FORMAT_TEXT: a human-readable, plain text format. _BUFFER_SERIALIZE_FORMAT_JSON: a machine-readable JSON format. _BUFFER_SERIALIZE_FORMAT_INVALID: invalid format.
*/
opaque type hb_buffer_serialize_format_t = CUnsignedInt
object hb_buffer_serialize_format_t extends _BindgenEnumCUnsignedInt[hb_buffer_serialize_format_t]:
  given _tag: Tag[hb_buffer_serialize_format_t] = Tag.UInt
  inline def define(inline a: Long): hb_buffer_serialize_format_t = a.toUInt
  val HB_BUFFER_SERIALIZE_FORMAT_TEXT = define(1413830740)
  val HB_BUFFER_SERIALIZE_FORMAT_JSON = define(1246973774)
  val HB_BUFFER_SERIALIZE_FORMAT_INVALID = define(0)
  def getName(value: hb_buffer_serialize_format_t): Option[String] =
    value match
      case `HB_BUFFER_SERIALIZE_FORMAT_TEXT` => Some("HB_BUFFER_SERIALIZE_FORMAT_TEXT")
      case `HB_BUFFER_SERIALIZE_FORMAT_JSON` => Some("HB_BUFFER_SERIALIZE_FORMAT_JSON")
      case `HB_BUFFER_SERIALIZE_FORMAT_INVALID` => Some("HB_BUFFER_SERIALIZE_FORMAT_INVALID")
      case _ => _root_.scala.None
  extension (a: hb_buffer_serialize_format_t)
    inline def &(b: hb_buffer_serialize_format_t): hb_buffer_serialize_format_t = a & b
    inline def |(b: hb_buffer_serialize_format_t): hb_buffer_serialize_format_t = a | b
    inline def is(b: hb_buffer_serialize_format_t): Boolean = (a & b) == b