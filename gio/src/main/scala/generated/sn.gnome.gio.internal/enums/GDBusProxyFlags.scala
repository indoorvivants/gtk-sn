package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusProxyFlags: _DBUS_PROXY_FLAGS_NONE: No flags set. _DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES: Don't load properties. _DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS: Don't connect to signals on the remote object. _DBUS_PROXY_FLAGS_DO_NOT_AUTO_START: If the proxy is for a well-known name, do not ask the bus to launch an owner during proxy initialization or a method call. This flag is only meaningful in proxies for well-known names. _DBUS_PROXY_FLAGS_GET_INVALIDATED_PROPERTIES: If set, the property value for any __invalidated property__ will be (asynchronously) retrieved upon receiving the [`PropertiesChanged`](http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-properties) D-Bus signal and the property will not cause emission of the #GDBusProxy::g-properties-changed signal. When the value is received the #GDBusProxy::g-properties-changed signal is emitted for the property along with the retrieved value. Since 2.32. _DBUS_PROXY_FLAGS_DO_NOT_AUTO_START_AT_CONSTRUCTION: If the proxy is for a well-known name, do not ask the bus to launch an owner during proxy initialization, but allow it to be autostarted by a method call. This flag is only meaningful in proxies for well-known names, and only if %G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START is not also specified. _DBUS_PROXY_FLAGS_NO_MATCH_RULE: Don't actually send the AddMatch D-Bus call for this signal subscription. This gives you more control over which match rules you add (but you must add them manually). (Since: 2.72)
*/
opaque type GDBusProxyFlags = CUnsignedInt
object GDBusProxyFlags extends _BindgenEnumCUnsignedInt[GDBusProxyFlags]:
  given _tag: Tag[GDBusProxyFlags] = Tag.UInt
  inline def define(inline a: Long): GDBusProxyFlags = a.toUInt
  val G_DBUS_PROXY_FLAGS_NONE = define(0)
  val G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES = define(1)
  val G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS = define(2)
  val G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START = define(4)
  val G_DBUS_PROXY_FLAGS_GET_INVALIDATED_PROPERTIES = define(8)
  val G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START_AT_CONSTRUCTION = define(16)
  val G_DBUS_PROXY_FLAGS_NO_MATCH_RULE = define(32)
  def getName(value: GDBusProxyFlags): Option[String] =
    value match
      case `G_DBUS_PROXY_FLAGS_NONE` => Some("G_DBUS_PROXY_FLAGS_NONE")
      case `G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES` => Some("G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES")
      case `G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS` => Some("G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS")
      case `G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START` => Some("G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START")
      case `G_DBUS_PROXY_FLAGS_GET_INVALIDATED_PROPERTIES` => Some("G_DBUS_PROXY_FLAGS_GET_INVALIDATED_PROPERTIES")
      case `G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START_AT_CONSTRUCTION` => Some("G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START_AT_CONSTRUCTION")
      case `G_DBUS_PROXY_FLAGS_NO_MATCH_RULE` => Some("G_DBUS_PROXY_FLAGS_NO_MATCH_RULE")
      case _ => _root_.scala.None
  extension (a: GDBusProxyFlags)
    inline def &(b: GDBusProxyFlags): GDBusProxyFlags = a & b
    inline def |(b: GDBusProxyFlags): GDBusProxyFlags = a | b
    inline def is(b: GDBusProxyFlags): Boolean = (a & b) == b