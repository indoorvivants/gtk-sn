package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GUnixMountMonitorClass

class UnixMountMonitorClass private[gnome] (raw: Ptr[GUnixMountMonitorClass]):

  def getUnsafeRawPointer(): Ptr[GUnixMountMonitorClass] = this.raw

end UnixMountMonitorClass
object UnixMountMonitorClass:
  def fromRaw(ptr: Ptr[GUnixMountMonitorClass]): UnixMountMonitorClass =
    new UnixMountMonitorClass(ptr)
end UnixMountMonitorClass
