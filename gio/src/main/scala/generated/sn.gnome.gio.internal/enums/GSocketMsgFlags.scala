package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSocketMsgFlags: _SOCKET_MSG_NONE: No flags. _SOCKET_MSG_OOB: Request to send/receive out of band data. _SOCKET_MSG_PEEK: Read data from the socket without removing it from the queue. _SOCKET_MSG_DONTROUTE: Don't use a gateway to send out the packet, only send to hosts on directly connected networks.
*/
opaque type GSocketMsgFlags = CUnsignedInt
object GSocketMsgFlags extends _BindgenEnumCUnsignedInt[GSocketMsgFlags]:
  given _tag: Tag[GSocketMsgFlags] = Tag.UInt
  inline def define(inline a: Long): GSocketMsgFlags = a.toUInt
  val G_SOCKET_MSG_NONE = define(0)
  val G_SOCKET_MSG_OOB = define(1)
  val G_SOCKET_MSG_PEEK = define(2)
  val G_SOCKET_MSG_DONTROUTE = define(4)
  def getName(value: GSocketMsgFlags): Option[String] =
    value match
      case `G_SOCKET_MSG_NONE` => Some("G_SOCKET_MSG_NONE")
      case `G_SOCKET_MSG_OOB` => Some("G_SOCKET_MSG_OOB")
      case `G_SOCKET_MSG_PEEK` => Some("G_SOCKET_MSG_PEEK")
      case `G_SOCKET_MSG_DONTROUTE` => Some("G_SOCKET_MSG_DONTROUTE")
      case _ => _root_.scala.None
  extension (a: GSocketMsgFlags)
    inline def &(b: GSocketMsgFlags): GSocketMsgFlags = a & b
    inline def |(b: GSocketMsgFlags): GSocketMsgFlags = a | b
    inline def is(b: GSocketMsgFlags): Boolean = (a & b) == b