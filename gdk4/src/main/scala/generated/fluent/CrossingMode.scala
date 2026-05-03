package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkCrossingMode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Specifies the crossing mode for enter and leave events.
  */
enum CrossingMode(val raw: GdkCrossingMode):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * crossing because of pointer motion.
    */
  case NORMAL extends CrossingMode(GdkCrossingMode.GDK_CROSSING_NORMAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * crossing because a grab is activated.
    */
  case GRAB extends CrossingMode(GdkCrossingMode.GDK_CROSSING_GRAB)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * crossing because a grab is deactivated.
    */
  case UNGRAB extends CrossingMode(GdkCrossingMode.GDK_CROSSING_UNGRAB)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * crossing because a GTK grab is activated.
    */
  case GTK_GRAB extends CrossingMode(GdkCrossingMode.GDK_CROSSING_GTK_GRAB)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * crossing because a GTK grab is deactivated.
    */
  case GTK_UNGRAB extends CrossingMode(GdkCrossingMode.GDK_CROSSING_GTK_UNGRAB)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * crossing because a GTK widget changed state (e.g. sensitivity).
    */
  case STATE_CHANGED
      extends CrossingMode(GdkCrossingMode.GDK_CROSSING_STATE_CHANGED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * crossing because a touch sequence has begun, this event is synthetic as
    * the pointer might have not left the surface.
    */
  case TOUCH_BEGIN
      extends CrossingMode(GdkCrossingMode.GDK_CROSSING_TOUCH_BEGIN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * crossing because a touch sequence has ended, this event is synthetic as
    * the pointer might have not left the surface.
    */
  case TOUCH_END extends CrossingMode(GdkCrossingMode.GDK_CROSSING_TOUCH_END)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * crossing because of a device switch (i.e. a mouse taking control of the
    * pointer after a touch device), this event is synthetic as the pointer
    * didn’t leave the surface.
    */
  case DEVICE_SWITCH
      extends CrossingMode(GdkCrossingMode.GDK_CROSSING_DEVICE_SWITCH)
end CrossingMode

object CrossingMode:
  def fromRaw(raw: GdkCrossingMode): CrossingMode =
    raw match
      case GdkCrossingMode.GDK_CROSSING_NORMAL        => CrossingMode.NORMAL
      case GdkCrossingMode.GDK_CROSSING_GRAB          => CrossingMode.GRAB
      case GdkCrossingMode.GDK_CROSSING_UNGRAB        => CrossingMode.UNGRAB
      case GdkCrossingMode.GDK_CROSSING_GTK_GRAB      => CrossingMode.GTK_GRAB
      case GdkCrossingMode.GDK_CROSSING_GTK_UNGRAB    => CrossingMode.GTK_UNGRAB
      case GdkCrossingMode.GDK_CROSSING_STATE_CHANGED =>
        CrossingMode.STATE_CHANGED
      case GdkCrossingMode.GDK_CROSSING_TOUCH_BEGIN => CrossingMode.TOUCH_BEGIN
      case GdkCrossingMode.GDK_CROSSING_TOUCH_END   => CrossingMode.TOUCH_END
      case GdkCrossingMode.GDK_CROSSING_DEVICE_SWITCH =>
        CrossingMode.DEVICE_SWITCH
  end fromRaw
end CrossingMode
