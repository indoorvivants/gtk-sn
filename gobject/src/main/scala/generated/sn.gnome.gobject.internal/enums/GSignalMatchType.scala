package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSignalMatchType: _SIGNAL_MATCH_ID: The signal id must be equal. _SIGNAL_MATCH_DETAIL: The signal detail must be equal. _SIGNAL_MATCH_CLOSURE: The closure must be the same. _SIGNAL_MATCH_FUNC: The C closure callback must be the same. _SIGNAL_MATCH_DATA: The closure data must be the same. _SIGNAL_MATCH_UNBLOCKED: Only unblocked signals may be matched.
*/
opaque type GSignalMatchType = CUnsignedInt
object GSignalMatchType extends _BindgenEnumCUnsignedInt[GSignalMatchType]:
  given _tag: Tag[GSignalMatchType] = Tag.UInt
  inline def define(inline a: Long): GSignalMatchType = a.toUInt
  val G_SIGNAL_MATCH_ID = define(1)
  val G_SIGNAL_MATCH_DETAIL = define(2)
  val G_SIGNAL_MATCH_CLOSURE = define(4)
  val G_SIGNAL_MATCH_FUNC = define(8)
  val G_SIGNAL_MATCH_DATA = define(16)
  val G_SIGNAL_MATCH_UNBLOCKED = define(32)
  def getName(value: GSignalMatchType): Option[String] =
    value match
      case `G_SIGNAL_MATCH_ID` => Some("G_SIGNAL_MATCH_ID")
      case `G_SIGNAL_MATCH_DETAIL` => Some("G_SIGNAL_MATCH_DETAIL")
      case `G_SIGNAL_MATCH_CLOSURE` => Some("G_SIGNAL_MATCH_CLOSURE")
      case `G_SIGNAL_MATCH_FUNC` => Some("G_SIGNAL_MATCH_FUNC")
      case `G_SIGNAL_MATCH_DATA` => Some("G_SIGNAL_MATCH_DATA")
      case `G_SIGNAL_MATCH_UNBLOCKED` => Some("G_SIGNAL_MATCH_UNBLOCKED")
      case _ => _root_.scala.None
  extension (a: GSignalMatchType)
    inline def &(b: GSignalMatchType): GSignalMatchType = a & b
    inline def |(b: GSignalMatchType): GSignalMatchType = a | b
    inline def is(b: GSignalMatchType): Boolean = (a & b) == b