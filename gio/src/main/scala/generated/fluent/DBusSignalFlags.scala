package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDBusSignalFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used when subscribing to signals via
  * g_dbus_connection_signal_subscribe().
  */
class DBusSignalFlags private (val raw: GDBusSignalFlags):
  def is(kv: DBusSignalFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[DBusSignalFlags.KnownValue]
    DBusSignalFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"DBusSignalFlags(${sb.result().mkString(", ")})"
end DBusSignalFlags

object DBusSignalFlags:
  export KnownValue.*

  def fromRaw(raw: GDBusSignalFlags) = new DBusSignalFlags(raw)

  extension (af: DBusSignalFlags)
    def &(other: DBusSignalFlags) =
      DBusSignalFlags(af.raw & other.raw)
    def |(other: DBusSignalFlags) =
      DBusSignalFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags used when subscribing to signals via
    * g_dbus_connection_signal_subscribe().
    */
  enum KnownValue(override val raw: GDBusSignalFlags, name: String)
      extends DBusSignalFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE
        extends KnownValue(GDBusSignalFlags.G_DBUS_SIGNAL_FLAGS_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Don't actually send the AddMatch D-Bus call for this signal
      * subscription. This gives you more control over which match rules you add
      * (but you must add them manually).
      */
    case NO_MATCH_RULE
        extends KnownValue(
          GDBusSignalFlags.G_DBUS_SIGNAL_FLAGS_NO_MATCH_RULE,
          "NO_MATCH_RULE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Match first arguments that contain a bus or interface name with the
      * given namespace.
      */
    case MATCH_ARG0_NAMESPACE
        extends KnownValue(
          GDBusSignalFlags.G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_NAMESPACE,
          "MATCH_ARG0_NAMESPACE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Match first arguments that contain an object path that is either
      * equivalent to the given path, or one of the paths is a subpath of the
      * other.
      */
    case MATCH_ARG0_PATH
        extends KnownValue(
          GDBusSignalFlags.G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_PATH,
          "MATCH_ARG0_PATH"
        )
  end KnownValue
end DBusSignalFlags
