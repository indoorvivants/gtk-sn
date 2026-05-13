package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.GdkEventType

/** Specifies the type of the event.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum EventType(val raw: GdkEventType):
  /** the window manager has requested that the toplevel surface be hidden or
    * destroyed, usually when the user clicks on a special icon in the title
    * bar.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DELETE extends EventType(GdkEventType.GDK_DELETE)

  /** the pointer (usually a mouse) has moved.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MOTION_NOTIFY extends EventType(GdkEventType.GDK_MOTION_NOTIFY)

  /** a mouse button has been pressed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BUTTON_PRESS extends EventType(GdkEventType.GDK_BUTTON_PRESS)

  /** a mouse button has been released.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BUTTON_RELEASE extends EventType(GdkEventType.GDK_BUTTON_RELEASE)

  /** a key has been pressed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KEY_PRESS extends EventType(GdkEventType.GDK_KEY_PRESS)

  /** a key has been released.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KEY_RELEASE extends EventType(GdkEventType.GDK_KEY_RELEASE)

  /** the pointer has entered the surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ENTER_NOTIFY extends EventType(GdkEventType.GDK_ENTER_NOTIFY)

  /** the pointer has left the surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LEAVE_NOTIFY extends EventType(GdkEventType.GDK_LEAVE_NOTIFY)

  /** the keyboard focus has entered or left the surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FOCUS_CHANGE extends EventType(GdkEventType.GDK_FOCUS_CHANGE)

  /** an input device has moved into contact with a sensing surface (e.g. a
    * touchscreen or graphics tablet).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PROXIMITY_IN extends EventType(GdkEventType.GDK_PROXIMITY_IN)

  /** an input device has moved out of contact with a sensing surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PROXIMITY_OUT extends EventType(GdkEventType.GDK_PROXIMITY_OUT)

  /** the mouse has entered the surface while a drag is in progress.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DRAG_ENTER extends EventType(GdkEventType.GDK_DRAG_ENTER)

  /** the mouse has left the surface while a drag is in progress.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DRAG_LEAVE extends EventType(GdkEventType.GDK_DRAG_LEAVE)

  /** the mouse has moved in the surface while a drag is in progress.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DRAG_MOTION extends EventType(GdkEventType.GDK_DRAG_MOTION)

  /** a drop operation onto the surface has started.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DROP_START extends EventType(GdkEventType.GDK_DROP_START)

  /** the scroll wheel was turned
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SCROLL extends EventType(GdkEventType.GDK_SCROLL)

  /** a pointer or keyboard grab was broken.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GRAB_BROKEN extends EventType(GdkEventType.GDK_GRAB_BROKEN)

  /** A new touch event sequence has just started.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOUCH_BEGIN extends EventType(GdkEventType.GDK_TOUCH_BEGIN)

  /** A touch event sequence has been updated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOUCH_UPDATE extends EventType(GdkEventType.GDK_TOUCH_UPDATE)

  /** A touch event sequence has finished.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOUCH_END extends EventType(GdkEventType.GDK_TOUCH_END)

  /** A touch event sequence has been canceled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOUCH_CANCEL extends EventType(GdkEventType.GDK_TOUCH_CANCEL)

  /** A touchpad swipe gesture event, the current state is determined by its
    * phase field.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOUCHPAD_SWIPE extends EventType(GdkEventType.GDK_TOUCHPAD_SWIPE)

  /** A touchpad pinch gesture event, the current state is determined by its
    * phase field.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOUCHPAD_PINCH extends EventType(GdkEventType.GDK_TOUCHPAD_PINCH)

  /** A tablet pad button press event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PAD_BUTTON_PRESS extends EventType(GdkEventType.GDK_PAD_BUTTON_PRESS)

  /** A tablet pad button release event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PAD_BUTTON_RELEASE extends EventType(GdkEventType.GDK_PAD_BUTTON_RELEASE)

  /** A tablet pad axis event from a "ring".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PAD_RING extends EventType(GdkEventType.GDK_PAD_RING)

  /** A tablet pad axis event from a "strip".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PAD_STRIP extends EventType(GdkEventType.GDK_PAD_STRIP)

  /** A tablet pad group mode change.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PAD_GROUP_MODE extends EventType(GdkEventType.GDK_PAD_GROUP_MODE)

  /** A touchpad hold gesture event, the current state is determined by its
    * phase field. Since: 4.6
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOUCHPAD_HOLD extends EventType(GdkEventType.GDK_TOUCHPAD_HOLD)

  /** marks the end of the GdkEventType enumeration.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
