package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.GestureDrag
import sn.gnome.gtk4.fluent.Orientation
import sn.gnome.gtk4.internal.GtkGesturePan

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkGesturePan` is a `GtkGesture` for pan gestures.
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
  */
class GesturePan(raw: Ptr[GtkGesturePan]) extends GestureDrag(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the orientation of the pan gestures that this @gesture expects.
    */
  def getOrientation(): Orientation /* None */ = Orientation.fromRaw(
    gtk_gesture_pan_get_orientation(this.raw.asInstanceOf[Ptr[GtkGesturePan]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the orientation to be expected on pan gestures.
    */
  def setOrientation(
      orientation: Orientation /* Some(GtkOrientation) */
  ): Unit /* None */ = gtk_gesture_pan_set_orientation(
    this.raw.asInstanceOf[Ptr[GtkGesturePan]],
    orientation.raw
  )

end GesturePan

object GesturePan:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a newly created `GtkGesture` that recognizes pan gestures.
    */
  def apply(orientation: Orientation /* Some(GtkOrientation) */ ): GesturePan =
    new GesturePan(gtk_gesture_pan_new(orientation.raw).asInstanceOf)
end GesturePan
