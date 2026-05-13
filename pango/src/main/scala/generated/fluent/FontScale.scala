package sn.gnome.pango

import _root_.sn.gnome.pango.internal.PangoFontScale

/** An enumeration that affects font sizes for superscript and subscript
  * positioning and for (emulated) Small Caps.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum FontScale(val raw: PangoFontScale):
  /** Leave the font size unchanged
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends FontScale(PangoFontScale.PANGO_FONT_SCALE_NONE)

  /** Change the font to a size suitable for superscripts
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SUPERSCRIPT
      extends FontScale(PangoFontScale.PANGO_FONT_SCALE_SUPERSCRIPT)

  /** Change the font to a size suitable for subscripts
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SUBSCRIPT extends FontScale(PangoFontScale.PANGO_FONT_SCALE_SUBSCRIPT)

  /** Change the font to a size suitable for Small Caps
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SMALL_CAPS extends FontScale(PangoFontScale.PANGO_FONT_SCALE_SMALL_CAPS)
end FontScale

object FontScale:
  def fromRaw(raw: PangoFontScale): FontScale =
    raw match
      case PangoFontScale.PANGO_FONT_SCALE_NONE        => FontScale.NONE
      case PangoFontScale.PANGO_FONT_SCALE_SUPERSCRIPT => FontScale.SUPERSCRIPT
      case PangoFontScale.PANGO_FONT_SCALE_SUBSCRIPT   => FontScale.SUBSCRIPT
      case PangoFontScale.PANGO_FONT_SCALE_SMALL_CAPS  => FontScale.SMALL_CAPS
  end fromRaw
end FontScale
