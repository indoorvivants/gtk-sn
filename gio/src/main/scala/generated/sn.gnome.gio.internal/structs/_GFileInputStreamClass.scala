package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GFileInputStreamClass = CStruct12[GInputStreamClass, CFuncPtr1[Ptr[GFileInputStream], _root_.sn.gnome.glib.internal.goffset], CFuncPtr1[Ptr[GFileInputStream], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr5[Ptr[GFileInputStream], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[GFileInputStream], CString, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]], CFuncPtr6[Ptr[GFileInputStream], CString, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GFileInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GFileInputStreamClass:
  given _tag: Tag[_GFileInputStreamClass] = Tag.materializeCStruct12Tag[GInputStreamClass, CFuncPtr1[Ptr[GFileInputStream], _root_.sn.gnome.glib.internal.goffset], CFuncPtr1[Ptr[GFileInputStream], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr5[Ptr[GFileInputStream], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[GFileInputStream], CString, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]], CFuncPtr6[Ptr[GFileInputStream], CString, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GFileInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GFileInputStreamClass)
      inline def parent_class : GInputStreamClass = struct._1
      inline def parent_class_=(value: GInputStreamClass): Unit = (!struct.at1 = value)
      inline def tell : CFuncPtr1[Ptr[GFileInputStream], _root_.sn.gnome.glib.internal.goffset] = struct._2
      inline def tell_=(value: CFuncPtr1[Ptr[GFileInputStream], _root_.sn.gnome.glib.internal.goffset]): Unit = (!struct.at2 = value)
      inline def can_seek : CFuncPtr1[Ptr[GFileInputStream], _root_.sn.gnome.glib.internal.gboolean] = struct._3
      inline def can_seek_=(value: CFuncPtr1[Ptr[GFileInputStream], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at3 = value)
      inline def seek : CFuncPtr5[Ptr[GFileInputStream], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._4
      inline def seek_=(value: CFuncPtr5[Ptr[GFileInputStream], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at4 = value)
      inline def query_info : CFuncPtr4[Ptr[GFileInputStream], CString, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]] = struct._5
      inline def query_info_=(value: CFuncPtr4[Ptr[GFileInputStream], CString, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]]): Unit = (!struct.at5 = value)
      inline def query_info_async : CFuncPtr6[Ptr[GFileInputStream], CString, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._6
      inline def query_info_async_=(value: CFuncPtr6[Ptr[GFileInputStream], CString, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at6 = value)
      inline def query_info_finish : CFuncPtr3[Ptr[GFileInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]] = struct._7
      inline def query_info_finish_=(value: CFuncPtr3[Ptr[GFileInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]]): Unit = (!struct.at7 = value)
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
    end extension
  
  // Allocates _GFileInputStreamClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GFileInputStreamClass] = scala.scalanative.unsafe.alloc[_GFileInputStreamClass](1)
  def apply(parent_class : GInputStreamClass, tell : CFuncPtr1[Ptr[GFileInputStream], _root_.sn.gnome.glib.internal.goffset], can_seek : CFuncPtr1[Ptr[GFileInputStream], _root_.sn.gnome.glib.internal.gboolean], seek : CFuncPtr5[Ptr[GFileInputStream], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], query_info : CFuncPtr4[Ptr[GFileInputStream], CString, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]], query_info_async : CFuncPtr6[Ptr[GFileInputStream], CString, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], query_info_finish : CFuncPtr3[Ptr[GFileInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]], _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit], _g_reserved4 : CFuncPtr0[Unit], _g_reserved5 : CFuncPtr0[Unit])(using Zone): Ptr[_GFileInputStreamClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).tell = tell
    (!____ptr).can_seek = can_seek
    (!____ptr).seek = seek
    (!____ptr).query_info = query_info
    (!____ptr).query_info_async = query_info_async
    (!____ptr).query_info_finish = query_info_finish
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    (!____ptr)._g_reserved3 = _g_reserved3
    (!____ptr)._g_reserved4 = _g_reserved4
    (!____ptr)._g_reserved5 = _g_reserved5
    ____ptr