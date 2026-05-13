package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GDBusConnectionFlags

/** Flags used when creating a new #GDBusConnection.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
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

  /** Flags used when creating a new #GDBusConnection.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GDBusConnectionFlags, name: String)
      extends DBusConnectionFlags(raw):
    override def toString(): String = this.name

    /** No flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(
          GDBusConnectionFlags.G_DBUS_CONNECTION_FLAGS_NONE,
          "NONE"
        )

    /** Perform authentication against server.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case AUTHENTICATION_CLIENT
        extends KnownValue(
          GDBusConnectionFlags.G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT,
          "AUTHENTICATION_CLIENT"
        )

    /** Perform authentication against client.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case AUTHENTICATION_SERVER
        extends KnownValue(
          GDBusConnectionFlags.G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_SERVER,
          "AUTHENTICATION_SERVER"
        )

    /** When authenticating as a server, allow the anonymous authentication
      * method.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case AUTHENTICATION_ALLOW_ANONYMOUS
        extends KnownValue(
          GDBusConnectionFlags.G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS,
          "AUTHENTICATION_ALLOW_ANONYMOUS"
        )

    /** Pass this flag if connecting to a peer that is a message bus. This means
      * that the Hello() method will be invoked as part of the connection setup.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case MESSAGE_BUS_CONNECTION
        extends KnownValue(
          GDBusConnectionFlags.G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION,
          "MESSAGE_BUS_CONNECTION"
        )

    /** If set, processing of D-Bus messages is delayed until
      * g_dbus_connection_start_message_processing() is called.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DELAY_MESSAGE_PROCESSING
        extends KnownValue(
          GDBusConnectionFlags.G_DBUS_CONNECTION_FLAGS_DELAY_MESSAGE_PROCESSING,
          "DELAY_MESSAGE_PROCESSING"
        )

    /** When authenticating as a server, require the UID of the peer to be the
      * same as the UID of the server. (Since: 2.68)
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case AUTHENTICATION_REQUIRE_SAME_USER
        extends KnownValue(
          GDBusConnectionFlags.G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER,
          "AUTHENTICATION_REQUIRE_SAME_USER"
        )

    /** When authenticating, try to use protocols that work across a Linux user
      * namespace boundary, even if this reduces interoperability with older
      * D-Bus implementations. This currently affects client-side `EXTERNAL`
      * authentication, for which this flag makes connections to a server in
      * another user namespace succeed, but causes a deadlock when connecting to
      * a GDBus server older than 2.73.3. Since: 2.74
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CROSS_NAMESPACE
        extends KnownValue(
          GDBusConnectionFlags.G_DBUS_CONNECTION_FLAGS_CROSS_NAMESPACE,
          "CROSS_NAMESPACE"
        )
  end KnownValue
end DBusConnectionFlags
