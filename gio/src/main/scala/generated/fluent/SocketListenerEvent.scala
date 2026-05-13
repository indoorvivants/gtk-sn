package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GSocketListenerEvent

/** Describes an event occurring on a #GSocketListener. See the
  * #GSocketListener::event signal for more details.
  *
  * Additional values may be added to this type in the future.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum SocketListenerEvent(val raw: GSocketListenerEvent):
  /** The listener is about to bind a socket.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BINDING
      extends SocketListenerEvent(
        GSocketListenerEvent.G_SOCKET_LISTENER_BINDING
      )

  /** The listener has bound a socket.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BOUND
      extends SocketListenerEvent(GSocketListenerEvent.G_SOCKET_LISTENER_BOUND)

  /** The listener is about to start listening on this socket.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LISTENING
      extends SocketListenerEvent(
        GSocketListenerEvent.G_SOCKET_LISTENER_LISTENING
      )

  /** The listener is now listening on this socket.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
