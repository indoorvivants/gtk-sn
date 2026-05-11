package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
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
class GestureRotate private[gnome] (raw: Ptr[GtkGestureRotate])
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
  def getAngleDelta(): Double /* None */ =
    gtk_gesture_rotate_get_angle_delta(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGestureRotate]]
    )
  end getAngleDelta

  /** Emitted when the angle between both tracked points changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal angle-changed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onAngleChanged = ???

end GestureRotate

object GestureRotate:
  def applyUnsafe(ptr: Ptr[GtkGestureRotate])(using Runtime) =
    summon[Runtime].getOrCreate[GestureRotate](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new GestureRotate(ptr)
    )

  /** Returns a newly created `GtkGesture` that recognizes 2-touch rotation
    * gestures.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): GestureRotate =
    val raw: Ptr[Byte] = gtk_gesture_rotate_new().asInstanceOf
    summon[Runtime].getOrCreate[GestureRotate](
      raw,
      r => GestureRotate.applyUnsafe(r.asInstanceOf)
    )
  end apply
end GestureRotate
