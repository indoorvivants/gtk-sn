package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDataStreamByteOrder

/** #GDataStreamByteOrder is used to ensure proper endianness of streaming data
  * sources across various machine architectures.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum DataStreamByteOrder(val raw: GDataStreamByteOrder):
  /** Selects Big Endian byte order.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BIG_ENDIAN
      extends DataStreamByteOrder(
        GDataStreamByteOrder.G_DATA_STREAM_BYTE_ORDER_BIG_ENDIAN
      )

  /** Selects Little Endian byte order.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LITTLE_ENDIAN
      extends DataStreamByteOrder(
        GDataStreamByteOrder.G_DATA_STREAM_BYTE_ORDER_LITTLE_ENDIAN
      )

  /** Selects endianness based on host machine's architecture.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
