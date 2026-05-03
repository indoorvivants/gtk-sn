package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GFileMeasureFlags: _FILE_MEASURE_NONE: No flags set. _FILE_MEASURE_REPORT_ANY_ERROR: Report any error encountered while traversing the directory tree. Normally errors are only reported for the toplevel file. _FILE_MEASURE_APPARENT_SIZE: Tally usage based on apparent file sizes. Normally, the block-size is used, if available, as this is a more accurate representation of disk space used. Compare with `du --apparent-size`. Since GLib 2.78. and similarly to `du` since GNU Coreutils 9.2, this will ignore the sizes of file types other than regular files and links, as the sizes of other file types are not specified in a standard way. _FILE_MEASURE_NO_XDEV: Do not cross mount point boundaries. Compare with `du -x`.
*/
opaque type GFileMeasureFlags = CUnsignedInt
object GFileMeasureFlags extends _BindgenEnumCUnsignedInt[GFileMeasureFlags]:
  given _tag: Tag[GFileMeasureFlags] = Tag.UInt
  inline def define(inline a: Long): GFileMeasureFlags = a.toUInt
  val G_FILE_MEASURE_NONE = define(0)
  val G_FILE_MEASURE_REPORT_ANY_ERROR = define(2)
  val G_FILE_MEASURE_APPARENT_SIZE = define(4)
  val G_FILE_MEASURE_NO_XDEV = define(8)
  def getName(value: GFileMeasureFlags): Option[String] =
    value match
      case `G_FILE_MEASURE_NONE` => Some("G_FILE_MEASURE_NONE")
      case `G_FILE_MEASURE_REPORT_ANY_ERROR` => Some("G_FILE_MEASURE_REPORT_ANY_ERROR")
      case `G_FILE_MEASURE_APPARENT_SIZE` => Some("G_FILE_MEASURE_APPARENT_SIZE")
      case `G_FILE_MEASURE_NO_XDEV` => Some("G_FILE_MEASURE_NO_XDEV")
      case _ => _root_.scala.None
  extension (a: GFileMeasureFlags)
    inline def &(b: GFileMeasureFlags): GFileMeasureFlags = a & b
    inline def |(b: GFileMeasureFlags): GFileMeasureFlags = a | b
    inline def is(b: GFileMeasureFlags): Boolean = (a & b) == b