package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GUnixSocketAddressType: _UNIX_SOCKET_ADDRESS_INVALID: invalid _UNIX_SOCKET_ADDRESS_ANONYMOUS: anonymous _UNIX_SOCKET_ADDRESS_PATH: a filesystem path _UNIX_SOCKET_ADDRESS_ABSTRACT: an abstract name _UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED: an abstract name, 0-padded to the full length of a unix socket name
*/
opaque type GUnixSocketAddressType = CUnsignedInt
object GUnixSocketAddressType extends _BindgenEnumCUnsignedInt[GUnixSocketAddressType]:
  given _tag: Tag[GUnixSocketAddressType] = Tag.UInt
  inline def define(inline a: Long): GUnixSocketAddressType = a.toUInt
  val G_UNIX_SOCKET_ADDRESS_INVALID = define(0)
  val G_UNIX_SOCKET_ADDRESS_ANONYMOUS = define(1)
  val G_UNIX_SOCKET_ADDRESS_PATH = define(2)
  val G_UNIX_SOCKET_ADDRESS_ABSTRACT = define(3)
  val G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED = define(4)
  def getName(value: GUnixSocketAddressType): Option[String] =
    value match
      case `G_UNIX_SOCKET_ADDRESS_INVALID` => Some("G_UNIX_SOCKET_ADDRESS_INVALID")
      case `G_UNIX_SOCKET_ADDRESS_ANONYMOUS` => Some("G_UNIX_SOCKET_ADDRESS_ANONYMOUS")
      case `G_UNIX_SOCKET_ADDRESS_PATH` => Some("G_UNIX_SOCKET_ADDRESS_PATH")
      case `G_UNIX_SOCKET_ADDRESS_ABSTRACT` => Some("G_UNIX_SOCKET_ADDRESS_ABSTRACT")
      case `G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED` => Some("G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED")
      case _ => _root_.scala.None
  extension (a: GUnixSocketAddressType)
    inline def &(b: GUnixSocketAddressType): GUnixSocketAddressType = a & b
    inline def |(b: GUnixSocketAddressType): GUnixSocketAddressType = a | b
    inline def is(b: GUnixSocketAddressType): Boolean = (a & b) == b