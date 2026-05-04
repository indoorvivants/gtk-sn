package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDBusPropertyInfoFlags

/** Flags describing the access control of a D-Bus property.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
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

  /** Flags describing the access control of a D-Bus property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GDBusPropertyInfoFlags, name: String)
      extends DBusPropertyInfoFlags(raw):
    override def toString(): String = this.name

    /** No flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(
          GDBusPropertyInfoFlags.G_DBUS_PROPERTY_INFO_FLAGS_NONE,
          "NONE"
        )

    /** Property is readable.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case READABLE
        extends KnownValue(
          GDBusPropertyInfoFlags.G_DBUS_PROPERTY_INFO_FLAGS_READABLE,
          "READABLE"
        )

    /** Property is writable.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case WRITABLE
        extends KnownValue(
          GDBusPropertyInfoFlags.G_DBUS_PROPERTY_INFO_FLAGS_WRITABLE,
          "WRITABLE"
        )
  end KnownValue
end DBusPropertyInfoFlags
