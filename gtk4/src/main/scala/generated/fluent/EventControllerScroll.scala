package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.ScrollUnit
import sn.gnome.glib.internal.{gchar, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{EventController, EventControllerScrollFlags}
import sn.gnome.gtk4.internal.GtkEventControllerScroll
import sn.gnome.runtime.*

/** `GtkEventControllerScroll` is an event controller that handles scroll
  * events.
  *
  * It is capable of handling both discrete and continuous scroll events from
  * mice or touchpads, abstracting them both with the
  * [signal@Gtk.EventControllerScroll::scroll] signal. Deltas in the discrete
  * case are multiples of 1.
  *
  * In the case of continuous scroll events, `GtkEventControllerScroll` encloses
  * all [signal@Gtk.EventControllerScroll::scroll] emissions between two
  * [signal@Gtk.EventControllerScroll::scroll-begin] and
  * [signal@Gtk.EventControllerScroll::scroll-end] signals.
  *
  * The behavior of the event controller can be modified by the flags given at
  * creation time, or modified at a later point through
  * [method@Gtk.EventControllerScroll.set_flags] (e.g. because the scrolling
  * conditions of the widget changed).
  *
  * The controller can be set up to emit motion for either/both vertical and
  * horizontal scroll events through %GTK_EVENT_CONTROLLER_SCROLL_VERTICAL,
  * %GTK_EVENT_CONTROLLER_SCROLL_HORIZONTAL and
  * %GTK_EVENT_CONTROLLER_SCROLL_BOTH_AXES. If any axis is disabled, the
  * respective [signal@Gtk.EventControllerScroll::scroll] delta will be 0.
  * Vertical scroll events will be translated to horizontal motion for the
  * devices incapable of horizontal scrolling.
  *
  * The event controller can also be forced to emit discrete events on all
  * devices through %GTK_EVENT_CONTROLLER_SCROLL_DISCRETE. This can be used to
  * implement discrete actions triggered through scroll events (e.g. switching
  * across combobox options).
  *
  * The %GTK_EVENT_CONTROLLER_SCROLL_KINETIC flag toggles the emission of the
  * [signal@Gtk.EventControllerScroll::decelerate] signal, emitted at the end of
  * scrolling with two X/Y velocity arguments that are consistent with the
  * motion that was received.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class EventControllerScroll private[gnome] (raw: Ptr[GtkEventControllerScroll])
    extends EventController(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the flags conditioning the scroll controller behavior.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFlags(): EventControllerScrollFlags /* None */ =
    EventControllerScrollFlags.fromRaw(
      gtk_event_controller_scroll_get_flags(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEventControllerScroll]]
      )
    )
  end getFlags

  /** Gets the scroll unit of the last
    * [signal@Gtk.EventControllerScroll::scroll] signal received.
    *
    * Always returns %GDK_SCROLL_UNIT_WHEEL if the
    * %GTK_EVENT_CONTROLLER_SCROLL_DISCRETE flag is set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUnit(): ScrollUnit /* None */ =
    ScrollUnit.fromRaw(
      gtk_event_controller_scroll_get_unit(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEventControllerScroll]]
      )
    )
  end getUnit

  /** Sets the flags conditioning scroll controller behavior.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFlags(
      flags: EventControllerScrollFlags /* Some(GtkEventControllerScrollFlags) */
  ): Unit /* None */ =
    gtk_event_controller_scroll_set_flags(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEventControllerScroll]],
      flags.raw
    )
  end setFlags

  /** Emitted after scroll is finished if the
    * %GTK_EVENT_CONTROLLER_SCROLL_KINETIC flag is set.
    *
    * @vel_x
    *   and @vel_y express the initial velocity that was imprinted by the scroll
    *   events. @vel_x and @vel_y are expressed in pixels/ms.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal decelerate]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onDecelerate = ???

  /** Signals that the widget should scroll by the amount specified by @dx and @dy.
    *
    * For the representation unit of the deltas, see
    * [method@Gtk.EventControllerScroll.get_unit].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal scroll]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onScroll = ???

  /** Signals that a new scrolling operation has begun.
    *
    * It will only be emitted on devices capable of it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onScrollBegin(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkEventControllerScroll],
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
    val signal = c"scroll-begin"
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
  end onScrollBegin

  /** Signals that a scrolling operation has finished.
    *
    * It will only be emitted on devices capable of it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onScrollEnd(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkEventControllerScroll],
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
    val signal = c"scroll-end"
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
  end onScrollEnd
end EventControllerScroll

object EventControllerScroll:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkEventControllerScroll])(using Runtime) =
    summon[Runtime].getOrCreate[EventControllerScroll](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new EventControllerScroll(ptr)
    )

  /** Creates a new event controller that will handle scroll events.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      flags: EventControllerScrollFlags /* Some(GtkEventControllerScrollFlags) */
  )(using Runtime): EventControllerScroll =
    val raw: Ptr[Byte] = gtk_event_controller_scroll_new(flags.raw).asInstanceOf
    summon[Runtime].getOrCreate[EventControllerScroll](
      raw,
      r => EventControllerScroll.applyUnsafe(r.asInstanceOf)
    )
  end apply
end EventControllerScroll
