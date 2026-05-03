package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoWeight: _WEIGHT_THIN: the thin weight (= 100) Since: 1.24 _WEIGHT_ULTRALIGHT: the ultralight weight (= 200) _WEIGHT_LIGHT: the light weight (= 300) _WEIGHT_SEMILIGHT: the semilight weight (= 350) Since: 1.36.7 _WEIGHT_BOOK: the book weight (= 380) Since: 1.24) _WEIGHT_NORMAL: the default weight (= 400) _WEIGHT_MEDIUM: the medium weight (= 500) Since: 1.24 _WEIGHT_SEMIBOLD: the semibold weight (= 600) _WEIGHT_BOLD: the bold weight (= 700) _WEIGHT_ULTRABOLD: the ultrabold weight (= 800) _WEIGHT_HEAVY: the heavy weight (= 900) _WEIGHT_ULTRAHEAVY: the ultraheavy weight (= 1000) Since: 1.24
*/
opaque type PangoWeight = CUnsignedInt
object PangoWeight extends _BindgenEnumCUnsignedInt[PangoWeight]:
  given _tag: Tag[PangoWeight] = Tag.UInt
  inline def define(inline a: Long): PangoWeight = a.toUInt
  val PANGO_WEIGHT_THIN = define(100)
  val PANGO_WEIGHT_ULTRALIGHT = define(200)
  val PANGO_WEIGHT_LIGHT = define(300)
  val PANGO_WEIGHT_SEMILIGHT = define(350)
  val PANGO_WEIGHT_BOOK = define(380)
  val PANGO_WEIGHT_NORMAL = define(400)
  val PANGO_WEIGHT_MEDIUM = define(500)
  val PANGO_WEIGHT_SEMIBOLD = define(600)
  val PANGO_WEIGHT_BOLD = define(700)
  val PANGO_WEIGHT_ULTRABOLD = define(800)
  val PANGO_WEIGHT_HEAVY = define(900)
  val PANGO_WEIGHT_ULTRAHEAVY = define(1000)
  def getName(value: PangoWeight): Option[String] =
    value match
      case `PANGO_WEIGHT_THIN` => Some("PANGO_WEIGHT_THIN")
      case `PANGO_WEIGHT_ULTRALIGHT` => Some("PANGO_WEIGHT_ULTRALIGHT")
      case `PANGO_WEIGHT_LIGHT` => Some("PANGO_WEIGHT_LIGHT")
      case `PANGO_WEIGHT_SEMILIGHT` => Some("PANGO_WEIGHT_SEMILIGHT")
      case `PANGO_WEIGHT_BOOK` => Some("PANGO_WEIGHT_BOOK")
      case `PANGO_WEIGHT_NORMAL` => Some("PANGO_WEIGHT_NORMAL")
      case `PANGO_WEIGHT_MEDIUM` => Some("PANGO_WEIGHT_MEDIUM")
      case `PANGO_WEIGHT_SEMIBOLD` => Some("PANGO_WEIGHT_SEMIBOLD")
      case `PANGO_WEIGHT_BOLD` => Some("PANGO_WEIGHT_BOLD")
      case `PANGO_WEIGHT_ULTRABOLD` => Some("PANGO_WEIGHT_ULTRABOLD")
      case `PANGO_WEIGHT_HEAVY` => Some("PANGO_WEIGHT_HEAVY")
      case `PANGO_WEIGHT_ULTRAHEAVY` => Some("PANGO_WEIGHT_ULTRAHEAVY")
      case _ => _root_.scala.None
  extension (a: PangoWeight)
    inline def &(b: PangoWeight): PangoWeight = a & b
    inline def |(b: PangoWeight): PangoWeight = a | b
    inline def is(b: PangoWeight): Boolean = (a & b) == b