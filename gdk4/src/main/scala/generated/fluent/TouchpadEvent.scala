package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.{Event, TouchpadGesturePhase}
import sn.gnome.gdk4.internal.GdkTouchpadEvent
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.runtime.*

/** An event related to a gesture on a touchpad device.
  *
  * Unlike touchscreens, where the windowing system sends basic sequences of
  * begin, update, end events, and leaves gesture recognition to the clients,
  * touchpad gestures are typically processed by the system, resulting in these
  * events.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TouchpadEvent private[gnome] (raw: Ptr[GdkTouchpadEvent])
    extends Event(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Extracts delta information from a touchpad event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_deltas]: Method get_deltas contains an OUT parameter, which is not supported yet"
  )
  private def getDeltas__ = ???

  /** Extracts the touchpad gesture phase from a touchpad event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getGesturePhase(): sn.gnome.gdk4.TouchpadGesturePhase /* None */ =
    sn.gnome.gdk4.TouchpadGesturePhase.fromRaw(
      gdk_touchpad_event_get_gesture_phase(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkEvent]]
      )
    )
  end getGesturePhase

  /** Extracts the number of fingers from a touchpad event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNFingers(): UInt /* None */ =
    gdk_touchpad_event_get_n_fingers(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkEvent]]
    ).value
  end getNFingers

  /** Extracts the angle delta from a touchpad pinch event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPinchAngleDelta(): Double /* None */ =
    gdk_touchpad_event_get_pinch_angle_delta(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkEvent]]
    )
  end getPinchAngleDelta

  /** Extracts the scale from a touchpad pinch event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPinchScale(): Double /* None */ =
    gdk_touchpad_event_get_pinch_scale(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkEvent]]
    )
  end getPinchScale

end TouchpadEvent

object TouchpadEvent:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkTouchpadEvent])(using Runtime) =
    summon[Runtime].getOrCreate[TouchpadEvent](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new TouchpadEvent(ptr)
    )

end TouchpadEvent
