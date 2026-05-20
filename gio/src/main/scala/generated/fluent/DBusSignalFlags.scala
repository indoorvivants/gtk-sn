package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GDBusSignalFlags

/** Flags used when subscribing to signals via
  * g_dbus_connection_signal_subscribe().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusSignalFlags private (val raw: GDBusSignalFlags):
  def is(kv: DBusSignalFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[DBusSignalFlags.KnownValue]
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

  /** Flags used when subscribing to signals via
    * g_dbus_connection_signal_subscribe().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GDBusSignalFlags, name: scala.Predef.String)
      extends DBusSignalFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** No flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(GDBusSignalFlags.G_DBUS_SIGNAL_FLAGS_NONE, "NONE")

    /** Don't actually send the AddMatch D-Bus call for this signal
      * subscription. This gives you more control over which match rules you add
      * (but you must add them manually).
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NO_MATCH_RULE
        extends KnownValue(
          GDBusSignalFlags.G_DBUS_SIGNAL_FLAGS_NO_MATCH_RULE,
          "NO_MATCH_RULE"
        )

    /** Match first arguments that contain a bus or interface name with the
      * given namespace.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case MATCH_ARG0_NAMESPACE
        extends KnownValue(
          GDBusSignalFlags.G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_NAMESPACE,
          "MATCH_ARG0_NAMESPACE"
        )

    /** Match first arguments that contain an object path that is either
      * equivalent to the given path, or one of the paths is a subpath of the
      * other.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case MATCH_ARG0_PATH
        extends KnownValue(
          GDBusSignalFlags.G_DBUS_SIGNAL_FLAGS_MATCH_ARG0_PATH,
          "MATCH_ARG0_PATH"
        )
  end KnownValue
end DBusSignalFlags
