package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GConnectFlags: _CONNECT_DEFAULT: Default behaviour (no special flags). Since: 2.74 _CONNECT_AFTER: If set, the handler should be called after the default handler of the signal. Normally, the handler is called before the default handler. _CONNECT_SWAPPED: If set, the instance and data should be swapped when calling the handler; see g_signal_connect_swapped() for an example.
*/
opaque type GConnectFlags = CUnsignedInt
object GConnectFlags extends _BindgenEnumCUnsignedInt[GConnectFlags]:
  given _tag: Tag[GConnectFlags] = Tag.UInt
  inline def define(inline a: Long): GConnectFlags = a.toUInt
  val G_CONNECT_DEFAULT = define(0)
  val G_CONNECT_AFTER = define(1)
  val G_CONNECT_SWAPPED = define(2)
  def getName(value: GConnectFlags): Option[String] =
    value match
      case `G_CONNECT_DEFAULT` => Some("G_CONNECT_DEFAULT")
      case `G_CONNECT_AFTER` => Some("G_CONNECT_AFTER")
      case `G_CONNECT_SWAPPED` => Some("G_CONNECT_SWAPPED")
      case _ => _root_.scala.None
  extension (a: GConnectFlags)
    inline def &(b: GConnectFlags): GConnectFlags = a & b
    inline def |(b: GConnectFlags): GConnectFlags = a | b
    inline def is(b: GConnectFlags): Boolean = (a & b) == b