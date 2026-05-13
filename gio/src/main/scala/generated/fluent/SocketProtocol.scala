package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GSocketProtocol

/** A protocol identifier is specified when creating a #GSocket, which is a
  * family/type specific identifier, where 0 means the default protocol for the
  * particular family/type.
  *
  * This enum contains a set of commonly available and used protocols. You can
  * also pass any other identifiers handled by the platform in order to use
  * protocols not listed here.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum SocketProtocol(val raw: GSocketProtocol):
  /** The protocol type is unknown
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN extends SocketProtocol(GSocketProtocol.G_SOCKET_PROTOCOL_UNKNOWN)

  /** The default protocol for the family/type
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DEFAULT extends SocketProtocol(GSocketProtocol.G_SOCKET_PROTOCOL_DEFAULT)

  /** TCP over IP
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TCP extends SocketProtocol(GSocketProtocol.G_SOCKET_PROTOCOL_TCP)

  /** UDP over IP
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UDP extends SocketProtocol(GSocketProtocol.G_SOCKET_PROTOCOL_UDP)

  /** SCTP over IP
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
