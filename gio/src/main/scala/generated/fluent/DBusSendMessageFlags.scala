package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDBusSendMessageFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used when sending #GDBusMessages on a #GDBusConnection.
  */
class DBusSendMessageFlags private (val raw: GDBusSendMessageFlags):
  def is(kv: DBusSendMessageFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[DBusSendMessageFlags.KnownValue]
    DBusSendMessageFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"DBusSendMessageFlags(${sb.result().mkString(", ")})"
end DBusSendMessageFlags

object DBusSendMessageFlags:
  export KnownValue.*

  def fromRaw(raw: GDBusSendMessageFlags) = new DBusSendMessageFlags(raw)

  extension (af: DBusSendMessageFlags)
    def &(other: DBusSendMessageFlags) =
      DBusSendMessageFlags(af.raw & other.raw)
    def |(other: DBusSendMessageFlags) =
      DBusSendMessageFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags used when sending #GDBusMessages on a #GDBusConnection.
    */
  enum KnownValue(override val raw: GDBusSendMessageFlags, name: String)
      extends DBusSendMessageFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE
        extends KnownValue(
          GDBusSendMessageFlags.G_DBUS_SEND_MESSAGE_FLAGS_NONE,
          "NONE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Do not automatically assign a serial number from the #GDBusConnection
      * object when sending a message.
      */
    case PRESERVE_SERIAL
        extends KnownValue(
          GDBusSendMessageFlags.G_DBUS_SEND_MESSAGE_FLAGS_PRESERVE_SERIAL,
          "PRESERVE_SERIAL"
        )
  end KnownValue
end DBusSendMessageFlags
