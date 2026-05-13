package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.hb_paint_composite_mode_t

/** The values of this enumeration describe the compositing modes that can be
  * used when combining temporary redirected drawing with the backdrop.
  *
  * See the OpenType spec
  * [COLR](https://learn.microsoft.com/en-us/typography/opentype/spec/colr)
  * section for details.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Paint_composite_mode_t(val raw: hb_paint_composite_mode_t):
  /** clear destination layer (bounded)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CLEAR
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_CLEAR
      )

  /** replace destination layer (bounded)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SRC
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_SRC
      )

  /** ignore the source
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DEST
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_DEST
      )

  /** draw source layer on top of destination layer (bounded)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SRC_OVER
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_SRC_OVER
      )

  /** draw destination on top of source
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DEST_OVER
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_DEST_OVER
      )

  /** draw source where there was destination content (unbounded)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SRC_IN
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_SRC_IN
      )

  /** leave destination only where there was source content (unbounded)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DEST_IN
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_DEST_IN
      )

  /** draw source where there was no destination content (unbounded)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SRC_OUT
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_SRC_OUT
      )

  /** leave destination only where there was no source content
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DEST_OUT
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_DEST_OUT
      )

  /** draw source on top of destination content and only there
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SRC_ATOP
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_SRC_ATOP
      )

  /** leave destination on top of source content and only there (unbounded)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DEST_ATOP
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_DEST_ATOP
      )

  /** source and destination are shown where there is only one of them
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case XOR
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_XOR
      )

  /** source and destination layers are accumulated
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PLUS
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_PLUS
      )

  /** source and destination are complemented and multiplied. This causes the
    * result to be at least as light as the lighter inputs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SCREEN
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_SCREEN
      )

  /** multiplies or screens, depending on the lightness of the destination
    * color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OVERLAY
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_OVERLAY
      )

  /** replaces the destination with the source if it is darker, otherwise keeps
    * the source.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DARKEN
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_DARKEN
      )

  /** replaces the destination with the source if it is lighter, otherwise keeps
    * the source.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LIGHTEN
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_LIGHTEN
      )

  /** brightens the destination color to reflect the source color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COLOR_DODGE
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_COLOR_DODGE
      )

  /** darkens the destination color to reflect the source color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COLOR_BURN
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_COLOR_BURN
      )

  /** Multiplies or screens, dependent on source color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HARD_LIGHT
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_HARD_LIGHT
      )

  /** Darkens or lightens, dependent on source color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SOFT_LIGHT
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_SOFT_LIGHT
      )

  /** Takes the difference of the source and destination color.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DIFFERENCE
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_DIFFERENCE
      )

  /** Produces an effect similar to difference, but with lower contrast.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EXCLUSION
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_EXCLUSION
      )

  /** source and destination layers are multiplied. This causes the result to be
    * at least as dark as the darker inputs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MULTIPLY
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_MULTIPLY
      )

  /** Creates a color with the hue of the source and the saturation and
    * luminosity of the target.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HSL_HUE
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_HSL_HUE
      )

  /** Creates a color with the saturation of the source and the hue and
    * luminosity of the target. Painting with this mode onto a gray area
    * produces no change.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HSL_SATURATION
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_HSL_SATURATION
      )

  /** Creates a color with the hue and saturation of the source and the
    * luminosity of the target. This preserves the gray levels of the target and
    * is useful for coloring monochrome images or tinting color images.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HSL_COLOR
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_HSL_COLOR
      )

  /** Creates a color with the luminosity of the source and the hue and
    * saturation of the target. This produces an inverse effect to @HB_PAINT_COMPOSITE_MODE_HSL_COLOR.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HSL_LUMINOSITY
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_HSL_LUMINOSITY
      )
end Paint_composite_mode_t

object Paint_composite_mode_t:
  def fromRaw(raw: hb_paint_composite_mode_t): Paint_composite_mode_t =
    raw match
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_CLEAR =>
        Paint_composite_mode_t.CLEAR
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_SRC =>
        Paint_composite_mode_t.SRC
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_DEST =>
        Paint_composite_mode_t.DEST
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_SRC_OVER =>
        Paint_composite_mode_t.SRC_OVER
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_DEST_OVER =>
        Paint_composite_mode_t.DEST_OVER
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_SRC_IN =>
        Paint_composite_mode_t.SRC_IN
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_DEST_IN =>
        Paint_composite_mode_t.DEST_IN
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_SRC_OUT =>
        Paint_composite_mode_t.SRC_OUT
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_DEST_OUT =>
        Paint_composite_mode_t.DEST_OUT
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_SRC_ATOP =>
        Paint_composite_mode_t.SRC_ATOP
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_DEST_ATOP =>
        Paint_composite_mode_t.DEST_ATOP
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_XOR =>
        Paint_composite_mode_t.XOR
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_PLUS =>
        Paint_composite_mode_t.PLUS
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_SCREEN =>
        Paint_composite_mode_t.SCREEN
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_OVERLAY =>
        Paint_composite_mode_t.OVERLAY
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_DARKEN =>
        Paint_composite_mode_t.DARKEN
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_LIGHTEN =>
        Paint_composite_mode_t.LIGHTEN
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_COLOR_DODGE =>
        Paint_composite_mode_t.COLOR_DODGE
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_COLOR_BURN =>
        Paint_composite_mode_t.COLOR_BURN
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_HARD_LIGHT =>
        Paint_composite_mode_t.HARD_LIGHT
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_SOFT_LIGHT =>
        Paint_composite_mode_t.SOFT_LIGHT
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_DIFFERENCE =>
        Paint_composite_mode_t.DIFFERENCE
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_EXCLUSION =>
        Paint_composite_mode_t.EXCLUSION
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_MULTIPLY =>
        Paint_composite_mode_t.MULTIPLY
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_HSL_HUE =>
        Paint_composite_mode_t.HSL_HUE
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_HSL_SATURATION =>
        Paint_composite_mode_t.HSL_SATURATION
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_HSL_COLOR =>
        Paint_composite_mode_t.HSL_COLOR
      case hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_HSL_LUMINOSITY =>
        Paint_composite_mode_t.HSL_LUMINOSITY
  end fromRaw
end Paint_composite_mode_t
