package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoStyle

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An enumeration specifying the various slant styles possible for a font.
  */
enum Style(val raw: PangoStyle):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the font is upright.
    */
  case NORMAL extends Style(PangoStyle.PANGO_STYLE_NORMAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the font is slanted, but in a roman style.
    */
  case OBLIQUE extends Style(PangoStyle.PANGO_STYLE_OBLIQUE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the font is slanted in an italic style.
    */
  case ITALIC extends Style(PangoStyle.PANGO_STYLE_ITALIC)
end Style

object Style:
  def fromRaw(raw: PangoStyle): Style =
    raw match
      case PangoStyle.PANGO_STYLE_NORMAL  => Style.NORMAL
      case PangoStyle.PANGO_STYLE_OBLIQUE => Style.OBLIQUE
      case PangoStyle.PANGO_STYLE_ITALIC  => Style.ITALIC
  end fromRaw
end Style
