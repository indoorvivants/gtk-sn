package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSocketFamily: _SOCKET_FAMILY_INVALID: no address family _SOCKET_FAMILY_IPV4: the IPv4 family _SOCKET_FAMILY_IPV6: the IPv6 family _SOCKET_FAMILY_UNIX: the UNIX domain family
*/
opaque type GSocketFamily = CUnsignedInt
object GSocketFamily extends _BindgenEnumCUnsignedInt[GSocketFamily]:
  given _tag: Tag[GSocketFamily] = Tag.UInt
  inline def define(inline a: Long): GSocketFamily = a.toUInt
  val G_SOCKET_FAMILY_INVALID = define(0)
  val G_SOCKET_FAMILY_UNIX = define(1)
  val G_SOCKET_FAMILY_IPV4 = define(2)
  val G_SOCKET_FAMILY_IPV6 = define(10)
  def getName(value: GSocketFamily): Option[String] =
    value match
      case `G_SOCKET_FAMILY_INVALID` => Some("G_SOCKET_FAMILY_INVALID")
      case `G_SOCKET_FAMILY_UNIX` => Some("G_SOCKET_FAMILY_UNIX")
      case `G_SOCKET_FAMILY_IPV4` => Some("G_SOCKET_FAMILY_IPV4")
      case `G_SOCKET_FAMILY_IPV6` => Some("G_SOCKET_FAMILY_IPV6")
      case _ => _root_.scala.None
  extension (a: GSocketFamily)
    inline def &(b: GSocketFamily): GSocketFamily = a & b
    inline def |(b: GSocketFamily): GSocketFamily = a | b
    inline def is(b: GSocketFamily): Boolean = (a & b) == b