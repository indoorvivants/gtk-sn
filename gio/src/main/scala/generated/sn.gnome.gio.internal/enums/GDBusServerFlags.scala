package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusServerFlags: _DBUS_SERVER_FLAGS_NONE: No flags set. _DBUS_SERVER_FLAGS_RUN_IN_THREAD: All #GDBusServer::new-connection signals will run in separated dedicated threads (see signal for details). _DBUS_SERVER_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS: Allow the anonymous authentication method. _DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER: Require the UID of the peer to be the same as the UID of the server when authenticating. (Since: 2.68)
*/
opaque type GDBusServerFlags = CUnsignedInt
object GDBusServerFlags extends _BindgenEnumCUnsignedInt[GDBusServerFlags]:
  given _tag: Tag[GDBusServerFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusServerFlags = a.toUInt
  val G_DBUS_SERVER_FLAGS_NONE = define(0)
  val G_DBUS_SERVER_FLAGS_RUN_IN_THREAD = define(1)
  val G_DBUS_SERVER_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS = define(2)
  val G_DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER = define(4)
  def getName(value: GDBusServerFlags): Option[String] =
    value match
      case `G_DBUS_SERVER_FLAGS_NONE` => Some("G_DBUS_SERVER_FLAGS_NONE")
      case `G_DBUS_SERVER_FLAGS_RUN_IN_THREAD` => Some("G_DBUS_SERVER_FLAGS_RUN_IN_THREAD")
      case `G_DBUS_SERVER_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS` => Some("G_DBUS_SERVER_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS")
      case `G_DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER` => Some("G_DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER")
      case _ => _root_.scala.None
  extension (a: GDBusServerFlags)
    inline def &(b: GDBusServerFlags): GDBusServerFlags = a & b
    inline def |(b: GDBusServerFlags): GDBusServerFlags = a | b
    inline def is(b: GDBusServerFlags): Boolean = (a & b) == b