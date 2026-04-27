package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDataStreamNewlineType: _DATA_STREAM_NEWLINE_TYPE_LF: Selects "LF" line endings, common on most modern UNIX platforms. _DATA_STREAM_NEWLINE_TYPE_CR: Selects "CR" line endings. _DATA_STREAM_NEWLINE_TYPE_CR_LF: Selects "CR, LF" line ending, common on Microsoft Windows. _DATA_STREAM_NEWLINE_TYPE_ANY: Automatically try to handle any line ending type.
*/
opaque type GDataStreamNewlineType = CUnsignedInt
object GDataStreamNewlineType extends _BindgenEnumCUnsignedInt[GDataStreamNewlineType]:
  given _tag: Tag[GDataStreamNewlineType] = Tag.UInt
  inline def define(inline a: Long): GDataStreamNewlineType = a.toUInt
  val G_DATA_STREAM_NEWLINE_TYPE_LF = define(0)
  val G_DATA_STREAM_NEWLINE_TYPE_CR = define(1)
  val G_DATA_STREAM_NEWLINE_TYPE_CR_LF = define(2)
  val G_DATA_STREAM_NEWLINE_TYPE_ANY = define(3)
  def getName(value: GDataStreamNewlineType): Option[String] =
    value match
      case `G_DATA_STREAM_NEWLINE_TYPE_LF` => Some("G_DATA_STREAM_NEWLINE_TYPE_LF")
      case `G_DATA_STREAM_NEWLINE_TYPE_CR` => Some("G_DATA_STREAM_NEWLINE_TYPE_CR")
      case `G_DATA_STREAM_NEWLINE_TYPE_CR_LF` => Some("G_DATA_STREAM_NEWLINE_TYPE_CR_LF")
      case `G_DATA_STREAM_NEWLINE_TYPE_ANY` => Some("G_DATA_STREAM_NEWLINE_TYPE_ANY")
      case _ => _root_.scala.None
  extension (a: GDataStreamNewlineType)
    inline def &(b: GDataStreamNewlineType): GDataStreamNewlineType = a & b
    inline def |(b: GDataStreamNewlineType): GDataStreamNewlineType = a | b
    inline def is(b: GDataStreamNewlineType): Boolean = (a & b) == b