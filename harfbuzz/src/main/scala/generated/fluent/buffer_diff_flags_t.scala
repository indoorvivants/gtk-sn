package sn.gnome.harfbuzz.fluent

import _root_.sn.gnome.harfbuzz.internal.hb_buffer_diff_flags_t

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags from comparing two #hb_buffer_t's.
  *
  * Buffer with different #hb_buffer_content_type_t cannot be meaningfully
  * compared in any further detail.
  *
  * For buffers with differing length, the per-glyph comparison is not
  * attempted, though we do still scan reference buffer for dotted circle and
  * `.notdef` glyphs.
  *
  * If the buffers have the same length, we compare them glyph-by-glyph and
  * report which aspect(s) of the glyph info/position are different.
  */
class buffer_diff_flags_t private (val raw: hb_buffer_diff_flags_t):
  def is(kv: buffer_diff_flags_t): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[buffer_diff_flags_t.KnownValue]
    buffer_diff_flags_t.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"buffer_diff_flags_t(${sb.result().mkString(", ")})"
end buffer_diff_flags_t

object buffer_diff_flags_t:
  export KnownValue.*

  def fromRaw(raw: hb_buffer_diff_flags_t) = new buffer_diff_flags_t(raw)

  extension (af: buffer_diff_flags_t)
    def &(other: buffer_diff_flags_t) =
      buffer_diff_flags_t(af.raw & other.raw)
    def |(other: buffer_diff_flags_t) =
      buffer_diff_flags_t(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags from comparing two #hb_buffer_t's.
    *
    * Buffer with different #hb_buffer_content_type_t cannot be meaningfully
    * compared in any further detail.
    *
    * For buffers with differing length, the per-glyph comparison is not
    * attempted, though we do still scan reference buffer for dotted circle and
    * `.notdef` glyphs.
    *
    * If the buffers have the same length, we compare them glyph-by-glyph and
    * report which aspect(s) of the glyph info/position are different.
    */
  enum KnownValue(override val raw: hb_buffer_diff_flags_t, name: String)
      extends buffer_diff_flags_t(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * equal buffers.
      */
    case EQUAL
        extends KnownValue(
          hb_buffer_diff_flags_t.HB_BUFFER_DIFF_FLAG_EQUAL,
          "EQUAL"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * buffers with different #hb_buffer_content_type_t.
      */
    case CONTENT_TYPE_MISMATCH
        extends KnownValue(
          hb_buffer_diff_flags_t.HB_BUFFER_DIFF_FLAG_CONTENT_TYPE_MISMATCH,
          "CONTENT_TYPE_MISMATCH"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * buffers with differing length.
      */
    case LENGTH_MISMATCH
        extends KnownValue(
          hb_buffer_diff_flags_t.HB_BUFFER_DIFF_FLAG_LENGTH_MISMATCH,
          "LENGTH_MISMATCH"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * `.notdef` glyph is present in the reference buffer.
      */
    case NOTDEF_PRESENT
        extends KnownValue(
          hb_buffer_diff_flags_t.HB_BUFFER_DIFF_FLAG_NOTDEF_PRESENT,
          "NOTDEF_PRESENT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * dotted circle glyph is present in the reference buffer.
      */
    case DOTTED_CIRCLE_PRESENT
        extends KnownValue(
          hb_buffer_diff_flags_t.HB_BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT,
          "DOTTED_CIRCLE_PRESENT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * difference in #hb_glyph_info_t.codepoint
      */
    case CODEPOINT_MISMATCH
        extends KnownValue(
          hb_buffer_diff_flags_t.HB_BUFFER_DIFF_FLAG_CODEPOINT_MISMATCH,
          "CODEPOINT_MISMATCH"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * difference in #hb_glyph_info_t.cluster
      */
    case CLUSTER_MISMATCH
        extends KnownValue(
          hb_buffer_diff_flags_t.HB_BUFFER_DIFF_FLAG_CLUSTER_MISMATCH,
          "CLUSTER_MISMATCH"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * difference in #hb_glyph_flags_t.
      */
    case GLYPH_FLAGS_MISMATCH
        extends KnownValue(
          hb_buffer_diff_flags_t.HB_BUFFER_DIFF_FLAG_GLYPH_FLAGS_MISMATCH,
          "GLYPH_FLAGS_MISMATCH"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * difference in #hb_glyph_position_t.
      */
    case POSITION_MISMATCH
        extends KnownValue(
          hb_buffer_diff_flags_t.HB_BUFFER_DIFF_FLAG_POSITION_MISMATCH,
          "POSITION_MISMATCH"
        )
  end KnownValue
end buffer_diff_flags_t
