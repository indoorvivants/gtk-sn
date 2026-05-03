package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusMessageFlags: _DBUS_MESSAGE_FLAGS_NONE: No flags set. _DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED: A reply is not expected. _DBUS_MESSAGE_FLAGS_NO_AUTO_START: The bus must not launch an owner for the destination name in response to this message. _DBUS_MESSAGE_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION: If set on a method call, this flag means that the caller is prepared to wait for interactive authorization. Since 2.46.
*/
opaque type GDBusMessageFlags = CUnsignedInt
object GDBusMessageFlags extends _BindgenEnumCUnsignedInt[GDBusMessageFlags]:
  given _tag: Tag[GDBusMessageFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusMessageFlags = a.toUInt
  val G_DBUS_MESSAGE_FLAGS_NONE = define(0)
  val G_DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED = define(1)
  val G_DBUS_MESSAGE_FLAGS_NO_AUTO_START = define(2)
  val G_DBUS_MESSAGE_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION = define(4)
  def getName(value: GDBusMessageFlags): Option[String] =
    value match
      case `G_DBUS_MESSAGE_FLAGS_NONE` => Some("G_DBUS_MESSAGE_FLAGS_NONE")
      case `G_DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED` => Some("G_DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED")
      case `G_DBUS_MESSAGE_FLAGS_NO_AUTO_START` => Some("G_DBUS_MESSAGE_FLAGS_NO_AUTO_START")
      case `G_DBUS_MESSAGE_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION` => Some("G_DBUS_MESSAGE_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION")
      case _ => _root_.scala.None
  extension (a: GDBusMessageFlags)
    inline def &(b: GDBusMessageFlags): GDBusMessageFlags = a & b
    inline def |(b: GDBusMessageFlags): GDBusMessageFlags = a | b
    inline def is(b: GDBusMessageFlags): Boolean = (a & b) == b