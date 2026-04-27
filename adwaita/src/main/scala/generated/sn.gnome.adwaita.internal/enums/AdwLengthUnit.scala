package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-length-unit.h
*/
opaque type AdwLengthUnit = CUnsignedInt
object AdwLengthUnit extends _BindgenEnumCUnsignedInt[AdwLengthUnit]:
  given _tag: Tag[AdwLengthUnit] = Tag.UInt
  inline def define(inline a: Long): AdwLengthUnit = a.toUInt
  val ADW_LENGTH_UNIT_PX = define(0)
  val ADW_LENGTH_UNIT_PT = define(1)
  val ADW_LENGTH_UNIT_SP = define(2)
  def getName(value: AdwLengthUnit): Option[String] =
    value match
      case `ADW_LENGTH_UNIT_PX` => Some("ADW_LENGTH_UNIT_PX")
      case `ADW_LENGTH_UNIT_PT` => Some("ADW_LENGTH_UNIT_PT")
      case `ADW_LENGTH_UNIT_SP` => Some("ADW_LENGTH_UNIT_SP")
      case _ => _root_.scala.None
  extension (a: AdwLengthUnit)
    inline def &(b: AdwLengthUnit): AdwLengthUnit = a & b
    inline def |(b: AdwLengthUnit): AdwLengthUnit = a | b
    inline def is(b: AdwLengthUnit): Boolean = (a & b) == b