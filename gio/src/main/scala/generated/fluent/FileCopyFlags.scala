package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GFileCopyFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used when copying or moving files.
  */
class FileCopyFlags private (val raw: GFileCopyFlags):
  def is(kv: FileCopyFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[FileCopyFlags.KnownValue]
    FileCopyFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"FileCopyFlags(${sb.result().mkString(", ")})"
end FileCopyFlags

object FileCopyFlags:
  export KnownValue.*

  def fromRaw(raw: GFileCopyFlags) = new FileCopyFlags(raw)

  extension (af: FileCopyFlags)
    def &(other: FileCopyFlags) =
      FileCopyFlags(af.raw & other.raw)
    def |(other: FileCopyFlags) =
      FileCopyFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags used when copying or moving files.
    */
  enum KnownValue(override val raw: GFileCopyFlags, name: String)
      extends FileCopyFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE extends KnownValue(GFileCopyFlags.G_FILE_COPY_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Overwrite any existing files
      */
    case OVERWRITE
        extends KnownValue(GFileCopyFlags.G_FILE_COPY_OVERWRITE, "OVERWRITE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Make a backup of any existing files.
      */
    case BACKUP extends KnownValue(GFileCopyFlags.G_FILE_COPY_BACKUP, "BACKUP")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Don't follow symlinks.
      */
    case NOFOLLOW_SYMLINKS
        extends KnownValue(
          GFileCopyFlags.G_FILE_COPY_NOFOLLOW_SYMLINKS,
          "NOFOLLOW_SYMLINKS"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Copy all file metadata instead of just default set used for copy (see
      * #GFileInfo).
      */
    case ALL_METADATA
        extends KnownValue(
          GFileCopyFlags.G_FILE_COPY_ALL_METADATA,
          "ALL_METADATA"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Don't use copy and delete fallback if native move not supported.
      */
    case NO_FALLBACK_FOR_MOVE
        extends KnownValue(
          GFileCopyFlags.G_FILE_COPY_NO_FALLBACK_FOR_MOVE,
          "NO_FALLBACK_FOR_MOVE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Leaves target file with default perms, instead of setting the source
      * file perms.
      */
    case TARGET_DEFAULT_PERMS
        extends KnownValue(
          GFileCopyFlags.G_FILE_COPY_TARGET_DEFAULT_PERMS,
          "TARGET_DEFAULT_PERMS"
        )
  end KnownValue
end FileCopyFlags
