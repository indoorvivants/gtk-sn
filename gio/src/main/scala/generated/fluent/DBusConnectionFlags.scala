package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDBusConnectionFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used when creating a new #GDBusConnection.
  */
class DBusConnectionFlags private (val raw: GDBusConnectionFlags):
  def is(kv: DBusConnectionFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[DBusConnectionFlags.KnownValue]
    DBusConnectionFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"DBusConnectionFlags(${sb.result().mkString(", ")})"
end DBusConnectionFlags

object DBusConnectionFlags:
  export KnownValue.*

  def fromRaw(raw: GDBusConnectionFlags) = new DBusConnectionFlags(raw)

  extension (af: DBusConnectionFlags)
    def &(other: DBusConnectionFlags) =
      DBusConnectionFlags(af.raw & other.raw)
    def |(other: DBusConnectionFlags) =
      DBusConnectionFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags used when creating a new #GDBusConnection.
    */
  enum KnownValue(override val raw: GDBusConnectionFlags, name: String)
      extends DBusConnectionFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE
        extends KnownValue(
          GDBusConnectionFlags.G_DBUS_CONNECTION_FLAGS_NONE,
          "NONE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Perform authentication against server.
      */
    case AUTHENTICATION_CLIENT
        extends KnownValue(
          GDBusConnectionFlags.G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT,
          "AUTHENTICATION_CLIENT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Perform authentication against client.
      */
    case AUTHENTICATION_SERVER
        extends KnownValue(
          GDBusConnectionFlags.G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER,
          "AUTHENTICATION_SERVER"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * When authenticating as a server, allow the anonymous authentication
      * method.
      */
    case AUTHENTICATION_ALLOW_ANONYMOUS
        extends KnownValue(
          GDBusConnectionFlags.G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS,
          "AUTHENTICATION_ALLOW_ANONYMOUS"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Pass this flag if connecting to a peer that is a message bus. This means
      * that the Hello() method will be invoked as part of the connection setup.
      */
    case MESSAGE_BUS_CONNECTION
        extends KnownValue(
          GDBusConnectionFlags.G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION,
          "MESSAGE_BUS_CONNECTION"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * If set, processing of D-Bus messages is delayed until
      * g_dbus_connection_start_message_processing() is called.
      */
    case DELAY_MESSAGE_PROCESSING
        extends KnownValue(
          GDBusConnectionFlags.G_DBUS_CONNECTION_FLAGS_DELAY_MESSAGE_PROCESSING,
          "DELAY_MESSAGE_PROCESSING"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * When authenticating as a server, require the UID of the peer to be the
      * same as the UID of the server. (Since: 2.68)
      */
    case AUTHENTICATION_REQUIRE_SAME_USER
        extends KnownValue(
          GDBusConnectionFlags.G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER,
          "AUTHENTICATION_REQUIRE_SAME_USER"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * When authenticating, try to use protocols that work across a Linux user
      * namespace boundary, even if this reduces interoperability with older
      * D-Bus implementations. This currently affects client-side `EXTERNAL`
      * authentication, for which this flag makes connections to a server in
      * another user namespace succeed, but causes a deadlock when connecting to
      * a GDBus server older than 2.73.3. Since: 2.74
      */
    case CROSS_NAMESPACE
        extends KnownValue(
          GDBusConnectionFlags.G_DBUS_CONNECTION_FLAGS_CROSS_NAMESPACE,
          "CROSS_NAMESPACE"
        )
  end KnownValue
end DBusConnectionFlags
