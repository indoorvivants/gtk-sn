package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDataStreamByteOrder

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GDataStreamByteOrder is used to ensure proper endianness of streaming data
  * sources across various machine architectures.
  */
enum DataStreamByteOrder(val raw: GDataStreamByteOrder):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects Big Endian byte order.
    */
  case BIG_ENDIAN
      extends DataStreamByteOrder(
        GDataStreamByteOrder.G_DATA_STREAM_BYTE_ORDER_BIG_ENDIAN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects Little Endian byte order.
    */
  case LITTLE_ENDIAN
      extends DataStreamByteOrder(
        GDataStreamByteOrder.G_DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects endianness based on host machine's architecture.
    */
  case HOST_ENDIAN
      extends DataStreamByteOrder(
        GDataStreamByteOrder.G_DATA_STREAM_BYTE_ORDER_HOST_ENDIAN
      )
end DataStreamByteOrder

object DataStreamByteOrder:
  def fromRaw(raw: GDataStreamByteOrder): DataStreamByteOrder =
    raw match
      case GDataStreamByteOrder.G_DATA_STREAM_BYTE_ORDER_BIG_ENDIAN =>
        DataStreamByteOrder.BIG_ENDIAN
      case GDataStreamByteOrder.G_DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN =>
        DataStreamByteOrder.LITTLE_ENDIAN
      case GDataStreamByteOrder.G_DATA_STREAM_BYTE_ORDER_HOST_ENDIAN =>
        DataStreamByteOrder.HOST_ENDIAN
  end fromRaw
end DataStreamByteOrder
