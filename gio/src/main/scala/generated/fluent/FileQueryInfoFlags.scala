package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GFileQueryInfoFlags

/** Flags used when querying a #GFileInfo.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileQueryInfoFlags private (val raw: GFileQueryInfoFlags):
  def is(kv: FileQueryInfoFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[FileQueryInfoFlags.KnownValue]
    FileQueryInfoFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"FileQueryInfoFlags(${sb.result().mkString(", ")})"
end FileQueryInfoFlags

object FileQueryInfoFlags:
  export KnownValue.*

  def fromRaw(raw: GFileQueryInfoFlags) = new FileQueryInfoFlags(raw)

  extension (af: FileQueryInfoFlags)
    def &(other: FileQueryInfoFlags) =
      FileQueryInfoFlags(af.raw & other.raw)
    def |(other: FileQueryInfoFlags) =
      FileQueryInfoFlags(af.raw | other.raw)

  /** Flags used when querying a #GFileInfo.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(
      override val raw: GFileQueryInfoFlags,
      name: scala.Predef.String
  ) extends FileQueryInfoFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** No flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(GFileQueryInfoFlags.G_FILE_QUERY_INFO_NONE, "NONE")

    /** Don't follow symlinks.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NOFOLLOW_SYMLINKS
        extends KnownValue(
          GFileQueryInfoFlags.G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS,
          "NOFOLLOW_SYMLINKS"
        )
  end KnownValue
end FileQueryInfoFlags
