package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GSocketListenerEvent

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes an event occurring on a #GSocketListener. See the
  * #GSocketListener::event signal for more details.
  *
  * Additional values may be added to this type in the future.
  */
enum SocketListenerEvent(val raw: GSocketListenerEvent):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The listener is about to bind a socket.
    */
  case BINDING
      extends SocketListenerEvent(
        GSocketListenerEvent.G_SOCKET_LISTENER_BINDING
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The listener has bound a socket.
    */
  case BOUND
      extends SocketListenerEvent(GSocketListenerEvent.G_SOCKET_LISTENER_BOUND)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The listener is about to start listening on this socket.
    */
  case LISTENING
      extends SocketListenerEvent(
        GSocketListenerEvent.G_SOCKET_LISTENER_LISTENING
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The listener is now listening on this socket.
    */
  case LISTENED
      extends SocketListenerEvent(
        GSocketListenerEvent.G_SOCKET_LISTENER_LISTENED
      )
end SocketListenerEvent

object SocketListenerEvent:
  def fromRaw(raw: GSocketListenerEvent): SocketListenerEvent =
    raw match
      case GSocketListenerEvent.G_SOCKET_LISTENER_BINDING =>
        SocketListenerEvent.BINDING
      case GSocketListenerEvent.G_SOCKET_LISTENER_BOUND =>
        SocketListenerEvent.BOUND
      case GSocketListenerEvent.G_SOCKET_LISTENER_LISTENING =>
        SocketListenerEvent.LISTENING
      case GSocketListenerEvent.G_SOCKET_LISTENER_LISTENED =>
        SocketListenerEvent.LISTENED
  end fromRaw
end SocketListenerEvent
