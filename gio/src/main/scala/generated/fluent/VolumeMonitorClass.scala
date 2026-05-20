package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GVolumeMonitorClass
import sn.gnome.gobject.ObjectClass

class VolumeMonitorClass private[gnome] (raw: Ptr[GVolumeMonitorClass]):

  def getUnsafeRawPointer(): Ptr[GVolumeMonitorClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field volume_added]: Field is missing <type>")
  private def volumeAdded__ = ???
  @annotation.compileTimeOnly("[field volume_removed]: Field is missing <type>")
  private def volumeRemoved__ = ???
  @annotation.compileTimeOnly("[field volume_changed]: Field is missing <type>")
  private def volumeChanged__ = ???
  @annotation.compileTimeOnly("[field mount_added]: Field is missing <type>")
  private def mountAdded__ = ???
  @annotation.compileTimeOnly("[field mount_removed]: Field is missing <type>")
  private def mountRemoved__ = ???
  @annotation.compileTimeOnly(
    "[field mount_pre_unmount]: Field is missing <type>"
  )
  private def mountPreUnmount__ = ???
  @annotation.compileTimeOnly("[field mount_changed]: Field is missing <type>")
  private def mountChanged__ = ???
  @annotation.compileTimeOnly(
    "[field drive_connected]: Field is missing <type>"
  )
  private def driveConnected__ = ???
  @annotation.compileTimeOnly(
    "[field drive_disconnected]: Field is missing <type>"
  )
  private def driveDisconnected__ = ???
  @annotation.compileTimeOnly("[field drive_changed]: Field is missing <type>")
  private def driveChanged__ = ???
  @annotation.compileTimeOnly("[field is_supported]: Field is missing <type>")
  private def isSupported__ = ???
  @annotation.compileTimeOnly(
    "[field get_connected_drives]: Field is missing <type>"
  )
  private def getConnectedDrives__ = ???
  @annotation.compileTimeOnly("[field get_volumes]: Field is missing <type>")
  private def getVolumes__ = ???
  @annotation.compileTimeOnly("[field get_mounts]: Field is missing <type>")
  private def getMounts__ = ???
  @annotation.compileTimeOnly(
    "[field get_volume_for_uuid]: Field is missing <type>"
  )
  private def getVolumeForUuid__ = ???
  @annotation.compileTimeOnly(
    "[field get_mount_for_uuid]: Field is missing <type>"
  )
  private def getMountForUuid__ = ???
  @annotation.compileTimeOnly(
    "[field adopt_orphan_mount]: Field is missing <type>"
  )
  private def adoptOrphanMount__ = ???
  @annotation.compileTimeOnly(
    "[field drive_eject_button]: Field is missing <type>"
  )
  private def driveEjectButton__ = ???
  @annotation.compileTimeOnly(
    "[field drive_stop_button]: Field is missing <type>"
  )
  private def driveStopButton__ = ???
  @annotation.compileTimeOnly("[field _g_reserved1]: Field is missing <type>")
  private def GReserved1__ = ???
  @annotation.compileTimeOnly("[field _g_reserved2]: Field is missing <type>")
  private def GReserved2__ = ???
  @annotation.compileTimeOnly("[field _g_reserved3]: Field is missing <type>")
  private def GReserved3__ = ???
  @annotation.compileTimeOnly("[field _g_reserved4]: Field is missing <type>")
  private def GReserved4__ = ???
  @annotation.compileTimeOnly("[field _g_reserved5]: Field is missing <type>")
  private def GReserved5__ = ???
  @annotation.compileTimeOnly("[field _g_reserved6]: Field is missing <type>")
  private def GReserved6__ = ???
end VolumeMonitorClass

object VolumeMonitorClass:
  def fromRaw(ptr: Ptr[GVolumeMonitorClass]): VolumeMonitorClass =
    new VolumeMonitorClass(ptr)
end VolumeMonitorClass
