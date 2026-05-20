package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GDBusProxyFlags

/** Flags used when constructing an instance of a #GDBusProxy derived class.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusProxyFlags private (val raw: GDBusProxyFlags):
  def is(kv: DBusProxyFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[DBusProxyFlags.KnownValue]
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

  /** Flags used when constructing an instance of a #GDBusProxy derived class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GDBusProxyFlags, name: scala.Predef.String)
      extends DBusProxyFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** No flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(GDBusProxyFlags.G_DBUS_PROXY_FLAGS_NONE, "NONE")

    /** Don't load properties.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DO_NOT_LOAD_PROPERTIES
        extends KnownValue(
          GDBusProxyFlags.G_DBUS_PROXY_FLAGS_DO_NOT_LOAD_PROPERTIES,
          "DO_NOT_LOAD_PROPERTIES"
        )

    /** Don't connect to signals on the remote object.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DO_NOT_CONNECT_SIGNALS
        extends KnownValue(
          GDBusProxyFlags.G_DBUS_PROXY_FLAGS_DO_NOT_CONNECT_SIGNALS,
          "DO_NOT_CONNECT_SIGNALS"
        )

    /** If the proxy is for a well-known name, do not ask the bus to launch an
      * owner during proxy initialization or a method call. This flag is only
      * meaningful in proxies for well-known names.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DO_NOT_AUTO_START
        extends KnownValue(
          GDBusProxyFlags.G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START,
          "DO_NOT_AUTO_START"
        )

    /** If set, the property value for any __invalidated property__ will be
      * (asynchronously) retrieved upon receiving the
      * [`PropertiesChanged`](http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-properties)
      * D-Bus signal and the property will not cause emission of the
      * #GDBusProxy::g-properties-changed signal. When the value is received the
      * #GDBusProxy::g-properties-changed signal is emitted for the property
      * along with the retrieved value. Since 2.32.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case GET_INVALIDATED_PROPERTIES
        extends KnownValue(
          GDBusProxyFlags.G_DBUS_PROXY_FLAGS_GET_INVALIDATED_PROPERTIES,
          "GET_INVALIDATED_PROPERTIES"
        )

    /** If the proxy is for a well-known name, do not ask the bus to launch an
      * owner during proxy initialization, but allow it to be autostarted by a
      * method call. This flag is only meaningful in proxies for well-known
      * names, and only if %G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START is not also
      * specified.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DO_NOT_AUTO_START_AT_CONSTRUCTION
        extends KnownValue(
          GDBusProxyFlags.G_DBUS_PROXY_FLAGS_DO_NOT_AUTO_START_AT_CONSTRUCTION,
          "DO_NOT_AUTO_START_AT_CONSTRUCTION"
        )

    /** Don't actually send the AddMatch D-Bus call for this signal
      * subscription. This gives you more control over which match rules you add
      * (but you must add them manually). (Since: 2.72)
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NO_MATCH_RULE
        extends KnownValue(
          GDBusProxyFlags.G_DBUS_PROXY_FLAGS_NO_MATCH_RULE,
          "NO_MATCH_RULE"
        )
  end KnownValue
end DBusProxyFlags
