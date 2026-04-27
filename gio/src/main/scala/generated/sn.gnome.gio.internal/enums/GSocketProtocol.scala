package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSocketProtocol: _SOCKET_PROTOCOL_UNKNOWN: The protocol type is unknown _SOCKET_PROTOCOL_DEFAULT: The default protocol for the family/type _SOCKET_PROTOCOL_TCP: TCP over IP _SOCKET_PROTOCOL_UDP: UDP over IP _SOCKET_PROTOCOL_SCTP: SCTP over IP
*/
opaque type GSocketProtocol = CInt
object GSocketProtocol extends _BindgenEnumCInt[GSocketProtocol]:
  given _tag: Tag[GSocketProtocol] = Tag.Int
  inline def define(inline a: CInt): GSocketProtocol = a
  val G_SOCKET_PROTOCOL_UNKNOWN = define(-1)
  val G_SOCKET_PROTOCOL_DEFAULT = define(0)
  val G_SOCKET_PROTOCOL_TCP = define(6)
  val G_SOCKET_PROTOCOL_UDP = define(17)
  val G_SOCKET_PROTOCOL_SCTP = define(132)
  def getName(value: GSocketProtocol): Option[String] =
    value match
      case `G_SOCKET_PROTOCOL_UNKNOWN` => Some("G_SOCKET_PROTOCOL_UNKNOWN")
      case `G_SOCKET_PROTOCOL_DEFAULT` => Some("G_SOCKET_PROTOCOL_DEFAULT")
      case `G_SOCKET_PROTOCOL_TCP` => Some("G_SOCKET_PROTOCOL_TCP")
      case `G_SOCKET_PROTOCOL_UDP` => Some("G_SOCKET_PROTOCOL_UDP")
      case `G_SOCKET_PROTOCOL_SCTP` => Some("G_SOCKET_PROTOCOL_SCTP")
      case _ => _root_.scala.None
  extension (a: GSocketProtocol)
    inline def &(b: GSocketProtocol): GSocketProtocol = a & b
    inline def |(b: GSocketProtocol): GSocketProtocol = a | b
    inline def is(b: GSocketProtocol): Boolean = (a & b) == b