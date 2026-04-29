package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSocketListenerEvent: _SOCKET_LISTENER_BINDING: The listener is about to bind a socket. _SOCKET_LISTENER_BOUND: The listener has bound a socket. _SOCKET_LISTENER_LISTENING: The listener is about to start listening on this socket. _SOCKET_LISTENER_LISTENED: The listener is now listening on this socket.
*/
opaque type GSocketListenerEvent = CUnsignedInt
object GSocketListenerEvent extends _BindgenEnumCUnsignedInt[GSocketListenerEvent]:
  given _tag: Tag[GSocketListenerEvent] = Tag.UInt
  inline def define(inline a: Long): GSocketListenerEvent = a.toUInt
  val G_SOCKET_LISTENER_BINDING = define(0)
  val G_SOCKET_LISTENER_BOUND = define(1)
  val G_SOCKET_LISTENER_LISTENING = define(2)
  val G_SOCKET_LISTENER_LISTENED = define(3)
  def getName(value: GSocketListenerEvent): Option[String] =
    value match
      case `G_SOCKET_LISTENER_BINDING` => Some("G_SOCKET_LISTENER_BINDING")
      case `G_SOCKET_LISTENER_BOUND` => Some("G_SOCKET_LISTENER_BOUND")
      case `G_SOCKET_LISTENER_LISTENING` => Some("G_SOCKET_LISTENER_LISTENING")
      case `G_SOCKET_LISTENER_LISTENED` => Some("G_SOCKET_LISTENER_LISTENED")
      case _ => _root_.scala.None
  extension (a: GSocketListenerEvent)
    inline def &(b: GSocketListenerEvent): GSocketListenerEvent = a & b
    inline def |(b: GSocketListenerEvent): GSocketListenerEvent = a | b
    inline def is(b: GSocketListenerEvent): Boolean = (a & b) == b