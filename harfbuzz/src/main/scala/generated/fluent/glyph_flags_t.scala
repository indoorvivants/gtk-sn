package sn.gnome.harfbuzz.fluent

import _root_.sn.gnome.harfbuzz.internal.hb_glyph_flags_t

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags for #hb_glyph_info_t.
  */
class glyph_flags_t private (val raw: hb_glyph_flags_t):
  def is(kv: glyph_flags_t): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[glyph_flags_t.KnownValue]
    glyph_flags_t.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"glyph_flags_t(${sb.result().mkString(", ")})"
end glyph_flags_t

object glyph_flags_t:
  export KnownValue.*

  def fromRaw(raw: hb_glyph_flags_t) = new glyph_flags_t(raw)

  extension (af: glyph_flags_t)
    def &(other: glyph_flags_t) =
      glyph_flags_t(af.raw & other.raw)
    def |(other: glyph_flags_t) =
      glyph_flags_t(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags for #hb_glyph_info_t.
    */
  enum KnownValue(override val raw: hb_glyph_flags_t, name: String)
      extends glyph_flags_t(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Indicates that if input text is broken at the beginning of the cluster
      * this glyph is part of, then both sides need to be re-shaped, as the
      * result might be different. On the flip side, it means that when this
      * flag is not present, then it is safe to break the glyph-run at the
      * beginning of this cluster, and the two sides will represent the exact
      * same result one would get if breaking input text at the beginning of
      * this cluster and shaping the two sides separately. This can be used to
      * optimize paragraph layout, by avoiding re-shaping of each line after
      * line-breaking.
      */
    case UNSAFE_TO_BREAK
        extends KnownValue(
          hb_glyph_flags_t.HB_GLYPH_FLAG_UNSAFE_TO_BREAK,
          "UNSAFE_TO_BREAK"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Indicates that if input text is changed on one side of the beginning of
      * the cluster this glyph is part of, then the shaping results for the
      * other side might change. Note that the absence of this flag will NOT by
      * itself mean that it IS safe to concat text. Only two pieces of text both
      * of which clear of this flag can be concatenated safely. This can be used
      * to optimize paragraph layout, by avoiding re-shaping of each line after
      * line-breaking, by limiting the reshaping to a small piece around the
      * breaking positin only, even if the breaking position carries the
      * #HB_GLYPH_FLAG_UNSAFE_TO_BREAK or when hyphenation or other text
      * transformation happens at line-break position, in the following way:
      *   1. Iterate back from the line-break position until the first cluster
      *      start position that is NOT unsafe-to-concat, 2. shape the segment
      *      from there till the end of line, 3. check whether the resulting
      *      glyph-run also is clear of the unsafe-to-concat at its
      *      start-of-text position; if it is, just splice it into place and the
      *      line is shaped; If not, move on to a position further back that is
      *      clear of unsafe-to-concat and retry from there, and repeat. At the
      *      start of next line a similar algorithm can be implemented. That is: 1.
      *      Iterate forward from the line-break position until the first
      *      cluster start position that is NOT unsafe-to-concat, 2. shape the
      *      segment from beginning of the line to that position, 3. check
      *      whether the resulting glyph-run also is clear of the
      *      unsafe-to-concat at its end-of-text position; if it is, just splice
      *      it into place and the beginning is shaped; If not, move on to a
      *      position further forward that is clear of unsafe-to-concat and
      *      retry up to there, and repeat. A slight complication will arise in
      *      the implementation of the algorithm above, because while our buffer
      *      API has a way to return flags for position corresponding to
      *      start-of-text, there is currently no position corresponding to
      *      end-of-text. This limitation can be alleviated by shaping more text
      *      than needed and looking for unsafe-to-concat flag within text
      *      clusters. The #HB_GLYPH_FLAG_UNSAFE_TO_BREAK flag will always imply
      *      this flag.
      * To use this flag, you must enable the buffer flag
      * @HB_BUFFER_FLAG_PRODUCE_UNSAFE_TO_CONCAT
      *   during shaping, otherwise the buffer flag will not be reliably
      *   produced. Since: 4.0.0
      */
    case UNSAFE_TO_CONCAT
        extends KnownValue(
          hb_glyph_flags_t.HB_GLYPH_FLAG_UNSAFE_TO_CONCAT,
          "UNSAFE_TO_CONCAT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * In scripts that use elongation (Arabic, Mongolian, Syriac, etc.), this
      * flag signifies that it is safe to insert a U+0640 TATWEEL character
      * before this cluster for elongation. This flag does not determine the
      * script-specific elongation places, but only when it is safe to do the
      * elongation without interrupting text shaping. Since: 5.1.0
      */
    case SAFE_TO_INSERT_TATWEEL
        extends KnownValue(
          hb_glyph_flags_t.HB_GLYPH_FLAG_SAFE_TO_INSERT_TATWEEL,
          "SAFE_TO_INSERT_TATWEEL"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * All the currently defined flags.
      */
    case DEFINED
        extends KnownValue(hb_glyph_flags_t.HB_GLYPH_FLAG_DEFINED, "DEFINED")
  end KnownValue
end glyph_flags_t
