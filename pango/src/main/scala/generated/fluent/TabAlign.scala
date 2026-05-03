package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoTabAlign

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `PangoTabAlign` specifies where the text appears relative to the tab stop
  * position.
  */
enum TabAlign(val raw: PangoTabAlign):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the text appears to the right of the tab stop position
    */
  case LEFT extends TabAlign(PangoTabAlign.PANGO_TAB_LEFT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the text appears to the left of the tab stop position until the available
    * space is filled. Since: 1.50
    */
  case RIGHT extends TabAlign(PangoTabAlign.PANGO_TAB_RIGHT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the text is centered at the tab stop position until the available space is
    * filled. Since: 1.50
    */
  case CENTER extends TabAlign(PangoTabAlign.PANGO_TAB_CENTER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * text before the first occurrence of the decimal point character appears to
    * the left of the tab stop position (until the available space is filled),
    * the rest to the right. Since: 1.50
    */
  case DECIMAL extends TabAlign(PangoTabAlign.PANGO_TAB_DECIMAL)
end TabAlign

object TabAlign:
  def fromRaw(raw: PangoTabAlign): TabAlign =
    raw match
      case PangoTabAlign.PANGO_TAB_LEFT    => TabAlign.LEFT
      case PangoTabAlign.PANGO_TAB_RIGHT   => TabAlign.RIGHT
      case PangoTabAlign.PANGO_TAB_CENTER  => TabAlign.CENTER
      case PangoTabAlign.PANGO_TAB_DECIMAL => TabAlign.DECIMAL
  end fromRaw
end TabAlign
