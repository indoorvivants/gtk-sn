package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GDBusCallFlags

/** Flags used in g_dbus_connection_call() and similar APIs.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusCallFlags private (val raw: GDBusCallFlags):
  def is(kv: DBusCallFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[DBusCallFlags.KnownValue]
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

  /** Flags used in g_dbus_connection_call() and similar APIs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GDBusCallFlags, name: scala.Predef.String)
      extends DBusCallFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** No flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE extends KnownValue(GDBusCallFlags.G_DBUS_CALL_FLAGS_NONE, "NONE")

    /** The bus must not launch an owner for the destination name in response to
      * this method invocation.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NO_AUTO_START
        extends KnownValue(
          GDBusCallFlags.G_DBUS_CALL_FLAGS_NO_AUTO_START,
          "NO_AUTO_START"
        )

    /** the caller is prepared to wait for interactive authorization. Since
      * 2.46.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ALLOW_INTERACTIVE_AUTHORIZATION
        extends KnownValue(
          GDBusCallFlags.G_DBUS_CALL_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION,
          "ALLOW_INTERACTIVE_AUTHORIZATION"
        )
  end KnownValue
end DBusCallFlags
