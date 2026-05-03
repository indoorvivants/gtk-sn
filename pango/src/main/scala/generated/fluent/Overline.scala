package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoOverline

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `PangoOverline` enumeration is used to specify whether text should be
  * overlined, and if so, the type of line.
  */
enum Overline(val raw: PangoOverline):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * no overline should be drawn
    */
  case NONE extends Overline(PangoOverline.PANGO_OVERLINE_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Draw a single line above the ink extents of the text being underlined.
    */
  case SINGLE extends Overline(PangoOverline.PANGO_OVERLINE_SINGLE)
end Overline

object Overline:
  def fromRaw(raw: PangoOverline): Overline =
    raw match
      case PangoOverline.PANGO_OVERLINE_NONE   => Overline.NONE
      case PangoOverline.PANGO_OVERLINE_SINGLE => Overline.SINGLE
  end fromRaw
end Overline
