package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDBusMessageHeaderField

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Header fields used in #GDBusMessage.
  */
enum DBusMessageHeaderField(val raw: GDBusMessageHeaderField):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Not a valid header field.
    */
  case INVALID
      extends DBusMessageHeaderField(
        GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_INVALID
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The object path.
    */
  case PATH
      extends DBusMessageHeaderField(
        GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_PATH
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The interface name.
    */
  case INTERFACE
      extends DBusMessageHeaderField(
        GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The method or signal name.
    */
  case MEMBER
      extends DBusMessageHeaderField(
        GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_MEMBER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The name of the error that occurred.
    */
  case ERROR_NAME
      extends DBusMessageHeaderField(
        GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The serial number the message is a reply to.
    */
  case REPLY_SERIAL
      extends DBusMessageHeaderField(
        GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The name the message is intended for.
    */
  case DESTINATION
      extends DBusMessageHeaderField(
        GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unique name of the sender of the message (filled in by the bus).
    */
  case SENDER
      extends DBusMessageHeaderField(
        GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_SENDER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The signature of the message body.
    */
  case SIGNATURE
      extends DBusMessageHeaderField(
        GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The number of UNIX file descriptors that accompany the message.
    */
  case NUM_UNIX_FDS
      extends DBusMessageHeaderField(
        GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS
      )
end DBusMessageHeaderField

object DBusMessageHeaderField:
  def fromRaw(raw: GDBusMessageHeaderField): DBusMessageHeaderField =
    raw match
      case GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_INVALID =>
        DBusMessageHeaderField.INVALID
      case GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_PATH =>
        DBusMessageHeaderField.PATH
      case GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE =>
        DBusMessageHeaderField.INTERFACE
      case GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_MEMBER =>
        DBusMessageHeaderField.MEMBER
      case GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME =>
        DBusMessageHeaderField.ERROR_NAME
      case GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL =>
        DBusMessageHeaderField.REPLY_SERIAL
      case GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION =>
        DBusMessageHeaderField.DESTINATION
      case GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_SENDER =>
        DBusMessageHeaderField.SENDER
      case GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE =>
        DBusMessageHeaderField.SIGNATURE
      case GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS =>
        DBusMessageHeaderField.NUM_UNIX_FDS
  end fromRaw
end DBusMessageHeaderField
