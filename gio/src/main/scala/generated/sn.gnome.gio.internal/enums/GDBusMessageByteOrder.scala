package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusMessageByteOrder: _DBUS_MESSAGE_BYTE_ORDER_BIG_ENDIAN: The byte order is big endian. _DBUS_MESSAGE_BYTE_ORDER_LITTLE_ENDIAN: The byte order is little endian.
*/
opaque type GDBusMessageByteOrder = CUnsignedInt
object GDBusMessageByteOrder extends _BindgenEnumCUnsignedInt[GDBusMessageByteOrder]:
  given _tag: Tag[GDBusMessageByteOrder] = Tag.UInt
  inline def define(inline a: Long): GDBusMessageByteOrder = a.toUInt
  val G_DBUS_MESSAGE_BYTE_ORDER_BIG_ENDIAN = define(66)
  val G_DBUS_MESSAGE_BYTE_ORDER_LITTLE_ENDIAN = define(108)
  def getName(value: GDBusMessageByteOrder): Option[String] =
    value match
      case `G_DBUS_MESSAGE_BYTE_ORDER_BIG_ENDIAN` => Some("G_DBUS_MESSAGE_BYTE_ORDER_BIG_ENDIAN")
      case `G_DBUS_MESSAGE_BYTE_ORDER_LITTLE_ENDIAN` => Some("G_DBUS_MESSAGE_BYTE_ORDER_LITTLE_ENDIAN")
      case _ => _root_.scala.None
  extension (a: GDBusMessageByteOrder)
    inline def &(b: GDBusMessageByteOrder): GDBusMessageByteOrder = a & b
    inline def |(b: GDBusMessageByteOrder): GDBusMessageByteOrder = a | b
    inline def is(b: GDBusMessageByteOrder): Boolean = (a & b) == b