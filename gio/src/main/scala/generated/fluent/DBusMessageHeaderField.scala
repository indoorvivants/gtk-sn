package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GDBusMessageHeaderField

/** Header fields used in #GDBusMessage.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum DBusMessageHeaderField(val raw: GDBusMessageHeaderField):
  /** Not a valid header field.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID
      extends DBusMessageHeaderField(
        GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_INVALID
      )

  /** The object path.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PATH
      extends DBusMessageHeaderField(
        GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_PATH
      )

  /** The interface name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INTERFACE
      extends DBusMessageHeaderField(
        GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE
      )

  /** The method or signal name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MEMBER
      extends DBusMessageHeaderField(
        GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_MEMBER
      )

  /** The name of the error that occurred.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ERROR_NAME
      extends DBusMessageHeaderField(
        GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME
      )

  /** The serial number the message is a reply to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case REPLY_SERIAL
      extends DBusMessageHeaderField(
        GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL
      )

  /** The name the message is intended for.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DESTINATION
      extends DBusMessageHeaderField(
        GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION
      )

  /** Unique name of the sender of the message (filled in by the bus).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SENDER
      extends DBusMessageHeaderField(
        GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_SENDER
      )

  /** The signature of the message body.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SIGNATURE
      extends DBusMessageHeaderField(
        GDBusMessageHeaderField.G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE
      )

  /** The number of UNIX file descriptors that accompany the message.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
