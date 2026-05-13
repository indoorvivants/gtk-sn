package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GFileCopyFlags

/** Flags used when copying or moving files.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
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

  /** Flags used when copying or moving files.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GFileCopyFlags, name: String)
      extends FileCopyFlags(raw):
    override def toString(): String = this.name

    /** No flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE extends KnownValue(GFileCopyFlags.G_FILE_COPY_NONE, "NONE")

    /** Overwrite any existing files
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case OVERWRITE
        extends KnownValue(GFileCopyFlags.G_FILE_COPY_OVERWRITE, "OVERWRITE")

    /** Make a backup of any existing files.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case BACKUP extends KnownValue(GFileCopyFlags.G_FILE_COPY_BACKUP, "BACKUP")

    /** Don't follow symlinks.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NOFOLLOW_SYMLINKS
        extends KnownValue(
          GFileCopyFlags.G_FILE_COPY_NOFOLLOW_SYMLINKS,
          "NOFOLLOW_SYMLINKS"
        )

    /** Copy all file metadata instead of just default set used for copy (see
      * #GFileInfo).
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ALL_METADATA
        extends KnownValue(
          GFileCopyFlags.G_FILE_COPY_ALL_METADATA,
          "ALL_METADATA"
        )

    /** Don't use copy and delete fallback if native move not supported.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NO_FALLBACK_FOR_MOVE
        extends KnownValue(
          GFileCopyFlags.G_FILE_COPY_NO_FALLBACK_FOR_MOVE,
          "NO_FALLBACK_FOR_MOVE"
        )

    /** Leaves target file with default perms, instead of setting the source
      * file perms.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case TARGET_DEFAULT_PERMS
        extends KnownValue(
          GFileCopyFlags.G_FILE_COPY_TARGET_DEFAULT_PERMS,
          "TARGET_DEFAULT_PERMS"
        )
  end KnownValue
end FileCopyFlags
