package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Gesture
import sn.gnome.gtk4.internal.GtkGestureRotate

/** `GtkGestureRotate` is a `GtkGesture` for 2-finger rotations.
  *
  * Whenever the angle between both handled sequences changes, the
  * [signal@Gtk.GestureRotate::angle-changed] signal is emitted.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GestureRotate(raw: Ptr[GtkGestureRotate])
    extends Gesture(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the angle delta in radians.
    *
    * If @gesture is active, this function returns the angle difference in
    * radians since the gesture was first recognized. If @gesture is not active,
    * 0 is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAngleDelta(): Double /* None */ = gtk_gesture_rotate_get_angle_delta(
    this.raw.asInstanceOf[Ptr[GtkGestureRotate]]
  )

end GestureRotate

object GestureRotate:
  /** Returns a newly created `GtkGesture` that recognizes 2-touch rotation
    * gestures.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): GestureRotate = new GestureRotate(
    gtk_gesture_rotate_new().asInstanceOf
  )
end GestureRotate
