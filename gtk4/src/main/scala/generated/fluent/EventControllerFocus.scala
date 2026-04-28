package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.internal.GtkEventControllerFocus

class EventControllerFocus(raw: Ptr[GtkEventControllerFocus])
    extends EventController(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def containsFocus(): Boolean =
    gtk_event_controller_focus_contains_focus(this.raw.asInstanceOf).value.!=(0)

  def isFocus(): Boolean =
    gtk_event_controller_focus_is_focus(this.raw.asInstanceOf).value.!=(0)

end EventControllerFocus

object EventControllerFocus:
  def apply(): EventControllerFocus = new EventControllerFocus(
    gtk_event_controller_focus_new().asInstanceOf
  )
end EventControllerFocus
