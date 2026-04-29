package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusSignalFlags: _DBUS_SIGNAL_FLAGS_NONE: No flags set. _DBUS_SIGNAL_FLAGS_NO_MATCH_RULE: Don't actually send the AddMatch D-Bus call for this signal subscription. This gives you more control over which match rules you add (but you must add them manually). _DBUS_SIGNAL_FLAGS_MATCH_ARG0_NAMESPACE: Match first arguments that contain a bus or interface name with the given namespace. _DBUS_SIGNAL_FLAGS_MATCH_ARG0_PATH: Match first arguments that contain an object path that is either equivalent to the given path, or one of the paths is a subpath of the other.
*/
opaque type GDBusSignalFlags = CUnsignedInt
object GDBusSignalFlags extends _BindgenEnumCUnsignedInt[GDBusSignalFlags]:
  given _tag: Tag[GDBusSignalFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusSignalFlags = a.toUInt
  val G_DBUS_SIGNAL_FLAGS_NONE = define(0)
  val G_DBUS_SIGNAL_FLAGS_NO_MATCH_RULE = define(1)
  val G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_NAMESPACE = define(2)
  val G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_PATH = define(4)
  def getName(value: GDBusSignalFlags): Option[String] =
    value match
      case `G_DBUS_SIGNAL_FLAGS_NONE` => Some("G_DBUS_SIGNAL_FLAGS_NONE")
      case `G_DBUS_SIGNAL_FLAGS_NO_MATCH_RULE` => Some("G_DBUS_SIGNAL_FLAGS_NO_MATCH_RULE")
      case `G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_NAMESPACE` => Some("G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_NAMESPACE")
      case `G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_PATH` => Some("G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_PATH")
      case _ => _root_.scala.None
  extension (a: GDBusSignalFlags)
    inline def &(b: GDBusSignalFlags): GDBusSignalFlags = a & b
    inline def |(b: GDBusSignalFlags): GDBusSignalFlags = a | b
    inline def is(b: GDBusSignalFlags): Boolean = (a & b) == b