package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_operator_t: _OPERATOR_CLEAR: clear destination layer (bounded) (Since 1.0) _OPERATOR_SOURCE: replace destination layer (bounded) (Since 1.0) _OPERATOR_OVER: draw source layer on top of destination layer (bounded) (Since 1.0) _OPERATOR_IN: draw source where there was destination content (unbounded) (Since 1.0) _OPERATOR_OUT: draw source where there was no destination content (unbounded) (Since 1.0) _OPERATOR_ATOP: draw source on top of destination content and only there (Since 1.0) _OPERATOR_DEST: ignore the source (Since 1.0) _OPERATOR_DEST_OVER: draw destination on top of source (Since 1.0) _OPERATOR_DEST_IN: leave destination only where there was source content (unbounded) (Since 1.0) _OPERATOR_DEST_OUT: leave destination only where there was no source content (Since 1.0) _OPERATOR_DEST_ATOP: leave destination on top of source content and only there (unbounded) (Since 1.0) _OPERATOR_XOR: source and destination are shown where there is only one of them (Since 1.0) _OPERATOR_ADD: source and destination layers are accumulated (Since 1.0) _OPERATOR_SATURATE: like over, but assuming source and dest are disjoint geometries (Since 1.0) _OPERATOR_MULTIPLY: source and destination layers are multiplied. This causes the result to be at least as dark as the darker inputs. (Since 1.10) _OPERATOR_SCREEN: source and destination are complemented and multiplied. This causes the result to be at least as light as the lighter inputs. (Since 1.10) _OPERATOR_OVERLAY: multiplies or screens, depending on the lightness of the destination color. (Since 1.10) _OPERATOR_DARKEN: replaces the destination with the source if it is darker, otherwise keeps the source. (Since 1.10) _OPERATOR_LIGHTEN: replaces the destination with the source if it is lighter, otherwise keeps the source. (Since 1.10) _OPERATOR_COLOR_DODGE: brightens the destination color to reflect the source color. (Since 1.10) _OPERATOR_COLOR_BURN: darkens the destination color to reflect the source color. (Since 1.10) _OPERATOR_HARD_LIGHT: Multiplies or screens, dependent on source color. (Since 1.10) _OPERATOR_SOFT_LIGHT: Darkens or lightens, dependent on source color. (Since 1.10) _OPERATOR_DIFFERENCE: Takes the difference of the source and destination color. (Since 1.10) _OPERATOR_EXCLUSION: Produces an effect similar to difference, but with lower contrast. (Since 1.10) _OPERATOR_HSL_HUE: Creates a color with the hue of the source and the saturation and luminosity of the target. (Since 1.10) _OPERATOR_HSL_SATURATION: Creates a color with the saturation of the source and the hue and luminosity of the target. Painting with this mode onto a gray area produces no change. (Since 1.10) _OPERATOR_HSL_COLOR: Creates a color with the hue and saturation of the source and the luminosity of the target. This preserves the gray levels of the target and is useful for coloring monochrome images or tinting color images. (Since 1.10) _OPERATOR_HSL_LUMINOSITY: Creates a color with the luminosity of the source and the hue and saturation of the target. This produces an inverse effect to _OPERATOR_HSL_COLOR. (Since 1.10)
*/
opaque type _cairo_operator = CUnsignedInt
object _cairo_operator extends _BindgenEnumCUnsignedInt[_cairo_operator]:
  given _tag: Tag[_cairo_operator] = Tag.UInt
  inline def define(inline a: Long): _cairo_operator = a.toUInt
  val CAIRO_OPERATOR_CLEAR = define(0)
  val CAIRO_OPERATOR_SOURCE = define(1)
  val CAIRO_OPERATOR_OVER = define(2)
  val CAIRO_OPERATOR_IN = define(3)
  val CAIRO_OPERATOR_OUT = define(4)
  val CAIRO_OPERATOR_ATOP = define(5)
  val CAIRO_OPERATOR_DEST = define(6)
  val CAIRO_OPERATOR_DEST_OVER = define(7)
  val CAIRO_OPERATOR_DEST_IN = define(8)
  val CAIRO_OPERATOR_DEST_OUT = define(9)
  val CAIRO_OPERATOR_DEST_ATOP = define(10)
  val CAIRO_OPERATOR_XOR = define(11)
  val CAIRO_OPERATOR_ADD = define(12)
  val CAIRO_OPERATOR_SATURATE = define(13)
  val CAIRO_OPERATOR_MULTIPLY = define(14)
  val CAIRO_OPERATOR_SCREEN = define(15)
  val CAIRO_OPERATOR_OVERLAY = define(16)
  val CAIRO_OPERATOR_DARKEN = define(17)
  val CAIRO_OPERATOR_LIGHTEN = define(18)
  val CAIRO_OPERATOR_COLOR_DODGE = define(19)
  val CAIRO_OPERATOR_COLOR_BURN = define(20)
  val CAIRO_OPERATOR_HARD_LIGHT = define(21)
  val CAIRO_OPERATOR_SOFT_LIGHT = define(22)
  val CAIRO_OPERATOR_DIFFERENCE = define(23)
  val CAIRO_OPERATOR_EXCLUSION = define(24)
  val CAIRO_OPERATOR_HSL_HUE = define(25)
  val CAIRO_OPERATOR_HSL_SATURATION = define(26)
  val CAIRO_OPERATOR_HSL_COLOR = define(27)
  val CAIRO_OPERATOR_HSL_LUMINOSITY = define(28)
  def getName(value: _cairo_operator): Option[String] =
    value match
      case `CAIRO_OPERATOR_CLEAR` => Some("CAIRO_OPERATOR_CLEAR")
      case `CAIRO_OPERATOR_SOURCE` => Some("CAIRO_OPERATOR_SOURCE")
      case `CAIRO_OPERATOR_OVER` => Some("CAIRO_OPERATOR_OVER")
      case `CAIRO_OPERATOR_IN` => Some("CAIRO_OPERATOR_IN")
      case `CAIRO_OPERATOR_OUT` => Some("CAIRO_OPERATOR_OUT")
      case `CAIRO_OPERATOR_ATOP` => Some("CAIRO_OPERATOR_ATOP")
      case `CAIRO_OPERATOR_DEST` => Some("CAIRO_OPERATOR_DEST")
      case `CAIRO_OPERATOR_DEST_OVER` => Some("CAIRO_OPERATOR_DEST_OVER")
      case `CAIRO_OPERATOR_DEST_IN` => Some("CAIRO_OPERATOR_DEST_IN")
      case `CAIRO_OPERATOR_DEST_OUT` => Some("CAIRO_OPERATOR_DEST_OUT")
      case `CAIRO_OPERATOR_DEST_ATOP` => Some("CAIRO_OPERATOR_DEST_ATOP")
      case `CAIRO_OPERATOR_XOR` => Some("CAIRO_OPERATOR_XOR")
      case `CAIRO_OPERATOR_ADD` => Some("CAIRO_OPERATOR_ADD")
      case `CAIRO_OPERATOR_SATURATE` => Some("CAIRO_OPERATOR_SATURATE")
      case `CAIRO_OPERATOR_MULTIPLY` => Some("CAIRO_OPERATOR_MULTIPLY")
      case `CAIRO_OPERATOR_SCREEN` => Some("CAIRO_OPERATOR_SCREEN")
      case `CAIRO_OPERATOR_OVERLAY` => Some("CAIRO_OPERATOR_OVERLAY")
      case `CAIRO_OPERATOR_DARKEN` => Some("CAIRO_OPERATOR_DARKEN")
      case `CAIRO_OPERATOR_LIGHTEN` => Some("CAIRO_OPERATOR_LIGHTEN")
      case `CAIRO_OPERATOR_COLOR_DODGE` => Some("CAIRO_OPERATOR_COLOR_DODGE")
      case `CAIRO_OPERATOR_COLOR_BURN` => Some("CAIRO_OPERATOR_COLOR_BURN")
      case `CAIRO_OPERATOR_HARD_LIGHT` => Some("CAIRO_OPERATOR_HARD_LIGHT")
      case `CAIRO_OPERATOR_SOFT_LIGHT` => Some("CAIRO_OPERATOR_SOFT_LIGHT")
      case `CAIRO_OPERATOR_DIFFERENCE` => Some("CAIRO_OPERATOR_DIFFERENCE")
      case `CAIRO_OPERATOR_EXCLUSION` => Some("CAIRO_OPERATOR_EXCLUSION")
      case `CAIRO_OPERATOR_HSL_HUE` => Some("CAIRO_OPERATOR_HSL_HUE")
      case `CAIRO_OPERATOR_HSL_SATURATION` => Some("CAIRO_OPERATOR_HSL_SATURATION")
      case `CAIRO_OPERATOR_HSL_COLOR` => Some("CAIRO_OPERATOR_HSL_COLOR")
      case `CAIRO_OPERATOR_HSL_LUMINOSITY` => Some("CAIRO_OPERATOR_HSL_LUMINOSITY")
      case _ => _root_.scala.None
  extension (a: _cairo_operator)
    inline def &(b: _cairo_operator): _cairo_operator = a & b
    inline def |(b: _cairo_operator): _cairo_operator = a | b
    inline def is(b: _cairo_operator): Boolean = (a & b) == b