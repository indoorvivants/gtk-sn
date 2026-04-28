package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Device
import sn.gnome.gdk4.fluent.DeviceTool
import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.fluent.Seat
import sn.gnome.gdk4.fluent.Surface
import sn.gnome.gdk4.internal.GdkEvent
import sn.gnome.gdk4.internal.GdkEventSequence
import sn.gnome.gdk4.internal.GdkEventType
import sn.gnome.gdk4.internal.GdkModifierType
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint32

class Event(raw: Ptr[GdkEvent]):
  def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  // Method _get_angle contains an OUT parameter, which is not supported yet

  // Method _get_center contains an OUT parameter, which is not supported yet

  // Method _get_distance contains an OUT parameter, which is not supported yet

  // Method get_axes contains an array parameter, which is not supported yet

  // Method get_axis contains an OUT parameter, which is not supported yet

  def getDevice(): Device = new Device(
    gdk_event_get_device(this.raw.asInstanceOf).asInstanceOf
  )

  def getDeviceTool(): DeviceTool = new DeviceTool(
    gdk_event_get_device_tool(this.raw.asInstanceOf).asInstanceOf
  )

  def getDisplay(): Display = new Display(
    gdk_event_get_display(this.raw.asInstanceOf).asInstanceOf
  )

  def getEventSequence(): Ptr[GdkEventSequence] = gdk_event_get_event_sequence(
    this.raw.asInstanceOf
  )

  def getEventType(): GdkEventType = gdk_event_get_event_type(
    this.raw.asInstanceOf
  )

  // Method get_history contains an OUT parameter, which is not supported yet

  def getModifierState(): GdkModifierType = gdk_event_get_modifier_state(
    this.raw.asInstanceOf
  )

  def getPointerEmulated(): Boolean =
    gdk_event_get_pointer_emulated(this.raw.asInstanceOf).value.!=(0)

  // Method get_position contains an OUT parameter, which is not supported yet

  def getSeat(): Seat = new Seat(
    gdk_event_get_seat(this.raw.asInstanceOf).asInstanceOf
  )

  def getSurface(): Surface = new Surface(
    gdk_event_get_surface(this.raw.asInstanceOf).asInstanceOf
  )

  def getTime(): UInt = gdk_event_get_time(this.raw.asInstanceOf).value

  def ref(): Event = new Event(
    gdk_event_ref(this.raw.asInstanceOf).asInstanceOf
  )

  def triggersContextMenu(): Boolean =
    gdk_event_triggers_context_menu(this.raw.asInstanceOf).value.!=(0)

  def unref(): Unit = gdk_event_unref(this.raw.asInstanceOf)

end Event
