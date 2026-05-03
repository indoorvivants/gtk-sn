package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GSocketClientEvent

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes an event occurring on a #GSocketClient. See the
  * #GSocketClient::event signal for more details.
  *
  * Additional values may be added to this type in the future.
  */
enum SocketClientEvent(val raw: GSocketClientEvent):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The client is doing a DNS lookup.
    */
  case RESOLVING
      extends SocketClientEvent(GSocketClientEvent.G_SOCKET_CLIENT_RESOLVING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The client has completed a DNS lookup.
    */
  case RESOLVED
      extends SocketClientEvent(GSocketClientEvent.G_SOCKET_CLIENT_RESOLVED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The client is connecting to a remote host (either a proxy or the
    * destination server).
    */
  case CONNECTING
      extends SocketClientEvent(GSocketClientEvent.G_SOCKET_CLIENT_CONNECTING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The client has connected to a remote host.
    */
  case CONNECTED
      extends SocketClientEvent(GSocketClientEvent.G_SOCKET_CLIENT_CONNECTED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The client is negotiating with a proxy to connect to the destination
    * server.
    */
  case PROXY_NEGOTIATING
      extends SocketClientEvent(
        GSocketClientEvent.G_SOCKET_CLIENT_PROXY_NEGOTIATING
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The client has negotiated with the proxy server.
    */
  case PROXY_NEGOTIATED
      extends SocketClientEvent(
        GSocketClientEvent.G_SOCKET_CLIENT_PROXY_NEGOTIATED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The client is performing a TLS handshake.
    */
  case TLS_HANDSHAKING
      extends SocketClientEvent(
        GSocketClientEvent.G_SOCKET_CLIENT_TLS_HANDSHAKING
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The client has performed a TLS handshake.
    */
  case TLS_HANDSHAKED
      extends SocketClientEvent(
        GSocketClientEvent.G_SOCKET_CLIENT_TLS_HANDSHAKED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The client is done with a particular #GSocketConnectable.
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
