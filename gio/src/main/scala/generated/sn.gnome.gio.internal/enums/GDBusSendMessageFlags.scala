package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusSendMessageFlags: _DBUS_SEND_MESSAGE_FLAGS_NONE: No flags set. _DBUS_SEND_MESSAGE_FLAGS_PRESERVE_SERIAL: Do not automatically assign a serial number from the #GDBusConnection object when sending a message.
*/
opaque type GDBusSendMessageFlags = CUnsignedInt
object GDBusSendMessageFlags extends _BindgenEnumCUnsignedInt[GDBusSendMessageFlags]:
  given _tag: Tag[GDBusSendMessageFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusSendMessageFlags = a.toUInt
  val G_DBUS_SEND_MESSAGE_FLAGS_NONE = define(0)
  val G_DBUS_SEND_MESSAGE_FLAGS_PRESERVE_SERIAL = define(1)
  def getName(value: GDBusSendMessageFlags): Option[String] =
    value match
      case `G_DBUS_SEND_MESSAGE_FLAGS_NONE` => Some("G_DBUS_SEND_MESSAGE_FLAGS_NONE")
      case `G_DBUS_SEND_MESSAGE_FLAGS_PRESERVE_SERIAL` => Some("G_DBUS_SEND_MESSAGE_FLAGS_PRESERVE_SERIAL")
      case _ => _root_.scala.None
  extension (a: GDBusSendMessageFlags)
    inline def &(b: GDBusSendMessageFlags): GDBusSendMessageFlags = a & b
    inline def |(b: GDBusSendMessageFlags): GDBusSendMessageFlags = a | b
    inline def is(b: GDBusSendMessageFlags): Boolean = (a & b) == b