package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.internal.GtkEventControllerMotion

class EventControllerMotion(raw: Ptr[GtkEventControllerMotion])
    extends EventController(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def containsPointer(): Boolean = gtk_event_controller_motion_contains_pointer(
    this.raw.asInstanceOf
  ).value.!=(0)

  def isPointer(): Boolean =
    gtk_event_controller_motion_is_pointer(this.raw.asInstanceOf).value.!=(0)

end EventControllerMotion

object EventControllerMotion:
  def apply(): EventControllerMotion = new EventControllerMotion(
    gtk_event_controller_motion_new().asInstanceOf
  )
end EventControllerMotion
