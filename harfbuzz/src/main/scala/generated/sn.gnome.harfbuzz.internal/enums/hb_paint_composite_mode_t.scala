package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_paint_composite_mode_t: _PAINT_COMPOSITE_MODE_CLEAR: clear destination layer (bounded) _PAINT_COMPOSITE_MODE_SRC: replace destination layer (bounded) _PAINT_COMPOSITE_MODE_SRC_OVER: draw source layer on top of destination layer (bounded) _PAINT_COMPOSITE_MODE_SRC_IN: draw source where there was destination content (unbounded) _PAINT_COMPOSITE_MODE_SRC_OUT: draw source where there was no destination content (unbounded) _PAINT_COMPOSITE_MODE_SRC_ATOP: draw source on top of destination content and only there _PAINT_COMPOSITE_MODE_DEST: ignore the source _PAINT_COMPOSITE_MODE_DEST_OVER: draw destination on top of source _PAINT_COMPOSITE_MODE_DEST_IN: leave destination only where there was source content (unbounded) _PAINT_COMPOSITE_MODE_DEST_OUT: leave destination only where there was no source content _PAINT_COMPOSITE_MODE_DEST_ATOP: leave destination on top of source content and only there (unbounded) _PAINT_COMPOSITE_MODE_XOR: source and destination are shown where there is only one of them _PAINT_COMPOSITE_MODE_PLUS: source and destination layers are accumulated _PAINT_COMPOSITE_MODE_MULTIPLY: source and destination layers are multiplied. This causes the result to be at least as dark as the darker inputs. _PAINT_COMPOSITE_MODE_SCREEN: source and destination are complemented and multiplied. This causes the result to be at least as light as the lighter inputs. _PAINT_COMPOSITE_MODE_OVERLAY: multiplies or screens, depending on the lightness of the destination color. _PAINT_COMPOSITE_MODE_DARKEN: replaces the destination with the source if it is darker, otherwise keeps the source. _PAINT_COMPOSITE_MODE_LIGHTEN: replaces the destination with the source if it is lighter, otherwise keeps the source. _PAINT_COMPOSITE_MODE_COLOR_DODGE: brightens the destination color to reflect the source color. _PAINT_COMPOSITE_MODE_COLOR_BURN: darkens the destination color to reflect the source color. _PAINT_COMPOSITE_MODE_HARD_LIGHT: Multiplies or screens, dependent on source color. _PAINT_COMPOSITE_MODE_SOFT_LIGHT: Darkens or lightens, dependent on source color. _PAINT_COMPOSITE_MODE_DIFFERENCE: Takes the difference of the source and destination color. _PAINT_COMPOSITE_MODE_EXCLUSION: Produces an effect similar to difference, but with lower contrast. _PAINT_COMPOSITE_MODE_HSL_HUE: Creates a color with the hue of the source and the saturation and luminosity of the target. _PAINT_COMPOSITE_MODE_HSL_SATURATION: Creates a color with the saturation of the source and the hue and luminosity of the target. Painting with this mode onto a gray area produces no change. _PAINT_COMPOSITE_MODE_HSL_COLOR: Creates a color with the hue and saturation of the source and the luminosity of the target. This preserves the gray levels of the target and is useful for coloring monochrome images or tinting color images. _PAINT_COMPOSITE_MODE_HSL_LUMINOSITY: Creates a color with the luminosity of the source and the hue and saturation of the target. This produces an inverse effect to _PAINT_COMPOSITE_MODE_HSL_COLOR.
*/
opaque type hb_paint_composite_mode_t = CUnsignedInt
object hb_paint_composite_mode_t extends _BindgenEnumCUnsignedInt[hb_paint_composite_mode_t]:
  given _tag: Tag[hb_paint_composite_mode_t] = Tag.UInt
  inline def define(inline a: Long): hb_paint_composite_mode_t = a.toUInt
  val HB_PAINT_COMPOSITE_MODE_CLEAR = define(0)
  val HB_PAINT_COMPOSITE_MODE_SRC = define(1)
  val HB_PAINT_COMPOSITE_MODE_DEST = define(2)
  val HB_PAINT_COMPOSITE_MODE_SRC_OVER = define(3)
  val HB_PAINT_COMPOSITE_MODE_DEST_OVER = define(4)
  val HB_PAINT_COMPOSITE_MODE_SRC_IN = define(5)
  val HB_PAINT_COMPOSITE_MODE_DEST_IN = define(6)
  val HB_PAINT_COMPOSITE_MODE_SRC_OUT = define(7)
  val HB_PAINT_COMPOSITE_MODE_DEST_OUT = define(8)
  val HB_PAINT_COMPOSITE_MODE_SRC_ATOP = define(9)
  val HB_PAINT_COMPOSITE_MODE_DEST_ATOP = define(10)
  val HB_PAINT_COMPOSITE_MODE_XOR = define(11)
  val HB_PAINT_COMPOSITE_MODE_PLUS = define(12)
  val HB_PAINT_COMPOSITE_MODE_SCREEN = define(13)
  val HB_PAINT_COMPOSITE_MODE_OVERLAY = define(14)
  val HB_PAINT_COMPOSITE_MODE_DARKEN = define(15)
  val HB_PAINT_COMPOSITE_MODE_LIGHTEN = define(16)
  val HB_PAINT_COMPOSITE_MODE_COLOR_DODGE = define(17)
  val HB_PAINT_COMPOSITE_MODE_COLOR_BURN = define(18)
  val HB_PAINT_COMPOSITE_MODE_HARD_LIGHT = define(19)
  val HB_PAINT_COMPOSITE_MODE_SOFT_LIGHT = define(20)
  val HB_PAINT_COMPOSITE_MODE_DIFFERENCE = define(21)
  val HB_PAINT_COMPOSITE_MODE_EXCLUSION = define(22)
  val HB_PAINT_COMPOSITE_MODE_MULTIPLY = define(23)
  val HB_PAINT_COMPOSITE_MODE_HSL_HUE = define(24)
  val HB_PAINT_COMPOSITE_MODE_HSL_SATURATION = define(25)
  val HB_PAINT_COMPOSITE_MODE_HSL_COLOR = define(26)
  val HB_PAINT_COMPOSITE_MODE_HSL_LUMINOSITY = define(27)
  def getName(value: hb_paint_composite_mode_t): Option[String] =
    value match
      case `HB_PAINT_COMPOSITE_MODE_CLEAR` => Some("HB_PAINT_COMPOSITE_MODE_CLEAR")
      case `HB_PAINT_COMPOSITE_MODE_SRC` => Some("HB_PAINT_COMPOSITE_MODE_SRC")
      case `HB_PAINT_COMPOSITE_MODE_DEST` => Some("HB_PAINT_COMPOSITE_MODE_DEST")
      case `HB_PAINT_COMPOSITE_MODE_SRC_OVER` => Some("HB_PAINT_COMPOSITE_MODE_SRC_OVER")
      case `HB_PAINT_COMPOSITE_MODE_DEST_OVER` => Some("HB_PAINT_COMPOSITE_MODE_DEST_OVER")
      case `HB_PAINT_COMPOSITE_MODE_SRC_IN` => Some("HB_PAINT_COMPOSITE_MODE_SRC_IN")
      case `HB_PAINT_COMPOSITE_MODE_DEST_IN` => Some("HB_PAINT_COMPOSITE_MODE_DEST_IN")
      case `HB_PAINT_COMPOSITE_MODE_SRC_OUT` => Some("HB_PAINT_COMPOSITE_MODE_SRC_OUT")
      case `HB_PAINT_COMPOSITE_MODE_DEST_OUT` => Some("HB_PAINT_COMPOSITE_MODE_DEST_OUT")
      case `HB_PAINT_COMPOSITE_MODE_SRC_ATOP` => Some("HB_PAINT_COMPOSITE_MODE_SRC_ATOP")
      case `HB_PAINT_COMPOSITE_MODE_DEST_ATOP` => Some("HB_PAINT_COMPOSITE_MODE_DEST_ATOP")
      case `HB_PAINT_COMPOSITE_MODE_XOR` => Some("HB_PAINT_COMPOSITE_MODE_XOR")
      case `HB_PAINT_COMPOSITE_MODE_PLUS` => Some("HB_PAINT_COMPOSITE_MODE_PLUS")
      case `HB_PAINT_COMPOSITE_MODE_SCREEN` => Some("HB_PAINT_COMPOSITE_MODE_SCREEN")
      case `HB_PAINT_COMPOSITE_MODE_OVERLAY` => Some("HB_PAINT_COMPOSITE_MODE_OVERLAY")
      case `HB_PAINT_COMPOSITE_MODE_DARKEN` => Some("HB_PAINT_COMPOSITE_MODE_DARKEN")
      case `HB_PAINT_COMPOSITE_MODE_LIGHTEN` => Some("HB_PAINT_COMPOSITE_MODE_LIGHTEN")
      case `HB_PAINT_COMPOSITE_MODE_COLOR_DODGE` => Some("HB_PAINT_COMPOSITE_MODE_COLOR_DODGE")
      case `HB_PAINT_COMPOSITE_MODE_COLOR_BURN` => Some("HB_PAINT_COMPOSITE_MODE_COLOR_BURN")
      case `HB_PAINT_COMPOSITE_MODE_HARD_LIGHT` => Some("HB_PAINT_COMPOSITE_MODE_HARD_LIGHT")
      case `HB_PAINT_COMPOSITE_MODE_SOFT_LIGHT` => Some("HB_PAINT_COMPOSITE_MODE_SOFT_LIGHT")
      case `HB_PAINT_COMPOSITE_MODE_DIFFERENCE` => Some("HB_PAINT_COMPOSITE_MODE_DIFFERENCE")
      case `HB_PAINT_COMPOSITE_MODE_EXCLUSION` => Some("HB_PAINT_COMPOSITE_MODE_EXCLUSION")
      case `HB_PAINT_COMPOSITE_MODE_MULTIPLY` => Some("HB_PAINT_COMPOSITE_MODE_MULTIPLY")
      case `HB_PAINT_COMPOSITE_MODE_HSL_HUE` => Some("HB_PAINT_COMPOSITE_MODE_HSL_HUE")
      case `HB_PAINT_COMPOSITE_MODE_HSL_SATURATION` => Some("HB_PAINT_COMPOSITE_MODE_HSL_SATURATION")
      case `HB_PAINT_COMPOSITE_MODE_HSL_COLOR` => Some("HB_PAINT_COMPOSITE_MODE_HSL_COLOR")
      case `HB_PAINT_COMPOSITE_MODE_HSL_LUMINOSITY` => Some("HB_PAINT_COMPOSITE_MODE_HSL_LUMINOSITY")
      case _ => _root_.scala.None
  extension (a: hb_paint_composite_mode_t)
    inline def &(b: hb_paint_composite_mode_t): hb_paint_composite_mode_t = a & b
    inline def |(b: hb_paint_composite_mode_t): hb_paint_composite_mode_t = a | b
    inline def is(b: hb_paint_composite_mode_t): Boolean = (a & b) == b