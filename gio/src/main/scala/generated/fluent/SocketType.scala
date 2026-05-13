package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GSocketType

/** Flags used when creating a #GSocket. Some protocols may not implement all
  * the socket types.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum SocketType(val raw: GSocketType):
  /** Type unknown or wrong
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID extends SocketType(GSocketType.G_SOCKET_TYPE_INVALID)

  /** Reliable connection-based byte streams (e.g. TCP).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STREAM extends SocketType(GSocketType.G_SOCKET_TYPE_STREAM)

  /** Connectionless, unreliable datagram passing. (e.g. UDP)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DATAGRAM extends SocketType(GSocketType.G_SOCKET_TYPE_DATAGRAM)

  /** Reliable connection-based passing of datagrams of fixed maximum length
    * (e.g. SCTP).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SEQPACKET extends SocketType(GSocketType.G_SOCKET_TYPE_SEQPACKET)
end SocketType

object SocketType:
  def fromRaw(raw: GSocketType): SocketType =
    raw match
      case GSocketType.G_SOCKET_TYPE_INVALID   => SocketType.INVALID
      case GSocketType.G_SOCKET_TYPE_STREAM    => SocketType.STREAM
      case GSocketType.G_SOCKET_TYPE_DATAGRAM  => SocketType.DATAGRAM
      case GSocketType.G_SOCKET_TYPE_SEQPACKET => SocketType.SEQPACKET
  end fromRaw
end SocketType
