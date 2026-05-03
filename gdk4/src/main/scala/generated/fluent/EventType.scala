package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkEventType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Specifies the type of the event.
  */
enum EventType(val raw: GdkEventType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the window manager has requested that the toplevel surface be hidden or
    * destroyed, usually when the user clicks on a special icon in the title
    * bar.
    */
  case DELETE extends EventType(GdkEventType.GDK_DELETE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the pointer (usually a mouse) has moved.
    */
  case MOTION_NOTIFY extends EventType(GdkEventType.GDK_MOTION_NOTIFY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a mouse button has been pressed.
    */
  case BUTTON_PRESS extends EventType(GdkEventType.GDK_BUTTON_PRESS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a mouse button has been released.
    */
  case BUTTON_RELEASE extends EventType(GdkEventType.GDK_BUTTON_RELEASE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a key has been pressed.
    */
  case KEY_PRESS extends EventType(GdkEventType.GDK_KEY_PRESS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a key has been released.
    */
  case KEY_RELEASE extends EventType(GdkEventType.GDK_KEY_RELEASE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the pointer has entered the surface.
    */
  case ENTER_NOTIFY extends EventType(GdkEventType.GDK_ENTER_NOTIFY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the pointer has left the surface.
    */
  case LEAVE_NOTIFY extends EventType(GdkEventType.GDK_LEAVE_NOTIFY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the keyboard focus has entered or left the surface.
    */
  case FOCUS_CHANGE extends EventType(GdkEventType.GDK_FOCUS_CHANGE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * an input device has moved into contact with a sensing surface (e.g. a
    * touchscreen or graphics tablet).
    */
  case PROXIMITY_IN extends EventType(GdkEventType.GDK_PROXIMITY_IN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * an input device has moved out of contact with a sensing surface.
    */
  case PROXIMITY_OUT extends EventType(GdkEventType.GDK_PROXIMITY_OUT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the mouse has entered the surface while a drag is in progress.
    */
  case DRAG_ENTER extends EventType(GdkEventType.GDK_DRAG_ENTER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the mouse has left the surface while a drag is in progress.
    */
  case DRAG_LEAVE extends EventType(GdkEventType.GDK_DRAG_LEAVE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the mouse has moved in the surface while a drag is in progress.
    */
  case DRAG_MOTION extends EventType(GdkEventType.GDK_DRAG_MOTION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a drop operation onto the surface has started.
    */
  case DROP_START extends EventType(GdkEventType.GDK_DROP_START)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the scroll wheel was turned
    */
  case SCROLL extends EventType(GdkEventType.GDK_SCROLL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a pointer or keyboard grab was broken.
    */
  case GRAB_BROKEN extends EventType(GdkEventType.GDK_GRAB_BROKEN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A new touch event sequence has just started.
    */
  case TOUCH_BEGIN extends EventType(GdkEventType.GDK_TOUCH_BEGIN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A touch event sequence has been updated.
    */
  case TOUCH_UPDATE extends EventType(GdkEventType.GDK_TOUCH_UPDATE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A touch event sequence has finished.
    */
  case TOUCH_END extends EventType(GdkEventType.GDK_TOUCH_END)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A touch event sequence has been canceled.
    */
  case TOUCH_CANCEL extends EventType(GdkEventType.GDK_TOUCH_CANCEL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A touchpad swipe gesture event, the current state is determined by its
    * phase field.
    */
  case TOUCHPAD_SWIPE extends EventType(GdkEventType.GDK_TOUCHPAD_SWIPE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A touchpad pinch gesture event, the current state is determined by its
    * phase field.
    */
  case TOUCHPAD_PINCH extends EventType(GdkEventType.GDK_TOUCHPAD_PINCH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A tablet pad button press event.
    */
  case PAD_BUTTON_PRESS extends EventType(GdkEventType.GDK_PAD_BUTTON_PRESS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A tablet pad button release event.
    */
  case PAD_BUTTON_RELEASE extends EventType(GdkEventType.GDK_PAD_BUTTON_RELEASE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A tablet pad axis event from a "ring".
    */
  case PAD_RING extends EventType(GdkEventType.GDK_PAD_RING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A tablet pad axis event from a "strip".
    */
  case PAD_STRIP extends EventType(GdkEventType.GDK_PAD_STRIP)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A tablet pad group mode change.
    */
  case PAD_GROUP_MODE extends EventType(GdkEventType.GDK_PAD_GROUP_MODE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A touchpad hold gesture event, the current state is determined by its
    * phase field. Since: 4.6
    */
  case TOUCHPAD_HOLD extends EventType(GdkEventType.GDK_TOUCHPAD_HOLD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * marks the end of the GdkEventType enumeration.
    */
  case EVENT_LAST extends EventType(GdkEventType.GDK_EVENT_LAST)
end EventType

object EventType:
  def fromRaw(raw: GdkEventType): EventType =
    raw match
      case GdkEventType.GDK_DELETE             => EventType.DELETE
      case GdkEventType.GDK_MOTION_NOTIFY      => EventType.MOTION_NOTIFY
      case GdkEventType.GDK_BUTTON_PRESS       => EventType.BUTTON_PRESS
      case GdkEventType.GDK_BUTTON_RELEASE     => EventType.BUTTON_RELEASE
      case GdkEventType.GDK_KEY_PRESS          => EventType.KEY_PRESS
      case GdkEventType.GDK_KEY_RELEASE        => EventType.KEY_RELEASE
      case GdkEventType.GDK_ENTER_NOTIFY       => EventType.ENTER_NOTIFY
      case GdkEventType.GDK_LEAVE_NOTIFY       => EventType.LEAVE_NOTIFY
      case GdkEventType.GDK_FOCUS_CHANGE       => EventType.FOCUS_CHANGE
      case GdkEventType.GDK_PROXIMITY_IN       => EventType.PROXIMITY_IN
      case GdkEventType.GDK_PROXIMITY_OUT      => EventType.PROXIMITY_OUT
      case GdkEventType.GDK_DRAG_ENTER         => EventType.DRAG_ENTER
      case GdkEventType.GDK_DRAG_LEAVE         => EventType.DRAG_LEAVE
      case GdkEventType.GDK_DRAG_MOTION        => EventType.DRAG_MOTION
      case GdkEventType.GDK_DROP_START         => EventType.DROP_START
      case GdkEventType.GDK_SCROLL             => EventType.SCROLL
      case GdkEventType.GDK_GRAB_BROKEN        => EventType.GRAB_BROKEN
      case GdkEventType.GDK_TOUCH_BEGIN        => EventType.TOUCH_BEGIN
      case GdkEventType.GDK_TOUCH_UPDATE       => EventType.TOUCH_UPDATE
      case GdkEventType.GDK_TOUCH_END          => EventType.TOUCH_END
      case GdkEventType.GDK_TOUCH_CANCEL       => EventType.TOUCH_CANCEL
      case GdkEventType.GDK_TOUCHPAD_SWIPE     => EventType.TOUCHPAD_SWIPE
      case GdkEventType.GDK_TOUCHPAD_PINCH     => EventType.TOUCHPAD_PINCH
      case GdkEventType.GDK_PAD_BUTTON_PRESS   => EventType.PAD_BUTTON_PRESS
      case GdkEventType.GDK_PAD_BUTTON_RELEASE => EventType.PAD_BUTTON_RELEASE
      case GdkEventType.GDK_PAD_RING           => EventType.PAD_RING
      case GdkEventType.GDK_PAD_STRIP          => EventType.PAD_STRIP
      case GdkEventType.GDK_PAD_GROUP_MODE     => EventType.PAD_GROUP_MODE
      case GdkEventType.GDK_TOUCHPAD_HOLD      => EventType.TOUCHPAD_HOLD
      case GdkEventType.GDK_EVENT_LAST         => EventType.EVENT_LAST
  end fromRaw
end EventType
