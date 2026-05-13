package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.GskMaskMode

/** The mask modes available for mask nodes.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum MaskMode(val raw: GskMaskMode):
  /** Use the alpha channel of the mask
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ALPHA extends MaskMode(GskMaskMode.GSK_MASK_MODE_ALPHA)

  /** Use the inverted alpha channel of the mask
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVERTED_ALPHA extends MaskMode(GskMaskMode.GSK_MASK_MODE_INVERTED_ALPHA)

  /** Use the luminance of the mask, multiplied by mask alpha
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LUMINANCE extends MaskMode(GskMaskMode.GSK_MASK_MODE_LUMINANCE)

  /** Use the inverted luminance of the mask, multiplied by mask alpha
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVERTED_LUMINANCE
      extends MaskMode(GskMaskMode.GSK_MASK_MODE_INVERTED_LUMINANCE)
end MaskMode

object MaskMode:
  def fromRaw(raw: GskMaskMode): MaskMode =
    raw match
      case GskMaskMode.GSK_MASK_MODE_ALPHA          => MaskMode.ALPHA
      case GskMaskMode.GSK_MASK_MODE_INVERTED_ALPHA => MaskMode.INVERTED_ALPHA
      case GskMaskMode.GSK_MASK_MODE_LUMINANCE      => MaskMode.LUMINANCE
      case GskMaskMode.GSK_MASK_MODE_INVERTED_LUMINANCE =>
        MaskMode.INVERTED_LUMINANCE
  end fromRaw
end MaskMode
