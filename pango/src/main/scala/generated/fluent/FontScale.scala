package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoFontScale

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An enumeration that affects font sizes for superscript and subscript
  * positioning and for (emulated) Small Caps.
  */
enum FontScale(val raw: PangoFontScale):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Leave the font size unchanged
    */
  case NONE extends FontScale(PangoFontScale.PANGO_FONT_SCALE_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Change the font to a size suitable for superscripts
    */
  case SUPERSCRIPT
      extends FontScale(PangoFontScale.PANGO_FONT_SCALE_SUPERSCRIPT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Change the font to a size suitable for subscripts
    */
  case SUBSCRIPT extends FontScale(PangoFontScale.PANGO_FONT_SCALE_SUBSCRIPT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Change the font to a size suitable for Small Caps
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
