package sn.gnome.harfbuzz.fluent

import _root_.sn.gnome.harfbuzz.internal.hb_paint_composite_mode_t

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The values of this enumeration describe the compositing modes that can be
  * used when combining temporary redirected drawing with the backdrop.
  *
  * See the OpenType spec
  * [COLR](https://learn.microsoft.com/en-us/typography/opentype/spec/colr)
  * section for details.
  */
enum Paint_composite_mode_t(val raw: hb_paint_composite_mode_t):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * clear destination layer (bounded)
    */
  case CLEAR
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_CLEAR
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * replace destination layer (bounded)
    */
  case SRC
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_SRC
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * ignore the source
    */
  case DEST
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_DEST
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * draw source layer on top of destination layer (bounded)
    */
  case SRC_OVER
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_SRC_OVER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * draw destination on top of source
    */
  case DEST_OVER
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_DEST_OVER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * draw source where there was destination content (unbounded)
    */
  case SRC_IN
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_SRC_IN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * leave destination only where there was source content (unbounded)
    */
  case DEST_IN
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_DEST_IN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * draw source where there was no destination content (unbounded)
    */
  case SRC_OUT
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_SRC_OUT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * leave destination only where there was no source content
    */
  case DEST_OUT
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_DEST_OUT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * draw source on top of destination content and only there
    */
  case SRC_ATOP
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_SRC_ATOP
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * leave destination on top of source content and only there (unbounded)
    */
  case DEST_ATOP
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_DEST_ATOP
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * source and destination are shown where there is only one of them
    */
  case XOR
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_XOR
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * source and destination layers are accumulated
    */
  case PLUS
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_PLUS
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * source and destination are complemented and multiplied. This causes the
    * result to be at least as light as the lighter inputs.
    */
  case SCREEN
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_SCREEN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * multiplies or screens, depending on the lightness of the destination
    * color.
    */
  case OVERLAY
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_OVERLAY
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * replaces the destination with the source if it is darker, otherwise keeps
    * the source.
    */
  case DARKEN
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_DARKEN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * replaces the destination with the source if it is lighter, otherwise keeps
    * the source.
    */
  case LIGHTEN
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_LIGHTEN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * brightens the destination color to reflect the source color.
    */
  case COLOR_DODGE
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_COLOR_DODGE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * darkens the destination color to reflect the source color.
    */
  case COLOR_BURN
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_COLOR_BURN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Multiplies or screens, dependent on source color.
    */
  case HARD_LIGHT
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_HARD_LIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Darkens or lightens, dependent on source color.
    */
  case SOFT_LIGHT
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_SOFT_LIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Takes the difference of the source and destination color.
    */
  case DIFFERENCE
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_DIFFERENCE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Produces an effect similar to difference, but with lower contrast.
    */
  case EXCLUSION
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_EXCLUSION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * source and destination layers are multiplied. This causes the result to be
    * at least as dark as the darker inputs.
    */
  case MULTIPLY
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_MULTIPLY
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a color with the hue of the source and the saturation and
    * luminosity of the target.
    */
  case HSL_HUE
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_HSL_HUE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a color with the saturation of the source and the hue and
    * luminosity of the target. Painting with this mode onto a gray area
    * produces no change.
    */
  case HSL_SATURATION
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_HSL_SATURATION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a color with the hue and saturation of the source and the
    * luminosity of the target. This preserves the gray levels of the target and
    * is useful for coloring monochrome images or tinting color images.
    */
  case HSL_COLOR
      extends Paint_composite_mode_t(
        hb_paint_composite_mode_t.HB_PAINT_COMPOSITE_MODE_HSL_COLOR
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a color with the luminosity of the source and the hue and
    * saturation of the target. This produces an inverse effect to @HB_PAINT_COMPOSITE_MODE_HSL_COLOR.
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
