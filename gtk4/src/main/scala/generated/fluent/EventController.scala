package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.{Device, Event, ModifierType}
import sn.gnome.glib.internal.guint32
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{PropagationLimit, PropagationPhase, Widget}
import sn.gnome.gtk4.internal.GtkEventController

/** `GtkEventController` is the base class for event controllers.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class EventController private[gnome] (raw: Ptr[GtkEventController])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the event that is currently being handled by the controller.
    *
    * At other times, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCurrentEvent()(using Runtime): sn.gnome.gdk4.fluent.Event /* None */ =
    sn.gnome.gdk4.fluent.Event.applyUnsafe(
      gtk_event_controller_get_current_event(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEventController]]
      ).asInstanceOf
    )
  end getCurrentEvent

  /** Returns the device of the event that is currently being handled by the
    * controller.
    *
    * At other times, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCurrentEventDevice()(using
      Runtime
  ): sn.gnome.gdk4.fluent.Device /* None */ =
    sn.gnome.gdk4.fluent.Device.applyUnsafe(
      gtk_event_controller_get_current_event_device(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEventController]]
      ).asInstanceOf
    )
  end getCurrentEventDevice

  /** Returns the modifier state of the event that is currently being handled by
    * the controller.
    *
    * At other times, 0 is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCurrentEventState(): ModifierType /* None */ =
    ModifierType.fromRaw(
      gtk_event_controller_get_current_event_state(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEventController]]
      )
    )
  end getCurrentEventState

  /** Returns the timestamp of the event that is currently being handled by the
    * controller.
    *
    * At other times, 0 is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCurrentEventTime(): UInt /* None */ =
    gtk_event_controller_get_current_event_time(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEventController]]
    ).value
  end getCurrentEventTime

  /** Gets the name of @controller.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName()(using Zone): String /* None */ =
    fromCString(
      gtk_event_controller_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEventController]]
      ).asInstanceOf
    )
  end getName

  /** Gets the propagation limit of the event controller.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPropagationLimit(): PropagationLimit /* None */ =
    PropagationLimit.fromRaw(
      gtk_event_controller_get_propagation_limit(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEventController]]
      )
    )
  end getPropagationLimit

  /** Gets the propagation phase at which @controller handles events.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPropagationPhase(): PropagationPhase /* None */ =
    PropagationPhase.fromRaw(
      gtk_event_controller_get_propagation_phase(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEventController]]
      )
    )
  end getPropagationPhase

  /** Returns the `GtkWidget` this controller relates to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWidget()(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_event_controller_get_widget(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEventController]]
      ).asInstanceOf
    )
  end getWidget

  /** Resets the @controller to a clean state.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def reset(): Unit /* None */ =
    gtk_event_controller_reset(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEventController]]
    )
  end reset

  /** Sets a name on the controller that can be used for debugging.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setName(
      name: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_event_controller_set_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEventController]],
      name.map[CString](o => toCString(o)).getOrElse(null.asInstanceOf[CString])
    )
  end setName

  /** Sets the event propagation limit on the event controller.
    *
    * If the limit is set to %GTK_LIMIT_SAME_NATIVE, the controller won't handle
    * events that are targeted at widgets on a different surface, such as
    * popovers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPropagationLimit(
      limit: PropagationLimit /* Some(GtkPropagationLimit) */
  ): Unit /* None */ =
    gtk_event_controller_set_propagation_limit(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEventController]],
      limit.raw
    )
  end setPropagationLimit

  /** Sets the propagation phase at which a controller handles events.
    *
    * If @phase is %GTK_PHASE_NONE, no automatic event handling will be
    * performed, but other additional gesture maintenance will.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPropagationPhase(
      phase: PropagationPhase /* Some(GtkPropagationPhase) */
  ): Unit /* None */ =
    gtk_event_controller_set_propagation_phase(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEventController]],
      phase.raw
    )
  end setPropagationPhase

  /** Sets a name on the controller that can be used for debugging.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setStaticName(
      name: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_event_controller_set_static_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkEventController]],
      name.map[CString](o => toCString(o)).getOrElse(null.asInstanceOf[CString])
    )
  end setStaticName

end EventController

object EventController:
  def applyUnsafe(ptr: Ptr[GtkEventController])(using Runtime) =
    summon[Runtime].getOrCreate[EventController](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new EventController(ptr)
    )

end EventController
