package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GIOStreamSpliceFlags: _IO_STREAM_SPLICE_NONE: Do not close either stream. _IO_STREAM_SPLICE_CLOSE_STREAM1: Close the first stream after the splice. _IO_STREAM_SPLICE_CLOSE_STREAM2: Close the second stream after the splice. _IO_STREAM_SPLICE_WAIT_FOR_BOTH: Wait for both splice operations to finish before calling the callback.
*/
opaque type GIOStreamSpliceFlags = CUnsignedInt
object GIOStreamSpliceFlags extends _BindgenEnumCUnsignedInt[GIOStreamSpliceFlags]:
  given _tag: Tag[GIOStreamSpliceFlags] = Tag.UInt
  inline def define(inline a: Long): GIOStreamSpliceFlags = a.toUInt
  val G_IO_STREAM_SPLICE_NONE = define(0)
  val G_IO_STREAM_SPLICE_CLOSE_STREAM1 = define(1)
  val G_IO_STREAM_SPLICE_CLOSE_STREAM2 = define(2)
  val G_IO_STREAM_SPLICE_WAIT_FOR_BOTH = define(4)
  def getName(value: GIOStreamSpliceFlags): Option[String] =
    value match
      case `G_IO_STREAM_SPLICE_NONE` => Some("G_IO_STREAM_SPLICE_NONE")
      case `G_IO_STREAM_SPLICE_CLOSE_STREAM1` => Some("G_IO_STREAM_SPLICE_CLOSE_STREAM1")
      case `G_IO_STREAM_SPLICE_CLOSE_STREAM2` => Some("G_IO_STREAM_SPLICE_CLOSE_STREAM2")
      case `G_IO_STREAM_SPLICE_WAIT_FOR_BOTH` => Some("G_IO_STREAM_SPLICE_WAIT_FOR_BOTH")
      case _ => _root_.scala.None
  extension (a: GIOStreamSpliceFlags)
    inline def &(b: GIOStreamSpliceFlags): GIOStreamSpliceFlags = a & b
    inline def |(b: GIOStreamSpliceFlags): GIOStreamSpliceFlags = a | b
    inline def is(b: GIOStreamSpliceFlags): Boolean = (a & b) == b