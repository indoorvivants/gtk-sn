package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GFileMonitorPrivate

class FileMonitorPrivate private[gnome] (raw: Ptr[GFileMonitorPrivate]):

  def getUnsafeRawPointer(): Ptr[GFileMonitorPrivate] = this.raw
end FileMonitorPrivate

object FileMonitorPrivate:
  def fromRaw(ptr: Ptr[GFileMonitorPrivate]): FileMonitorPrivate =
    new FileMonitorPrivate(ptr)
end FileMonitorPrivate
