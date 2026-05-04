package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Drop
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.internal.GtkDropControllerMotion

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkDropControllerMotion` is an event controller tracking the pointer during
  * Drag-and-Drop operations.
  *
  * It is modeled after [class@Gtk.EventControllerMotion] so if you have used
  * that, this should feel really familiar.
  *
  * This controller is not able to accept drops, use [class@Gtk.DropTarget] for
  * that purpose.
  */
class DropControllerMotion(raw: Ptr[GtkDropControllerMotion])
    extends EventController(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns if a Drag-and-Drop operation is within the widget
    * @self
    *   or one of its children.
    */
  def containsPointer(): Boolean /* None */ =
    gtk_drop_controller_motion_contains_pointer(
      this.raw.asInstanceOf[Ptr[GtkDropControllerMotion]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GdkDrop` of a current Drag-and-Drop operation over the widget
    * of @self.
    */
  def getDrop(): Drop /* None */ = new Drop(
    gtk_drop_controller_motion_get_drop(
      this.raw.asInstanceOf[Ptr[GtkDropControllerMotion]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns if a Drag-and-Drop operation is within the widget
    * @self,
    *   not one of its children.
    */
  def isPointer(): Boolean /* None */ = gtk_drop_controller_motion_is_pointer(
    this.raw.asInstanceOf[Ptr[GtkDropControllerMotion]]
  ).value.!=(0)

end DropControllerMotion

object DropControllerMotion:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new event controller that will handle pointer motion events
    * during drag and drop.
    */
  def apply(): DropControllerMotion = new DropControllerMotion(
    gtk_drop_controller_motion_new().asInstanceOf
  )
end DropControllerMotion
