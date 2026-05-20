package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GDBusCapabilityFlags

/** Capabilities negotiated with the remote peer.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusCapabilityFlags private (val raw: GDBusCapabilityFlags):
  def is(kv: DBusCapabilityFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[DBusCapabilityFlags.KnownValue]
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

  /** Capabilities negotiated with the remote peer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(
      override val raw: GDBusCapabilityFlags,
      name: scala.Predef.String
  ) extends DBusCapabilityFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** No flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(
          GDBusCapabilityFlags.G_DBUS_CAPABILITY_FLAGS_NONE,
          "NONE"
        )

    /** The connection supports exchanging UNIX file descriptors with the remote
      * peer.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case UNIX_FD_PASSING
        extends KnownValue(
          GDBusCapabilityFlags.G_DBUS_CAPABILITY_FLAGS_UNIX_FD_PASSING,
          "UNIX_FD_PASSING"
        )
  end KnownValue
end DBusCapabilityFlags
