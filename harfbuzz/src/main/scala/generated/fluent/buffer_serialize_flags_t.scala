package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.hb_buffer_serialize_flags_t

/** Flags that control what glyph information are serialized in
  * hb_buffer_serialize_glyphs().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class buffer_serialize_flags_t private (val raw: hb_buffer_serialize_flags_t):
  def is(kv: buffer_serialize_flags_t): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[buffer_serialize_flags_t.KnownValue]
    buffer_serialize_flags_t.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"buffer_serialize_flags_t(${sb.result().mkString(", ")})"
end buffer_serialize_flags_t

object buffer_serialize_flags_t:
  export KnownValue.*

  def fromRaw(raw: hb_buffer_serialize_flags_t) = new buffer_serialize_flags_t(
    raw
  )

  extension (af: buffer_serialize_flags_t)
    def &(other: buffer_serialize_flags_t) =
      buffer_serialize_flags_t(af.raw & other.raw)
    def |(other: buffer_serialize_flags_t) =
      buffer_serialize_flags_t(af.raw | other.raw)

  /** Flags that control what glyph information are serialized in
    * hb_buffer_serialize_glyphs().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: hb_buffer_serialize_flags_t, name: String)
      extends buffer_serialize_flags_t(raw):
    override def toString(): String = this.name

    /** serialize glyph names, clusters and positions.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DEFAULT
        extends KnownValue(
          hb_buffer_serialize_flags_t.HB_BUFFER_SERIALIZE_FLAG_DEFAULT,
          "DEFAULT"
        )

    /** do not serialize glyph cluster.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NO_CLUSTERS
        extends KnownValue(
          hb_buffer_serialize_flags_t.HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS,
          "NO_CLUSTERS"
        )

    /** do not serialize glyph position information.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NO_POSITIONS
        extends KnownValue(
          hb_buffer_serialize_flags_t.HB_BUFFER_SERIALIZE_FLAG_NO_POSITIONS,
          "NO_POSITIONS"
        )

    /** do no serialize glyph name.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NO_GLYPH_NAMES
        extends KnownValue(
          hb_buffer_serialize_flags_t.HB_BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES,
          "NO_GLYPH_NAMES"
        )

    /** serialize glyph extents.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case GLYPH_EXTENTS
        extends KnownValue(
          hb_buffer_serialize_flags_t.HB_BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS,
          "GLYPH_EXTENTS"
        )

    /** serialize glyph flags. Since: 1.5.0
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case GLYPH_FLAGS
        extends KnownValue(
          hb_buffer_serialize_flags_t.HB_BUFFER_SERIALIZE_FLAG_GLYPH_FLAGS,
          "GLYPH_FLAGS"
        )

    /** do not serialize glyph advances, glyph offsets will reflect absolute
      * glyph positions. Since: 1.8.0
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NO_ADVANCES
        extends KnownValue(
          hb_buffer_serialize_flags_t.HB_BUFFER_SERIALIZE_FLAG_NO_ADVANCES,
          "NO_ADVANCES"
        )

    /** All currently defined flags. Since: 4.4.0
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DEFINED
        extends KnownValue(
          hb_buffer_serialize_flags_t.HB_BUFFER_SERIALIZE_FLAG_DEFINED,
          "DEFINED"
        )
  end KnownValue
end buffer_serialize_flags_t
