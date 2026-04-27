package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSocketClientEvent: _SOCKET_CLIENT_RESOLVING: The client is doing a DNS lookup. _SOCKET_CLIENT_RESOLVED: The client has completed a DNS lookup. _SOCKET_CLIENT_CONNECTING: The client is connecting to a remote host (either a proxy or the destination server). _SOCKET_CLIENT_CONNECTED: The client has connected to a remote host. _SOCKET_CLIENT_PROXY_NEGOTIATING: The client is negotiating with a proxy to connect to the destination server. _SOCKET_CLIENT_PROXY_NEGOTIATED: The client has negotiated with the proxy server. _SOCKET_CLIENT_TLS_HANDSHAKING: The client is performing a TLS handshake. _SOCKET_CLIENT_TLS_HANDSHAKED: The client has performed a TLS handshake. _SOCKET_CLIENT_COMPLETE: The client is done with a particular #GSocketConnectable.
*/
opaque type GSocketClientEvent = CUnsignedInt
object GSocketClientEvent extends _BindgenEnumCUnsignedInt[GSocketClientEvent]:
  given _tag: Tag[GSocketClientEvent] = Tag.UInt
  inline def define(inline a: Long): GSocketClientEvent = a.toUInt
  val G_SOCKET_CLIENT_RESOLVING = define(0)
  val G_SOCKET_CLIENT_RESOLVED = define(1)
  val G_SOCKET_CLIENT_CONNECTING = define(2)
  val G_SOCKET_CLIENT_CONNECTED = define(3)
  val G_SOCKET_CLIENT_PROXY_NEGOTIATING = define(4)
  val G_SOCKET_CLIENT_PROXY_NEGOTIATED = define(5)
  val G_SOCKET_CLIENT_TLS_HANDSHAKING = define(6)
  val G_SOCKET_CLIENT_TLS_HANDSHAKED = define(7)
  val G_SOCKET_CLIENT_COMPLETE = define(8)
  def getName(value: GSocketClientEvent): Option[String] =
    value match
      case `G_SOCKET_CLIENT_RESOLVING` => Some("G_SOCKET_CLIENT_RESOLVING")
      case `G_SOCKET_CLIENT_RESOLVED` => Some("G_SOCKET_CLIENT_RESOLVED")
      case `G_SOCKET_CLIENT_CONNECTING` => Some("G_SOCKET_CLIENT_CONNECTING")
      case `G_SOCKET_CLIENT_CONNECTED` => Some("G_SOCKET_CLIENT_CONNECTED")
      case `G_SOCKET_CLIENT_PROXY_NEGOTIATING` => Some("G_SOCKET_CLIENT_PROXY_NEGOTIATING")
      case `G_SOCKET_CLIENT_PROXY_NEGOTIATED` => Some("G_SOCKET_CLIENT_PROXY_NEGOTIATED")
      case `G_SOCKET_CLIENT_TLS_HANDSHAKING` => Some("G_SOCKET_CLIENT_TLS_HANDSHAKING")
      case `G_SOCKET_CLIENT_TLS_HANDSHAKED` => Some("G_SOCKET_CLIENT_TLS_HANDSHAKED")
      case `G_SOCKET_CLIENT_COMPLETE` => Some("G_SOCKET_CLIENT_COMPLETE")
      case _ => _root_.scala.None
  extension (a: GSocketClientEvent)
    inline def &(b: GSocketClientEvent): GSocketClientEvent = a & b
    inline def |(b: GSocketClientEvent): GSocketClientEvent = a | b
    inline def is(b: GSocketClientEvent): Boolean = (a & b) == b