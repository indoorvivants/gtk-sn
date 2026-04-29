package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDateMonth = CUnsignedInt
object GDateMonth extends _BindgenEnumCUnsignedInt[GDateMonth]:
  given _tag: Tag[GDateMonth] = Tag.UInt
  inline def define(inline a: Long): GDateMonth = a.toUInt
  val G_DATE_BAD_MONTH = define(0)
  val G_DATE_JANUARY = define(1)
  val G_DATE_FEBRUARY = define(2)
  val G_DATE_MARCH = define(3)
  val G_DATE_APRIL = define(4)
  val G_DATE_MAY = define(5)
  val G_DATE_JUNE = define(6)
  val G_DATE_JULY = define(7)
  val G_DATE_AUGUST = define(8)
  val G_DATE_SEPTEMBER = define(9)
  val G_DATE_OCTOBER = define(10)
  val G_DATE_NOVEMBER = define(11)
  val G_DATE_DECEMBER = define(12)
  def getName(value: GDateMonth): Option[String] =
    value match
      case `G_DATE_BAD_MONTH` => Some("G_DATE_BAD_MONTH")
      case `G_DATE_JANUARY` => Some("G_DATE_JANUARY")
      case `G_DATE_FEBRUARY` => Some("G_DATE_FEBRUARY")
      case `G_DATE_MARCH` => Some("G_DATE_MARCH")
      case `G_DATE_APRIL` => Some("G_DATE_APRIL")
      case `G_DATE_MAY` => Some("G_DATE_MAY")
      case `G_DATE_JUNE` => Some("G_DATE_JUNE")
      case `G_DATE_JULY` => Some("G_DATE_JULY")
      case `G_DATE_AUGUST` => Some("G_DATE_AUGUST")
      case `G_DATE_SEPTEMBER` => Some("G_DATE_SEPTEMBER")
      case `G_DATE_OCTOBER` => Some("G_DATE_OCTOBER")
      case `G_DATE_NOVEMBER` => Some("G_DATE_NOVEMBER")
      case `G_DATE_DECEMBER` => Some("G_DATE_DECEMBER")
      case _ => _root_.scala.None
  extension (a: GDateMonth)
    inline def &(b: GDateMonth): GDateMonth = a & b
    inline def |(b: GDateMonth): GDateMonth = a | b
    inline def is(b: GDateMonth): Boolean = (a & b) == b