package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GVolumeIface = CStruct22[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GVolume], Unit], CFuncPtr1[Ptr[GVolume], Unit], CFuncPtr1[Ptr[GVolume], CString], CFuncPtr1[Ptr[GVolume], Ptr[GIcon]], CFuncPtr1[Ptr[GVolume], CString], CFuncPtr1[Ptr[GVolume], Ptr[GDrive]], CFuncPtr1[Ptr[GVolume], Ptr[GMount]], CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr6[Ptr[GVolume], GMountMountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr5[Ptr[GVolume], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GVolume], CString, CString], CFuncPtr1[Ptr[GVolume], Ptr[CString]], CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GVolume], Ptr[GFile]], CFuncPtr6[Ptr[GVolume], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GVolume], Ptr[_root_.sn.gnome.glib.internal.gchar]], CFuncPtr1[Ptr[GVolume], Ptr[GIcon]]]

object _GVolumeIface:
  given _tag: Tag[_GVolumeIface] = Tag.materializeCStruct22Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GVolume], Unit], CFuncPtr1[Ptr[GVolume], Unit], CFuncPtr1[Ptr[GVolume], CString], CFuncPtr1[Ptr[GVolume], Ptr[GIcon]], CFuncPtr1[Ptr[GVolume], CString], CFuncPtr1[Ptr[GVolume], Ptr[GDrive]], CFuncPtr1[Ptr[GVolume], Ptr[GMount]], CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr6[Ptr[GVolume], GMountMountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr5[Ptr[GVolume], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GVolume], CString, CString], CFuncPtr1[Ptr[GVolume], Ptr[CString]], CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GVolume], Ptr[GFile]], CFuncPtr6[Ptr[GVolume], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GVolume], Ptr[_root_.sn.gnome.glib.internal.gchar]], CFuncPtr1[Ptr[GVolume], Ptr[GIcon]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GVolumeIface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def changed : CFuncPtr1[Ptr[GVolume], Unit] = struct._2
      inline def changed_=(value: CFuncPtr1[Ptr[GVolume], Unit]): Unit = (!struct.at2 = value)
      inline def removed : CFuncPtr1[Ptr[GVolume], Unit] = struct._3
      inline def removed_=(value: CFuncPtr1[Ptr[GVolume], Unit]): Unit = (!struct.at3 = value)
      inline def get_name : CFuncPtr1[Ptr[GVolume], CString] = struct._4
      inline def get_name_=(value: CFuncPtr1[Ptr[GVolume], CString]): Unit = (!struct.at4 = value)
      inline def get_icon : CFuncPtr1[Ptr[GVolume], Ptr[GIcon]] = struct._5
      inline def get_icon_=(value: CFuncPtr1[Ptr[GVolume], Ptr[GIcon]]): Unit = (!struct.at5 = value)
      inline def get_uuid : CFuncPtr1[Ptr[GVolume], CString] = struct._6
      inline def get_uuid_=(value: CFuncPtr1[Ptr[GVolume], CString]): Unit = (!struct.at6 = value)
      inline def get_drive : CFuncPtr1[Ptr[GVolume], Ptr[GDrive]] = struct._7
      inline def get_drive_=(value: CFuncPtr1[Ptr[GVolume], Ptr[GDrive]]): Unit = (!struct.at7 = value)
      inline def get_mount : CFuncPtr1[Ptr[GVolume], Ptr[GMount]] = struct._8
      inline def get_mount_=(value: CFuncPtr1[Ptr[GVolume], Ptr[GMount]]): Unit = (!struct.at8 = value)
      inline def can_mount : CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean] = struct._9
      inline def can_mount_=(value: CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at9 = value)
      inline def can_eject : CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean] = struct._10
      inline def can_eject_=(value: CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at10 = value)
      inline def mount_fn : CFuncPtr6[Ptr[GVolume], GMountMountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._11
      inline def mount_fn_=(value: CFuncPtr6[Ptr[GVolume], GMountMountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at11 = value)
      inline def mount_finish : CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._12
      inline def mount_finish_=(value: CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at12 = value)
      inline def eject : CFuncPtr5[Ptr[GVolume], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._13
      inline def eject_=(value: CFuncPtr5[Ptr[GVolume], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at13 = value)
      inline def eject_finish : CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._14
      inline def eject_finish_=(value: CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at14 = value)
      inline def get_identifier : CFuncPtr2[Ptr[GVolume], CString, CString] = struct._15
      inline def get_identifier_=(value: CFuncPtr2[Ptr[GVolume], CString, CString]): Unit = (!struct.at15 = value)
      inline def enumerate_identifiers : CFuncPtr1[Ptr[GVolume], Ptr[CString]] = struct._16
      inline def enumerate_identifiers_=(value: CFuncPtr1[Ptr[GVolume], Ptr[CString]]): Unit = (!struct.at16 = value)
      inline def should_automount : CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean] = struct._17
      inline def should_automount_=(value: CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at17 = value)
      inline def get_activation_root : CFuncPtr1[Ptr[GVolume], Ptr[GFile]] = struct._18
      inline def get_activation_root_=(value: CFuncPtr1[Ptr[GVolume], Ptr[GFile]]): Unit = (!struct.at18 = value)
      inline def eject_with_operation : CFuncPtr6[Ptr[GVolume], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._19
      inline def eject_with_operation_=(value: CFuncPtr6[Ptr[GVolume], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at19 = value)
      inline def eject_with_operation_finish : CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._20
      inline def eject_with_operation_finish_=(value: CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at20 = value)
      inline def get_sort_key : CFuncPtr1[Ptr[GVolume], Ptr[_root_.sn.gnome.glib.internal.gchar]] = struct._21
      inline def get_sort_key_=(value: CFuncPtr1[Ptr[GVolume], Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = (!struct.at21 = value)
      inline def get_symbolic_icon : CFuncPtr1[Ptr[GVolume], Ptr[GIcon]] = struct._22
      inline def get_symbolic_icon_=(value: CFuncPtr1[Ptr[GVolume], Ptr[GIcon]]): Unit = (!struct.at22 = value)
    end extension
  
  // Allocates _GVolumeIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GVolumeIface] = scala.scalanative.unsafe.alloc[_GVolumeIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, changed : CFuncPtr1[Ptr[GVolume], Unit], removed : CFuncPtr1[Ptr[GVolume], Unit], get_name : CFuncPtr1[Ptr[GVolume], CString], get_icon : CFuncPtr1[Ptr[GVolume], Ptr[GIcon]], get_uuid : CFuncPtr1[Ptr[GVolume], CString], get_drive : CFuncPtr1[Ptr[GVolume], Ptr[GDrive]], get_mount : CFuncPtr1[Ptr[GVolume], Ptr[GMount]], can_mount : CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean], can_eject : CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean], mount_fn : CFuncPtr6[Ptr[GVolume], GMountMountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], mount_finish : CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], eject : CFuncPtr5[Ptr[GVolume], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], eject_finish : CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], get_identifier : CFuncPtr2[Ptr[GVolume], CString, CString], enumerate_identifiers : CFuncPtr1[Ptr[GVolume], Ptr[CString]], should_automount : CFuncPtr1[Ptr[GVolume], _root_.sn.gnome.glib.internal.gboolean], get_activation_root : CFuncPtr1[Ptr[GVolume], Ptr[GFile]], eject_with_operation : CFuncPtr6[Ptr[GVolume], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], eject_with_operation_finish : CFuncPtr3[Ptr[GVolume], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], get_sort_key : CFuncPtr1[Ptr[GVolume], Ptr[_root_.sn.gnome.glib.internal.gchar]], get_symbolic_icon : CFuncPtr1[Ptr[GVolume], Ptr[GIcon]])(using Zone): Ptr[_GVolumeIface] =
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