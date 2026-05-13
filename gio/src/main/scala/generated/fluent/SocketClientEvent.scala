package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GSocketClientEvent

/** Describes an event occurring on a #GSocketClient. See the
  * #GSocketClient::event signal for more details.
  *
  * Additional values may be added to this type in the future.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum SocketClientEvent(val raw: GSocketClientEvent):
  /** The client is doing a DNS lookup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RESOLVING
      extends SocketClientEvent(GSocketClientEvent.G_SOCKET_CLIENT_RESOLVING)

  /** The client has completed a DNS lookup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RESOLVED
      extends SocketClientEvent(GSocketClientEvent.G_SOCKET_CLIENT_RESOLVED)

  /** The client is connecting to a remote host (either a proxy or the
    * destination server).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CONNECTING
      extends SocketClientEvent(GSocketClientEvent.G_SOCKET_CLIENT_CONNECTING)

  /** The client has connected to a remote host.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CONNECTED
      extends SocketClientEvent(GSocketClientEvent.G_SOCKET_CLIENT_CONNECTED)

  /** The client is negotiating with a proxy to connect to the destination
    * server.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PROXY_NEGOTIATING
      extends SocketClientEvent(
        GSocketClientEvent.G_SOCKET_CLIENT_PROXY_NEGOTIATING
      )

  /** The client has negotiated with the proxy server.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PROXY_NEGOTIATED
      extends SocketClientEvent(
        GSocketClientEvent.G_SOCKET_CLIENT_PROXY_NEGOTIATED
      )

  /** The client is performing a TLS handshake.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TLS_HANDSHAKING
      extends SocketClientEvent(
        GSocketClientEvent.G_SOCKET_CLIENT_TLS_HANDSHAKING
      )

  /** The client has performed a TLS handshake.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TLS_HANDSHAKED
      extends SocketClientEvent(
        GSocketClientEvent.G_SOCKET_CLIENT_TLS_HANDSHAKED
      )

  /** The client is done with a particular #GSocketConnectable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COMPLETE
      extends SocketClientEvent(GSocketClientEvent.G_SOCKET_CLIENT_COMPLETE)
end SocketClientEvent

object SocketClientEvent:
  def fromRaw(raw: GSocketClientEvent): SocketClientEvent =
    raw match
      case GSocketClientEvent.G_SOCKET_CLIENT_RESOLVING =>
        SocketClientEvent.RESOLVING
      case GSocketClientEvent.G_SOCKET_CLIENT_RESOLVED =>
        SocketClientEvent.RESOLVED
      case GSocketClientEvent.G_SOCKET_CLIENT_CONNECTING =>
        SocketClientEvent.CONNECTING
      case GSocketClientEvent.G_SOCKET_CLIENT_CONNECTED =>
        SocketClientEvent.CONNECTED
      case GSocketClientEvent.G_SOCKET_CLIENT_PROXY_NEGOTIATING =>
        SocketClientEvent.PROXY_NEGOTIATING
      case GSocketClientEvent.G_SOCKET_CLIENT_PROXY_NEGOTIATED =>
        SocketClientEvent.PROXY_NEGOTIATED
      case GSocketClientEvent.G_SOCKET_CLIENT_TLS_HANDSHAKING =>
        SocketClientEvent.TLS_HANDSHAKING
      case GSocketClientEvent.G_SOCKET_CLIENT_TLS_HANDSHAKED =>
        SocketClientEvent.TLS_HANDSHAKED
      case GSocketClientEvent.G_SOCKET_CLIENT_COMPLETE =>
        SocketClientEvent.COMPLETE
  end fromRaw
end SocketClientEvent
