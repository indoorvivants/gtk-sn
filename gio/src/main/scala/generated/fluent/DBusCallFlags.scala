package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDBusCallFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used in g_dbus_connection_call() and similar APIs.
  */
class DBusCallFlags private (val raw: GDBusCallFlags):
  def is(kv: DBusCallFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[DBusCallFlags.KnownValue]
    DBusCallFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"DBusCallFlags(${sb.result().mkString(", ")})"
end DBusCallFlags

object DBusCallFlags:
  export KnownValue.*

  def fromRaw(raw: GDBusCallFlags) = new DBusCallFlags(raw)

  extension (af: DBusCallFlags)
    def &(other: DBusCallFlags) =
      DBusCallFlags(af.raw & other.raw)
    def |(other: DBusCallFlags) =
      DBusCallFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags used in g_dbus_connection_call() and similar APIs.
    */
  enum KnownValue(override val raw: GDBusCallFlags, name: String)
      extends DBusCallFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE extends KnownValue(GDBusCallFlags.G_DBUS_CALL_FLAGS_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The bus must not launch an owner for the destination name in response to
      * this method invocation.
      */
    case NO_AUTO_START
        extends KnownValue(
          GDBusCallFlags.G_DBUS_CALL_FLAGS_NO_AUTO_START,
          "NO_AUTO_START"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the caller is prepared to wait for interactive authorization. Since
      * 2.46.
      */
    case ALLOW_INTERACTIVE_AUTHORIZATION
        extends KnownValue(
          GDBusCallFlags.G_DBUS_CALL_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION,
          "ALLOW_INTERACTIVE_AUTHORIZATION"
        )
  end KnownValue
end DBusCallFlags
