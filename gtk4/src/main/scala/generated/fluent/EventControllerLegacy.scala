package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.internal.GtkEventControllerLegacy

/** `GtkEventControllerLegacy` is an event controller that provides raw access
  * to the event stream.
  *
  * It should only be used as a last resort if none of the other event
  * controllers or gestures do the job.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class EventControllerLegacy(raw: Ptr[GtkEventControllerLegacy])
    extends EventController(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end EventControllerLegacy

object EventControllerLegacy:
  /** Creates a new legacy event controller.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): EventControllerLegacy = new EventControllerLegacy(
    gtk_event_controller_legacy_new().asInstanceOf
  )
end EventControllerLegacy
