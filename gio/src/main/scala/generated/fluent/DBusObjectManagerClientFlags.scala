package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDBusObjectManagerClientFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used when constructing a #GDBusObjectManagerClient.
  */
class DBusObjectManagerClientFlags private (
    val raw: GDBusObjectManagerClientFlags
):
  def is(kv: DBusObjectManagerClientFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[DBusObjectManagerClientFlags.KnownValue]
    DBusObjectManagerClientFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"DBusObjectManagerClientFlags(${sb.result().mkString(", ")})"
end DBusObjectManagerClientFlags

object DBusObjectManagerClientFlags:
  export KnownValue.*

  def fromRaw(raw: GDBusObjectManagerClientFlags) =
    new DBusObjectManagerClientFlags(raw)

  extension (af: DBusObjectManagerClientFlags)
    def &(other: DBusObjectManagerClientFlags) =
      DBusObjectManagerClientFlags(af.raw & other.raw)
    def |(other: DBusObjectManagerClientFlags) =
      DBusObjectManagerClientFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags used when constructing a #GDBusObjectManagerClient.
    */
  enum KnownValue(override val raw: GDBusObjectManagerClientFlags, name: String)
      extends DBusObjectManagerClientFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE
        extends KnownValue(
          GDBusObjectManagerClientFlags.G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_NONE,
          "NONE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * If not set and the manager is for a well-known name, then request the
      * bus to launch an owner for the name if no-one owns the name. This flag
      * can only be used in managers for well-known names.
      */
    case DO_NOT_AUTO_START
        extends KnownValue(
          GDBusObjectManagerClientFlags.G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_DO_NOT_AUTO_START,
          "DO_NOT_AUTO_START"
        )
  end KnownValue
end DBusObjectManagerClientFlags
