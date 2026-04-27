package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_buffer_content_type_t: _BUFFER_CONTENT_TYPE_INVALID: Initial value for new buffer. _BUFFER_CONTENT_TYPE_UNICODE: The buffer contains input characters (before shaping). _BUFFER_CONTENT_TYPE_GLYPHS: The buffer contains output glyphs (after shaping).
*/
opaque type hb_buffer_content_type_t = CUnsignedInt
object hb_buffer_content_type_t extends _BindgenEnumCUnsignedInt[hb_buffer_content_type_t]:
  given _tag: Tag[hb_buffer_content_type_t] = Tag.UInt
  inline def define(inline a: Long): hb_buffer_content_type_t = a.toUInt
  val HB_BUFFER_CONTENT_TYPE_INVALID = define(0)
  val HB_BUFFER_CONTENT_TYPE_UNICODE = define(1)
  val HB_BUFFER_CONTENT_TYPE_GLYPHS = define(2)
  def getName(value: hb_buffer_content_type_t): Option[String] =
    value match
      case `HB_BUFFER_CONTENT_TYPE_INVALID` => Some("HB_BUFFER_CONTENT_TYPE_INVALID")
      case `HB_BUFFER_CONTENT_TYPE_UNICODE` => Some("HB_BUFFER_CONTENT_TYPE_UNICODE")
      case `HB_BUFFER_CONTENT_TYPE_GLYPHS` => Some("HB_BUFFER_CONTENT_TYPE_GLYPHS")
      case _ => _root_.scala.None
  extension (a: hb_buffer_content_type_t)
    inline def &(b: hb_buffer_content_type_t): hb_buffer_content_type_t = a & b
    inline def |(b: hb_buffer_content_type_t): hb_buffer_content_type_t = a | b
    inline def is(b: hb_buffer_content_type_t): Boolean = (a & b) == b