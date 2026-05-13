package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{GestureDrag, Orientation}
import sn.gnome.gtk4.internal.GtkGesturePan

/** `GtkGesturePan` is a `GtkGesture` for pan gestures.
  *
  * These are drags that are locked to happen along one axis. The axis that a
  * `GtkGesturePan` handles is defined at construct time, and can be changed
  * through [method@Gtk.GesturePan.set_orientation].
  *
  * When the gesture starts to be recognized, `GtkGesturePan` will attempt to
  * determine as early as possible whether the sequence is moving in the
  * expected direction, and denying the sequence if this does not happen.
  *
  * Once a panning gesture along the expected axis is recognized, the
  * [signal@Gtk.GesturePan::pan] signal will be emitted as input events are
  * received, containing the offset in the given axis.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GesturePan private[gnome] (raw: Ptr[GtkGesturePan])
    extends GestureDrag(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the orientation of the pan gestures that this @gesture expects.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOrientation(): Orientation /* None */ =
    Orientation.fromRaw(
      gtk_gesture_pan_get_orientation(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGesturePan]]
      )
    )
  end getOrientation

  /** Sets the orientation to be expected on pan gestures.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setOrientation(
      orientation: Orientation /* Some(GtkOrientation) */
  ): Unit /* None */ =
    gtk_gesture_pan_set_orientation(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkGesturePan]],
      orientation.raw
    )
  end setOrientation

  /** Emitted once a panning gesture along the expected axis is detected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal pan]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onPan = ???

end GesturePan

object GesturePan:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkGesturePan])(using Runtime) =
    summon[Runtime].getOrCreate[GesturePan](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new GesturePan(ptr)
    )

  /** Returns a newly created `GtkGesture` that recognizes pan gestures.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(orientation: Orientation /* Some(GtkOrientation) */ )(using
      Runtime
  ): GesturePan =
    val raw: Ptr[Byte] = gtk_gesture_pan_new(orientation.raw).asInstanceOf
    summon[Runtime]
      .getOrCreate[GesturePan](raw, r => GesturePan.applyUnsafe(r.asInstanceOf))
  end apply
end GesturePan
