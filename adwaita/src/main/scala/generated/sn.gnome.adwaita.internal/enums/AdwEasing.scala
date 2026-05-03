package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-easing.h
*/
opaque type AdwEasing = CUnsignedInt
object AdwEasing extends _BindgenEnumCUnsignedInt[AdwEasing]:
  given _tag: Tag[AdwEasing] = Tag.UInt
  inline def define(inline a: Long): AdwEasing = a.toUInt
  val ADW_LINEAR = define(0)
  val ADW_EASE_IN_QUAD = define(1)
  val ADW_EASE_OUT_QUAD = define(2)
  val ADW_EASE_IN_OUT_QUAD = define(3)
  val ADW_EASE_IN_CUBIC = define(4)
  val ADW_EASE_OUT_CUBIC = define(5)
  val ADW_EASE_IN_OUT_CUBIC = define(6)
  val ADW_EASE_IN_QUART = define(7)
  val ADW_EASE_OUT_QUART = define(8)
  val ADW_EASE_IN_OUT_QUART = define(9)
  val ADW_EASE_IN_QUINT = define(10)
  val ADW_EASE_OUT_QUINT = define(11)
  val ADW_EASE_IN_OUT_QUINT = define(12)
  val ADW_EASE_IN_SINE = define(13)
  val ADW_EASE_OUT_SINE = define(14)
  val ADW_EASE_IN_OUT_SINE = define(15)
  val ADW_EASE_IN_EXPO = define(16)
  val ADW_EASE_OUT_EXPO = define(17)
  val ADW_EASE_IN_OUT_EXPO = define(18)
  val ADW_EASE_IN_CIRC = define(19)
  val ADW_EASE_OUT_CIRC = define(20)
  val ADW_EASE_IN_OUT_CIRC = define(21)
  val ADW_EASE_IN_ELASTIC = define(22)
  val ADW_EASE_OUT_ELASTIC = define(23)
  val ADW_EASE_IN_OUT_ELASTIC = define(24)
  val ADW_EASE_IN_BACK = define(25)
  val ADW_EASE_OUT_BACK = define(26)
  val ADW_EASE_IN_OUT_BACK = define(27)
  val ADW_EASE_IN_BOUNCE = define(28)
  val ADW_EASE_OUT_BOUNCE = define(29)
  val ADW_EASE_IN_OUT_BOUNCE = define(30)
  def getName(value: AdwEasing): Option[String] =
    value match
      case `ADW_LINEAR` => Some("ADW_LINEAR")
      case `ADW_EASE_IN_QUAD` => Some("ADW_EASE_IN_QUAD")
      case `ADW_EASE_OUT_QUAD` => Some("ADW_EASE_OUT_QUAD")
      case `ADW_EASE_IN_OUT_QUAD` => Some("ADW_EASE_IN_OUT_QUAD")
      case `ADW_EASE_IN_CUBIC` => Some("ADW_EASE_IN_CUBIC")
      case `ADW_EASE_OUT_CUBIC` => Some("ADW_EASE_OUT_CUBIC")
      case `ADW_EASE_IN_OUT_CUBIC` => Some("ADW_EASE_IN_OUT_CUBIC")
      case `ADW_EASE_IN_QUART` => Some("ADW_EASE_IN_QUART")
      case `ADW_EASE_OUT_QUART` => Some("ADW_EASE_OUT_QUART")
      case `ADW_EASE_IN_OUT_QUART` => Some("ADW_EASE_IN_OUT_QUART")
      case `ADW_EASE_IN_QUINT` => Some("ADW_EASE_IN_QUINT")
      case `ADW_EASE_OUT_QUINT` => Some("ADW_EASE_OUT_QUINT")
      case `ADW_EASE_IN_OUT_QUINT` => Some("ADW_EASE_IN_OUT_QUINT")
      case `ADW_EASE_IN_SINE` => Some("ADW_EASE_IN_SINE")
      case `ADW_EASE_OUT_SINE` => Some("ADW_EASE_OUT_SINE")
      case `ADW_EASE_IN_OUT_SINE` => Some("ADW_EASE_IN_OUT_SINE")
      case `ADW_EASE_IN_EXPO` => Some("ADW_EASE_IN_EXPO")
      case `ADW_EASE_OUT_EXPO` => Some("ADW_EASE_OUT_EXPO")
      case `ADW_EASE_IN_OUT_EXPO` => Some("ADW_EASE_IN_OUT_EXPO")
      case `ADW_EASE_IN_CIRC` => Some("ADW_EASE_IN_CIRC")
      case `ADW_EASE_OUT_CIRC` => Some("ADW_EASE_OUT_CIRC")
      case `ADW_EASE_IN_OUT_CIRC` => Some("ADW_EASE_IN_OUT_CIRC")
      case `ADW_EASE_IN_ELASTIC` => Some("ADW_EASE_IN_ELASTIC")
      case `ADW_EASE_OUT_ELASTIC` => Some("ADW_EASE_OUT_ELASTIC")
      case `ADW_EASE_IN_OUT_ELASTIC` => Some("ADW_EASE_IN_OUT_ELASTIC")
      case `ADW_EASE_IN_BACK` => Some("ADW_EASE_IN_BACK")
      case `ADW_EASE_OUT_BACK` => Some("ADW_EASE_OUT_BACK")
      case `ADW_EASE_IN_OUT_BACK` => Some("ADW_EASE_IN_OUT_BACK")
      case `ADW_EASE_IN_BOUNCE` => Some("ADW_EASE_IN_BOUNCE")
      case `ADW_EASE_OUT_BOUNCE` => Some("ADW_EASE_OUT_BOUNCE")
      case `ADW_EASE_IN_OUT_BOUNCE` => Some("ADW_EASE_IN_OUT_BOUNCE")
      case _ => _root_.scala.None
  extension (a: AdwEasing)
    inline def &(b: AdwEasing): AdwEasing = a & b
    inline def |(b: AdwEasing): AdwEasing = a | b
    inline def is(b: AdwEasing): Boolean = (a & b) == b