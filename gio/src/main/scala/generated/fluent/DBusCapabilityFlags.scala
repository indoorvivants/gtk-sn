package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDBusCapabilityFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Capabilities negotiated with the remote peer.
  */
class DBusCapabilityFlags private (val raw: GDBusCapabilityFlags):
  def is(kv: DBusCapabilityFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[DBusCapabilityFlags.KnownValue]
    DBusCapabilityFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"DBusCapabilityFlags(${sb.result().mkString(", ")})"
end DBusCapabilityFlags

object DBusCapabilityFlags:
  export KnownValue.*

  def fromRaw(raw: GDBusCapabilityFlags) = new DBusCapabilityFlags(raw)

  extension (af: DBusCapabilityFlags)
    def &(other: DBusCapabilityFlags) =
      DBusCapabilityFlags(af.raw & other.raw)
    def |(other: DBusCapabilityFlags) =
      DBusCapabilityFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Capabilities negotiated with the remote peer.
    */
  enum KnownValue(override val raw: GDBusCapabilityFlags, name: String)
      extends DBusCapabilityFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE
        extends KnownValue(
          GDBusCapabilityFlags.G_DBUS_CAPABILITY_FLAGS_NONE,
          "NONE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The connection supports exchanging UNIX file descriptors with the remote
      * peer.
      */
    case UNIX_FD_PASSING
        extends KnownValue(
          GDBusCapabilityFlags.G_DBUS_CAPABILITY_FLAGS_UNIX_FD_PASSING,
          "UNIX_FD_PASSING"
        )
  end KnownValue
end DBusCapabilityFlags
