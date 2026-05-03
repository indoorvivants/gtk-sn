package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GSocketType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used when creating a #GSocket. Some protocols may not implement all
  * the socket types.
  */
enum SocketType(val raw: GSocketType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Type unknown or wrong
    */
  case INVALID extends SocketType(GSocketType.G_SOCKET_TYPE_INVALID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reliable connection-based byte streams (e.g. TCP).
    */
  case STREAM extends SocketType(GSocketType.G_SOCKET_TYPE_STREAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Connectionless, unreliable datagram passing. (e.g. UDP)
    */
  case DATAGRAM extends SocketType(GSocketType.G_SOCKET_TYPE_DATAGRAM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reliable connection-based passing of datagrams of fixed maximum length
    * (e.g. SCTP).
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
