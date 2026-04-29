package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusCapabilityFlags: _DBUS_CAPABILITY_FLAGS_NONE: No flags set. _DBUS_CAPABILITY_FLAGS_UNIX_FD_PASSING: The connection supports exchanging UNIX file descriptors with the remote peer.
*/
opaque type GDBusCapabilityFlags = CUnsignedInt
object GDBusCapabilityFlags extends _BindgenEnumCUnsignedInt[GDBusCapabilityFlags]:
  given _tag: Tag[GDBusCapabilityFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusCapabilityFlags = a.toUInt
  val G_DBUS_CAPABILITY_FLAGS_NONE = define(0)
  val G_DBUS_CAPABILITY_FLAGS_UNIX_FD_PASSING = define(1)
  def getName(value: GDBusCapabilityFlags): Option[String] =
    value match
      case `G_DBUS_CAPABILITY_FLAGS_NONE` => Some("G_DBUS_CAPABILITY_FLAGS_NONE")
      case `G_DBUS_CAPABILITY_FLAGS_UNIX_FD_PASSING` => Some("G_DBUS_CAPABILITY_FLAGS_UNIX_FD_PASSING")
      case _ => _root_.scala.None
  extension (a: GDBusCapabilityFlags)
    inline def &(b: GDBusCapabilityFlags): GDBusCapabilityFlags = a & b
    inline def |(b: GDBusCapabilityFlags): GDBusCapabilityFlags = a | b
    inline def is(b: GDBusCapabilityFlags): Boolean = (a & b) == b