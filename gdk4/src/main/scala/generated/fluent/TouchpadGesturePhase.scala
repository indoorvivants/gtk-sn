package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkTouchpadGesturePhase

/** Specifies the current state of a touchpad gesture.
  *
  * All gestures are guaranteed to begin with an event with phase
  * %GDK_TOUCHPAD_GESTURE_PHASE_BEGIN, followed by 0 or several events with
  * phase %GDK_TOUCHPAD_GESTURE_PHASE_UPDATE.
  *
  * A finished gesture may have 2 possible outcomes, an event with phase
  * %GDK_TOUCHPAD_GESTURE_PHASE_END will be emitted when the gesture is
  * considered successful, this should be used as the hint to perform any
  * permanent changes.
  *
  * Cancelled gestures may be so for a variety of reasons, due to hardware or
  * the compositor, or due to the gesture recognition layers hinting the gesture
  * did not finish resolutely (eg. a 3rd finger being added during a pinch
  * gesture). In these cases, the last event will report the phase
  * %GDK_TOUCHPAD_GESTURE_PHASE_CANCEL, this should be used as a hint to undo
  * any visible/permanent changes that were done throughout the progress of the
  * gesture.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum TouchpadGesturePhase(val raw: GdkTouchpadGesturePhase):
  /** The gesture has begun.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BEGIN
      extends TouchpadGesturePhase(
        GdkTouchpadGesturePhase.GDK_TOUCHPAD_GESTURE_PHASE_BEGIN
      )

  /** The gesture has been updated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UPDATE
      extends TouchpadGesturePhase(
        GdkTouchpadGesturePhase.GDK_TOUCHPAD_GESTURE_PHASE_UPDATE
      )

  /** The gesture was finished, changes should be permanently applied.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case END
      extends TouchpadGesturePhase(
        GdkTouchpadGesturePhase.GDK_TOUCHPAD_GESTURE_PHASE_END
      )

  /** The gesture was cancelled, all changes should be undone.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CANCEL
      extends TouchpadGesturePhase(
        GdkTouchpadGesturePhase.GDK_TOUCHPAD_GESTURE_PHASE_CANCEL
      )
end TouchpadGesturePhase

object TouchpadGesturePhase:
  def fromRaw(raw: GdkTouchpadGesturePhase): TouchpadGesturePhase =
    raw match
      case GdkTouchpadGesturePhase.GDK_TOUCHPAD_GESTURE_PHASE_BEGIN =>
        TouchpadGesturePhase.BEGIN
      case GdkTouchpadGesturePhase.GDK_TOUCHPAD_GESTURE_PHASE_UPDATE =>
        TouchpadGesturePhase.UPDATE
      case GdkTouchpadGesturePhase.GDK_TOUCHPAD_GESTURE_PHASE_END =>
        TouchpadGesturePhase.END
      case GdkTouchpadGesturePhase.GDK_TOUCHPAD_GESTURE_PHASE_CANCEL =>
        TouchpadGesturePhase.CANCEL
  end fromRaw
end TouchpadGesturePhase
