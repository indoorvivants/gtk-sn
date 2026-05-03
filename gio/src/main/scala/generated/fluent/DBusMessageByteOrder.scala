package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDBusMessageByteOrder

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Enumeration used to describe the byte order of a D-Bus message.
  */
enum DBusMessageByteOrder(val raw: GDBusMessageByteOrder):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The byte order is big endian.
    */
  case BIG_ENDIAN
      extends DBusMessageByteOrder(
        GDBusMessageByteOrder.G_DBUS_MESSAGE_BYTE_ORDER_BIG_ENDIAN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The byte order is little endian.
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
