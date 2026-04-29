package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkTouchpadEvent
import sn.gnome.gdk4.internal.GdkTouchpadGesturePhase
import sn.gnome.glib.internal.guint

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An event related to a gesture on a touchpad device.
  *
  * Unlike touchscreens, where the windowing system sends basic sequences of
  * begin, update, end events, and leaves gesture recognition to the clients,
  * touchpad gestures are typically processed by the system, resulting in these
  * events.
  */
class TouchpadEvent(raw: Ptr[GdkTouchpadEvent]) extends Event(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extracts delta information from a touchpad event.
    */
  @annotation.compileTimeOnly(
    "Method get_deltas contains an OUT parameter, which is not supported yet"
  )
  def getDeltas(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extracts the touchpad gesture phase from a touchpad event.
    */
  def getGesturePhase(): GdkTouchpadGesturePhase =
    gdk_touchpad_event_get_gesture_phase(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extracts the number of fingers from a touchpad event.
    */
  def getNFingers(): UInt = gdk_touchpad_event_get_n_fingers(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extracts the angle delta from a touchpad pinch event.
    */
  def getPinchAngleDelta(): Double = gdk_touchpad_event_get_pinch_angle_delta(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extracts the scale from a touchpad pinch event.
    */
  def getPinchScale(): Double = gdk_touchpad_event_get_pinch_scale(
    this.raw.asInstanceOf
  )

end TouchpadEvent
