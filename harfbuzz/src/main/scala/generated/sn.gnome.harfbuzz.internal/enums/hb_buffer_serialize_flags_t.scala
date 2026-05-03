package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_buffer_serialize_flags_t: _BUFFER_SERIALIZE_FLAG_DEFAULT: serialize glyph names, clusters and positions. _BUFFER_SERIALIZE_FLAG_NO_CLUSTERS: do not serialize glyph cluster. _BUFFER_SERIALIZE_FLAG_NO_POSITIONS: do not serialize glyph position information. _BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES: do no serialize glyph name. _BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS: serialize glyph extents. _BUFFER_SERIALIZE_FLAG_GLYPH_FLAGS: serialize glyph flags. Since: 1.5.0 _BUFFER_SERIALIZE_FLAG_NO_ADVANCES: do not serialize glyph advances, glyph offsets will reflect absolute glyph positions. Since: 1.8.0 _BUFFER_SERIALIZE_FLAG_DEFINED: All currently defined flags. Since: 4.4.0
*/
opaque type hb_buffer_serialize_flags_t = CUnsignedInt
object hb_buffer_serialize_flags_t extends _BindgenEnumCUnsignedInt[hb_buffer_serialize_flags_t]:
  given _tag: Tag[hb_buffer_serialize_flags_t] = Tag.UInt
  inline def define(inline a: Long): hb_buffer_serialize_flags_t = a.toUInt
  val HB_BUFFER_SERIALIZE_FLAG_DEFAULT = define(0)
  val HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS = define(1)
  val HB_BUFFER_SERIALIZE_FLAG_NO_POSITIONS = define(2)
  val HB_BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES = define(4)
  val HB_BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS = define(8)
  val HB_BUFFER_SERIALIZE_FLAG_GLYPH_FLAGS = define(16)
  val HB_BUFFER_SERIALIZE_FLAG_NO_ADVANCES = define(32)
  val HB_BUFFER_SERIALIZE_FLAG_DEFINED = define(63)
  def getName(value: hb_buffer_serialize_flags_t): Option[String] =
    value match
      case `HB_BUFFER_SERIALIZE_FLAG_DEFAULT` => Some("HB_BUFFER_SERIALIZE_FLAG_DEFAULT")
      case `HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS` => Some("HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS")
      case `HB_BUFFER_SERIALIZE_FLAG_NO_POSITIONS` => Some("HB_BUFFER_SERIALIZE_FLAG_NO_POSITIONS")
      case `HB_BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES` => Some("HB_BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES")
      case `HB_BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS` => Some("HB_BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS")
      case `HB_BUFFER_SERIALIZE_FLAG_GLYPH_FLAGS` => Some("HB_BUFFER_SERIALIZE_FLAG_GLYPH_FLAGS")
      case `HB_BUFFER_SERIALIZE_FLAG_NO_ADVANCES` => Some("HB_BUFFER_SERIALIZE_FLAG_NO_ADVANCES")
      case `HB_BUFFER_SERIALIZE_FLAG_DEFINED` => Some("HB_BUFFER_SERIALIZE_FLAG_DEFINED")
      case _ => _root_.scala.None
  extension (a: hb_buffer_serialize_flags_t)
    inline def &(b: hb_buffer_serialize_flags_t): hb_buffer_serialize_flags_t = a & b
    inline def |(b: hb_buffer_serialize_flags_t): hb_buffer_serialize_flags_t = a | b
    inline def is(b: hb_buffer_serialize_flags_t): Boolean = (a & b) == b