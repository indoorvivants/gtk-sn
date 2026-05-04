package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GKeyFileFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags which influence the parsing.
  */
class KeyFileFlags private (val raw: GKeyFileFlags):
  def is(kv: KeyFileFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[KeyFileFlags.KnownValue]
    KeyFileFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"KeyFileFlags(${sb.result().mkString(", ")})"
end KeyFileFlags

object KeyFileFlags:
  export KnownValue.*

  def fromRaw(raw: GKeyFileFlags) = new KeyFileFlags(raw)

  extension (af: KeyFileFlags)
    def &(other: KeyFileFlags) =
      KeyFileFlags(af.raw & other.raw)
    def |(other: KeyFileFlags) =
      KeyFileFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags which influence the parsing.
    */
  enum KnownValue(override val raw: GKeyFileFlags, name: String)
      extends KeyFileFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags, default behaviour
      */
    case NONE extends KnownValue(GKeyFileFlags.G_KEY_FILE_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Use this flag if you plan to write the (possibly modified) contents of
      * the key file back to a file; otherwise all comments will be lost when
      * the key file is written back.
      */
    case KEEP_COMMENTS
        extends KnownValue(
          GKeyFileFlags.G_KEY_FILE_KEEP_COMMENTS,
          "KEEP_COMMENTS"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Use this flag if you plan to write the (possibly modified) contents of
      * the key file back to a file; otherwise only the translations for the
      * current language will be written back.
      */
    case KEEP_TRANSLATIONS
        extends KnownValue(
          GKeyFileFlags.G_KEY_FILE_KEEP_TRANSLATIONS,
          "KEEP_TRANSLATIONS"
        )
  end KnownValue
end KeyFileFlags
