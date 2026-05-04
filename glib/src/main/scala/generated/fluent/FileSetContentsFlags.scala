package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GFileSetContentsFlags

/** Flags to pass to g_file_set_contents_full() to affect its safety and
  * performance.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileSetContentsFlags private (val raw: GFileSetContentsFlags):
  def is(kv: FileSetContentsFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[FileSetContentsFlags.KnownValue]
    FileSetContentsFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"FileSetContentsFlags(${sb.result().mkString(", ")})"
end FileSetContentsFlags

object FileSetContentsFlags:
  export KnownValue.*

  def fromRaw(raw: GFileSetContentsFlags) = new FileSetContentsFlags(raw)

  extension (af: FileSetContentsFlags)
    def &(other: FileSetContentsFlags) =
      FileSetContentsFlags(af.raw & other.raw)
    def |(other: FileSetContentsFlags) =
      FileSetContentsFlags(af.raw | other.raw)

  /** Flags to pass to g_file_set_contents_full() to affect its safety and
    * performance.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GFileSetContentsFlags, name: String)
      extends FileSetContentsFlags(raw):
    override def toString(): String = this.name

    /** No guarantees about file consistency or durability. The most dangerous
      * setting, which is slightly faster than other settings.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(
          GFileSetContentsFlags.G_FILE_SET_CONTENTS_NONE,
          "NONE"
        )

    /** Guarantee file consistency: after a crash, either the old version of the
      * file or the new version of the file will be available, but not a
      * mixture. On Unix systems this equates to an `fsync()` on the file and
      * use of an atomic `rename()` of the new version of the file over the old.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CONSISTENT
        extends KnownValue(
          GFileSetContentsFlags.G_FILE_SET_CONTENTS_CONSISTENT,
          "CONSISTENT"
        )

    /** Guarantee file durability: after a crash, the new version of the file
      * will be available. On Unix systems this equates to an `fsync()` on the
      * file (if %G_FILE_SET_CONTENTS_CONSISTENT is unset), or the effects of
      * %G_FILE_SET_CONTENTS_CONSISTENT plus an `fsync()` on the directory
      * containing the file after calling `rename()`.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DURABLE
        extends KnownValue(
          GFileSetContentsFlags.G_FILE_SET_CONTENTS_DURABLE,
          "DURABLE"
        )

    /** Only apply consistency and durability guarantees if the file already
      * exists. This may speed up file operations if the file doesn’t currently
      * exist, but may result in a corrupted version of the new file if the
      * system crashes while writing it.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ONLY_EXISTING
        extends KnownValue(
          GFileSetContentsFlags.G_FILE_SET_CONTENTS_ONLY_EXISTING,
          "ONLY_EXISTING"
        )
  end KnownValue
end FileSetContentsFlags
