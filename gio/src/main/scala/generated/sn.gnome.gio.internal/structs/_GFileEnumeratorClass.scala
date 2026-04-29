package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GFileEnumeratorClass = CStruct14[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]], CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr6[Ptr[GFileEnumerator], CInt, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Byte]], CFuncPtr5[Ptr[GFileEnumerator], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GFileEnumeratorClass:
  given _tag: Tag[_GFileEnumeratorClass] = Tag.materializeCStruct14Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]], CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr6[Ptr[GFileEnumerator], CInt, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Byte]], CFuncPtr5[Ptr[GFileEnumerator], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GFileEnumeratorClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def next_file : CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]] = struct._2
      inline def next_file_=(value: CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]]): Unit = (!struct.at2 = value)
      inline def close_fn : CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._3
      inline def close_fn_=(value: CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at3 = value)
      inline def next_files_async : CFuncPtr6[Ptr[GFileEnumerator], CInt, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._4
      inline def next_files_async_=(value: CFuncPtr6[Ptr[GFileEnumerator], CInt, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at4 = value)
      inline def next_files_finish : CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[_root_.sn.gnome.glib.internal.GList]] = struct._5.asInstanceOf[CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[_root_.sn.gnome.glib.internal.GList]]]
      inline def next_files_finish_=(value: CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = (!struct.at5 = value.asInstanceOf[CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Byte]]])
      inline def close_async : CFuncPtr5[Ptr[GFileEnumerator], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._6
      inline def close_async_=(value: CFuncPtr5[Ptr[GFileEnumerator], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at6 = value)
      inline def close_finish : CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._7
      inline def close_finish_=(value: CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at7 = value)
      inline def _g_reserved1 : CFuncPtr0[Unit] = struct._8
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at8 = value)
      inline def _g_reserved2 : CFuncPtr0[Unit] = struct._9
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at9 = value)
      inline def _g_reserved3 : CFuncPtr0[Unit] = struct._10
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at10 = value)
      inline def _g_reserved4 : CFuncPtr0[Unit] = struct._11
      inline def _g_reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at11 = value)
      inline def _g_reserved5 : CFuncPtr0[Unit] = struct._12
      inline def _g_reserved5_=(value: CFuncPtr0[Unit]): Unit = (!struct.at12 = value)
      inline def _g_reserved6 : CFuncPtr0[Unit] = struct._13
      inline def _g_reserved6_=(value: CFuncPtr0[Unit]): Unit = (!struct.at13 = value)
      inline def _g_reserved7 : CFuncPtr0[Unit] = struct._14
      inline def _g_reserved7_=(value: CFuncPtr0[Unit]): Unit = (!struct.at14 = value)
    end extension
  
  // Allocates _GFileEnumeratorClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GFileEnumeratorClass] = scala.scalanative.unsafe.alloc[_GFileEnumeratorClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, next_file : CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]], close_fn : CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], next_files_async : CFuncPtr6[Ptr[GFileEnumerator], CInt, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], next_files_finish : CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[_root_.sn.gnome.glib.internal.GList]], close_async : CFuncPtr5[Ptr[GFileEnumerator], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], close_finish : CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit], _g_reserved4 : CFuncPtr0[Unit], _g_reserved5 : CFuncPtr0[Unit], _g_reserved6 : CFuncPtr0[Unit], _g_reserved7 : CFuncPtr0[Unit])(using Zone): Ptr[_GFileEnumeratorClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).next_file = next_file
    (!____ptr).close_fn = close_fn
    (!____ptr).next_files_async = next_files_async
    (!____ptr).next_files_finish = next_files_finish
    (!____ptr).close_async = close_async
    (!____ptr).close_finish = close_finish
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    (!____ptr)._g_reserved3 = _g_reserved3
    (!____ptr)._g_reserved4 = _g_reserved4
    (!____ptr)._g_reserved5 = _g_reserved5
    (!____ptr)._g_reserved6 = _g_reserved6
    (!____ptr)._g_reserved7 = _g_reserved7
    ____ptr