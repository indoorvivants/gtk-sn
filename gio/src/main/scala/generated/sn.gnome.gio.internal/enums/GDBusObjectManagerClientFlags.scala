package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusObjectManagerClientFlags: _DBUS_OBJECT_MANAGER_CLIENT_FLAGS_NONE: No flags set. _DBUS_OBJECT_MANAGER_CLIENT_FLAGS_DO_NOT_AUTO_START: If not set and the manager is for a well-known name, then request the bus to launch an owner for the name if no-one owns the name. This flag can only be used in managers for well-known names.
*/
opaque type GDBusObjectManagerClientFlags = CUnsignedInt
object GDBusObjectManagerClientFlags extends _BindgenEnumCUnsignedInt[GDBusObjectManagerClientFlags]:
  given _tag: Tag[GDBusObjectManagerClientFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusObjectManagerClientFlags = a.toUInt
  val G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_NONE = define(0)
  val G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_DO_NOT_AUTO_START = define(1)
  def getName(value: GDBusObjectManagerClientFlags): Option[String] =
    value match
      case `G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_NONE` => Some("G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_NONE")
      case `G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_DO_NOT_AUTO_START` => Some("G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_DO_NOT_AUTO_START")
      case _ => _root_.scala.None
  extension (a: GDBusObjectManagerClientFlags)
    inline def &(b: GDBusObjectManagerClientFlags): GDBusObjectManagerClientFlags = a & b
    inline def |(b: GDBusObjectManagerClientFlags): GDBusObjectManagerClientFlags = a | b
    inline def is(b: GDBusObjectManagerClientFlags): Boolean = (a & b) == b