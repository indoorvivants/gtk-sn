package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_buffer_diff_flags_t: _BUFFER_DIFF_FLAG_EQUAL: equal buffers. _BUFFER_DIFF_FLAG_CONTENT_TYPE_MISMATCH: buffers with different #hb_buffer_content_type_t. _BUFFER_DIFF_FLAG_LENGTH_MISMATCH: buffers with differing length. _BUFFER_DIFF_FLAG_NOTDEF_PRESENT: `.notdef` glyph is present in the reference buffer. _BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT: dotted circle glyph is present in the reference buffer. _BUFFER_DIFF_FLAG_CODEPOINT_MISMATCH: difference in #hb_glyph_info_t.codepoint _BUFFER_DIFF_FLAG_CLUSTER_MISMATCH: difference in #hb_glyph_info_t.cluster _BUFFER_DIFF_FLAG_GLYPH_FLAGS_MISMATCH: difference in #hb_glyph_flags_t. _BUFFER_DIFF_FLAG_POSITION_MISMATCH: difference in #hb_glyph_position_t.
*/
opaque type hb_buffer_diff_flags_t = CUnsignedInt
object hb_buffer_diff_flags_t extends _BindgenEnumCUnsignedInt[hb_buffer_diff_flags_t]:
  given _tag: Tag[hb_buffer_diff_flags_t] = Tag.UInt
  inline def define(inline a: Long): hb_buffer_diff_flags_t = a.toUInt
  val HB_BUFFER_DIFF_FLAG_EQUAL = define(0)
  val HB_BUFFER_DIFF_FLAG_CONTENT_TYPE_MISMATCH = define(1)
  val HB_BUFFER_DIFF_FLAG_LENGTH_MISMATCH = define(2)
  val HB_BUFFER_DIFF_FLAG_NOTDEF_PRESENT = define(4)
  val HB_BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT = define(8)
  val HB_BUFFER_DIFF_FLAG_CODEPOINT_MISMATCH = define(16)
  val HB_BUFFER_DIFF_FLAG_CLUSTER_MISMATCH = define(32)
  val HB_BUFFER_DIFF_FLAG_GLYPH_FLAGS_MISMATCH = define(64)
  val HB_BUFFER_DIFF_FLAG_POSITION_MISMATCH = define(128)
  def getName(value: hb_buffer_diff_flags_t): Option[String] =
    value match
      case `HB_BUFFER_DIFF_FLAG_EQUAL` => Some("HB_BUFFER_DIFF_FLAG_EQUAL")
      case `HB_BUFFER_DIFF_FLAG_CONTENT_TYPE_MISMATCH` => Some("HB_BUFFER_DIFF_FLAG_CONTENT_TYPE_MISMATCH")
      case `HB_BUFFER_DIFF_FLAG_LENGTH_MISMATCH` => Some("HB_BUFFER_DIFF_FLAG_LENGTH_MISMATCH")
      case `HB_BUFFER_DIFF_FLAG_NOTDEF_PRESENT` => Some("HB_BUFFER_DIFF_FLAG_NOTDEF_PRESENT")
      case `HB_BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT` => Some("HB_BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT")
      case `HB_BUFFER_DIFF_FLAG_CODEPOINT_MISMATCH` => Some("HB_BUFFER_DIFF_FLAG_CODEPOINT_MISMATCH")
      case `HB_BUFFER_DIFF_FLAG_CLUSTER_MISMATCH` => Some("HB_BUFFER_DIFF_FLAG_CLUSTER_MISMATCH")
      case `HB_BUFFER_DIFF_FLAG_GLYPH_FLAGS_MISMATCH` => Some("HB_BUFFER_DIFF_FLAG_GLYPH_FLAGS_MISMATCH")
      case `HB_BUFFER_DIFF_FLAG_POSITION_MISMATCH` => Some("HB_BUFFER_DIFF_FLAG_POSITION_MISMATCH")
      case _ => _root_.scala.None
  extension (a: hb_buffer_diff_flags_t)
    inline def &(b: hb_buffer_diff_flags_t): hb_buffer_diff_flags_t = a & b
    inline def |(b: hb_buffer_diff_flags_t): hb_buffer_diff_flags_t = a | b
    inline def is(b: hb_buffer_diff_flags_t): Boolean = (a & b) == b