package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GVolumeIface = CArray[CChar, Nat.Digit3[Nat._1, Nat._8, Nat._4]]

object GVolumeIface:
  given _tag: Tag[GVolumeIface] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._8, Nat._4]](Tag.Byte, Tag.Digit3[Nat._1, Nat._8, Nat._4](Tag.Nat1, Tag.Nat8, Tag.Nat4))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GVolumeIface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def changed: CFuncPtr1[Ptr[GVolume], Unit] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], Unit]]]
      inline def changed_=(value: CFuncPtr1[Ptr[GVolume], Unit]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], Unit]]] = value
      inline def removed: CFuncPtr1[Ptr[GVolume], Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], Unit]]]
      inline def removed_=(value: CFuncPtr1[Ptr[GVolume], Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], Unit]]] = value
      inline def get_name: CFuncPtr1[Ptr[GVolume], CString] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], CString]]]
      inline def get_name_=(value: CFuncPtr1[Ptr[GVolume], CString]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], CString]]] = value
      inline def get_icon: CFuncPtr1[Ptr[GVolume], Ptr[GIcon]] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], Ptr[GIcon]]]]
      inline def get_icon_=(value: CFuncPtr1[Ptr[GVolume], Ptr[GIcon]]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], Ptr[GIcon]]]] = value
      inline def get_uuid: CFuncPtr1[Ptr[GVolume], CString] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], CString]]]
      inline def get_uuid_=(value: CFuncPtr1[Ptr[GVolume], CString]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], CString]]] = value
      inline def get_drive: CFuncPtr1[Ptr[GVolume], Ptr[GDrive]] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], Ptr[GDrive]]]]
      inline def get_drive_=(value: CFuncPtr1[Ptr[GVolume], Ptr[GDrive]]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], Ptr[GDrive]]]] = value
      inline def get_mount: CFuncPtr1[Ptr[GVolume], Ptr[GMount]] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], Ptr[GMount]]]]
      inline def get_mount_=(value: CFuncPtr1[Ptr[GVolume], Ptr[GMount]]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], Ptr[GMount]]]] = value
      inline def can_mount: CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def can_mount_=(value: CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def can_eject: CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def can_eject_=(value: CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def mount_fn: CFuncPtr6[Ptr[GVolume], GMountMountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GVolume], GMountMountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def mount_fn_=(value: CFuncPtr6[Ptr[GVolume], GMountMountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GVolume], GMountMountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def mount_finish: CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def mount_finish_=(value: CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def eject: CFuncPtr5[Ptr[GVolume], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GVolume], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def eject_=(value: CFuncPtr5[Ptr[GVolume], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GVolume], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def eject_finish: CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def eject_finish_=(value: CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def get_identifier: CFuncPtr2[Ptr[GVolume], CString, CString] = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolume], CString, CString]]]
      inline def get_identifier_=(value: CFuncPtr2[Ptr[GVolume], CString, CString]): Unit = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GVolume], CString, CString]]] = value
      inline def enumerate_identifiers: CFuncPtr1[Ptr[GVolume], Ptr[CString]] = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], Ptr[CString]]]]
      inline def enumerate_identifiers_=(value: CFuncPtr1[Ptr[GVolume], Ptr[CString]]): Unit = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], Ptr[CString]]]] = value
      inline def should_automount: CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def should_automount_=(value: CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def get_activation_root: CFuncPtr1[Ptr[GVolume], Ptr[GFile]] = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], Ptr[GFile]]]]
      inline def get_activation_root_=(value: CFuncPtr1[Ptr[GVolume], Ptr[GFile]]): Unit = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], Ptr[GFile]]]] = value
      inline def eject_with_operation: CFuncPtr6[Ptr[GVolume], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(18)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GVolume], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def eject_with_operation_=(value: CFuncPtr6[Ptr[GVolume], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(18)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GVolume], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def eject_with_operation_finish: CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(19)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def eject_with_operation_finish_=(value: CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(19)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def get_sort_key: CFuncPtr1[Ptr[GVolume], Ptr[_root_.sn.gnome.glib.internal.gchar]] = !struct.at(offsets(20)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], Ptr[_root_.sn.gnome.glib.internal.gchar]]]]
      inline def get_sort_key_=(value: CFuncPtr1[Ptr[GVolume], Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = !struct.at(offsets(20)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], Ptr[_root_.sn.gnome.glib.internal.gchar]]]] = value
      inline def get_symbolic_icon: CFuncPtr1[Ptr[GVolume], Ptr[GIcon]] = !struct.at(offsets(21)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], Ptr[GIcon]]]]
      inline def get_symbolic_icon_=(value: CFuncPtr1[Ptr[GVolume], Ptr[GIcon]]): Unit = !struct.at(offsets(21)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GVolume], Ptr[GIcon]]]] = value
    end extension
  
  // Allocates GVolumeIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GVolumeIface] = scala.scalanative.unsafe.alloc[GVolumeIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, changed : CFuncPtr1[Ptr[GVolume], Unit], removed : CFuncPtr1[Ptr[GVolume], Unit], get_name : CFuncPtr1[Ptr[GVolume], CString], get_icon : CFuncPtr1[Ptr[GVolume], Ptr[GIcon]], get_uuid : CFuncPtr1[Ptr[GVolume], CString], get_drive : CFuncPtr1[Ptr[GVolume], Ptr[GDrive]], get_mount : CFuncPtr1[Ptr[GVolume], Ptr[GMount]], can_mount : CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean], can_eject : CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean], mount_fn : CFuncPtr6[Ptr[GVolume], GMountMountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], mount_finish : CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], eject : CFuncPtr5[Ptr[GVolume], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], eject_finish : CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], get_identifier : CFuncPtr2[Ptr[GVolume], CString, CString], enumerate_identifiers : CFuncPtr1[Ptr[GVolume], Ptr[CString]], should_automount : CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean], get_activation_root : CFuncPtr1[Ptr[GVolume], Ptr[GFile]], eject_with_operation : CFuncPtr6[Ptr[GVolume], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], eject_with_operation_finish : CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], get_sort_key : CFuncPtr1[Ptr[GVolume], Ptr[_root_.sn.gnome.glib.internal.gchar]], get_symbolic_icon : CFuncPtr1[Ptr[GVolume], Ptr[GIcon]])(using Zone): Ptr[GVolumeIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).changed = changed
    (!____ptr).removed = removed
    (!____ptr).get_name = get_name
    (!____ptr).get_icon = get_icon
    (!____ptr).get_uuid = get_uuid
    (!____ptr).get_drive = get_drive
    (!____ptr).get_mount = get_mount
    (!____ptr).can_mount = can_mount
    (!____ptr).can_eject = can_eject
    (!____ptr).mount_fn = mount_fn
    (!____ptr).mount_finish = mount_finish
    (!____ptr).eject = eject
    (!____ptr).eject_finish = eject_finish
    (!____ptr).get_identifier = get_identifier
    (!____ptr).enumerate_identifiers = enumerate_identifiers
    (!____ptr).should_automount = should_automount
    (!____ptr).get_activation_root = get_activation_root
    (!____ptr).eject_with_operation = eject_with_operation
    (!____ptr).eject_with_operation_finish = eject_with_operation_finish
    (!____ptr).get_sort_key = get_sort_key
    (!____ptr).get_symbolic_icon = get_symbolic_icon
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](22)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr1[Ptr[GVolume], Unit]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GVolume], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GVolume], Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[GVolume], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GVolume], CString]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr1[Ptr[GVolume], CString]].toInt, alignmentof[CFuncPtr1[Ptr[GVolume], Ptr[GIcon]]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr1[Ptr[GVolume], Ptr[GIcon]]].toInt, alignmentof[CFuncPtr1[Ptr[GVolume], CString]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr1[Ptr[GVolume], CString]].toInt, alignmentof[CFuncPtr1[Ptr[GVolume], Ptr[GDrive]]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr1[Ptr[GVolume], Ptr[GDrive]]].toInt, alignmentof[CFuncPtr1[Ptr[GVolume], Ptr[GMount]]].toInt)
    res(8) = align(res(7) + sizeof[CFuncPtr1[Ptr[GVolume], Ptr[GMount]]].toInt, alignmentof[CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(9) = align(res(8) + sizeof[CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(10) = align(res(9) + sizeof[CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr6[Ptr[GVolume], GMountMountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(11) = align(res(10) + sizeof[CFuncPtr6[Ptr[GVolume], GMountMountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(12) = align(res(11) + sizeof[CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr5[Ptr[GVolume], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(13) = align(res(12) + sizeof[CFuncPtr5[Ptr[GVolume], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(14) = align(res(13) + sizeof[CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr2[Ptr[GVolume], CString, CString]].toInt)
    res(15) = align(res(14) + sizeof[CFuncPtr2[Ptr[GVolume], CString, CString]].toInt, alignmentof[CFuncPtr1[Ptr[GVolume], Ptr[CString]]].toInt)
    res(16) = align(res(15) + sizeof[CFuncPtr1[Ptr[GVolume], Ptr[CString]]].toInt, alignmentof[CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(17) = align(res(16) + sizeof[CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GVolume], Ptr[GFile]]].toInt)
    res(18) = align(res(17) + sizeof[CFuncPtr1[Ptr[GVolume], Ptr[GFile]]].toInt, alignmentof[CFuncPtr6[Ptr[GVolume], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(19) = align(res(18) + sizeof[CFuncPtr6[Ptr[GVolume], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(20) = align(res(19) + sizeof[CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GVolume], Ptr[_root_.sn.gnome.glib.internal.gchar]]].toInt)
    res(21) = align(res(20) + sizeof[CFuncPtr1[Ptr[GVolume], Ptr[_root_.sn.gnome.glib.internal.gchar]]].toInt, alignmentof[CFuncPtr1[Ptr[GVolume], Ptr[GIcon]]].toInt)
    res
  end offsets