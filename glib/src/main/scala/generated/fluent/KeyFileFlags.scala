package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GKeyFileFlags

/** Flags which influence the parsing.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class KeyFileFlags private (val raw: GKeyFileFlags):
  def is(kv: KeyFileFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[KeyFileFlags.KnownValue]
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

  /** Flags which influence the parsing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GKeyFileFlags, name: scala.Predef.String)
      extends KeyFileFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** No flags, default behaviour
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE extends KnownValue(GKeyFileFlags.G_KEY_FILE_NONE, "NONE")

    /** Use this flag if you plan to write the (possibly modified) contents of
      * the key file back to a file; otherwise all comments will be lost when
      * the key file is written back.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case KEEP_COMMENTS
        extends KnownValue(
          GKeyFileFlags.G_KEY_FILE_KEEP_COMMENTS,
          "KEEP_COMMENTS"
        )

    /** Use this flag if you plan to write the (possibly modified) contents of
      * the key file back to a file; otherwise only the translations for the
      * current language will be written back.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case KEEP_TRANSLATIONS
        extends KnownValue(
          GKeyFileFlags.G_KEY_FILE_KEEP_TRANSLATIONS,
          "KEEP_TRANSLATIONS"
        )
  end KnownValue
end KeyFileFlags
