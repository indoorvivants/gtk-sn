package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTimeType: _TIME_TYPE_STANDARD: the time is in local standard time _TIME_TYPE_DAYLIGHT: the time is in local daylight time _TIME_TYPE_UNIVERSAL: the time is in UTC
*/
opaque type GTimeType = CUnsignedInt
object GTimeType extends _BindgenEnumCUnsignedInt[GTimeType]:
  given _tag: Tag[GTimeType] = Tag.UInt
  inline def define(inline a: Long): GTimeType = a.toUInt
  val G_TIME_TYPE_STANDARD = define(0)
  val G_TIME_TYPE_DAYLIGHT = define(1)
  val G_TIME_TYPE_UNIVERSAL = define(2)
  def getName(value: GTimeType): Option[String] =
    value match
      case `G_TIME_TYPE_STANDARD` => Some("G_TIME_TYPE_STANDARD")
      case `G_TIME_TYPE_DAYLIGHT` => Some("G_TIME_TYPE_DAYLIGHT")
      case `G_TIME_TYPE_UNIVERSAL` => Some("G_TIME_TYPE_UNIVERSAL")
      case _ => _root_.scala.None
  extension (a: GTimeType)
    inline def &(b: GTimeType): GTimeType = a & b
    inline def |(b: GTimeType): GTimeType = a | b
    inline def is(b: GTimeType): Boolean = (a & b) == b