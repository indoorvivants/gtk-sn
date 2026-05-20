package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkDevicePadInterface

class DevicePadInterface private[gnome] (raw: Ptr[GdkDevicePadInterface]):

  def getUnsafeRawPointer(): Ptr[GdkDevicePadInterface] = this.raw
end DevicePadInterface

object DevicePadInterface:
  def fromRaw(ptr: Ptr[GdkDevicePadInterface]): DevicePadInterface =
    new DevicePadInterface(ptr)
end DevicePadInterface
