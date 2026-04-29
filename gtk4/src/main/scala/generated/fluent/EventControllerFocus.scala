package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.internal.GtkEventControllerFocus

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkEventControllerFocus` is an event controller to keep track of keyboard
  * focus.
  *
  * The event controller offers [signal@Gtk.EventControllerFocus::enter] and
  * [signal@Gtk.EventControllerFocus::leave] signals, as well as
  * [property@Gtk.EventControllerFocus:is-focus] and
  * [property@Gtk.EventControllerFocus:contains-focus] properties which are
  * updated to reflect focus changes inside the widget hierarchy that is rooted
  * at the controllers widget.
  */
class EventControllerFocus(raw: Ptr[GtkEventControllerFocus])
    extends EventController(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if focus is within @self or one of its children.
    */
  def containsFocus(): Boolean =
    gtk_event_controller_focus_contains_focus(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if focus is within @self, but not one of its children.
    */
  def isFocus(): Boolean =
    gtk_event_controller_focus_is_focus(this.raw.asInstanceOf).value.!=(0)

end EventControllerFocus

object EventControllerFocus:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new event controller that will handle focus events.
    */
  def apply(): EventControllerFocus = new EventControllerFocus(
    gtk_event_controller_focus_new().asInstanceOf
  )
end EventControllerFocus
