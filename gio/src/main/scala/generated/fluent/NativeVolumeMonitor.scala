package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.VolumeMonitor
import sn.gnome.gio.internal.GNativeVolumeMonitor

class NativeVolumeMonitor(raw: Ptr[GNativeVolumeMonitor])
    extends VolumeMonitor(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end NativeVolumeMonitor
