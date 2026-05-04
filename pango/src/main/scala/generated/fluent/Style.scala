package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoStyle

/** An enumeration specifying the various slant styles possible for a font.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Style(val raw: PangoStyle):
  /** the font is upright.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NORMAL extends Style(PangoStyle.PANGO_STYLE_NORMAL)

  /** the font is slanted, but in a roman style.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OBLIQUE extends Style(PangoStyle.PANGO_STYLE_OBLIQUE)

  /** the font is slanted in an italic style.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
