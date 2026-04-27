package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GOutputStreamSpliceFlags: _OUTPUT_STREAM_SPLICE_NONE: Do not close either stream. _OUTPUT_STREAM_SPLICE_CLOSE_SOURCE: Close the source stream after the splice. _OUTPUT_STREAM_SPLICE_CLOSE_TARGET: Close the target stream after the splice.
*/
opaque type GOutputStreamSpliceFlags = CUnsignedInt
object GOutputStreamSpliceFlags extends _BindgenEnumCUnsignedInt[GOutputStreamSpliceFlags]:
  given _tag: Tag[GOutputStreamSpliceFlags] = Tag.UInt
  inline def define(inline a: Long): GOutputStreamSpliceFlags = a.toUInt
  val G_OUTPUT_STREAM_SPLICE_NONE = define(0)
  val G_OUTPUT_STREAM_SPLICE_CLOSE_SOURCE = define(1)
  val G_OUTPUT_STREAM_SPLICE_CLOSE_TARGET = define(2)
  def getName(value: GOutputStreamSpliceFlags): Option[String] =
    value match
      case `G_OUTPUT_STREAM_SPLICE_NONE` => Some("G_OUTPUT_STREAM_SPLICE_NONE")
      case `G_OUTPUT_STREAM_SPLICE_CLOSE_SOURCE` => Some("G_OUTPUT_STREAM_SPLICE_CLOSE_SOURCE")
      case `G_OUTPUT_STREAM_SPLICE_CLOSE_TARGET` => Some("G_OUTPUT_STREAM_SPLICE_CLOSE_TARGET")
      case _ => _root_.scala.None
  extension (a: GOutputStreamSpliceFlags)
    inline def &(b: GOutputStreamSpliceFlags): GOutputStreamSpliceFlags = a & b
    inline def |(b: GOutputStreamSpliceFlags): GOutputStreamSpliceFlags = a | b
    inline def is(b: GOutputStreamSpliceFlags): Boolean = (a & b) == b