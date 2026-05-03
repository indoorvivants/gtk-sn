package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.GskMaskMode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The mask modes available for mask nodes.
  */
enum MaskMode(val raw: GskMaskMode):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Use the alpha channel of the mask
    */
  case ALPHA extends MaskMode(GskMaskMode.GSK_MASK_MODE_ALPHA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Use the inverted alpha channel of the mask
    */
  case INVERTED_ALPHA extends MaskMode(GskMaskMode.GSK_MASK_MODE_INVERTED_ALPHA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Use the luminance of the mask, multiplied by mask alpha
    */
  case LUMINANCE extends MaskMode(GskMaskMode.GSK_MASK_MODE_LUMINANCE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Use the inverted luminance of the mask, multiplied by mask alpha
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
