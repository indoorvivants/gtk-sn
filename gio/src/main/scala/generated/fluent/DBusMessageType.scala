package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDBusMessageType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Message types used in #GDBusMessage.
  */
enum DBusMessageType(val raw: GDBusMessageType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Message is of invalid type.
    */
  case INVALID
      extends DBusMessageType(GDBusMessageType.G_DBUS_MESSAGE_TYPE_INVALID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Method call.
    */
  case METHOD_CALL
      extends DBusMessageType(GDBusMessageType.G_DBUS_MESSAGE_TYPE_METHOD_CALL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Method reply.
    */
  case METHOD_RETURN
      extends DBusMessageType(
        GDBusMessageType.G_DBUS_MESSAGE_TYPE_METHOD_RETURN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Error reply.
    */
  case ERROR extends DBusMessageType(GDBusMessageType.G_DBUS_MESSAGE_TYPE_ERROR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Signal emission.
    */
  case SIGNAL
      extends DBusMessageType(GDBusMessageType.G_DBUS_MESSAGE_TYPE_SIGNAL)
end DBusMessageType

object DBusMessageType:
  def fromRaw(raw: GDBusMessageType): DBusMessageType =
    raw match
      case GDBusMessageType.G_DBUS_MESSAGE_TYPE_INVALID =>
        DBusMessageType.INVALID
      case GDBusMessageType.G_DBUS_MESSAGE_TYPE_METHOD_CALL =>
        DBusMessageType.METHOD_CALL
      case GDBusMessageType.G_DBUS_MESSAGE_TYPE_METHOD_RETURN =>
        DBusMessageType.METHOD_RETURN
      case GDBusMessageType.G_DBUS_MESSAGE_TYPE_ERROR  => DBusMessageType.ERROR
      case GDBusMessageType.G_DBUS_MESSAGE_TYPE_SIGNAL => DBusMessageType.SIGNAL
  end fromRaw
end DBusMessageType
