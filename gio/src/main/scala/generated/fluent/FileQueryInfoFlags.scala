package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GFileQueryInfoFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used when querying a #GFileInfo.
  */
class FileQueryInfoFlags private (val raw: GFileQueryInfoFlags):
  def is(kv: FileQueryInfoFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[FileQueryInfoFlags.KnownValue]
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags used when querying a #GFileInfo.
    */
  enum KnownValue(override val raw: GFileQueryInfoFlags, name: String)
      extends FileQueryInfoFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE
        extends KnownValue(GFileQueryInfoFlags.G_FILE_QUERY_INFO_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Don't follow symlinks.
      */
    case NOFOLLOW_SYMLINKS
        extends KnownValue(
          GFileQueryInfoFlags.G_FILE_QUERY_INFO_NOFOLLOW_SYMLINKS,
          "NOFOLLOW_SYMLINKS"
        )
  end KnownValue
end FileQueryInfoFlags
