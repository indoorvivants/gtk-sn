package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_glyph_flags_t: _GLYPH_FLAG_UNSAFE_TO_BREAK: Indicates that if input text is broken at the beginning of the cluster this glyph is part of, then both sides need to be re-shaped, as the result might be different. On the flip side, it means that when this flag is not present, then it is safe to break the glyph-run at the beginning of this cluster, and the two sides will represent the exact same result one would get if breaking input text at the beginning of this cluster and shaping the two sides separately. This can be used to optimize paragraph layout, by avoiding re-shaping of each line after line-breaking. _GLYPH_FLAG_UNSAFE_TO_CONCAT: Indicates that if input text is changed on one side of the beginning of the cluster this glyph is part of, then the shaping results for the other side might change. Note that the absence of this flag will NOT by itself mean that it IS safe to concat text. Only two pieces of text both of which clear of this flag can be concatenated safely. This can be used to optimize paragraph layout, by avoiding re-shaping of each line after line-breaking, by limiting the reshaping to a small piece around the breaking position only, even if the breaking position carries the #HB_GLYPH_FLAG_UNSAFE_TO_BREAK or when hyphenation or other text transformation happens at line-break position, in the following way: 1. Iterate back from the line-break position until the first cluster start position that is NOT unsafe-to-concat, 2. shape the segment from there till the end of line, 3. check whether the resulting glyph-run also is clear of the unsafe-to-concat at its start-of-text position; if it is, just splice it into place and the line is shaped; If not, move on to a position further back that is clear of unsafe-to-concat and retry from there, and repeat. At the start of next line a similar algorithm can be implemented. That is: 1. Iterate forward from the line-break position until the first cluster start position that is NOT unsafe-to-concat, 2. shape the segment from beginning of the line to that position, 3. check whether the resulting glyph-run also is clear of the unsafe-to-concat at its end-of-text position; if it is, just splice it into place and the beginning is shaped; If not, move on to a position further forward that is clear of unsafe-to-concat and retry up to there, and repeat. A slight complication will arise in the implementation of the algorithm above, because while our buffer API has a way to return flags for position corresponding to start-of-text, there is currently no position corresponding to end-of-text. This limitation can be alleviated by shaping more text than needed and looking for unsafe-to-concat flag within text clusters. The #HB_GLYPH_FLAG_UNSAFE_TO_BREAK flag will always imply this flag. To use this flag, you must enable the buffer flag _BUFFER_FLAG_PRODUCE_UNSAFE_TO_CONCAT during shaping, otherwise the buffer flag will not be reliably produced. Since: 4.0.0 _GLYPH_FLAG_SAFE_TO_INSERT_TATWEEL: In scripts that use elongation (Arabic, Mongolian, Syriac, etc.), this flag signifies that it is safe to insert a U+0640 TATWEEL character before this cluster for elongation. This flag does not determine the script-specific elongation places, but only when it is safe to do the elongation without interrupting text shaping. Since: 5.1.0 _GLYPH_FLAG_DEFINED: All the currently defined flags.
*/
opaque type hb_glyph_flags_t = CUnsignedInt
object hb_glyph_flags_t extends _BindgenEnumCUnsignedInt[hb_glyph_flags_t]:
  given _tag: Tag[hb_glyph_flags_t] = Tag.UInt
  inline def define(inline a: Long): hb_glyph_flags_t = a.toUInt
  val HB_GLYPH_FLAG_UNSAFE_TO_BREAK = define(1)
  val HB_GLYPH_FLAG_UNSAFE_TO_CONCAT = define(2)
  val HB_GLYPH_FLAG_SAFE_TO_INSERT_TATWEEL = define(4)
  val HB_GLYPH_FLAG_DEFINED = define(7)
  def getName(value: hb_glyph_flags_t): Option[String] =
    value match
      case `HB_GLYPH_FLAG_UNSAFE_TO_BREAK` => Some("HB_GLYPH_FLAG_UNSAFE_TO_BREAK")
      case `HB_GLYPH_FLAG_UNSAFE_TO_CONCAT` => Some("HB_GLYPH_FLAG_UNSAFE_TO_CONCAT")
      case `HB_GLYPH_FLAG_SAFE_TO_INSERT_TATWEEL` => Some("HB_GLYPH_FLAG_SAFE_TO_INSERT_TATWEEL")
      case `HB_GLYPH_FLAG_DEFINED` => Some("HB_GLYPH_FLAG_DEFINED")
      case _ => _root_.scala.None
  extension (a: hb_glyph_flags_t)
    inline def &(b: hb_glyph_flags_t): hb_glyph_flags_t = a & b
    inline def |(b: hb_glyph_flags_t): hb_glyph_flags_t = a | b
    inline def is(b: hb_glyph_flags_t): Boolean = (a & b) == b