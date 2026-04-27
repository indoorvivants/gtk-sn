package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusCallFlags: _DBUS_CALL_FLAGS_NONE: No flags set. _DBUS_CALL_FLAGS_NO_AUTO_START: The bus must not launch an owner for the destination name in response to this method invocation. _DBUS_CALL_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION: the caller is prepared to wait for interactive authorization. Since 2.46.
*/
opaque type GDBusCallFlags = CUnsignedInt
object GDBusCallFlags extends _BindgenEnumCUnsignedInt[GDBusCallFlags]:
  given _tag: Tag[GDBusCallFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusCallFlags = a.toUInt
  val G_DBUS_CALL_FLAGS_NONE = define(0)
  val G_DBUS_CALL_FLAGS_NO_AUTO_START = define(1)
  val G_DBUS_CALL_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION = define(2)
  def getName(value: GDBusCallFlags): Option[String] =
    value match
      case `G_DBUS_CALL_FLAGS_NONE` => Some("G_DBUS_CALL_FLAGS_NONE")
      case `G_DBUS_CALL_FLAGS_NO_AUTO_START` => Some("G_DBUS_CALL_FLAGS_NO_AUTO_START")
      case `G_DBUS_CALL_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION` => Some("G_DBUS_CALL_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION")
      case _ => _root_.scala.None
  extension (a: GDBusCallFlags)
    inline def &(b: GDBusCallFlags): GDBusCallFlags = a & b
    inline def |(b: GDBusCallFlags): GDBusCallFlags = a | b
    inline def is(b: GDBusCallFlags): Boolean = (a & b) == b