package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusConnectionFlags: _DBUS_CONNECTION_FLAGS_NONE: No flags set. _DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT: Perform authentication against server. _DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER: Perform authentication against client. _DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS: When authenticating as a server, allow the anonymous authentication method. _DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION: Pass this flag if connecting to a peer that is a message bus. This means that the Hello() method will be invoked as part of the connection setup. _DBUS_CONNECTION_FLAGS_DELAY_MESSAGE_PROCESSING: If set, processing of D-Bus messages is delayed until g_dbus_connection_start_message_processing() is called. _DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER: When authenticating as a server, require the UID of the peer to be the same as the UID of the server. (Since: 2.68) _DBUS_CONNECTION_FLAGS_CROSS_NAMESPACE: When authenticating, try to use protocols that work across a Linux user namespace boundary, even if this reduces interoperability with older D-Bus implementations. This currently affects client-side `EXTERNAL` authentication, for which this flag makes connections to a server in another user namespace succeed, but causes a deadlock when connecting to a GDBus server older than 2.73.3. Since: 2.74
*/
opaque type GDBusConnectionFlags = CUnsignedInt
object GDBusConnectionFlags extends _BindgenEnumCUnsignedInt[GDBusConnectionFlags]:
  given _tag: Tag[GDBusConnectionFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusConnectionFlags = a.toUInt
  val G_DBUS_CONNECTION_FLAGS_NONE = define(0)
  val G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT = define(1)
  val G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER = define(2)
  val G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS = define(4)
  val G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION = define(8)
  val G_DBUS_CONNECTION_FLAGS_DELAY_MESSAGE_PROCESSING = define(16)
  val G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER = define(32)
  val G_DBUS_CONNECTION_FLAGS_CROSS_NAMESPACE = define(64)
  def getName(value: GDBusConnectionFlags): Option[String] =
    value match
      case `G_DBUS_CONNECTION_FLAGS_NONE` => Some("G_DBUS_CONNECTION_FLAGS_NONE")
      case `G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT` => Some("G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT")
      case `G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER` => Some("G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER")
      case `G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS` => Some("G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS")
      case `G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION` => Some("G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION")
      case `G_DBUS_CONNECTION_FLAGS_DELAY_MESSAGE_PROCESSING` => Some("G_DBUS_CONNECTION_FLAGS_DELAY_MESSAGE_PROCESSING")
      case `G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER` => Some("G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER")
      case `G_DBUS_CONNECTION_FLAGS_CROSS_NAMESPACE` => Some("G_DBUS_CONNECTION_FLAGS_CROSS_NAMESPACE")
      case _ => _root_.scala.None
  extension (a: GDBusConnectionFlags)
    inline def &(b: GDBusConnectionFlags): GDBusConnectionFlags = a & b
    inline def |(b: GDBusConnectionFlags): GDBusConnectionFlags = a | b
    inline def is(b: GDBusConnectionFlags): Boolean = (a & b) == b