package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_buffer_flags_t: _BUFFER_FLAG_DEFAULT: the default buffer flag. _BUFFER_FLAG_BOT: flag indicating that special handling of the beginning of text paragraph can be applied to this buffer. Should usually be set, unless you are passing to the buffer only part of the text without the full context. _BUFFER_FLAG_EOT: flag indicating that special handling of the end of text paragraph can be applied to this buffer, similar to _BUFFER_FLAG_BOT. _BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES: flag indication that character with Default_Ignorable Unicode property should use the corresponding glyph from the font, instead of hiding them (done by replacing them with the space glyph and zeroing the advance width.) This flag takes precedence over _BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES. _BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES: flag indication that character with Default_Ignorable Unicode property should be removed from glyph string instead of hiding them (done by replacing them with the space glyph and zeroing the advance width.) _BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES takes precedence over this flag. Since: 1.8.0 _BUFFER_FLAG_DO_NOT_INSERT_DOTTED_CIRCLE: flag indicating that a dotted circle should not be inserted in the rendering of incorrect character sequences (such at <0905 093E>). Since: 2.4.0 _BUFFER_FLAG_VERIFY: flag indicating that the hb_shape() call and its variants should perform various verification processes on the results of the shaping operation on the buffer. If the verification fails, then either a buffer message is sent, if a message handler is installed on the buffer, or a message is written to standard error. In either case, the shaping result might be modified to show the failed output. Since: 3.4.0 _BUFFER_FLAG_PRODUCE_UNSAFE_TO_CONCAT: flag indicating that the _GLYPH_FLAG_UNSAFE_TO_CONCAT glyph-flag should be produced by the shaper. By default it will not be produced since it incurs a cost. Since: 4.0.0 _BUFFER_FLAG_PRODUCE_SAFE_TO_INSERT_TATWEEL: flag indicating that the _GLYPH_FLAG_SAFE_TO_INSERT_TATWEEL glyph-flag should be produced by the shaper. By default it will not be produced. Since: 5.1.0 _BUFFER_FLAG_DEFINED: All currently defined flags: Since: 4.4.0
*/
opaque type hb_buffer_flags_t = CUnsignedInt
object hb_buffer_flags_t extends _BindgenEnumCUnsignedInt[hb_buffer_flags_t]:
  given _tag: Tag[hb_buffer_flags_t] = Tag.UInt
  inline def define(inline a: Long): hb_buffer_flags_t = a.toUInt
  val HB_BUFFER_FLAG_DEFAULT = define(0)
  val HB_BUFFER_FLAG_BOT = define(1)
  val HB_BUFFER_FLAG_EOT = define(2)
  val HB_BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES = define(4)
  val HB_BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES = define(8)
  val HB_BUFFER_FLAG_DO_NOT_INSERT_DOTTED_CIRCLE = define(16)
  val HB_BUFFER_FLAG_VERIFY = define(32)
  val HB_BUFFER_FLAG_PRODUCE_UNSAFE_TO_CONCAT = define(64)
  val HB_BUFFER_FLAG_PRODUCE_SAFE_TO_INSERT_TATWEEL = define(128)
  val HB_BUFFER_FLAG_DEFINED = define(255)
  def getName(value: hb_buffer_flags_t): Option[String] =
    value match
      case `HB_BUFFER_FLAG_DEFAULT` => Some("HB_BUFFER_FLAG_DEFAULT")
      case `HB_BUFFER_FLAG_BOT` => Some("HB_BUFFER_FLAG_BOT")
      case `HB_BUFFER_FLAG_EOT` => Some("HB_BUFFER_FLAG_EOT")
      case `HB_BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES` => Some("HB_BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES")
      case `HB_BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES` => Some("HB_BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES")
      case `HB_BUFFER_FLAG_DO_NOT_INSERT_DOTTED_CIRCLE` => Some("HB_BUFFER_FLAG_DO_NOT_INSERT_DOTTED_CIRCLE")
      case `HB_BUFFER_FLAG_VERIFY` => Some("HB_BUFFER_FLAG_VERIFY")
      case `HB_BUFFER_FLAG_PRODUCE_UNSAFE_TO_CONCAT` => Some("HB_BUFFER_FLAG_PRODUCE_UNSAFE_TO_CONCAT")
      case `HB_BUFFER_FLAG_PRODUCE_SAFE_TO_INSERT_TATWEEL` => Some("HB_BUFFER_FLAG_PRODUCE_SAFE_TO_INSERT_TATWEEL")
      case `HB_BUFFER_FLAG_DEFINED` => Some("HB_BUFFER_FLAG_DEFINED")
      case _ => _root_.scala.None
  extension (a: hb_buffer_flags_t)
    inline def &(b: hb_buffer_flags_t): hb_buffer_flags_t = a & b
    inline def |(b: hb_buffer_flags_t): hb_buffer_flags_t = a | b
    inline def is(b: hb_buffer_flags_t): Boolean = (a & b) == b