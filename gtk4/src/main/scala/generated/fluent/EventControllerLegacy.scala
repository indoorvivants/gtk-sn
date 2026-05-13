package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.Event
import sn.gnome.gdk4.internal.GdkEvent
import sn.gnome.glib.internal.{gchar, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.EventController
import sn.gnome.gtk4.internal.GtkEventControllerLegacy
import sn.gnome.runtime.*

/** `GtkEventControllerLegacy` is an event controller that provides raw access
  * to the event stream.
  *
  * It should only be used as a last resort if none of the other event
  * controllers or gestures do the job.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class EventControllerLegacy private[gnome] (raw: Ptr[GtkEventControllerLegacy])
    extends EventController(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Emitted for each GDK event delivered to @controller.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onEvent(handler: ((event: Event)) => Boolean)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (event: Event), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkEventControllerLegacy],
          event: Ptr[GdkEvent] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (event = sr.runtime.get[Event](event.asInstanceOf[Ptr[Byte]]))
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"event"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onEvent
end EventControllerLegacy

object EventControllerLegacy:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkEventControllerLegacy])(using Runtime) =
    summon[Runtime].getOrCreate[EventControllerLegacy](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new EventControllerLegacy(ptr)
    )

  /** Creates a new legacy event controller.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): EventControllerLegacy =
    val raw: Ptr[Byte] = gtk_event_controller_legacy_new().asInstanceOf
    summon[Runtime].getOrCreate[EventControllerLegacy](
      raw,
      r => EventControllerLegacy.applyUnsafe(r.asInstanceOf)
    )
  end apply
end EventControllerLegacy
