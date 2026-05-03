package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GLogWriterOutput: _LOG_WRITER_HANDLED: Log writer has handled the log entry. _LOG_WRITER_UNHANDLED: Log writer could not handle the log entry.
*/
opaque type GLogWriterOutput = CUnsignedInt
object GLogWriterOutput extends _BindgenEnumCUnsignedInt[GLogWriterOutput]:
  given _tag: Tag[GLogWriterOutput] = Tag.UInt
  inline def define(inline a: Long): GLogWriterOutput = a.toUInt
  val G_LOG_WRITER_HANDLED = define(1)
  val G_LOG_WRITER_UNHANDLED = define(0)
  def getName(value: GLogWriterOutput): Option[String] =
    value match
      case `G_LOG_WRITER_HANDLED` => Some("G_LOG_WRITER_HANDLED")
      case `G_LOG_WRITER_UNHANDLED` => Some("G_LOG_WRITER_UNHANDLED")
      case _ => _root_.scala.None
  extension (a: GLogWriterOutput)
    inline def &(b: GLogWriterOutput): GLogWriterOutput = a & b
    inline def |(b: GLogWriterOutput): GLogWriterOutput = a | b
    inline def is(b: GLogWriterOutput): Boolean = (a & b) == b