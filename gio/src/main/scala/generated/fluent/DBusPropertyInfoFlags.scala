package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDBusPropertyInfoFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags describing the access control of a D-Bus property.
  */
class DBusPropertyInfoFlags private (val raw: GDBusPropertyInfoFlags):
  def is(kv: DBusPropertyInfoFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[DBusPropertyInfoFlags.KnownValue]
    DBusPropertyInfoFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"DBusPropertyInfoFlags(${sb.result().mkString(", ")})"
end DBusPropertyInfoFlags

object DBusPropertyInfoFlags:
  export KnownValue.*

  def fromRaw(raw: GDBusPropertyInfoFlags) = new DBusPropertyInfoFlags(raw)

  extension (af: DBusPropertyInfoFlags)
    def &(other: DBusPropertyInfoFlags) =
      DBusPropertyInfoFlags(af.raw & other.raw)
    def |(other: DBusPropertyInfoFlags) =
      DBusPropertyInfoFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags describing the access control of a D-Bus property.
    */
  enum KnownValue(override val raw: GDBusPropertyInfoFlags, name: String)
      extends DBusPropertyInfoFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE
        extends KnownValue(
          GDBusPropertyInfoFlags.G_DBUS_PROPERTY_INFO_FLAGS_NONE,
          "NONE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Property is readable.
      */
    case READABLE
        extends KnownValue(
          GDBusPropertyInfoFlags.G_DBUS_PROPERTY_INFO_FLAGS_READABLE,
          "READABLE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Property is writable.
      */
    case WRITABLE
        extends KnownValue(
          GDBusPropertyInfoFlags.G_DBUS_PROPERTY_INFO_FLAGS_WRITABLE,
          "WRITABLE"
        )
  end KnownValue
end DBusPropertyInfoFlags
