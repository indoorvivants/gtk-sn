package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDBusProxyFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used when constructing an instance of a #GDBusProxy derived class.
  */
class DBusProxyFlags private (val raw: GDBusProxyFlags):
  def is(kv: DBusProxyFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[DBusProxyFlags.KnownValue]
    DBusProxyFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"DBusProxyFlags(${sb.result().mkString(", ")})"
end DBusProxyFlags

object DBusProxyFlags:
  export KnownValue.*

  def fromRaw(raw: GDBusProxyFlags) = new DBusProxyFlags(raw)

  extension (af: DBusProxyFlags)
    def &(other: DBusProxyFlags) =
      DBusProxyFlags(af.raw & other.raw)
    def |(other: DBusProxyFlags) =
      DBusProxyFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags used when constructing an instance of a #GDBusProxy derived class.
    */
  enum KnownValue(override val raw: GDBusProxyFlags, name: String)
      extends DBusProxyFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE
        extends KnownValue(GDBusProxyFlags.G_DBUS_PROXY_FLAGS_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Don't load properties.
      */
    case DO_NOT_LOAD_PROPERTIES
        extends KnownValue(
          GDBusProxyFlags.G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES,
          "DO_NOT_LOAD_PROPERTIES"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Don't connect to signals on the remote object.
      */
    case DO_NOT_CONNECT_SIGNALS
        extends KnownValue(
          GDBusProxyFlags.G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS,
          "DO_NOT_CONNECT_SIGNALS"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * If the proxy is for a well-known name, do not ask the bus to launch an
      * owner during proxy initialization or a method call. This flag is only
      * meaningful in proxies for well-known names.
      */
    case DO_NOT_AUTO_START
        extends KnownValue(
          GDBusProxyFlags.G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START,
          "DO_NOT_AUTO_START"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * If set, the property value for any __invalidated property__ will be
      * (asynchronously) retrieved upon receiving the
      * [`PropertiesChanged`](http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-properties)
      * D-Bus signal and the property will not cause emission of the
      * #GDBusProxy::g-properties-changed signal. When the value is received the
      * #GDBusProxy::g-properties-changed signal is emitted for the property
      * along with the retrieved value. Since 2.32.
      */
    case GET_INVALIDATED_PROPERTIES
        extends KnownValue(
          GDBusProxyFlags.G_DBUS_PROXY_FLAGS_GET_INVALIDATED_PROPERTIES,
          "GET_INVALIDATED_PROPERTIES"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * If the proxy is for a well-known name, do not ask the bus to launch an
      * owner during proxy initialization, but allow it to be autostarted by a
      * method call. This flag is only meaningful in proxies for well-known
      * names, and only if %G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START is not also
      * specified.
      */
    case DO_NOT_AUTO_START_AT_CONSTRUCTION
        extends KnownValue(
          GDBusProxyFlags.G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START_AT_CONSTRUCTION,
          "DO_NOT_AUTO_START_AT_CONSTRUCTION"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Don't actually send the AddMatch D-Bus call for this signal
      * subscription. This gives you more control over which match rules you add
      * (but you must add them manually). (Since: 2.72)
      */
    case NO_MATCH_RULE
        extends KnownValue(
          GDBusProxyFlags.G_DBUS_PROXY_FLAGS_NO_MATCH_RULE,
          "NO_MATCH_RULE"
        )
  end KnownValue
end DBusProxyFlags
