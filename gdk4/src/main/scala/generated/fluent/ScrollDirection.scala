package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkScrollDirection

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Specifies the direction for scroll events.
  */
enum ScrollDirection(val raw: GdkScrollDirection):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the surface is scrolled up.
    */
  case UP extends ScrollDirection(GdkScrollDirection.GDK_SCROLL_UP)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the surface is scrolled down.
    */
  case DOWN extends ScrollDirection(GdkScrollDirection.GDK_SCROLL_DOWN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the surface is scrolled to the left.
    */
  case LEFT extends ScrollDirection(GdkScrollDirection.GDK_SCROLL_LEFT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the surface is scrolled to the right.
    */
  case RIGHT extends ScrollDirection(GdkScrollDirection.GDK_SCROLL_RIGHT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the scrolling is determined by the delta values in scroll events. See
    * gdk_scroll_event_get_deltas()
    */
  case SMOOTH extends ScrollDirection(GdkScrollDirection.GDK_SCROLL_SMOOTH)
end ScrollDirection

object ScrollDirection:
  def fromRaw(raw: GdkScrollDirection): ScrollDirection =
    raw match
      case GdkScrollDirection.GDK_SCROLL_UP     => ScrollDirection.UP
      case GdkScrollDirection.GDK_SCROLL_DOWN   => ScrollDirection.DOWN
      case GdkScrollDirection.GDK_SCROLL_LEFT   => ScrollDirection.LEFT
      case GdkScrollDirection.GDK_SCROLL_RIGHT  => ScrollDirection.RIGHT
      case GdkScrollDirection.GDK_SCROLL_SMOOTH => ScrollDirection.SMOOTH
  end fromRaw
end ScrollDirection
