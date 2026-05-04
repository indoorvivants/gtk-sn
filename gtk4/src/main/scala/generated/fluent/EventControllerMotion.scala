package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.internal.GtkEventControllerMotion

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkEventControllerMotion` is an event controller tracking the pointer
  * position.
  *
  * The event controller offers [signal@Gtk.EventControllerMotion::enter] and
  * [signal@Gtk.EventControllerMotion::leave] signals, as well as
  * [property@Gtk.EventControllerMotion:is-pointer] and
  * [property@Gtk.EventControllerMotion:contains-pointer] properties which are
  * updated to reflect changes in the pointer position as it moves over the
  * widget.
  */
class EventControllerMotion(raw: Ptr[GtkEventControllerMotion])
    extends EventController(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns if a pointer is within @self or one of its children.
    */
  def containsPointer(): Boolean /* None */ =
    gtk_event_controller_motion_contains_pointer(
      this.raw.asInstanceOf[Ptr[GtkEventControllerMotion]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns if a pointer is within @self, but not one of its children.
    */
  def isPointer(): Boolean /* None */ = gtk_event_controller_motion_is_pointer(
    this.raw.asInstanceOf[Ptr[GtkEventControllerMotion]]
  ).value.!=(0)

end EventControllerMotion

object EventControllerMotion:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new event controller that will handle motion events.
    */
  def apply(): EventControllerMotion = new EventControllerMotion(
    gtk_event_controller_motion_new().asInstanceOf
  )
end EventControllerMotion
