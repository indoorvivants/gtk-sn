package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDateWeekday = CUnsignedInt
object GDateWeekday extends _BindgenEnumCUnsignedInt[GDateWeekday]:
  given _tag: Tag[GDateWeekday] = Tag.UInt
  inline def define(inline a: Long): GDateWeekday = a.toUInt
  val G_DATE_BAD_WEEKDAY = define(0)
  val G_DATE_MONDAY = define(1)
  val G_DATE_TUESDAY = define(2)
  val G_DATE_WEDNESDAY = define(3)
  val G_DATE_THURSDAY = define(4)
  val G_DATE_FRIDAY = define(5)
  val G_DATE_SATURDAY = define(6)
  val G_DATE_SUNDAY = define(7)
  def getName(value: GDateWeekday): Option[String] =
    value match
      case `G_DATE_BAD_WEEKDAY` => Some("G_DATE_BAD_WEEKDAY")
      case `G_DATE_MONDAY` => Some("G_DATE_MONDAY")
      case `G_DATE_TUESDAY` => Some("G_DATE_TUESDAY")
      case `G_DATE_WEDNESDAY` => Some("G_DATE_WEDNESDAY")
      case `G_DATE_THURSDAY` => Some("G_DATE_THURSDAY")
      case `G_DATE_FRIDAY` => Some("G_DATE_FRIDAY")
      case `G_DATE_SATURDAY` => Some("G_DATE_SATURDAY")
      case `G_DATE_SUNDAY` => Some("G_DATE_SUNDAY")
      case _ => _root_.scala.None
  extension (a: GDateWeekday)
    inline def &(b: GDateWeekday): GDateWeekday = a & b
    inline def |(b: GDateWeekday): GDateWeekday = a | b
    inline def is(b: GDateWeekday): Boolean = (a & b) == b