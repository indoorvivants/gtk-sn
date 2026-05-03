package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Device
import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkModifierType
import sn.gnome.glib.internal.guint32
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.PropagationLimit
import sn.gnome.gtk4.fluent.PropagationPhase
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkEventController

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkEventController` is the base class for event controllers.
  *
  * These are ancillary objects associated to widgets, which react to
  * `GdkEvents`, and possibly trigger actions as a consequence.
  *
  * Event controllers are added to a widget with
  * [method@Gtk.Widget.add_controller]. It is rarely necessary to explicitly
  * remove a controller with [method@Gtk.Widget.remove_controller].
  *
  * See the chapter on [input handling](input-handling.html) for an overview of
  * the basic concepts, such as the capture and bubble phases of event
  * propagation.
  */
class EventController(raw: Ptr[GtkEventController])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the event that is currently being handled by the controller.
    *
    * At other times, %NULL is returned.
    */
  def getCurrentEvent(): Event /* None */ = new Event(
    gtk_event_controller_get_current_event(
      this.raw.asInstanceOf[Ptr[GtkEventController]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the device of the event that is currently being handled by the
    * controller.
    *
    * At other times, %NULL is returned.
    */
  def getCurrentEventDevice(): Device /* None */ = new Device(
    gtk_event_controller_get_current_event_device(
      this.raw.asInstanceOf[Ptr[GtkEventController]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the modifier state of the event that is currently being handled by
    * the controller.
    *
    * At other times, 0 is returned.
    */
  def getCurrentEventState(): GdkModifierType /* None */ =
    gtk_event_controller_get_current_event_state(
      this.raw.asInstanceOf[Ptr[GtkEventController]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the timestamp of the event that is currently being handled by the
    * controller.
    *
    * At other times, 0 is returned.
    */
  def getCurrentEventTime(): UInt /* None */ =
    gtk_event_controller_get_current_event_time(
      this.raw.asInstanceOf[Ptr[GtkEventController]]
    ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the name of @controller.
    */
  def getName()(using Zone): String /* None */ = fromCString(
    gtk_event_controller_get_name(
      this.raw.asInstanceOf[Ptr[GtkEventController]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the propagation limit of the event controller.
    */
  def getPropagationLimit(): PropagationLimit /* None */ =
    PropagationLimit.fromRaw(
      gtk_event_controller_get_propagation_limit(
        this.raw.asInstanceOf[Ptr[GtkEventController]]
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the propagation phase at which @controller handles events.
    */
  def getPropagationPhase(): PropagationPhase /* None */ =
    PropagationPhase.fromRaw(
      gtk_event_controller_get_propagation_phase(
        this.raw.asInstanceOf[Ptr[GtkEventController]]
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GtkWidget` this controller relates to.
    */
  def getWidget(): Widget /* None */ = new Widget(
    gtk_event_controller_get_widget(
      this.raw.asInstanceOf[Ptr[GtkEventController]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Resets the @controller to a clean state.
    */
  def reset(): Unit /* None */ = gtk_event_controller_reset(
    this.raw.asInstanceOf[Ptr[GtkEventController]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a name on the controller that can be used for debugging.
    */
  def setName(
      name: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_event_controller_set_name(
    this.raw.asInstanceOf[Ptr[GtkEventController]],
    name
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the event propagation limit on the event controller.
    *
    * If the limit is set to %GTK_LIMIT_SAME_NATIVE, the controller won't handle
    * events that are targeted at widgets on a different surface, such as
    * popovers.
    */
  def setPropagationLimit(
      limit: PropagationLimit /* Some(GtkPropagationLimit) */
  ): Unit /* None */ = gtk_event_controller_set_propagation_limit(
    this.raw.asInstanceOf[Ptr[GtkEventController]],
    limit.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the propagation phase at which a controller handles events.
    *
    * If @phase is %GTK_PHASE_NONE, no automatic event handling will be
    * performed, but other additional gesture maintenance will.
    */
  def setPropagationPhase(
      phase: PropagationPhase /* Some(GtkPropagationPhase) */
  ): Unit /* None */ = gtk_event_controller_set_propagation_phase(
    this.raw.asInstanceOf[Ptr[GtkEventController]],
    phase.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a name on the controller that can be used for debugging.
    */
  def setStaticName(
      name: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_event_controller_set_static_name(
    this.raw.asInstanceOf[Ptr[GtkEventController]],
    name
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end EventController
