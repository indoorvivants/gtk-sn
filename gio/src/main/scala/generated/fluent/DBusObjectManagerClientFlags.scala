package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GDBusObjectManagerClientFlags

/** Flags used when constructing a #GDBusObjectManagerClient.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusObjectManagerClientFlags private (
    val raw: GDBusObjectManagerClientFlags
):
  def is(kv: DBusObjectManagerClientFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[DBusObjectManagerClientFlags.KnownValue]
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

  /** Flags used when constructing a #GDBusObjectManagerClient.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(
      override val raw: GDBusObjectManagerClientFlags,
      name: scala.Predef.String
  ) extends DBusObjectManagerClientFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** No flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(
          GDBusObjectManagerClientFlags.G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_NONE,
          "NONE"
        )

    /** If not set and the manager is for a well-known name, then request the
      * bus to launch an owner for the name if no-one owns the name. This flag
      * can only be used in managers for well-known names.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DO_NOT_AUTO_START
        extends KnownValue(
          GDBusObjectManagerClientFlags.G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_DO_NOT_AUTO_START,
          "DO_NOT_AUTO_START"
        )
  end KnownValue
end DBusObjectManagerClientFlags
