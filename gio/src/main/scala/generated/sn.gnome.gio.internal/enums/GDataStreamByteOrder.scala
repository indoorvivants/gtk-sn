package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDataStreamByteOrder: _DATA_STREAM_BYTE_ORDER_BIG_ENDIAN: Selects Big Endian byte order. _DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN: Selects Little Endian byte order. _DATA_STREAM_BYTE_ORDER_HOST_ENDIAN: Selects endianness based on host machine's architecture.
*/
opaque type GDataStreamByteOrder = CUnsignedInt
object GDataStreamByteOrder extends _BindgenEnumCUnsignedInt[GDataStreamByteOrder]:
  given _tag: Tag[GDataStreamByteOrder] = Tag.UInt
  inline def define(inline a: Long): GDataStreamByteOrder = a.toUInt
  val G_DATA_STREAM_BYTE_ORDER_BIG_ENDIAN = define(0)
  val G_DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN = define(1)
  val G_DATA_STREAM_BYTE_ORDER_HOST_ENDIAN = define(2)
  def getName(value: GDataStreamByteOrder): Option[String] =
    value match
      case `G_DATA_STREAM_BYTE_ORDER_BIG_ENDIAN` => Some("G_DATA_STREAM_BYTE_ORDER_BIG_ENDIAN")
      case `G_DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN` => Some("G_DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN")
      case `G_DATA_STREAM_BYTE_ORDER_HOST_ENDIAN` => Some("G_DATA_STREAM_BYTE_ORDER_HOST_ENDIAN")
      case _ => _root_.scala.None
  extension (a: GDataStreamByteOrder)
    inline def &(b: GDataStreamByteOrder): GDataStreamByteOrder = a & b
    inline def |(b: GDataStreamByteOrder): GDataStreamByteOrder = a | b
    inline def is(b: GDataStreamByteOrder): Boolean = (a & b) == b