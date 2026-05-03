package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusPropertyInfoFlags: _DBUS_PROPERTY_INFO_FLAGS_NONE: No flags set. _DBUS_PROPERTY_INFO_FLAGS_READABLE: Property is readable. _DBUS_PROPERTY_INFO_FLAGS_WRITABLE: Property is writable.
*/
opaque type GDBusPropertyInfoFlags = CUnsignedInt
object GDBusPropertyInfoFlags extends _BindgenEnumCUnsignedInt[GDBusPropertyInfoFlags]:
  given _tag: Tag[GDBusPropertyInfoFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusPropertyInfoFlags = a.toUInt
  val G_DBUS_PROPERTY_INFO_FLAGS_NONE = define(0)
  val G_DBUS_PROPERTY_INFO_FLAGS_READABLE = define(1)
  val G_DBUS_PROPERTY_INFO_FLAGS_WRITABLE = define(2)
  def getName(value: GDBusPropertyInfoFlags): Option[String] =
    value match
      case `G_DBUS_PROPERTY_INFO_FLAGS_NONE` => Some("G_DBUS_PROPERTY_INFO_FLAGS_NONE")
      case `G_DBUS_PROPERTY_INFO_FLAGS_READABLE` => Some("G_DBUS_PROPERTY_INFO_FLAGS_READABLE")
      case `G_DBUS_PROPERTY_INFO_FLAGS_WRITABLE` => Some("G_DBUS_PROPERTY_INFO_FLAGS_WRITABLE")
      case _ => _root_.scala.None
  extension (a: GDBusPropertyInfoFlags)
    inline def &(b: GDBusPropertyInfoFlags): GDBusPropertyInfoFlags = a & b
    inline def |(b: GDBusPropertyInfoFlags): GDBusPropertyInfoFlags = a | b
    inline def is(b: GDBusPropertyInfoFlags): Boolean = (a & b) == b