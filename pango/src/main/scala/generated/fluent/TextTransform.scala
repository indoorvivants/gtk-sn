package sn.gnome.pango

import _root_.sn.gnome.pango.internal.PangoTextTransform

/** An enumeration that affects how Pango treats characters during shaping.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum TextTransform(val raw: PangoTextTransform):
  /** Leave text unchanged
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends TextTransform(PangoTextTransform.PANGO_TEXT_TRANSFORM_NONE)

  /** Display letters and numbers as lowercase
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LOWERCASE
      extends TextTransform(PangoTextTransform.PANGO_TEXT_TRANSFORM_LOWERCASE)

  /** Display letters and numbers as uppercase
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UPPERCASE
      extends TextTransform(PangoTextTransform.PANGO_TEXT_TRANSFORM_UPPERCASE)

  /** Display the first character of a word in titlecase
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CAPITALIZE
      extends TextTransform(PangoTextTransform.PANGO_TEXT_TRANSFORM_CAPITALIZE)
end TextTransform

object TextTransform:
  def fromRaw(raw: PangoTextTransform): TextTransform =
    raw match
      case PangoTextTransform.PANGO_TEXT_TRANSFORM_NONE => TextTransform.NONE
      case PangoTextTransform.PANGO_TEXT_TRANSFORM_LOWERCASE =>
        TextTransform.LOWERCASE
      case PangoTextTransform.PANGO_TEXT_TRANSFORM_UPPERCASE =>
        TextTransform.UPPERCASE
      case PangoTextTransform.PANGO_TEXT_TRANSFORM_CAPITALIZE =>
        TextTransform.CAPITALIZE
  end fromRaw
end TextTransform
