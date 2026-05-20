package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.VolumeMonitorClass
import sn.gnome.gio.internal.GNativeVolumeMonitorClass

class NativeVolumeMonitorClass private[gnome] (
    raw: Ptr[GNativeVolumeMonitorClass]
):

  def getUnsafeRawPointer(): Ptr[GNativeVolumeMonitorClass] = this.raw

  def parentClass: sn.gnome.gio.VolumeMonitorClass /* None */ =
    (!raw).parent_class.asInstanceOf[GVolumeMonitorClass]
  @annotation.compileTimeOnly(
    "[field get_mount_for_mount_path]: Field is missing <type>"
  )
  private def getMountForMountPath__ = ???
end NativeVolumeMonitorClass

object NativeVolumeMonitorClass:
  def fromRaw(ptr: Ptr[GNativeVolumeMonitorClass]): NativeVolumeMonitorClass =
    new NativeVolumeMonitorClass(ptr)
end NativeVolumeMonitorClass
