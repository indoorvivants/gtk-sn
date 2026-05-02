package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.internal.GtkEventControllerLegacy

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkEventControllerLegacy` is an event controller that provides raw access
  * to the event stream.
  *
  * It should only be used as a last resort if none of the other event
  * controllers or gestures do the job.
  */
class EventControllerLegacy(raw: Ptr[GtkEventControllerLegacy])
    extends EventController(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end EventControllerLegacy

object EventControllerLegacy:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new legacy event controller.
    */
  def apply(): EventControllerLegacy = new EventControllerLegacy(
    gtk_event_controller_legacy_new().asInstanceOf
  )
end EventControllerLegacy
