package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Device
import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkModifierType
import sn.gnome.glib.internal.guint32
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkEventController
import sn.gnome.gtk4.internal.GtkPropagationLimit
import sn.gnome.gtk4.internal.GtkPropagationPhase

class EventController(raw: Ptr[GtkEventController])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getCurrentEvent(): Event = new Event(
    gtk_event_controller_get_current_event(this.raw.asInstanceOf).asInstanceOf
  )

  def getCurrentEventDevice(): Device = new Device(
    gtk_event_controller_get_current_event_device(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

  def getCurrentEventState(): GdkModifierType =
    gtk_event_controller_get_current_event_state(this.raw.asInstanceOf)

  def getCurrentEventTime(): UInt = gtk_event_controller_get_current_event_time(
    this.raw.asInstanceOf
  ).value

  def getName()(using Zone): String = fromCString(
    gtk_event_controller_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getPropagationLimit(): GtkPropagationLimit =
    gtk_event_controller_get_propagation_limit(this.raw.asInstanceOf)

  def getPropagationPhase(): GtkPropagationPhase =
    gtk_event_controller_get_propagation_phase(this.raw.asInstanceOf)

  def getWidget(): Widget = new Widget(
    gtk_event_controller_get_widget(this.raw.asInstanceOf).asInstanceOf
  )

  def reset(): Unit = gtk_event_controller_reset(this.raw.asInstanceOf)

  def setName(name: String | CString)(using Zone): Unit =
    gtk_event_controller_set_name(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    )

  def setPropagationLimit(limit: GtkPropagationLimit): Unit =
    gtk_event_controller_set_propagation_limit(this.raw.asInstanceOf, limit)

  def setPropagationPhase(phase: GtkPropagationPhase): Unit =
    gtk_event_controller_set_propagation_phase(this.raw.asInstanceOf, phase)

  def setStaticName(name: String | CString)(using Zone): Unit =
    gtk_event_controller_set_static_name(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
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
