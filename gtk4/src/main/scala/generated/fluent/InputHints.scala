package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkInputHints

/** Describes hints that might be taken into account by input methods or
  * applications.
  *
  * Note that input methods may already tailor their behaviour according to the
  * [enum@InputPurpose] of the entry.
  *
  * Some common sense is expected when using these flags - mixing
  * %GTK_INPUT_HINT_LOWERCASE with any of the uppercase hints makes no sense.
  *
  * This enumeration may be extended in the future; input methods should ignore
  * unknown values.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class InputHints private (val raw: GtkInputHints):
  def is(kv: InputHints): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[InputHints.KnownValue]
    InputHints.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"InputHints(${sb.result().mkString(", ")})"
end InputHints

object InputHints:
  export KnownValue.*

  def fromRaw(raw: GtkInputHints) = new InputHints(raw)

  extension (af: InputHints)
    def &(other: InputHints) =
      InputHints(af.raw & other.raw)
    def |(other: InputHints) =
      InputHints(af.raw | other.raw)

  /** Describes hints that might be taken into account by input methods or
    * applications.
    *
    * Note that input methods may already tailor their behaviour according to
    * the [enum@InputPurpose] of the entry.
    *
    * Some common sense is expected when using these flags - mixing
    * %GTK_INPUT_HINT_LOWERCASE with any of the uppercase hints makes no sense.
    *
    * This enumeration may be extended in the future; input methods should
    * ignore unknown values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GtkInputHints, name: scala.Predef.String)
      extends InputHints(raw):
    override def toString(): scala.Predef.String = this.name

    /** No special behaviour suggested
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE extends KnownValue(GtkInputHints.GTK_INPUT_HINT_NONE, "NONE")

    /** Suggest checking for typos
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SPELLCHECK
        extends KnownValue(
          GtkInputHints.GTK_INPUT_HINT_SPELLCHECK,
          "SPELLCHECK"
        )

    /** Suggest not checking for typos
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NO_SPELLCHECK
        extends KnownValue(
          GtkInputHints.GTK_INPUT_HINT_NO_SPELLCHECK,
          "NO_SPELLCHECK"
        )

    /** Suggest word completion
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case WORD_COMPLETION
        extends KnownValue(
          GtkInputHints.GTK_INPUT_HINT_WORD_COMPLETION,
          "WORD_COMPLETION"
        )

    /** Suggest to convert all text to lowercase
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LOWERCASE
        extends KnownValue(GtkInputHints.GTK_INPUT_HINT_LOWERCASE, "LOWERCASE")

    /** Suggest to capitalize all text
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case UPPERCASE_CHARS
        extends KnownValue(
          GtkInputHints.GTK_INPUT_HINT_UPPERCASE_CHARS,
          "UPPERCASE_CHARS"
        )

    /** Suggest to capitalize the first character of each word
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case UPPERCASE_WORDS
        extends KnownValue(
          GtkInputHints.GTK_INPUT_HINT_UPPERCASE_WORDS,
          "UPPERCASE_WORDS"
        )

    /** Suggest to capitalize the first word of each sentence
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case UPPERCASE_SENTENCES
        extends KnownValue(
          GtkInputHints.GTK_INPUT_HINT_UPPERCASE_SENTENCES,
          "UPPERCASE_SENTENCES"
        )

    /** Suggest to not show an onscreen keyboard (e.g for a calculator that
      * already has all the keys).
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case INHIBIT_OSK
        extends KnownValue(
          GtkInputHints.GTK_INPUT_HINT_INHIBIT_OSK,
          "INHIBIT_OSK"
        )

    /** The text is vertical
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case VERTICAL_WRITING
        extends KnownValue(
          GtkInputHints.GTK_INPUT_HINT_VERTICAL_WRITING,
          "VERTICAL_WRITING"
        )

    /** Suggest offering Emoji support
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case EMOJI extends KnownValue(GtkInputHints.GTK_INPUT_HINT_EMOJI, "EMOJI")

    /** Suggest not offering Emoji support
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NO_EMOJI
        extends KnownValue(GtkInputHints.GTK_INPUT_HINT_NO_EMOJI, "NO_EMOJI")

    /** Request that the input method should not update personalized data (like
      * typing history)
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case PRIVATE
        extends KnownValue(GtkInputHints.GTK_INPUT_HINT_PRIVATE, "PRIVATE")
  end KnownValue
end InputHints
