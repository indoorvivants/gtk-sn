package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSocketType: _SOCKET_TYPE_INVALID: Type unknown or wrong _SOCKET_TYPE_STREAM: Reliable connection-based byte streams (e.g. TCP). _SOCKET_TYPE_DATAGRAM: Connectionless, unreliable datagram passing. (e.g. UDP) _SOCKET_TYPE_SEQPACKET: Reliable connection-based passing of datagrams of fixed maximum length (e.g. SCTP).
*/
opaque type GSocketType = CUnsignedInt
object GSocketType extends _BindgenEnumCUnsignedInt[GSocketType]:
  given _tag: Tag[GSocketType] = Tag.UInt
  inline def define(inline a: Long): GSocketType = a.toUInt
  val G_SOCKET_TYPE_INVALID = define(0)
  val G_SOCKET_TYPE_STREAM = define(1)
  val G_SOCKET_TYPE_DATAGRAM = define(2)
  val G_SOCKET_TYPE_SEQPACKET = define(3)
  def getName(value: GSocketType): Option[String] =
    value match
      case `G_SOCKET_TYPE_INVALID` => Some("G_SOCKET_TYPE_INVALID")
      case `G_SOCKET_TYPE_STREAM` => Some("G_SOCKET_TYPE_STREAM")
      case `G_SOCKET_TYPE_DATAGRAM` => Some("G_SOCKET_TYPE_DATAGRAM")
      case `G_SOCKET_TYPE_SEQPACKET` => Some("G_SOCKET_TYPE_SEQPACKET")
      case _ => _root_.scala.None
  extension (a: GSocketType)
    inline def &(b: GSocketType): GSocketType = a & b
    inline def |(b: GSocketType): GSocketType = a | b
    inline def is(b: GSocketType): Boolean = (a & b) == b