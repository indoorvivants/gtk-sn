package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.GskBlendMode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The blend modes available for render nodes.
  *
  * The implementation of each blend mode is deferred to the rendering pipeline.
  *
  * See <https://www.w3.org/TR/compositing-1/#blending> for more information on
  * blending and blend modes.
  */
enum BlendMode(val raw: GskBlendMode):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The default blend mode, which specifies no blending
    */
  case DEFAULT extends BlendMode(GskBlendMode.GSK_BLEND_MODE_DEFAULT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The source color is multiplied by the destination and replaces the
    * destination
    */
  case MULTIPLY extends BlendMode(GskBlendMode.GSK_BLEND_MODE_MULTIPLY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Multiplies the complements of the destination and source color values,
    * then complements the result.
    */
  case SCREEN extends BlendMode(GskBlendMode.GSK_BLEND_MODE_SCREEN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Multiplies or screens the colors, depending on the destination color
    * value. This is the inverse of hard-list
    */
  case OVERLAY extends BlendMode(GskBlendMode.GSK_BLEND_MODE_OVERLAY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects the darker of the destination and source colors
    */
  case DARKEN extends BlendMode(GskBlendMode.GSK_BLEND_MODE_DARKEN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects the lighter of the destination and source colors
    */
  case LIGHTEN extends BlendMode(GskBlendMode.GSK_BLEND_MODE_LIGHTEN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Brightens the destination color to reflect the source color
    */
  case COLOR_DODGE extends BlendMode(GskBlendMode.GSK_BLEND_MODE_COLOR_DODGE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Darkens the destination color to reflect the source color
    */
  case COLOR_BURN extends BlendMode(GskBlendMode.GSK_BLEND_MODE_COLOR_BURN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Multiplies or screens the colors, depending on the source color value
    */
  case HARD_LIGHT extends BlendMode(GskBlendMode.GSK_BLEND_MODE_HARD_LIGHT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Darkens or lightens the colors, depending on the source color value
    */
  case SOFT_LIGHT extends BlendMode(GskBlendMode.GSK_BLEND_MODE_SOFT_LIGHT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Subtracts the darker of the two constituent colors from the lighter color
    */
  case DIFFERENCE extends BlendMode(GskBlendMode.GSK_BLEND_MODE_DIFFERENCE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Produces an effect similar to that of the difference mode but lower in
    * contrast
    */
  case EXCLUSION extends BlendMode(GskBlendMode.GSK_BLEND_MODE_EXCLUSION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a color with the hue and saturation of the source color and the
    * luminosity of the destination color
    */
  case COLOR extends BlendMode(GskBlendMode.GSK_BLEND_MODE_COLOR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a color with the hue of the source color and the saturation and
    * luminosity of the destination color
    */
  case HUE extends BlendMode(GskBlendMode.GSK_BLEND_MODE_HUE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a color with the saturation of the source color and the hue and
    * luminosity of the destination color
    */
  case SATURATION extends BlendMode(GskBlendMode.GSK_BLEND_MODE_SATURATION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a color with the luminosity of the source color and the hue and
    * saturation of the destination color
    */
  case LUMINOSITY extends BlendMode(GskBlendMode.GSK_BLEND_MODE_LUMINOSITY)
end BlendMode

object BlendMode:
  def fromRaw(raw: GskBlendMode): BlendMode =
    raw match
      case GskBlendMode.GSK_BLEND_MODE_DEFAULT     => BlendMode.DEFAULT
      case GskBlendMode.GSK_BLEND_MODE_MULTIPLY    => BlendMode.MULTIPLY
      case GskBlendMode.GSK_BLEND_MODE_SCREEN      => BlendMode.SCREEN
      case GskBlendMode.GSK_BLEND_MODE_OVERLAY     => BlendMode.OVERLAY
      case GskBlendMode.GSK_BLEND_MODE_DARKEN      => BlendMode.DARKEN
      case GskBlendMode.GSK_BLEND_MODE_LIGHTEN     => BlendMode.LIGHTEN
      case GskBlendMode.GSK_BLEND_MODE_COLOR_DODGE => BlendMode.COLOR_DODGE
      case GskBlendMode.GSK_BLEND_MODE_COLOR_BURN  => BlendMode.COLOR_BURN
      case GskBlendMode.GSK_BLEND_MODE_HARD_LIGHT  => BlendMode.HARD_LIGHT
      case GskBlendMode.GSK_BLEND_MODE_SOFT_LIGHT  => BlendMode.SOFT_LIGHT
      case GskBlendMode.GSK_BLEND_MODE_DIFFERENCE  => BlendMode.DIFFERENCE
      case GskBlendMode.GSK_BLEND_MODE_EXCLUSION   => BlendMode.EXCLUSION
      case GskBlendMode.GSK_BLEND_MODE_COLOR       => BlendMode.COLOR
      case GskBlendMode.GSK_BLEND_MODE_HUE         => BlendMode.HUE
      case GskBlendMode.GSK_BLEND_MODE_SATURATION  => BlendMode.SATURATION
      case GskBlendMode.GSK_BLEND_MODE_LUMINOSITY  => BlendMode.LUMINOSITY
  end fromRaw
end BlendMode
