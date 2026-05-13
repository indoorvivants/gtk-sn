package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.GdkScrollDirection

/** Specifies the direction for scroll events.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ScrollDirection(val raw: GdkScrollDirection):
  /** the surface is scrolled up.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UP extends ScrollDirection(GdkScrollDirection.GDK_SCROLL_UP)

  /** the surface is scrolled down.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DOWN extends ScrollDirection(GdkScrollDirection.GDK_SCROLL_DOWN)

  /** the surface is scrolled to the left.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LEFT extends ScrollDirection(GdkScrollDirection.GDK_SCROLL_LEFT)

  /** the surface is scrolled to the right.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RIGHT extends ScrollDirection(GdkScrollDirection.GDK_SCROLL_RIGHT)

  /** the scrolling is determined by the delta values in scroll events. See
    * gdk_scroll_event_get_deltas()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
