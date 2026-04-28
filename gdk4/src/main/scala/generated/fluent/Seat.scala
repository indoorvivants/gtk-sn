package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Device
import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.internal.GdkSeat
import sn.gnome.gdk4.internal.GdkSeatCapabilities
import sn.gnome.glib.internal.GList
import sn.gnome.gobject.fluent.Object

class Seat(raw: Ptr[GdkSeat]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getCapabilities(): GdkSeatCapabilities = gdk_seat_get_capabilities(
    this.raw.asInstanceOf
  )

  def getDevices(capabilities: GdkSeatCapabilities): Ptr[GList] =
    gdk_seat_get_devices(this.raw.asInstanceOf, capabilities)

  def getDisplay(): Display = new Display(
    gdk_seat_get_display(this.raw.asInstanceOf).asInstanceOf
  )

  def getKeyboard(): Device = new Device(
    gdk_seat_get_keyboard(this.raw.asInstanceOf).asInstanceOf
  )

  def getPointer(): Device = new Device(
    gdk_seat_get_pointer(this.raw.asInstanceOf).asInstanceOf
  )

  def getTools(): Ptr[GList] = gdk_seat_get_tools(this.raw.asInstanceOf)

end Seat
