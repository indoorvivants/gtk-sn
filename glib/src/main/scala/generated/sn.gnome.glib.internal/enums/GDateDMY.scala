package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDateDMY = CUnsignedInt
object GDateDMY extends _BindgenEnumCUnsignedInt[GDateDMY]:
  given _tag: Tag[GDateDMY] = Tag.UInt
  inline def define(inline a: Long): GDateDMY = a.toUInt
  val G_DATE_DAY = define(0)
  val G_DATE_MONTH = define(1)
  val G_DATE_YEAR = define(2)
  def getName(value: GDateDMY): Option[String] =
    value match
      case `G_DATE_DAY` => Some("G_DATE_DAY")
      case `G_DATE_MONTH` => Some("G_DATE_MONTH")
      case `G_DATE_YEAR` => Some("G_DATE_YEAR")
      case _ => _root_.scala.None
  extension (a: GDateDMY)
    inline def &(b: GDateDMY): GDateDMY = a & b
    inline def |(b: GDateDMY): GDateDMY = a | b
    inline def is(b: GDateDMY): Boolean = (a & b) == b