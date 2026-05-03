package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GSocketProtocol

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A protocol identifier is specified when creating a #GSocket, which is a
  * family/type specific identifier, where 0 means the default protocol for the
  * particular family/type.
  *
  * This enum contains a set of commonly available and used protocols. You can
  * also pass any other identifiers handled by the platform in order to use
  * protocols not listed here.
  */
enum SocketProtocol(val raw: GSocketProtocol):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The protocol type is unknown
    */
  case UNKNOWN extends SocketProtocol(GSocketProtocol.G_SOCKET_PROTOCOL_UNKNOWN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The default protocol for the family/type
    */
  case DEFAULT extends SocketProtocol(GSocketProtocol.G_SOCKET_PROTOCOL_DEFAULT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * TCP over IP
    */
  case TCP extends SocketProtocol(GSocketProtocol.G_SOCKET_PROTOCOL_TCP)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * UDP over IP
    */
  case UDP extends SocketProtocol(GSocketProtocol.G_SOCKET_PROTOCOL_UDP)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * SCTP over IP
    */
  case SCTP extends SocketProtocol(GSocketProtocol.G_SOCKET_PROTOCOL_SCTP)
end SocketProtocol

object SocketProtocol:
  def fromRaw(raw: GSocketProtocol): SocketProtocol =
    raw match
      case GSocketProtocol.G_SOCKET_PROTOCOL_UNKNOWN => SocketProtocol.UNKNOWN
      case GSocketProtocol.G_SOCKET_PROTOCOL_DEFAULT => SocketProtocol.DEFAULT
      case GSocketProtocol.G_SOCKET_PROTOCOL_TCP     => SocketProtocol.TCP
      case GSocketProtocol.G_SOCKET_PROTOCOL_UDP     => SocketProtocol.UDP
      case GSocketProtocol.G_SOCKET_PROTOCOL_SCTP    => SocketProtocol.SCTP
  end fromRaw
end SocketProtocol
