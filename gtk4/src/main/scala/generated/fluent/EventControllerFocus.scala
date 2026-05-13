package sn.gnome.gtk4.fluent

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
import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.internal.GtkEventControllerFocus
import sn.gnome.runtime.*

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
class EventControllerFocus private[gnome] (raw: Ptr[GtkEventControllerFocus])
    extends EventController(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns %TRUE if focus is within @self or one of its children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def containsFocus(): Boolean /* None */ =
    gtk_event_controller_focus_contains_focus(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEventControllerFocus]]
    ).value.!=(0)
  end containsFocus

  /** Returns %TRUE if focus is within @self, but not one of its children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isFocus(): Boolean /* None */ =
    gtk_event_controller_focus_is_focus(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEventControllerFocus]]
    ).value.!=(0)
  end isFocus

  /** Emitted whenever the focus enters into the widget or one of its
    * descendents.
    *
    * Note that this means you may not get an ::enter signal even though the
    * widget becomes the focus location, in certain cases (such as when the
    * focus moves from a descendent of the widget to the widget itself). If you
    * are interested in these cases, you can monitor the
    * [property@Gtk.EventControllerFocus:is-focus] property for changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onEnter(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkEventControllerFocus],
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
    val signal = c"enter"
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
  end onEnter

  /** Emitted whenever the focus leaves the widget hierarchy that is rooted at
    * the widget that the controller is attached to.
    *
    * Note that this means you may not get a ::leave signal even though the
    * focus moves away from the widget, in certain cases (such as when the focus
    * moves from the widget to a descendent). If you are interested in these
    * cases, you can monitor the [property@Gtk.EventControllerFocus:is-focus]
    * property for changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onLeave(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkEventControllerFocus],
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
end EventControllerFocus

object EventControllerFocus:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkEventControllerFocus])(using Runtime) =
    summon[Runtime].getOrCreate[EventControllerFocus](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new EventControllerFocus(ptr)
    )

  /** Creates a new event controller that will handle focus events.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): EventControllerFocus =
    val raw: Ptr[Byte] = gtk_event_controller_focus_new().asInstanceOf
    summon[Runtime].getOrCreate[EventControllerFocus](
      raw,
      r => EventControllerFocus.applyUnsafe(r.asInstanceOf)
    )
  end apply
end EventControllerFocus
