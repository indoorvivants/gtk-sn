package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDBusServerFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used when creating a #GDBusServer.
  */
class DBusServerFlags private (val raw: GDBusServerFlags):
  def is(kv: DBusServerFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[DBusServerFlags.KnownValue]
    DBusServerFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"DBusServerFlags(${sb.result().mkString(", ")})"
end DBusServerFlags

object DBusServerFlags:
  export KnownValue.*

  def fromRaw(raw: GDBusServerFlags) = new DBusServerFlags(raw)

  extension (af: DBusServerFlags)
    def &(other: DBusServerFlags) =
      DBusServerFlags(af.raw & other.raw)
    def |(other: DBusServerFlags) =
      DBusServerFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags used when creating a #GDBusServer.
    */
  enum KnownValue(override val raw: GDBusServerFlags, name: String)
      extends DBusServerFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE
        extends KnownValue(GDBusServerFlags.G_DBUS_SERVER_FLAGS_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * All #GDBusServer::new-connection signals will run in separated dedicated
      * threads (see signal for details).
      */
    case RUN_IN_THREAD
        extends KnownValue(
          GDBusServerFlags.G_DBUS_SERVER_FLAGS_RUN_IN_THREAD,
          "RUN_IN_THREAD"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Allow the anonymous authentication method.
      */
    case AUTHENTICATION_ALLOW_ANONYMOUS
        extends KnownValue(
          GDBusServerFlags.G_DBUS_SERVER_FLAGS_AUTHENTICATION_ALLOW_ANONYMOUS,
          "AUTHENTICATION_ALLOW_ANONYMOUS"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Require the UID of the peer to be the same as the UID of the server when
      * authenticating. (Since: 2.68)
      */
    case AUTHENTICATION_REQUIRE_SAME_USER
        extends KnownValue(
          GDBusServerFlags.G_DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER,
          "AUTHENTICATION_REQUIRE_SAME_USER"
        )
  end KnownValue
end DBusServerFlags
