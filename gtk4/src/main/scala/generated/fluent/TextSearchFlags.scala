package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkTextSearchFlags

/** Flags affecting how a search is done.
  *
  * If neither %GTK_TEXT_SEARCH_VISIBLE_ONLY nor %GTK_TEXT_SEARCH_TEXT_ONLY are
  * enabled, the match must be exact; the special 0xFFFC character will match
  * embedded paintables or child widgets.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TextSearchFlags private (val raw: GtkTextSearchFlags):
  def is(kv: TextSearchFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[TextSearchFlags.KnownValue]
    TextSearchFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"TextSearchFlags(${sb.result().mkString(", ")})"
end TextSearchFlags

object TextSearchFlags:
  export KnownValue.*

  def fromRaw(raw: GtkTextSearchFlags) = new TextSearchFlags(raw)

  extension (af: TextSearchFlags)
    def &(other: TextSearchFlags) =
      TextSearchFlags(af.raw & other.raw)
    def |(other: TextSearchFlags) =
      TextSearchFlags(af.raw | other.raw)

  /** Flags affecting how a search is done.
    *
    * If neither %GTK_TEXT_SEARCH_VISIBLE_ONLY nor %GTK_TEXT_SEARCH_TEXT_ONLY
    * are enabled, the match must be exact; the special 0xFFFC character will
    * match embedded paintables or child widgets.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GtkTextSearchFlags, name: String)
      extends TextSearchFlags(raw):
    override def toString(): String = this.name

    /** Search only visible data. A search match may have invisible text
      * interspersed.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case VISIBLE_ONLY
        extends KnownValue(
          GtkTextSearchFlags.GTK_TEXT_SEARCH_VISIBLE_ONLY,
          "VISIBLE_ONLY"
        )

    /** Search only text. A match may have paintables or child widgets mixed
      * inside the matched range.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case TEXT_ONLY
        extends KnownValue(
          GtkTextSearchFlags.GTK_TEXT_SEARCH_TEXT_ONLY,
          "TEXT_ONLY"
        )

    /** The text will be matched regardless of what case it is in.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CASE_INSENSITIVE
        extends KnownValue(
          GtkTextSearchFlags.GTK_TEXT_SEARCH_CASE_INSENSITIVE,
          "CASE_INSENSITIVE"
        )
  end KnownValue
end TextSearchFlags
