package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusMessageType: _DBUS_MESSAGE_TYPE_INVALID: Message is of invalid type. _DBUS_MESSAGE_TYPE_METHOD_CALL: Method call. _DBUS_MESSAGE_TYPE_METHOD_RETURN: Method reply. _DBUS_MESSAGE_TYPE_ERROR: Error reply. _DBUS_MESSAGE_TYPE_SIGNAL: Signal emission.
*/
opaque type GDBusMessageType = CUnsignedInt
object GDBusMessageType extends _BindgenEnumCUnsignedInt[GDBusMessageType]:
  given _tag: Tag[GDBusMessageType] = Tag.UInt
  inline def define(inline a: Long): GDBusMessageType = a.toUInt
  val G_DBUS_MESSAGE_TYPE_INVALID = define(0)
  val G_DBUS_MESSAGE_TYPE_METHOD_CALL = define(1)
  val G_DBUS_MESSAGE_TYPE_METHOD_RETURN = define(2)
  val G_DBUS_MESSAGE_TYPE_ERROR = define(3)
  val G_DBUS_MESSAGE_TYPE_SIGNAL = define(4)
  def getName(value: GDBusMessageType): Option[String] =
    value match
      case `G_DBUS_MESSAGE_TYPE_INVALID` => Some("G_DBUS_MESSAGE_TYPE_INVALID")
      case `G_DBUS_MESSAGE_TYPE_METHOD_CALL` => Some("G_DBUS_MESSAGE_TYPE_METHOD_CALL")
      case `G_DBUS_MESSAGE_TYPE_METHOD_RETURN` => Some("G_DBUS_MESSAGE_TYPE_METHOD_RETURN")
      case `G_DBUS_MESSAGE_TYPE_ERROR` => Some("G_DBUS_MESSAGE_TYPE_ERROR")
      case `G_DBUS_MESSAGE_TYPE_SIGNAL` => Some("G_DBUS_MESSAGE_TYPE_SIGNAL")
      case _ => _root_.scala.None
  extension (a: GDBusMessageType)
    inline def &(b: GDBusMessageType): GDBusMessageType = a & b
    inline def |(b: GDBusMessageType): GDBusMessageType = a | b
    inline def is(b: GDBusMessageType): Boolean = (a & b) == b