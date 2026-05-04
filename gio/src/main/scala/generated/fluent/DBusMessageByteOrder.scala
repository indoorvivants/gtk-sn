package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDBusMessageByteOrder

/** Enumeration used to describe the byte order of a D-Bus message.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum DBusMessageByteOrder(val raw: GDBusMessageByteOrder):
  /** The byte order is big endian.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BIG_ENDIAN
      extends DBusMessageByteOrder(
        GDBusMessageByteOrder.G_DBUS_MESSAGE_BYTE_ORDER_BIG_ENDIAN
      )

  /** The byte order is little endian.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LITTLE_ENDIAN
      extends DBusMessageByteOrder(
        GDBusMessageByteOrder.G_DBUS_MESSAGE_BYTE_ORDER_LITTLE_ENDIAN
      )
end DBusMessageByteOrder

object DBusMessageByteOrder:
  def fromRaw(raw: GDBusMessageByteOrder): DBusMessageByteOrder =
    raw match
      case GDBusMessageByteOrder.G_DBUS_MESSAGE_BYTE_ORDER_BIG_ENDIAN =>
        DBusMessageByteOrder.BIG_ENDIAN
      case GDBusMessageByteOrder.G_DBUS_MESSAGE_BYTE_ORDER_LITTLE_ENDIAN =>
        DBusMessageByteOrder.LITTLE_ENDIAN
  end fromRaw
end DBusMessageByteOrder
