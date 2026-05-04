package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.GestureSingle
import sn.gnome.gtk4.internal.GtkGestureDrag

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkGestureDrag` is a `GtkGesture` implementation for drags.
  *
  * The drag operation itself can be tracked throughout the
  * [signal@Gtk.GestureDrag::drag-begin], [signal@Gtk.GestureDrag::drag-update]
  * and [signal@Gtk.GestureDrag::drag-end] signals, and the relevant coordinates
  * can be extracted through [method@Gtk.GestureDrag.get_offset] and
  * [method@Gtk.GestureDrag.get_start_point].
  */
class GestureDrag(raw: Ptr[GtkGestureDrag])
    extends GestureSingle(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the offset from the start point.
    *
    * If the @gesture is active, this function returns %TRUE and fills in @x and @y
    * with the coordinates of the current point, as an offset to the starting
    * drag point.
    */
  @annotation.compileTimeOnly(
    "Method get_offset contains an OUT parameter, which is not supported yet"
  )
  def getOffset__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the point where the drag started.
    *
    * If the @gesture is active, this function returns %TRUE and fills in @x and @y
    * with the drag start coordinates, in widget-relative coordinates.
    */
  @annotation.compileTimeOnly(
    "Method get_start_point contains an OUT parameter, which is not supported yet"
  )
  def getStartPoint__ = ???

end GestureDrag

object GestureDrag:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a newly created `GtkGesture` that recognizes drags.
    */
  def apply(): GestureDrag = new GestureDrag(
    gtk_gesture_drag_new().asInstanceOf
  )
end GestureDrag
