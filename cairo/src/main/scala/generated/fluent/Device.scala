package sn.gnome.cairo

import _root_.sn.gnome.cairo.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.cairo.internal.cairo_device_t

class Device private[gnome] (raw: Ptr[cairo_device_t]):

  def getUnsafeRawPointer(): Ptr[cairo_device_t] = this.raw
end Device

object Device:
  def fromRaw(ptr: Ptr[cairo_device_t]): Device = new Device(ptr)
end Device
