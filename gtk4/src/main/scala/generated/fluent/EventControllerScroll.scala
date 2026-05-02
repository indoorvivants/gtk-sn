package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkScrollUnit
import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.internal.GtkEventControllerScroll
import sn.gnome.gtk4.internal.GtkEventControllerScrollFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkEventControllerScroll` is an event controller that handles scroll
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
  */
class EventControllerScroll(raw: Ptr[GtkEventControllerScroll])
    extends EventController(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the flags conditioning the scroll controller behavior.
    */
  def getFlags(): GtkEventControllerScrollFlags /* None */ =
    gtk_event_controller_scroll_get_flags(
      this.raw.asInstanceOf[Ptr[GtkEventControllerScroll]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the scroll unit of the last
    * [signal@Gtk.EventControllerScroll::scroll] signal received.
    *
    * Always returns %GDK_SCROLL_UNIT_WHEEL if the
    * %GTK_EVENT_CONTROLLER_SCROLL_DISCRETE flag is set.
    */
  def getUnit(): GdkScrollUnit /* None */ =
    gtk_event_controller_scroll_get_unit(
      this.raw.asInstanceOf[Ptr[GtkEventControllerScroll]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the flags conditioning scroll controller behavior.
    */
  def setFlags(
      flags: GtkEventControllerScrollFlags /* Some(GtkEventControllerScrollFlags) */
  ): Unit /* None */ = gtk_event_controller_scroll_set_flags(
    this.raw.asInstanceOf[Ptr[GtkEventControllerScroll]],
    flags
  )

end EventControllerScroll

object EventControllerScroll:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new event controller that will handle scroll events.
    */
  def apply(
      flags: GtkEventControllerScrollFlags /* Some(GtkEventControllerScrollFlags) */
  ): EventControllerScroll = new EventControllerScroll(
    gtk_event_controller_scroll_new(flags).asInstanceOf
  )
end EventControllerScroll
