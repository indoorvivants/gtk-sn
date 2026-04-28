package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkTouchpadEvent
import sn.gnome.gdk4.internal.GdkTouchpadGesturePhase
import sn.gnome.glib.internal.guint

class TouchpadEvent(raw: Ptr[GdkTouchpadEvent]) extends Event(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  // Method get_deltas contains an OUT parameter, which is not supported yet

  def getGesturePhase(): GdkTouchpadGesturePhase =
    gdk_touchpad_event_get_gesture_phase(this.raw.asInstanceOf)

  def getNFingers(): UInt = gdk_touchpad_event_get_n_fingers(
    this.raw.asInstanceOf
  ).value

  def getPinchAngleDelta(): Double = gdk_touchpad_event_get_pinch_angle_delta(
    this.raw.asInstanceOf
  )

  def getPinchScale(): Double = gdk_touchpad_event_get_pinch_scale(
    this.raw.asInstanceOf
  )

end TouchpadEvent
