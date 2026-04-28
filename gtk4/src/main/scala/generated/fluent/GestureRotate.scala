package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Gesture
import sn.gnome.gtk4.internal.GtkGestureRotate

class GestureRotate(raw: Ptr[GtkGestureRotate])
    extends Gesture(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAngleDelta(): Double = gtk_gesture_rotate_get_angle_delta(
    this.raw.asInstanceOf
  )

end GestureRotate

object GestureRotate:
  def apply(): GestureRotate = new GestureRotate(
    gtk_gesture_rotate_new().asInstanceOf
  )
end GestureRotate
