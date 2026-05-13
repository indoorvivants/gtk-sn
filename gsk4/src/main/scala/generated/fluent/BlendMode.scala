package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.GskBlendMode

/** The blend modes available for render nodes.
  *
  * The implementation of each blend mode is deferred to the rendering pipeline.
  *
  * See <https://www.w3.org/TR/compositing-1/#blending> for more information on
  * blending and blend modes.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum BlendMode(val raw: GskBlendMode):
  /** The default blend mode, which specifies no blending
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DEFAULT extends BlendMode(GskBlendMode.GSK_BLEND_MODE_DEFAULT)

  /** The source color is multiplied by the destination and replaces the
    * destination
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MULTIPLY extends BlendMode(GskBlendMode.GSK_BLEND_MODE_MULTIPLY)

  /** Multiplies the complements of the destination and source color values,
    * then complements the result.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SCREEN extends BlendMode(GskBlendMode.GSK_BLEND_MODE_SCREEN)

  /** Multiplies or screens the colors, depending on the destination color
    * value. This is the inverse of hard-list
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OVERLAY extends BlendMode(GskBlendMode.GSK_BLEND_MODE_OVERLAY)

  /** Selects the darker of the destination and source colors
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DARKEN extends BlendMode(GskBlendMode.GSK_BLEND_MODE_DARKEN)

  /** Selects the lighter of the destination and source colors
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LIGHTEN extends BlendMode(GskBlendMode.GSK_BLEND_MODE_LIGHTEN)

  /** Brightens the destination color to reflect the source color
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COLOR_DODGE extends BlendMode(GskBlendMode.GSK_BLEND_MODE_COLOR_DODGE)

  /** Darkens the destination color to reflect the source color
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COLOR_BURN extends BlendMode(GskBlendMode.GSK_BLEND_MODE_COLOR_BURN)

  /** Multiplies or screens the colors, depending on the source color value
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HARD_LIGHT extends BlendMode(GskBlendMode.GSK_BLEND_MODE_HARD_LIGHT)

  /** Darkens or lightens the colors, depending on the source color value
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SOFT_LIGHT extends BlendMode(GskBlendMode.GSK_BLEND_MODE_SOFT_LIGHT)

  /** Subtracts the darker of the two constituent colors from the lighter color
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DIFFERENCE extends BlendMode(GskBlendMode.GSK_BLEND_MODE_DIFFERENCE)

  /** Produces an effect similar to that of the difference mode but lower in
    * contrast
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EXCLUSION extends BlendMode(GskBlendMode.GSK_BLEND_MODE_EXCLUSION)

  /** Creates a color with the hue and saturation of the source color and the
    * luminosity of the destination color
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COLOR extends BlendMode(GskBlendMode.GSK_BLEND_MODE_COLOR)

  /** Creates a color with the hue of the source color and the saturation and
    * luminosity of the destination color
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HUE extends BlendMode(GskBlendMode.GSK_BLEND_MODE_HUE)

  /** Creates a color with the saturation of the source color and the hue and
    * luminosity of the destination color
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SATURATION extends BlendMode(GskBlendMode.GSK_BLEND_MODE_SATURATION)

  /** Creates a color with the luminosity of the source color and the hue and
    * saturation of the destination color
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
