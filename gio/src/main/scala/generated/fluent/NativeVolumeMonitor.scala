package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.VolumeMonitor
import sn.gnome.gio.internal.GNativeVolumeMonitor
import sn.gnome.gobject.runtime.*

class NativeVolumeMonitor private[gnome] (raw: Ptr[GNativeVolumeMonitor])
    extends VolumeMonitor(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end NativeVolumeMonitor

object NativeVolumeMonitor:
  def applyUnsafe(ptr: Ptr[GNativeVolumeMonitor])(using Runtime) =
    summon[Runtime].getOrCreate[NativeVolumeMonitor](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new NativeVolumeMonitor(ptr)
    )

end NativeVolumeMonitor
