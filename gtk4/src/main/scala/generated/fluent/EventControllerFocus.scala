package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.internal.GtkEventControllerFocus

/** `GtkEventControllerFocus` is an event controller to keep track of keyboard
  * focus.
  *
  * The event controller offers [signal@Gtk.EventControllerFocus::enter] and
  * [signal@Gtk.EventControllerFocus::leave] signals, as well as
  * [property@Gtk.EventControllerFocus:is-focus] and
  * [property@Gtk.EventControllerFocus:contains-focus] properties which are
  * updated to reflect focus changes inside the widget hierarchy that is rooted
  * at the controllers widget.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class EventControllerFocus(raw: Ptr[GtkEventControllerFocus])
    extends EventController(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns %TRUE if focus is within @self or one of its children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def containsFocus(): Boolean /* None */ =
    gtk_event_controller_focus_contains_focus(
      this.raw.asInstanceOf[Ptr[GtkEventControllerFocus]]
    ).value.!=(0)

  /** Returns %TRUE if focus is within @self, but not one of its children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isFocus(): Boolean /* None */ = gtk_event_controller_focus_is_focus(
    this.raw.asInstanceOf[Ptr[GtkEventControllerFocus]]
  ).value.!=(0)

end EventControllerFocus

object EventControllerFocus:
  /** Creates a new event controller that will handle focus events.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): EventControllerFocus = new EventControllerFocus(
    gtk_event_controller_focus_new().asInstanceOf
  )
end EventControllerFocus
