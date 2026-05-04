package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.GestureSingle
import sn.gnome.gtk4.internal.GtkGestureSwipe

/** `GtkGestureSwipe` is a `GtkGesture` for swipe gestures.
  *
  * After a press/move/.../move/release sequence happens, the
  * [signal@Gtk.GestureSwipe::swipe] signal will be emitted, providing the
  * velocity and directionality of the sequence at the time it was lifted.
  *
  * If the velocity is desired in intermediate points,
  * [method@Gtk.GestureSwipe.get_velocity] can be called in a
  * [signal@Gtk.Gesture::update] handler.
  *
  * All velocities are reported in pixels/sec units.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GestureSwipe(raw: Ptr[GtkGestureSwipe])
    extends GestureSingle(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the current velocity.
    *
    * If the gesture is recognized, this function returns %TRUE and fills in @velocity_x
    * and @velocity_y with the recorded velocity, as per the last events
    * processed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_velocity]: Method get_velocity contains an OUT parameter, which is not supported yet"
  )
  private def getVelocity__ = ???

end GestureSwipe

object GestureSwipe:
  /** Returns a newly created `GtkGesture` that recognizes swipes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): GestureSwipe = new GestureSwipe(
    gtk_gesture_swipe_new().asInstanceOf
  )
end GestureSwipe
