package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
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
class GestureZoom private[gnome] (raw: Ptr[GtkGestureZoom])
    extends Gesture(raw.asInstanceOf):

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
  def getScaleDelta(): Double /* None */ =
    gtk_gesture_zoom_get_scale_delta(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGestureZoom]]
    )
  end getScaleDelta

  /** Emitted whenever the distance between both tracked sequences changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal scale-changed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onScaleChanged = ???

end GestureZoom

object GestureZoom:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkGestureZoom])(using Runtime) =
    summon[Runtime].getOrCreate[GestureZoom](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new GestureZoom(ptr)
    )

  /** Returns a newly created `GtkGesture` that recognizes pinch/zoom gestures.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): GestureZoom =
    val raw: Ptr[Byte] = gtk_gesture_zoom_new().asInstanceOf
    summon[Runtime].getOrCreate[GestureZoom](
      raw,
      r => GestureZoom.applyUnsafe(r.asInstanceOf)
    )
  end apply
end GestureZoom
