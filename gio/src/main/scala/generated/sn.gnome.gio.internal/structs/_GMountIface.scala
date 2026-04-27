package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GMountIface: _iface: The parent interface. : Changed signal that is emitted when the mount's state has changed. : The unmounted signal that is emitted when the #GMount have been unmounted. If the recipient is holding references to the object they should release them so the object can be finalized.
*/
opaque type _GMountIface = CArray[CChar, Nat.Digit3[Nat._2, Nat._3, Nat._2]]

object _GMountIface:
  given _tag: Tag[_GMountIface] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._3, Nat._2]](Tag.Byte, Tag.Digit3[Nat._2, Nat._3, Nat._2](Tag.Nat2, Tag.Nat3, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GMountIface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def changed: CFuncPtr1[Ptr[GMount], Unit] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], Unit]]]
      inline def changed_=(value: CFuncPtr1[Ptr[GMount], Unit]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], Unit]]] = value
      inline def unmounted: CFuncPtr1[Ptr[GMount], Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], Unit]]]
      inline def unmounted_=(value: CFuncPtr1[Ptr[GMount], Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], Unit]]] = value
      inline def get_root: CFuncPtr1[Ptr[GMount], Ptr[GFile]] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], Ptr[GFile]]]]
      inline def get_root_=(value: CFuncPtr1[Ptr[GMount], Ptr[GFile]]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], Ptr[GFile]]]] = value
      inline def get_name: CFuncPtr1[Ptr[GMount], CString] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], CString]]]
      inline def get_name_=(value: CFuncPtr1[Ptr[GMount], CString]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], CString]]] = value
      inline def get_icon: CFuncPtr1[Ptr[GMount], Ptr[GIcon]] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], Ptr[GIcon]]]]
      inline def get_icon_=(value: CFuncPtr1[Ptr[GMount], Ptr[GIcon]]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], Ptr[GIcon]]]] = value
      inline def get_uuid: CFuncPtr1[Ptr[GMount], CString] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], CString]]]
      inline def get_uuid_=(value: CFuncPtr1[Ptr[GMount], CString]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], CString]]] = value
      inline def get_volume: CFuncPtr1[Ptr[GMount], Ptr[GVolume]] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], Ptr[GVolume]]]]
      inline def get_volume_=(value: CFuncPtr1[Ptr[GMount], Ptr[GVolume]]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], Ptr[GVolume]]]] = value
      inline def get_drive: CFuncPtr1[Ptr[GMount], Ptr[GDrive]] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], Ptr[GDrive]]]]
      inline def get_drive_=(value: CFuncPtr1[Ptr[GMount], Ptr[GDrive]]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], Ptr[GDrive]]]] = value
      inline def can_unmount: CFuncPtr1[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def can_unmount_=(value: CFuncPtr1[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def can_eject: CFuncPtr1[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def can_eject_=(value: CFuncPtr1[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def unmount: CFuncPtr5[Ptr[GMount], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GMount], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def unmount_=(value: CFuncPtr5[Ptr[GMount], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GMount], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def unmount_finish: CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def unmount_finish_=(value: CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def eject: CFuncPtr5[Ptr[GMount], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GMount], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def eject_=(value: CFuncPtr5[Ptr[GMount], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GMount], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def eject_finish: CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def eject_finish_=(value: CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def remount: CFuncPtr6[Ptr[GMount], GMountMountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GMount], GMountMountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def remount_=(value: CFuncPtr6[Ptr[GMount], GMountMountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GMount], GMountMountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def remount_finish: CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def remount_finish_=(value: CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def guess_content_type: CFuncPtr5[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def guess_content_type_=(value: CFuncPtr5[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def guess_content_type_finish: CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = !struct.at(offsets(18)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]]]
      inline def guess_content_type_finish_=(value: CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]): Unit = !struct.at(offsets(18)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]]] = value
      inline def guess_content_type_sync: CFuncPtr4[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = !struct.at(offsets(19)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]]]
      inline def guess_content_type_sync_=(value: CFuncPtr4[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]): Unit = !struct.at(offsets(19)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]]] = value
      inline def pre_unmount: CFuncPtr1[Ptr[GMount], Unit] = !struct.at(offsets(20)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], Unit]]]
      inline def pre_unmount_=(value: CFuncPtr1[Ptr[GMount], Unit]): Unit = !struct.at(offsets(20)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], Unit]]] = value
      inline def unmount_with_operation: CFuncPtr6[Ptr[GMount], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(21)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GMount], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def unmount_with_operation_=(value: CFuncPtr6[Ptr[GMount], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(21)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GMount], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def unmount_with_operation_finish: CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(22)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def unmount_with_operation_finish_=(value: CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(22)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def eject_with_operation: CFuncPtr6[Ptr[GMount], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(23)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GMount], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def eject_with_operation_=(value: CFuncPtr6[Ptr[GMount], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(23)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GMount], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def eject_with_operation_finish: CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(24)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def eject_with_operation_finish_=(value: CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(24)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def get_default_location: CFuncPtr1[Ptr[GMount], Ptr[GFile]] = !struct.at(offsets(25)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], Ptr[GFile]]]]
      inline def get_default_location_=(value: CFuncPtr1[Ptr[GMount], Ptr[GFile]]): Unit = !struct.at(offsets(25)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], Ptr[GFile]]]] = value
      inline def get_sort_key: CFuncPtr1[Ptr[GMount], Ptr[_root_.sn.gnome.glib.internal.gchar]] = !struct.at(offsets(26)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], Ptr[_root_.sn.gnome.glib.internal.gchar]]]]
      inline def get_sort_key_=(value: CFuncPtr1[Ptr[GMount], Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = !struct.at(offsets(26)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], Ptr[_root_.sn.gnome.glib.internal.gchar]]]] = value
      inline def get_symbolic_icon: CFuncPtr1[Ptr[GMount], Ptr[GIcon]] = !struct.at(offsets(27)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], Ptr[GIcon]]]]
      inline def get_symbolic_icon_=(value: CFuncPtr1[Ptr[GMount], Ptr[GIcon]]): Unit = !struct.at(offsets(27)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMount], Ptr[GIcon]]]] = value
    end extension
  
  // Allocates _GMountIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GMountIface] = scala.scalanative.unsafe.alloc[_GMountIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, changed : CFuncPtr1[Ptr[GMount], Unit], unmounted : CFuncPtr1[Ptr[GMount], Unit], get_root : CFuncPtr1[Ptr[GMount], Ptr[GFile]], get_name : CFuncPtr1[Ptr[GMount], CString], get_icon : CFuncPtr1[Ptr[GMount], Ptr[GIcon]], get_uuid : CFuncPtr1[Ptr[GMount], CString], get_volume : CFuncPtr1[Ptr[GMount], Ptr[GVolume]], get_drive : CFuncPtr1[Ptr[GMount], Ptr[GDrive]], can_unmount : CFuncPtr1[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean], can_eject : CFuncPtr1[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean], unmount : CFuncPtr5[Ptr[GMount], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], unmount_finish : CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], eject : CFuncPtr5[Ptr[GMount], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], eject_finish : CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], remount : CFuncPtr6[Ptr[GMount], GMountMountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], remount_finish : CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], guess_content_type : CFuncPtr5[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], guess_content_type_finish : CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], guess_content_type_sync : CFuncPtr4[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], pre_unmount : CFuncPtr1[Ptr[GMount], Unit], unmount_with_operation : CFuncPtr6[Ptr[GMount], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], unmount_with_operation_finish : CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], eject_with_operation : CFuncPtr6[Ptr[GMount], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], eject_with_operation_finish : CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], get_default_location : CFuncPtr1[Ptr[GMount], Ptr[GFile]], get_sort_key : CFuncPtr1[Ptr[GMount], Ptr[_root_.sn.gnome.glib.internal.gchar]], get_symbolic_icon : CFuncPtr1[Ptr[GMount], Ptr[GIcon]])(using Zone): Ptr[_GMountIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).changed = changed
    (!____ptr).unmounted = unmounted
    (!____ptr).get_root = get_root
    (!____ptr).get_name = get_name
    (!____ptr).get_icon = get_icon
    (!____ptr).get_uuid = get_uuid
    (!____ptr).get_volume = get_volume
    (!____ptr).get_drive = get_drive
    (!____ptr).can_unmount = can_unmount
    (!____ptr).can_eject = can_eject
    (!____ptr).unmount = unmount
    (!____ptr).unmount_finish = unmount_finish
    (!____ptr).eject = eject
    (!____ptr).eject_finish = eject_finish
    (!____ptr).remount = remount
    (!____ptr).remount_finish = remount_finish
    (!____ptr).guess_content_type = guess_content_type
    (!____ptr).guess_content_type_finish = guess_content_type_finish
    (!____ptr).guess_content_type_sync = guess_content_type_sync
    (!____ptr).pre_unmount = pre_unmount
    (!____ptr).unmount_with_operation = unmount_with_operation
    (!____ptr).unmount_with_operation_finish = unmount_with_operation_finish
    (!____ptr).eject_with_operation = eject_with_operation
    (!____ptr).eject_with_operation_finish = eject_with_operation_finish
    (!____ptr).get_default_location = get_default_location
    (!____ptr).get_sort_key = get_sort_key
    (!____ptr).get_symbolic_icon = get_symbolic_icon
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](28)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr1[Ptr[GMount], Unit]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GMount], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GMount], Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[GMount], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GMount], Ptr[GFile]]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr1[Ptr[GMount], Ptr[GFile]]].toInt, alignmentof[CFuncPtr1[Ptr[GMount], CString]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr1[Ptr[GMount], CString]].toInt, alignmentof[CFuncPtr1[Ptr[GMount], Ptr[GIcon]]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr1[Ptr[GMount], Ptr[GIcon]]].toInt, alignmentof[CFuncPtr1[Ptr[GMount], CString]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr1[Ptr[GMount], CString]].toInt, alignmentof[CFuncPtr1[Ptr[GMount], Ptr[GVolume]]].toInt)
    res(8) = align(res(7) + sizeof[CFuncPtr1[Ptr[GMount], Ptr[GVolume]]].toInt, alignmentof[CFuncPtr1[Ptr[GMount], Ptr[GDrive]]].toInt)
    res(9) = align(res(8) + sizeof[CFuncPtr1[Ptr[GMount], Ptr[GDrive]]].toInt, alignmentof[CFuncPtr1[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(10) = align(res(9) + sizeof[CFuncPtr1[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(11) = align(res(10) + sizeof[CFuncPtr1[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr5[Ptr[GMount], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(12) = align(res(11) + sizeof[CFuncPtr5[Ptr[GMount], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(13) = align(res(12) + sizeof[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr5[Ptr[GMount], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(14) = align(res(13) + sizeof[CFuncPtr5[Ptr[GMount], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(15) = align(res(14) + sizeof[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr6[Ptr[GMount], GMountMountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(16) = align(res(15) + sizeof[CFuncPtr6[Ptr[GMount], GMountMountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(17) = align(res(16) + sizeof[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr5[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(18) = align(res(17) + sizeof[CFuncPtr5[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]].toInt)
    res(19) = align(res(18) + sizeof[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]].toInt, alignmentof[CFuncPtr4[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]].toInt)
    res(20) = align(res(19) + sizeof[CFuncPtr4[Ptr[GMount], _root_.sn.gnome.glib.internal.gboolean, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]].toInt, alignmentof[CFuncPtr1[Ptr[GMount], Unit]].toInt)
    res(21) = align(res(20) + sizeof[CFuncPtr1[Ptr[GMount], Unit]].toInt, alignmentof[CFuncPtr6[Ptr[GMount], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(22) = align(res(21) + sizeof[CFuncPtr6[Ptr[GMount], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(23) = align(res(22) + sizeof[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr6[Ptr[GMount], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(24) = align(res(23) + sizeof[CFuncPtr6[Ptr[GMount], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(25) = align(res(24) + sizeof[CFuncPtr3[Ptr[GMount], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GMount], Ptr[GFile]]].toInt)
    res(26) = align(res(25) + sizeof[CFuncPtr1[Ptr[GMount], Ptr[GFile]]].toInt, alignmentof[CFuncPtr1[Ptr[GMount], Ptr[_root_.sn.gnome.glib.internal.gchar]]].toInt)
    res(27) = align(res(26) + sizeof[CFuncPtr1[Ptr[GMount], Ptr[_root_.sn.gnome.glib.internal.gchar]]].toInt, alignmentof[CFuncPtr1[Ptr[GMount], Ptr[GIcon]]].toInt)
    res
  end offsets