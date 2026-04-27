package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GskBlendMode: _BLEND_MODE_DEFAULT: The default blend mode, which specifies no blending _BLEND_MODE_MULTIPLY: The source color is multiplied by the destination and replaces the destination _BLEND_MODE_SCREEN: Multiplies the complements of the destination and source color values, then complements the result. _BLEND_MODE_OVERLAY: Multiplies or screens the colors, depending on the destination color value. This is the inverse of hard-list _BLEND_MODE_DARKEN: Selects the darker of the destination and source colors _BLEND_MODE_LIGHTEN: Selects the lighter of the destination and source colors _BLEND_MODE_COLOR_DODGE: Brightens the destination color to reflect the source color _BLEND_MODE_COLOR_BURN: Darkens the destination color to reflect the source color _BLEND_MODE_HARD_LIGHT: Multiplies or screens the colors, depending on the source color value _BLEND_MODE_SOFT_LIGHT: Darkens or lightens the colors, depending on the source color value _BLEND_MODE_DIFFERENCE: Subtracts the darker of the two constituent colors from the lighter color _BLEND_MODE_EXCLUSION: Produces an effect similar to that of the difference mode but lower in contrast _BLEND_MODE_COLOR: Creates a color with the hue and saturation of the source color and the luminosity of the destination color _BLEND_MODE_HUE: Creates a color with the hue of the source color and the saturation and luminosity of the destination color _BLEND_MODE_SATURATION: Creates a color with the saturation of the source color and the hue and luminosity of the destination color _BLEND_MODE_LUMINOSITY: Creates a color with the luminosity of the source color and the hue and saturation of the destination color
*/
opaque type GskBlendMode = CUnsignedInt
object GskBlendMode extends _BindgenEnumCUnsignedInt[GskBlendMode]:
  given _tag: Tag[GskBlendMode] = Tag.UInt
  inline def define(inline a: Long): GskBlendMode = a.toUInt
  val GSK_BLEND_MODE_DEFAULT = define(0)
  val GSK_BLEND_MODE_MULTIPLY = define(1)
  val GSK_BLEND_MODE_SCREEN = define(2)
  val GSK_BLEND_MODE_OVERLAY = define(3)
  val GSK_BLEND_MODE_DARKEN = define(4)
  val GSK_BLEND_MODE_LIGHTEN = define(5)
  val GSK_BLEND_MODE_COLOR_DODGE = define(6)
  val GSK_BLEND_MODE_COLOR_BURN = define(7)
  val GSK_BLEND_MODE_HARD_LIGHT = define(8)
  val GSK_BLEND_MODE_SOFT_LIGHT = define(9)
  val GSK_BLEND_MODE_DIFFERENCE = define(10)
  val GSK_BLEND_MODE_EXCLUSION = define(11)
  val GSK_BLEND_MODE_COLOR = define(12)
  val GSK_BLEND_MODE_HUE = define(13)
  val GSK_BLEND_MODE_SATURATION = define(14)
  val GSK_BLEND_MODE_LUMINOSITY = define(15)
  def getName(value: GskBlendMode): Option[String] =
    value match
      case `GSK_BLEND_MODE_DEFAULT` => Some("GSK_BLEND_MODE_DEFAULT")
      case `GSK_BLEND_MODE_MULTIPLY` => Some("GSK_BLEND_MODE_MULTIPLY")
      case `GSK_BLEND_MODE_SCREEN` => Some("GSK_BLEND_MODE_SCREEN")
      case `GSK_BLEND_MODE_OVERLAY` => Some("GSK_BLEND_MODE_OVERLAY")
      case `GSK_BLEND_MODE_DARKEN` => Some("GSK_BLEND_MODE_DARKEN")
      case `GSK_BLEND_MODE_LIGHTEN` => Some("GSK_BLEND_MODE_LIGHTEN")
      case `GSK_BLEND_MODE_COLOR_DODGE` => Some("GSK_BLEND_MODE_COLOR_DODGE")
      case `GSK_BLEND_MODE_COLOR_BURN` => Some("GSK_BLEND_MODE_COLOR_BURN")
      case `GSK_BLEND_MODE_HARD_LIGHT` => Some("GSK_BLEND_MODE_HARD_LIGHT")
      case `GSK_BLEND_MODE_SOFT_LIGHT` => Some("GSK_BLEND_MODE_SOFT_LIGHT")
      case `GSK_BLEND_MODE_DIFFERENCE` => Some("GSK_BLEND_MODE_DIFFERENCE")
      case `GSK_BLEND_MODE_EXCLUSION` => Some("GSK_BLEND_MODE_EXCLUSION")
      case `GSK_BLEND_MODE_COLOR` => Some("GSK_BLEND_MODE_COLOR")
      case `GSK_BLEND_MODE_HUE` => Some("GSK_BLEND_MODE_HUE")
      case `GSK_BLEND_MODE_SATURATION` => Some("GSK_BLEND_MODE_SATURATION")
      case `GSK_BLEND_MODE_LUMINOSITY` => Some("GSK_BLEND_MODE_LUMINOSITY")
      case _ => _root_.scala.None
  extension (a: GskBlendMode)
    inline def &(b: GskBlendMode): GskBlendMode = a & b
    inline def |(b: GskBlendMode): GskBlendMode = a | b
    inline def is(b: GskBlendMode): Boolean = (a & b) == b