package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDriveIface = CArray[CChar, Nat.Digit3[Nat._2, Nat._7, Nat._2]]

object GDriveIface:
  given _tag: Tag[GDriveIface] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._7, Nat._2]](Tag.Byte, Tag.Digit3[Nat._2, Nat._7, Nat._2](Tag.Nat2, Tag.Nat7, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDriveIface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def changed: CFuncPtr1[Ptr[GDrive], Unit] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], Unit]]]
      inline def changed_=(value: CFuncPtr1[Ptr[GDrive], Unit]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], Unit]]] = value
      inline def disconnected: CFuncPtr1[Ptr[GDrive], Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], Unit]]]
      inline def disconnected_=(value: CFuncPtr1[Ptr[GDrive], Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], Unit]]] = value
      inline def eject_button: CFuncPtr1[Ptr[GDrive], Unit] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], Unit]]]
      inline def eject_button_=(value: CFuncPtr1[Ptr[GDrive], Unit]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], Unit]]] = value
      inline def get_name: CFuncPtr1[Ptr[GDrive], CString] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], CString]]]
      inline def get_name_=(value: CFuncPtr1[Ptr[GDrive], CString]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], CString]]] = value
      inline def get_icon: CFuncPtr1[Ptr[GDrive], Ptr[GIcon]] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], Ptr[GIcon]]]]
      inline def get_icon_=(value: CFuncPtr1[Ptr[GDrive], Ptr[GIcon]]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], Ptr[GIcon]]]] = value
      inline def has_volumes: CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def has_volumes_=(value: CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def get_volumes: CFuncPtr1[Ptr[GDrive], Ptr[_root_.sn.gnome.glib.internal.GList]] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], Ptr[_root_.sn.gnome.glib.internal.GList]]]]
      inline def get_volumes_=(value: CFuncPtr1[Ptr[GDrive], Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], Ptr[_root_.sn.gnome.glib.internal.GList]]]] = value
      inline def is_media_removable: CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def is_media_removable_=(value: CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def has_media: CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def has_media_=(value: CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def is_media_check_automatic: CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def is_media_check_automatic_=(value: CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def can_eject: CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def can_eject_=(value: CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def can_poll_for_media: CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def can_poll_for_media_=(value: CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def eject: CFuncPtr5[Ptr[GDrive], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GDrive], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def eject_=(value: CFuncPtr5[Ptr[GDrive], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GDrive], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def eject_finish: CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def eject_finish_=(value: CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def poll_for_media: CFuncPtr4[Ptr[GDrive], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GDrive], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def poll_for_media_=(value: CFuncPtr4[Ptr[GDrive], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GDrive], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def poll_for_media_finish: CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def poll_for_media_finish_=(value: CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(16)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def get_identifier: CFuncPtr2[Ptr[GDrive], CString, CString] = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDrive], CString, CString]]]
      inline def get_identifier_=(value: CFuncPtr2[Ptr[GDrive], CString, CString]): Unit = !struct.at(offsets(17)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDrive], CString, CString]]] = value
      inline def enumerate_identifiers: CFuncPtr1[Ptr[GDrive], Ptr[CString]] = !struct.at(offsets(18)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], Ptr[CString]]]]
      inline def enumerate_identifiers_=(value: CFuncPtr1[Ptr[GDrive], Ptr[CString]]): Unit = !struct.at(offsets(18)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], Ptr[CString]]]] = value
      inline def get_start_stop_type: CFuncPtr1[Ptr[GDrive], GDriveStartStopType] = !struct.at(offsets(19)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], GDriveStartStopType]]]
      inline def get_start_stop_type_=(value: CFuncPtr1[Ptr[GDrive], GDriveStartStopType]): Unit = !struct.at(offsets(19)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], GDriveStartStopType]]] = value
      inline def can_start: CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(20)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def can_start_=(value: CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(20)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def can_start_degraded: CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(21)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def can_start_degraded_=(value: CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(21)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def start: CFuncPtr6[Ptr[GDrive], GDriveStartFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(22)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GDrive], GDriveStartFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def start_=(value: CFuncPtr6[Ptr[GDrive], GDriveStartFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(22)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GDrive], GDriveStartFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def start_finish: CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(23)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def start_finish_=(value: CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(23)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def can_stop: CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(24)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def can_stop_=(value: CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(24)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def stop: CFuncPtr6[Ptr[GDrive], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(25)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GDrive], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def stop_=(value: CFuncPtr6[Ptr[GDrive], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(25)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GDrive], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def stop_finish: CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(26)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def stop_finish_=(value: CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(26)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def stop_button: CFuncPtr1[Ptr[GDrive], Unit] = !struct.at(offsets(27)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], Unit]]]
      inline def stop_button_=(value: CFuncPtr1[Ptr[GDrive], Unit]): Unit = !struct.at(offsets(27)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], Unit]]] = value
      inline def eject_with_operation: CFuncPtr6[Ptr[GDrive], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(28)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GDrive], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def eject_with_operation_=(value: CFuncPtr6[Ptr[GDrive], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(28)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GDrive], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def eject_with_operation_finish: CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(29)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def eject_with_operation_finish_=(value: CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(29)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def get_sort_key: CFuncPtr1[Ptr[GDrive], Ptr[_root_.sn.gnome.glib.internal.gchar]] = !struct.at(offsets(30)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], Ptr[_root_.sn.gnome.glib.internal.gchar]]]]
      inline def get_sort_key_=(value: CFuncPtr1[Ptr[GDrive], Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = !struct.at(offsets(30)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], Ptr[_root_.sn.gnome.glib.internal.gchar]]]] = value
      inline def get_symbolic_icon: CFuncPtr1[Ptr[GDrive], Ptr[GIcon]] = !struct.at(offsets(31)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], Ptr[GIcon]]]]
      inline def get_symbolic_icon_=(value: CFuncPtr1[Ptr[GDrive], Ptr[GIcon]]): Unit = !struct.at(offsets(31)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], Ptr[GIcon]]]] = value
      inline def is_removable: CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(32)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def is_removable_=(value: CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(32)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]]] = value
    end extension
  
  // Allocates GDriveIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDriveIface] = scala.scalanative.unsafe.alloc[GDriveIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, changed : CFuncPtr1[Ptr[GDrive], Unit], disconnected : CFuncPtr1[Ptr[GDrive], Unit], eject_button : CFuncPtr1[Ptr[GDrive], Unit], get_name : CFuncPtr1[Ptr[GDrive], CString], get_icon : CFuncPtr1[Ptr[GDrive], Ptr[GIcon]], has_volumes : CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean], get_volumes : CFuncPtr1[Ptr[GDrive], Ptr[_root_.sn.gnome.glib.internal.GList]], is_media_removable : CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean], has_media : CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean], is_media_check_automatic : CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean], can_eject : CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean], can_poll_for_media : CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean], eject : CFuncPtr5[Ptr[GDrive], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], eject_finish : CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], poll_for_media : CFuncPtr4[Ptr[GDrive], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], poll_for_media_finish : CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], get_identifier : CFuncPtr2[Ptr[GDrive], CString, CString], enumerate_identifiers : CFuncPtr1[Ptr[GDrive], Ptr[CString]], get_start_stop_type : CFuncPtr1[Ptr[GDrive], GDriveStartStopType], can_start : CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean], can_start_degraded : CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean], start : CFuncPtr6[Ptr[GDrive], GDriveStartFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], start_finish : CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], can_stop : CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean], stop : CFuncPtr6[Ptr[GDrive], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], stop_finish : CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], stop_button : CFuncPtr1[Ptr[GDrive], Unit], eject_with_operation : CFuncPtr6[Ptr[GDrive], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], eject_with_operation_finish : CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], get_sort_key : CFuncPtr1[Ptr[GDrive], Ptr[_root_.sn.gnome.glib.internal.gchar]], get_symbolic_icon : CFuncPtr1[Ptr[GDrive], Ptr[GIcon]], is_removable : CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[GDriveIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).changed = changed
    (!____ptr).disconnected = disconnected
    (!____ptr).eject_button = eject_button
    (!____ptr).get_name = get_name
    (!____ptr).get_icon = get_icon
    (!____ptr).has_volumes = has_volumes
    (!____ptr).get_volumes = get_volumes
    (!____ptr).is_media_removable = is_media_removable
    (!____ptr).has_media = has_media
    (!____ptr).is_media_check_automatic = is_media_check_automatic
    (!____ptr).can_eject = can_eject
    (!____ptr).can_poll_for_media = can_poll_for_media
    (!____ptr).eject = eject
    (!____ptr).eject_finish = eject_finish
    (!____ptr).poll_for_media = poll_for_media
    (!____ptr).poll_for_media_finish = poll_for_media_finish
    (!____ptr).get_identifier = get_identifier
    (!____ptr).enumerate_identifiers = enumerate_identifiers
    (!____ptr).get_start_stop_type = get_start_stop_type
    (!____ptr).can_start = can_start
    (!____ptr).can_start_degraded = can_start_degraded
    (!____ptr).start = start
    (!____ptr).start_finish = start_finish
    (!____ptr).can_stop = can_stop
    (!____ptr).stop = stop
    (!____ptr).stop_finish = stop_finish
    (!____ptr).stop_button = stop_button
    (!____ptr).eject_with_operation = eject_with_operation
    (!____ptr).eject_with_operation_finish = eject_with_operation_finish
    (!____ptr).get_sort_key = get_sort_key
    (!____ptr).get_symbolic_icon = get_symbolic_icon
    (!____ptr).is_removable = is_removable
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](33)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr1[Ptr[GDrive], Unit]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GDrive], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GDrive], Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[GDrive], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GDrive], Unit]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr1[Ptr[GDrive], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GDrive], CString]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr1[Ptr[GDrive], CString]].toInt, alignmentof[CFuncPtr1[Ptr[GDrive], Ptr[GIcon]]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr1[Ptr[GDrive], Ptr[GIcon]]].toInt, alignmentof[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GDrive], Ptr[_root_.sn.gnome.glib.internal.GList]]].toInt)
    res(8) = align(res(7) + sizeof[CFuncPtr1[Ptr[GDrive], Ptr[_root_.sn.gnome.glib.internal.GList]]].toInt, alignmentof[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(9) = align(res(8) + sizeof[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(10) = align(res(9) + sizeof[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(11) = align(res(10) + sizeof[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(12) = align(res(11) + sizeof[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(13) = align(res(12) + sizeof[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr5[Ptr[GDrive], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(14) = align(res(13) + sizeof[CFuncPtr5[Ptr[GDrive], GMountUnmountFlags, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(15) = align(res(14) + sizeof[CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr4[Ptr[GDrive], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(16) = align(res(15) + sizeof[CFuncPtr4[Ptr[GDrive], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(17) = align(res(16) + sizeof[CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr2[Ptr[GDrive], CString, CString]].toInt)
    res(18) = align(res(17) + sizeof[CFuncPtr2[Ptr[GDrive], CString, CString]].toInt, alignmentof[CFuncPtr1[Ptr[GDrive], Ptr[CString]]].toInt)
    res(19) = align(res(18) + sizeof[CFuncPtr1[Ptr[GDrive], Ptr[CString]]].toInt, alignmentof[CFuncPtr1[Ptr[GDrive], GDriveStartStopType]].toInt)
    res(20) = align(res(19) + sizeof[CFuncPtr1[Ptr[GDrive], GDriveStartStopType]].toInt, alignmentof[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(21) = align(res(20) + sizeof[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(22) = align(res(21) + sizeof[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr6[Ptr[GDrive], GDriveStartFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(23) = align(res(22) + sizeof[CFuncPtr6[Ptr[GDrive], GDriveStartFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(24) = align(res(23) + sizeof[CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(25) = align(res(24) + sizeof[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr6[Ptr[GDrive], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(26) = align(res(25) + sizeof[CFuncPtr6[Ptr[GDrive], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(27) = align(res(26) + sizeof[CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GDrive], Unit]].toInt)
    res(28) = align(res(27) + sizeof[CFuncPtr1[Ptr[GDrive], Unit]].toInt, alignmentof[CFuncPtr6[Ptr[GDrive], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(29) = align(res(28) + sizeof[CFuncPtr6[Ptr[GDrive], GMountUnmountFlags, Ptr[GMountOperation], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(30) = align(res(29) + sizeof[CFuncPtr3[Ptr[GDrive], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GDrive], Ptr[_root_.sn.gnome.glib.internal.gchar]]].toInt)
    res(31) = align(res(30) + sizeof[CFuncPtr1[Ptr[GDrive], Ptr[_root_.sn.gnome.glib.internal.gchar]]].toInt, alignmentof[CFuncPtr1[Ptr[GDrive], Ptr[GIcon]]].toInt)
    res(32) = align(res(31) + sizeof[CFuncPtr1[Ptr[GDrive], Ptr[GIcon]]].toInt, alignmentof[CFuncPtr1[Ptr[GDrive], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res
  end offsets