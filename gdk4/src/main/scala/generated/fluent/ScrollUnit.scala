package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkScrollUnit

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Specifies the unit of scroll deltas.
  *
  * When you get %GDK_SCROLL_UNIT_WHEEL, a delta of 1.0 means 1 wheel detent
  * click in the south direction, 2.0 means 2 wheel detent clicks in the south
  * direction... This is the same logic for negative values but in the north
  * direction.
  *
  * If you get %GDK_SCROLL_UNIT_SURFACE, are managing a scrollable view and get
  * a value of 123, you have to scroll 123 surface logical pixels right if it's
  * @delta_x
  *   or down if it's @delta_y. This is the same logic for negative values but
  *   you have to scroll left instead of right if it's @delta_x and up instead
  *   of down if it's @delta_y.
  *
  * 1 surface logical pixel is equal to 1 real screen pixel multiplied by the
  * final scale factor of your graphical interface (the product of the desktop
  * scale factor and eventually a custom scale factor in your app).
  */
enum ScrollUnit(val raw: GdkScrollUnit):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The delta is in number of wheel clicks.
    */
  case WHEEL extends ScrollUnit(GdkScrollUnit.GDK_SCROLL_UNIT_WHEEL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The delta is in surface pixels to scroll directly on screen.
    */
  case SURFACE extends ScrollUnit(GdkScrollUnit.GDK_SCROLL_UNIT_SURFACE)
end ScrollUnit

object ScrollUnit:
  def fromRaw(raw: GdkScrollUnit): ScrollUnit =
    raw match
      case GdkScrollUnit.GDK_SCROLL_UNIT_WHEEL   => ScrollUnit.WHEEL
      case GdkScrollUnit.GDK_SCROLL_UNIT_SURFACE => ScrollUnit.SURFACE
  end fromRaw
end ScrollUnit
