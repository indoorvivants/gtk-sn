package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GBufferedInputStreamClass = CStruct9[GFilterInputStreamClass, CFuncPtr4[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr6[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GBufferedInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GBufferedInputStreamClass:
  given _tag: Tag[_GBufferedInputStreamClass] = Tag.materializeCStruct9Tag[GFilterInputStreamClass, CFuncPtr4[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr6[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GBufferedInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GBufferedInputStreamClass)
      inline def parent_class : GFilterInputStreamClass = struct._1
      inline def parent_class_=(value: GFilterInputStreamClass): Unit = (!struct.at1 = value)
      inline def fill : CFuncPtr4[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize] = struct._2
      inline def fill_=(value: CFuncPtr4[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]): Unit = (!struct.at2 = value)
      inline def fill_async : CFuncPtr6[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._3
      inline def fill_async_=(value: CFuncPtr6[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at3 = value)
      inline def fill_finish : CFuncPtr3[Ptr[GBufferedInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize] = struct._4
      inline def fill_finish_=(value: CFuncPtr3[Ptr[GBufferedInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]): Unit = (!struct.at4 = value)
      inline def _g_reserved1 : CFuncPtr0[Unit] = struct._5
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at5 = value)
      inline def _g_reserved2 : CFuncPtr0[Unit] = struct._6
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at6 = value)
      inline def _g_reserved3 : CFuncPtr0[Unit] = struct._7
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at7 = value)
      inline def _g_reserved4 : CFuncPtr0[Unit] = struct._8
      inline def _g_reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at8 = value)
      inline def _g_reserved5 : CFuncPtr0[Unit] = struct._9
      inline def _g_reserved5_=(value: CFuncPtr0[Unit]): Unit = (!struct.at9 = value)
    end extension
  
  // Allocates _GBufferedInputStreamClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GBufferedInputStreamClass] = scala.scalanative.unsafe.alloc[_GBufferedInputStreamClass](1)
  def apply(parent_class : GFilterInputStreamClass, fill : CFuncPtr4[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], fill_async : CFuncPtr6[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], fill_finish : CFuncPtr3[Ptr[GBufferedInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit], _g_reserved4 : CFuncPtr0[Unit], _g_reserved5 : CFuncPtr0[Unit])(using Zone): Ptr[_GBufferedInputStreamClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).fill = fill
    (!____ptr).fill_async = fill_async
    (!____ptr).fill_finish = fill_finish
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    (!____ptr)._g_reserved3 = _g_reserved3
    (!____ptr)._g_reserved4 = _g_reserved4
    (!____ptr)._g_reserved5 = _g_reserved5
    ____ptr