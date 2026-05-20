package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.hb_buffer_flags_t

/** Flags for #hb_buffer_t.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class buffer_flags_t private (val raw: hb_buffer_flags_t):
  def is(kv: buffer_flags_t): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[buffer_flags_t.KnownValue]
    buffer_flags_t.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"buffer_flags_t(${sb.result().mkString(", ")})"
end buffer_flags_t

object buffer_flags_t:
  export KnownValue.*

  def fromRaw(raw: hb_buffer_flags_t) = new buffer_flags_t(raw)

  extension (af: buffer_flags_t)
    def &(other: buffer_flags_t) =
      buffer_flags_t(af.raw & other.raw)
    def |(other: buffer_flags_t) =
      buffer_flags_t(af.raw | other.raw)

  /** Flags for #hb_buffer_t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(
      override val raw: hb_buffer_flags_t,
      name: scala.Predef.String
  ) extends buffer_flags_t(raw):
    override def toString(): scala.Predef.String = this.name

    /** the default buffer flag.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DEFAULT
        extends KnownValue(hb_buffer_flags_t.HB_BUFFER_FLAG_DEFAULT, "DEFAULT")

    /** flag indicating that special handling of the beginning of text paragraph
      * can be applied to this buffer. Should usually be set, unless you are
      * passing to the buffer only part of the text without the full context.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case BOT extends KnownValue(hb_buffer_flags_t.HB_BUFFER_FLAG_BOT, "BOT")

    /** flag indicating that special handling of the end of text paragraph can
      * be applied to this buffer, similar to
      * @HB_BUFFER_FLAG_BOT.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case EOT extends KnownValue(hb_buffer_flags_t.HB_BUFFER_FLAG_EOT, "EOT")

    /** flag indication that character with Default_Ignorable Unicode property
      * should use the corresponding glyph from the font, instead of hiding them
      * (done by replacing them with the space glyph and zeroing the advance
      * width.) This flag takes precedence over
      * @HB_BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case PRESERVE_DEFAULT_IGNORABLES
        extends KnownValue(
          hb_buffer_flags_t.HB_BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES,
          "PRESERVE_DEFAULT_IGNORABLES"
        )

    /** flag indication that character with Default_Ignorable Unicode property
      * should be removed from glyph string instead of hiding them (done by
      * replacing them with the space glyph and zeroing the advance width.)
      * @HB_BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES
      *   takes precedence over this flag. Since: 1.8.0
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case REMOVE_DEFAULT_IGNORABLES
        extends KnownValue(
          hb_buffer_flags_t.HB_BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES,
          "REMOVE_DEFAULT_IGNORABLES"
        )

    /** flag indicating that a dotted circle should not be inserted in the
      * rendering of incorrect character sequences (such at <0905 093E>). Since:
      * 2.4.0
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DO_NOT_INSERT_DOTTED_CIRCLE
        extends KnownValue(
          hb_buffer_flags_t.HB_BUFFER_FLAG_DO_NOT_INSERT_DOTTED_CIRCLE,
          "DO_NOT_INSERT_DOTTED_CIRCLE"
        )

    /** flag indicating that the hb_shape() call and its variants should perform
      * various verification processes on the results of the shaping operation
      * on the buffer. If the verification fails, then either a buffer message
      * is sent, if a message handler is installed on the buffer, or a message
      * is written to standard error. In either case, the shaping result might
      * be modified to show the failed output. Since: 3.4.0
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case VERIFY
        extends KnownValue(hb_buffer_flags_t.HB_BUFFER_FLAG_VERIFY, "VERIFY")

    /** flag indicating that the @HB_GLYPH_FLAG_UNSAFE_TO_CONCAT glyph-flag
      * should be produced by the shaper. By default it will not be produced
      * since it incurs a cost. Since: 4.0.0
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case PRODUCE_UNSAFE_TO_CONCAT
        extends KnownValue(
          hb_buffer_flags_t.HB_BUFFER_FLAG_PRODUCE_UNSAFE_TO_CONCAT,
          "PRODUCE_UNSAFE_TO_CONCAT"
        )

    /** flag indicating that the @HB_GLYPH_FLAG_SAFE_TO_INSERT_TATWEEL
      * glyph-flag should be produced by the shaper. By default it will not be
      * produced. Since: 5.1.0
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case PRODUCE_SAFE_TO_INSERT_TATWEEL
        extends KnownValue(
          hb_buffer_flags_t.HB_BUFFER_FLAG_PRODUCE_SAFE_TO_INSERT_TATWEEL,
          "PRODUCE_SAFE_TO_INSERT_TATWEEL"
        )

    /** All currently defined flags: Since: 4.4.0
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DEFINED
        extends KnownValue(hb_buffer_flags_t.HB_BUFFER_FLAG_DEFINED, "DEFINED")
  end KnownValue
end buffer_flags_t
