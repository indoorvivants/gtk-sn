package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.internal.GtkEventControllerLegacy

class EventControllerLegacy(raw: Ptr[GtkEventControllerLegacy])
    extends EventController(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end EventControllerLegacy

object EventControllerLegacy:
  def apply(): EventControllerLegacy = new EventControllerLegacy(
    gtk_event_controller_legacy_new().asInstanceOf
  )
end EventControllerLegacy
