package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GFileMeasureFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags that can be used with g_file_measure_disk_usage().
  */
class FileMeasureFlags private (val raw: GFileMeasureFlags):
  def is(kv: FileMeasureFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[FileMeasureFlags.KnownValue]
    FileMeasureFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"FileMeasureFlags(${sb.result().mkString(", ")})"
end FileMeasureFlags

object FileMeasureFlags:
  export KnownValue.*

  def fromRaw(raw: GFileMeasureFlags) = new FileMeasureFlags(raw)

  extension (af: FileMeasureFlags)
    def &(other: FileMeasureFlags) =
      FileMeasureFlags(af.raw & other.raw)
    def |(other: FileMeasureFlags) =
      FileMeasureFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags that can be used with g_file_measure_disk_usage().
    */
  enum KnownValue(override val raw: GFileMeasureFlags, name: String)
      extends FileMeasureFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE extends KnownValue(GFileMeasureFlags.G_FILE_MEASURE_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Report any error encountered while traversing the directory tree.
      * Normally errors are only reported for the toplevel file.
      */
    case REPORT_ANY_ERROR
        extends KnownValue(
          GFileMeasureFlags.G_FILE_MEASURE_REPORT_ANY_ERROR,
          "REPORT_ANY_ERROR"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Tally usage based on apparent file sizes. Normally, the block-size is
      * used, if available, as this is a more accurate representation of disk
      * space used. Compare with `du --apparent-size`. Since GLib 2.78. and
      * similarly to `du` since GNU Coreutils 9.2, this will ignore the sizes of
      * file types other than regular files and links, as the sizes of other
      * file types are not specified in a standard way.
      */
    case APPARENT_SIZE
        extends KnownValue(
          GFileMeasureFlags.G_FILE_MEASURE_APPARENT_SIZE,
          "APPARENT_SIZE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Do not cross mount point boundaries. Compare with `du -x`.
      */
    case NO_XDEV
        extends KnownValue(GFileMeasureFlags.G_FILE_MEASURE_NO_XDEV, "NO_XDEV")
  end KnownValue
end FileMeasureFlags
