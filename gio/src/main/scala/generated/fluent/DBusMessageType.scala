package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDBusMessageType

/** Message types used in #GDBusMessage.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum DBusMessageType(val raw: GDBusMessageType):
  /** Message is of invalid type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID
      extends DBusMessageType(GDBusMessageType.G_DBUS_MESSAGE_TYPE_INVALID)

  /** Method call.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case METHOD_CALL
      extends DBusMessageType(GDBusMessageType.G_DBUS_MESSAGE_TYPE_METHOD_CALL)

  /** Method reply.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case METHOD_RETURN
      extends DBusMessageType(
        GDBusMessageType.G_DBUS_MESSAGE_TYPE_METHOD_RETURN
      )

  /** Error reply.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ERROR extends DBusMessageType(GDBusMessageType.G_DBUS_MESSAGE_TYPE_ERROR)

  /** Signal emission.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
