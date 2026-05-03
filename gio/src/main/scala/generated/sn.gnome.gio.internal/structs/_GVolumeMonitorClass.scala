package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GVolumeMonitorClass = CArray[CChar, Nat.Digit3[Nat._3, Nat._3, Nat._6]]

object _GVolumeMonitorClass:
  given _tag: Tag[_GVolumeMonitorClass] = Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._3, Nat._6]](Tag.Byte, Tag.Digit3[Nat._3, Nat._3, Nat._6](Tag.Nat3, Tag.Nat3, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GVolumeMonitorClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def volume_added: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GVolume], Unit] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GVolume], Unit]]]
      inline def volume_added_=(value: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GVolume], Unit]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GVolume], Unit]]] = value
      inline def volume_removed: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GVolume], Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GVolume], Unit]]]
      inline def volume_removed_=(value: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GVolume], Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GVolume], Unit]]] = value
      inline def volume_changed: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GVolume], Unit] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GVolume], Unit]]]
      inline def volume_changed_=(value: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GVolume], Unit]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GVolume], Unit]]] = value
      inline def mount_added: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit]]]
      inline def mount_added_=(value: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit]]] = value
      inline def mount_removed: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit]]]
      inline def mount_removed_=(value: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit]]] = value
      inline def mount_pre_unmount: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit]]]
      inline def mount_pre_unmount_=(value: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit]]] = value
      inline def mount_changed: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit]]]
      inline def mount_changed_=(value: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit]]] = value
      inline def drive_connected: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]]]
      inline def drive_connected_=(value: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]]] = value
      inline def drive_disconnected: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit] = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]]]
      inline def drive_disconnected_=(value: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]]] = value
      inline def drive_changed: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit] = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]]]
      inline def drive_changed_=(value: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]]] = value
      inline def is_supported: CFuncPtr0[_root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr0[_root_.sn.gnome.glib.internal.gboolean]]]
      inline def is_supported_=(value: CFuncPtr0[_root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr0[_root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def get_connected_drives: CFuncPtr1[Ptr[GVolumeMonitor], Ptr[_root_.sn.gnome.glib.internal.GList]] = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolumeMonitor], Ptr[_root_.sn.gnome.glib.internal.GList]]]]
      inline def get_connected_drives_=(value: CFuncPtr1[Ptr[GVolumeMonitor], Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolumeMonitor], Ptr[_root_.sn.gnome.glib.internal.GList]]]] = value
      inline def get_volumes: CFuncPtr1[Ptr[GVolumeMonitor], Ptr[_root_.sn.gnome.glib.internal.GList]] = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolumeMonitor], Ptr[_root_.sn.gnome.glib.internal.GList]]]]
      inline def get_volumes_=(value: CFuncPtr1[Ptr[GVolumeMonitor], Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolumeMonitor], Ptr[_root_.sn.gnome.glib.internal.GList]]]] = value
      inline def get_mounts: CFuncPtr1[Ptr[GVolumeMonitor], Ptr[_root_.sn.gnome.glib.internal.GList]] = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolumeMonitor], Ptr[_root_.sn.gnome.glib.internal.GList]]]]
      inline def get_mounts_=(value: CFuncPtr1[Ptr[GVolumeMonitor], Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolumeMonitor], Ptr[_root_.sn.gnome.glib.internal.GList]]]] = value
      inline def get_volume_for_uuid: CFuncPtr2[Ptr[GVolumeMonitor], CString, Ptr[GVolume]] = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], CString, Ptr[GVolume]]]]
      inline def get_volume_for_uuid_=(value: CFuncPtr2[Ptr[GVolumeMonitor], CString, Ptr[GVolume]]): Unit = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], CString, Ptr[GVolume]]]] = value
      inline def get_mount_for_uuid: CFuncPtr2[Ptr[GVolumeMonitor], CString, Ptr[GMount]] = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], CString, Ptr[GMount]]]]
      inline def get_mount_for_uuid_=(value: CFuncPtr2[Ptr[GVolumeMonitor], CString, Ptr[GMount]]): Unit = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], CString, Ptr[GMount]]]] = value
      inline def adopt_orphan_mount: CFuncPtr2[Ptr[GMount], Ptr[GVolumeMonitor], Ptr[GVolume]] = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GMount], Ptr[GVolumeMonitor], Ptr[GVolume]]]]
      inline def adopt_orphan_mount_=(value: CFuncPtr2[Ptr[GMount], Ptr[GVolumeMonitor], Ptr[GVolume]]): Unit = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GMount], Ptr[GVolumeMonitor], Ptr[GVolume]]]] = value
      inline def drive_eject_button: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit] = !struct.at(offsets(18)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]]]
      inline def drive_eject_button_=(value: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]): Unit = !struct.at(offsets(18)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]]] = value
      inline def drive_stop_button: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit] = !struct.at(offsets(19)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]]]
      inline def drive_stop_button_=(value: CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]): Unit = !struct.at(offsets(19)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]]] = value
      inline def _g_reserved1: CFuncPtr0[Unit] = !struct.at(offsets(20)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(20)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved2: CFuncPtr0[Unit] = !struct.at(offsets(21)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(21)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved3: CFuncPtr0[Unit] = !struct.at(offsets(22)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(22)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved4: CFuncPtr0[Unit] = !struct.at(offsets(23)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(23)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved5: CFuncPtr0[Unit] = !struct.at(offsets(24)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(24)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved6: CFuncPtr0[Unit] = !struct.at(offsets(25)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved6_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(25)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
    end extension
  
  // Allocates _GVolumeMonitorClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GVolumeMonitorClass] = scala.scalanative.unsafe.alloc[_GVolumeMonitorClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, volume_added : CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GVolume], Unit], volume_removed : CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GVolume], Unit], volume_changed : CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GVolume], Unit], mount_added : CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit], mount_removed : CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit], mount_pre_unmount : CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit], mount_changed : CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit], drive_connected : CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit], drive_disconnected : CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit], drive_changed : CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit], is_supported : CFuncPtr0[_root_.sn.gnome.glib.internal.gboolean], get_connected_drives : CFuncPtr1[Ptr[GVolumeMonitor], Ptr[_root_.sn.gnome.glib.internal.GList]], get_volumes : CFuncPtr1[Ptr[GVolumeMonitor], Ptr[_root_.sn.gnome.glib.internal.GList]], get_mounts : CFuncPtr1[Ptr[GVolumeMonitor], Ptr[_root_.sn.gnome.glib.internal.GList]], get_volume_for_uuid : CFuncPtr2[Ptr[GVolumeMonitor], CString, Ptr[GVolume]], get_mount_for_uuid : CFuncPtr2[Ptr[GVolumeMonitor], CString, Ptr[GMount]], adopt_orphan_mount : CFuncPtr2[Ptr[GMount], Ptr[GVolumeMonitor], Ptr[GVolume]], drive_eject_button : CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit], drive_stop_button : CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit], _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit], _g_reserved4 : CFuncPtr0[Unit], _g_reserved5 : CFuncPtr0[Unit], _g_reserved6 : CFuncPtr0[Unit])(using Zone): Ptr[_GVolumeMonitorClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).volume_added = volume_added
    (!____ptr).volume_removed = volume_removed
    (!____ptr).volume_changed = volume_changed
    (!____ptr).mount_added = mount_added
    (!____ptr).mount_removed = mount_removed
    (!____ptr).mount_pre_unmount = mount_pre_unmount
    (!____ptr).mount_changed = mount_changed
    (!____ptr).drive_connected = drive_connected
    (!____ptr).drive_disconnected = drive_disconnected
    (!____ptr).drive_changed = drive_changed
    (!____ptr).is_supported = is_supported
    (!____ptr).get_connected_drives = get_connected_drives
    (!____ptr).get_volumes = get_volumes
    (!____ptr).get_mounts = get_mounts
    (!____ptr).get_volume_for_uuid = get_volume_for_uuid
    (!____ptr).get_mount_for_uuid = get_mount_for_uuid
    (!____ptr).adopt_orphan_mount = adopt_orphan_mount
    (!____ptr).drive_eject_button = drive_eject_button
    (!____ptr).drive_stop_button = drive_stop_button
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    (!____ptr)._g_reserved3 = _g_reserved3
    (!____ptr)._g_reserved4 = _g_reserved4
    (!____ptr)._g_reserved5 = _g_reserved5
    (!____ptr)._g_reserved6 = _g_reserved6
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](26)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GVolume], Unit]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GVolume], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GVolume], Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GVolume], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GVolume], Unit]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GVolume], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit]].toInt)
    res(8) = align(res(7) + sizeof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GMount], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]].toInt)
    res(9) = align(res(8) + sizeof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]].toInt)
    res(10) = align(res(9) + sizeof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]].toInt)
    res(11) = align(res(10) + sizeof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]].toInt, alignmentof[CFuncPtr0[_root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(12) = align(res(11) + sizeof[CFuncPtr0[_root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GVolumeMonitor], Ptr[_root_.sn.gnome.glib.internal.GList]]].toInt)
    res(13) = align(res(12) + sizeof[CFuncPtr1[Ptr[GVolumeMonitor], Ptr[_root_.sn.gnome.glib.internal.GList]]].toInt, alignmentof[CFuncPtr1[Ptr[GVolumeMonitor], Ptr[_root_.sn.gnome.glib.internal.GList]]].toInt)
    res(14) = align(res(13) + sizeof[CFuncPtr1[Ptr[GVolumeMonitor], Ptr[_root_.sn.gnome.glib.internal.GList]]].toInt, alignmentof[CFuncPtr1[Ptr[GVolumeMonitor], Ptr[_root_.sn.gnome.glib.internal.GList]]].toInt)
    res(15) = align(res(14) + sizeof[CFuncPtr1[Ptr[GVolumeMonitor], Ptr[_root_.sn.gnome.glib.internal.GList]]].toInt, alignmentof[CFuncPtr2[Ptr[GVolumeMonitor], CString, Ptr[GVolume]]].toInt)
    res(16) = align(res(15) + sizeof[CFuncPtr2[Ptr[GVolumeMonitor], CString, Ptr[GVolume]]].toInt, alignmentof[CFuncPtr2[Ptr[GVolumeMonitor], CString, Ptr[GMount]]].toInt)
    res(17) = align(res(16) + sizeof[CFuncPtr2[Ptr[GVolumeMonitor], CString, Ptr[GMount]]].toInt, alignmentof[CFuncPtr2[Ptr[GMount], Ptr[GVolumeMonitor], Ptr[GVolume]]].toInt)
    res(18) = align(res(17) + sizeof[CFuncPtr2[Ptr[GMount], Ptr[GVolumeMonitor], Ptr[GVolume]]].toInt, alignmentof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]].toInt)
    res(19) = align(res(18) + sizeof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]].toInt)
    res(20) = align(res(19) + sizeof[CFuncPtr2[Ptr[GVolumeMonitor], Ptr[GDrive], Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(21) = align(res(20) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(22) = align(res(21) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(23) = align(res(22) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(24) = align(res(23) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(25) = align(res(24) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res
  end offsets