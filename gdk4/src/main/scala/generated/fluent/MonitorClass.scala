package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkMonitorClass

class MonitorClass private[gnome] (raw: Ptr[GdkMonitorClass]):

  def getUnsafeRawPointer(): Ptr[GdkMonitorClass] = this.raw
end MonitorClass

object MonitorClass:
  def fromRaw(ptr: Ptr[GdkMonitorClass]): MonitorClass = new MonitorClass(ptr)
end MonitorClass
