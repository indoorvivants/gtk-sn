package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkScrollUnit
import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.internal.GtkEventControllerScroll
import sn.gnome.gtk4.internal.GtkEventControllerScrollFlags

class EventControllerScroll(raw: Ptr[GtkEventControllerScroll])
    extends EventController(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getFlags(): GtkEventControllerScrollFlags =
    gtk_event_controller_scroll_get_flags(this.raw.asInstanceOf)

  def getUnit(): GdkScrollUnit = gtk_event_controller_scroll_get_unit(
    this.raw.asInstanceOf
  )

  def setFlags(flags: GtkEventControllerScrollFlags): Unit =
    gtk_event_controller_scroll_set_flags(this.raw.asInstanceOf, flags)

end EventControllerScroll

object EventControllerScroll:
  def apply(flags: GtkEventControllerScrollFlags): EventControllerScroll =
    new EventControllerScroll(
      gtk_event_controller_scroll_new(flags).asInstanceOf
    )
end EventControllerScroll
