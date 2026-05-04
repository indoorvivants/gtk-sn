package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkInputHints

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes hints that might be taken into account by input methods or
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
  */
class InputHints private (val raw: GtkInputHints):
  def is(kv: InputHints): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[InputHints.KnownValue]
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Describes hints that might be taken into account by input methods or
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
    */
  enum KnownValue(override val raw: GtkInputHints, name: String)
      extends InputHints(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No special behaviour suggested
      */
    case NONE extends KnownValue(GtkInputHints.GTK_INPUT_HINT_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Suggest checking for typos
      */
    case SPELLCHECK
        extends KnownValue(
          GtkInputHints.GTK_INPUT_HINT_SPELLCHECK,
          "SPELLCHECK"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Suggest not checking for typos
      */
    case NO_SPELLCHECK
        extends KnownValue(
          GtkInputHints.GTK_INPUT_HINT_NO_SPELLCHECK,
          "NO_SPELLCHECK"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Suggest word completion
      */
    case WORD_COMPLETION
        extends KnownValue(
          GtkInputHints.GTK_INPUT_HINT_WORD_COMPLETION,
          "WORD_COMPLETION"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Suggest to convert all text to lowercase
      */
    case LOWERCASE
        extends KnownValue(GtkInputHints.GTK_INPUT_HINT_LOWERCASE, "LOWERCASE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Suggest to capitalize all text
      */
    case UPPERCASE_CHARS
        extends KnownValue(
          GtkInputHints.GTK_INPUT_HINT_UPPERCASE_CHARS,
          "UPPERCASE_CHARS"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Suggest to capitalize the first character of each word
      */
    case UPPERCASE_WORDS
        extends KnownValue(
          GtkInputHints.GTK_INPUT_HINT_UPPERCASE_WORDS,
          "UPPERCASE_WORDS"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Suggest to capitalize the first word of each sentence
      */
    case UPPERCASE_SENTENCES
        extends KnownValue(
          GtkInputHints.GTK_INPUT_HINT_UPPERCASE_SENTENCES,
          "UPPERCASE_SENTENCES"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Suggest to not show an onscreen keyboard (e.g for a calculator that
      * already has all the keys).
      */
    case INHIBIT_OSK
        extends KnownValue(
          GtkInputHints.GTK_INPUT_HINT_INHIBIT_OSK,
          "INHIBIT_OSK"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The text is vertical
      */
    case VERTICAL_WRITING
        extends KnownValue(
          GtkInputHints.GTK_INPUT_HINT_VERTICAL_WRITING,
          "VERTICAL_WRITING"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Suggest offering Emoji support
      */
    case EMOJI extends KnownValue(GtkInputHints.GTK_INPUT_HINT_EMOJI, "EMOJI")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Suggest not offering Emoji support
      */
    case NO_EMOJI
        extends KnownValue(GtkInputHints.GTK_INPUT_HINT_NO_EMOJI, "NO_EMOJI")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Request that the input method should not update personalized data (like
      * typing history)
      */
    case PRIVATE
        extends KnownValue(GtkInputHints.GTK_INPUT_HINT_PRIVATE, "PRIVATE")
  end KnownValue
end InputHints
