package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkContentProviderClass: _changed: Signal class closure for `GdkContentProvider::content-changed`
*/
opaque type _GdkContentProviderClass = CStruct10[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GdkContentProvider], Unit], CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit], CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit], CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]], CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]], CFuncPtr7[Ptr[GdkContentProvider], CString, Ptr[_root_.sn.gnome.gio.internal.GOutputStream], CInt, Ptr[_root_.sn.gnome.gio.internal.GCancellable], _root_.sn.gnome.gio.internal.GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.sn.gnome.gio.internal.GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.sn.gnome.gobject.internal.GValue], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _GdkContentProviderClass:
  given _tag: Tag[_GdkContentProviderClass] = Tag.materializeCStruct10Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GdkContentProvider], Unit], CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit], CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit], CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]], CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]], CFuncPtr7[Ptr[GdkContentProvider], CString, Ptr[_root_.sn.gnome.gio.internal.GOutputStream], CInt, Ptr[_root_.sn.gnome.gio.internal.GCancellable], _root_.sn.gnome.gio.internal.GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.sn.gnome.gio.internal.GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.sn.gnome.gobject.internal.GValue], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GdkContentProviderClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def content_changed : CFuncPtr1[Ptr[GdkContentProvider], Unit] = struct._2
      inline def content_changed_=(value: CFuncPtr1[Ptr[GdkContentProvider], Unit]): Unit = (!struct.at2 = value)
      inline def attach_clipboard : CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit] = struct._3
      inline def attach_clipboard_=(value: CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit]): Unit = (!struct.at3 = value)
      inline def detach_clipboard : CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit] = struct._4
      inline def detach_clipboard_=(value: CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit]): Unit = (!struct.at4 = value)
      inline def ref_formats : CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]] = struct._5
      inline def ref_formats_=(value: CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]]): Unit = (!struct.at5 = value)
      inline def ref_storable_formats : CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]] = struct._6
      inline def ref_storable_formats_=(value: CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]]): Unit = (!struct.at6 = value)
      inline def write_mime_type_async : CFuncPtr7[Ptr[GdkContentProvider], CString, Ptr[_root_.sn.gnome.gio.internal.GOutputStream], CInt, Ptr[_root_.sn.gnome.gio.internal.GCancellable], _root_.sn.gnome.gio.internal.GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._7
      inline def write_mime_type_async_=(value: CFuncPtr7[Ptr[GdkContentProvider], CString, Ptr[_root_.sn.gnome.gio.internal.GOutputStream], CInt, Ptr[_root_.sn.gnome.gio.internal.GCancellable], _root_.sn.gnome.gio.internal.GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at7 = value)
      inline def write_mime_type_finish : CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.sn.gnome.gio.internal.GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._8
      inline def write_mime_type_finish_=(value: CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.sn.gnome.gio.internal.GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at8 = value)
      inline def get_value : CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.sn.gnome.gobject.internal.GValue], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._9
      inline def get_value_=(value: CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.sn.gnome.gobject.internal.GValue], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at9 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._10
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at10 = value)
    end extension
  
  // Allocates _GdkContentProviderClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GdkContentProviderClass] = scala.scalanative.unsafe.alloc[_GdkContentProviderClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, content_changed : CFuncPtr1[Ptr[GdkContentProvider], Unit], attach_clipboard : CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit], detach_clipboard : CFuncPtr2[Ptr[GdkContentProvider], Ptr[GdkClipboard], Unit], ref_formats : CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]], ref_storable_formats : CFuncPtr1[Ptr[GdkContentProvider], Ptr[GdkContentFormats]], write_mime_type_async : CFuncPtr7[Ptr[GdkContentProvider], CString, Ptr[_root_.sn.gnome.gio.internal.GOutputStream], CInt, Ptr[_root_.sn.gnome.gio.internal.GCancellable], _root_.sn.gnome.gio.internal.GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], write_mime_type_finish : CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.sn.gnome.gio.internal.GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], get_value : CFuncPtr3[Ptr[GdkContentProvider], Ptr[_root_.sn.gnome.gobject.internal.GValue], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_GdkContentProviderClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).content_changed = content_changed
    (!____ptr).attach_clipboard = attach_clipboard
    (!____ptr).detach_clipboard = detach_clipboard
    (!____ptr).ref_formats = ref_formats
    (!____ptr).ref_storable_formats = ref_storable_formats
    (!____ptr).write_mime_type_async = write_mime_type_async
    (!____ptr).write_mime_type_finish = write_mime_type_finish
    (!____ptr).get_value = get_value
    (!____ptr).padding = padding
    ____ptr