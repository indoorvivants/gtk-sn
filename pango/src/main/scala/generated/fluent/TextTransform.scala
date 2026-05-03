package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoTextTransform

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An enumeration that affects how Pango treats characters during shaping.
  */
enum TextTransform(val raw: PangoTextTransform):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Leave text unchanged
    */
  case NONE extends TextTransform(PangoTextTransform.PANGO_TEXT_TRANSFORM_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Display letters and numbers as lowercase
    */
  case LOWERCASE
      extends TextTransform(PangoTextTransform.PANGO_TEXT_TRANSFORM_LOWERCASE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Display letters and numbers as uppercase
    */
  case UPPERCASE
      extends TextTransform(PangoTextTransform.PANGO_TEXT_TRANSFORM_UPPERCASE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Display the first character of a word in titlecase
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
