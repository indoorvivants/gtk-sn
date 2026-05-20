package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GFileMeasureFlags

/** Flags that can be used with g_file_measure_disk_usage().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileMeasureFlags private (val raw: GFileMeasureFlags):
  def is(kv: FileMeasureFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[FileMeasureFlags.KnownValue]
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

  /** Flags that can be used with g_file_measure_disk_usage().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(
      override val raw: GFileMeasureFlags,
      name: scala.Predef.String
  ) extends FileMeasureFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** No flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE extends KnownValue(GFileMeasureFlags.G_FILE_MEASURE_NONE, "NONE")

    /** Report any error encountered while traversing the directory tree.
      * Normally errors are only reported for the toplevel file.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case REPORT_ANY_ERROR
        extends KnownValue(
          GFileMeasureFlags.G_FILE_MEASURE_REPORT_ANY_ERROR,
          "REPORT_ANY_ERROR"
        )

    /** Tally usage based on apparent file sizes. Normally, the block-size is
      * used, if available, as this is a more accurate representation of disk
      * space used. Compare with `du --apparent-size`. Since GLib 2.78. and
      * similarly to `du` since GNU Coreutils 9.2, this will ignore the sizes of
      * file types other than regular files and links, as the sizes of other
      * file types are not specified in a standard way.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case APPARENT_SIZE
        extends KnownValue(
          GFileMeasureFlags.G_FILE_MEASURE_APPARENT_SIZE,
          "APPARENT_SIZE"
        )

    /** Do not cross mount point boundaries. Compare with `du -x`.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NO_XDEV
        extends KnownValue(GFileMeasureFlags.G_FILE_MEASURE_NO_XDEV, "NO_XDEV")
  end KnownValue
end FileMeasureFlags
