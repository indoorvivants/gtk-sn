package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.GestureSingle
import sn.gnome.gtk4.internal.GtkGestureDrag

/** `GtkGestureDrag` is a `GtkGesture` implementation for drags.
  *
  * The drag operation itself can be tracked throughout the
  * [signal@Gtk.GestureDrag::drag-begin], [signal@Gtk.GestureDrag::drag-update]
  * and [signal@Gtk.GestureDrag::drag-end] signals, and the relevant coordinates
  * can be extracted through [method@Gtk.GestureDrag.get_offset] and
  * [method@Gtk.GestureDrag.get_start_point].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GestureDrag private[gnome] (raw: Ptr[GtkGestureDrag])
    extends GestureSingle(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the offset from the start point.
    *
    * If the @gesture is active, this function returns %TRUE and fills in @x and @y
    * with the coordinates of the current point, as an offset to the starting
    * drag point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_offset]: Method get_offset contains an OUT parameter, which is not supported yet"
  )
  private def getOffset__ = ???

  /** Gets the point where the drag started.
    *
    * If the @gesture is active, this function returns %TRUE and fills in @x and @y
    * with the drag start coordinates, in widget-relative coordinates.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_start_point]: Method get_start_point contains an OUT parameter, which is not supported yet"
  )
  private def getStartPoint__ = ???

  /** Emitted whenever dragging starts.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal drag-begin]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onDragBegin = ???

  /** Emitted whenever the dragging is finished.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal drag-end]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onDragEnd = ???

  /** Emitted whenever the dragging point moves.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal drag-update]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onDragUpdate = ???

end GestureDrag

object GestureDrag:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkGestureDrag])(using Runtime) =
    summon[Runtime].getOrCreate[GestureDrag](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new GestureDrag(ptr)
    )

  /** Returns a newly created `GtkGesture` that recognizes drags.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): GestureDrag =
    val raw: Ptr[Byte] = gtk_gesture_drag_new().asInstanceOf
    summon[Runtime].getOrCreate[GestureDrag](
      raw,
      r => GestureDrag.applyUnsafe(r.asInstanceOf)
    )
  end apply
end GestureDrag
