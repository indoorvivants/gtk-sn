package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.EventController
import sn.gnome.gtk4.internal.GtkEventControllerMotion
import sn.gnome.runtime.*

/** `GtkEventControllerMotion` is an event controller tracking the pointer
  * position.
  *
  * The event controller offers [signal@Gtk.EventControllerMotion::enter] and
  * [signal@Gtk.EventControllerMotion::leave] signals, as well as
  * [property@Gtk.EventControllerMotion:is-pointer] and
  * [property@Gtk.EventControllerMotion:contains-pointer] properties which are
  * updated to reflect changes in the pointer position as it moves over the
  * widget.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class EventControllerMotion private[gnome] (raw: Ptr[GtkEventControllerMotion])
    extends EventController(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns if a pointer is within @self or one of its children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def containsPointer(): Boolean /* None */ =
    gtk_event_controller_motion_contains_pointer(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEventControllerMotion]]
    ).value.!=(0)
  end containsPointer

  /** Returns if a pointer is within @self, but not one of its children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isPointer(): Boolean /* None */ =
    gtk_event_controller_motion_is_pointer(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEventControllerMotion]]
    ).value.!=(0)
  end isPointer

  /** Signals that the pointer has entered the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal enter]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onEnter = ???

  /** Signals that the pointer has left the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onLeave(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkEventControllerMotion],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"leave"
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
  end onLeave

  /** Emitted when the pointer moves inside the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal motion]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onMotion = ???

end EventControllerMotion

object EventControllerMotion:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkEventControllerMotion])(using Runtime) =
    summon[Runtime].getOrCreate[EventControllerMotion](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new EventControllerMotion(ptr)
    )

  /** Creates a new event controller that will handle motion events.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): EventControllerMotion =
    val raw: Ptr[Byte] = gtk_event_controller_motion_new().asInstanceOf
    summon[Runtime].getOrCreate[EventControllerMotion](
      raw,
      r => EventControllerMotion.applyUnsafe(r.asInstanceOf)
    )
  end apply
end EventControllerMotion
