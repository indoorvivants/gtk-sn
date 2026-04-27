package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusMessageHeaderField: _DBUS_MESSAGE_HEADER_FIELD_INVALID: Not a valid header field. _DBUS_MESSAGE_HEADER_FIELD_PATH: The object path. _DBUS_MESSAGE_HEADER_FIELD_INTERFACE: The interface name. _DBUS_MESSAGE_HEADER_FIELD_MEMBER: The method or signal name. _DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME: The name of the error that occurred. _DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL: The serial number the message is a reply to. _DBUS_MESSAGE_HEADER_FIELD_DESTINATION: The name the message is intended for. _DBUS_MESSAGE_HEADER_FIELD_SENDER: Unique name of the sender of the message (filled in by the bus). _DBUS_MESSAGE_HEADER_FIELD_SIGNATURE: The signature of the message body. _DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS: The number of UNIX file descriptors that accompany the message.
*/
opaque type GDBusMessageHeaderField = CUnsignedInt
object GDBusMessageHeaderField extends _BindgenEnumCUnsignedInt[GDBusMessageHeaderField]:
  given _tag: Tag[GDBusMessageHeaderField] = Tag.UInt
  inline def define(inline a: Long): GDBusMessageHeaderField = a.toUInt
  val G_DBUS_MESSAGE_HEADER_FIELD_INVALID = define(0)
  val G_DBUS_MESSAGE_HEADER_FIELD_PATH = define(1)
  val G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE = define(2)
  val G_DBUS_MESSAGE_HEADER_FIELD_MEMBER = define(3)
  val G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME = define(4)
  val G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL = define(5)
  val G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION = define(6)
  val G_DBUS_MESSAGE_HEADER_FIELD_SENDER = define(7)
  val G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE = define(8)
  val G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS = define(9)
  def getName(value: GDBusMessageHeaderField): Option[String] =
    value match
      case `G_DBUS_MESSAGE_HEADER_FIELD_INVALID` => Some("G_DBUS_MESSAGE_HEADER_FIELD_INVALID")
      case `G_DBUS_MESSAGE_HEADER_FIELD_PATH` => Some("G_DBUS_MESSAGE_HEADER_FIELD_PATH")
      case `G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE` => Some("G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE")
      case `G_DBUS_MESSAGE_HEADER_FIELD_MEMBER` => Some("G_DBUS_MESSAGE_HEADER_FIELD_MEMBER")
      case `G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME` => Some("G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME")
      case `G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL` => Some("G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL")
      case `G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION` => Some("G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION")
      case `G_DBUS_MESSAGE_HEADER_FIELD_SENDER` => Some("G_DBUS_MESSAGE_HEADER_FIELD_SENDER")
      case `G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE` => Some("G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE")
      case `G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS` => Some("G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS")
      case _ => _root_.scala.None
  extension (a: GDBusMessageHeaderField)
    inline def &(b: GDBusMessageHeaderField): GDBusMessageHeaderField = a & b
    inline def |(b: GDBusMessageHeaderField): GDBusMessageHeaderField = a | b
    inline def is(b: GDBusMessageHeaderField): Boolean = (a & b) == b