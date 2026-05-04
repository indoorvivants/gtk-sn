package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDBusMessageFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Message flags used in #GDBusMessage.
  */
class DBusMessageFlags private (val raw: GDBusMessageFlags):
  def is(kv: DBusMessageFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[DBusMessageFlags.KnownValue]
    DBusMessageFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"DBusMessageFlags(${sb.result().mkString(", ")})"
end DBusMessageFlags

object DBusMessageFlags:
  export KnownValue.*

  def fromRaw(raw: GDBusMessageFlags) = new DBusMessageFlags(raw)

  extension (af: DBusMessageFlags)
    def &(other: DBusMessageFlags) =
      DBusMessageFlags(af.raw & other.raw)
    def |(other: DBusMessageFlags) =
      DBusMessageFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Message flags used in #GDBusMessage.
    */
  enum KnownValue(override val raw: GDBusMessageFlags, name: String)
      extends DBusMessageFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE
        extends KnownValue(GDBusMessageFlags.G_DBUS_MESSAGE_FLAGS_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * A reply is not expected.
      */
    case NO_REPLY_EXPECTED
        extends KnownValue(
          GDBusMessageFlags.G_DBUS_MESSAGE_FLAGS_NO_REPLY_EXPECTED,
          "NO_REPLY_EXPECTED"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The bus must not launch an owner for the destination name in response to
      * this message.
      */
    case NO_AUTO_START
        extends KnownValue(
          GDBusMessageFlags.G_DBUS_MESSAGE_FLAGS_NO_AUTO_START,
          "NO_AUTO_START"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * If set on a method call, this flag means that the caller is prepared to
      * wait for interactive authorization. Since 2.46.
      */
    case ALLOW_INTERACTIVE_AUTHORIZATION
        extends KnownValue(
          GDBusMessageFlags.G_DBUS_MESSAGE_FLAGS_ALLOW_INTERACTIVE_AUTHORIZATION,
          "ALLOW_INTERACTIVE_AUTHORIZATION"
        )
  end KnownValue
end DBusMessageFlags
