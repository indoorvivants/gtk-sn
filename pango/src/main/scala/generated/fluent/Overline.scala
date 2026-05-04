package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoOverline

/** The `PangoOverline` enumeration is used to specify whether text should be
  * overlined, and if so, the type of line.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Overline(val raw: PangoOverline):
  /** no overline should be drawn
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends Overline(PangoOverline.PANGO_OVERLINE_NONE)

  /** Draw a single line above the ink extents of the text being underlined.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
