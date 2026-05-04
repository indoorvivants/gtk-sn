package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Gesture
import sn.gnome.gtk4.internal.GtkGestureZoom

/** `GtkGestureZoom` is a `GtkGesture` for 2-finger pinch/zoom gestures.
  *
  * Whenever the distance between both tracked sequences changes, the
  * [signal@Gtk.GestureZoom::scale-changed] signal is emitted to report the
  * scale factor.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GestureZoom(raw: Ptr[GtkGestureZoom]) extends Gesture(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the scale delta.
    *
    * If @gesture is active, this function returns the zooming difference since
    * the gesture was recognized (hence the starting point is considered 1:1).
    * If @gesture is not active, 1 is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getScaleDelta(): Double /* None */ = gtk_gesture_zoom_get_scale_delta(
    this.raw.asInstanceOf[Ptr[GtkGestureZoom]]
  )

end GestureZoom

object GestureZoom:
  /** Returns a newly created `GtkGesture` that recognizes pinch/zoom gestures.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): GestureZoom = new GestureZoom(
    gtk_gesture_zoom_new().asInstanceOf
  )
end GestureZoom
