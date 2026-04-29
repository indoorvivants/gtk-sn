package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GInputStreamClass = CStruct15[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr5[Ptr[GInputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr4[Ptr[GInputStream], _root_.sn.gnome.glib.internal.gsize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr3[Ptr[GInputStream], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr7[Ptr[GInputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr6[Ptr[GInputStream], _root_.sn.gnome.glib.internal.gsize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr5[Ptr[GInputStream], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GInputStreamClass:
  given _tag: Tag[_GInputStreamClass] = Tag.materializeCStruct15Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr5[Ptr[GInputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr4[Ptr[GInputStream], _root_.sn.gnome.glib.internal.gsize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr3[Ptr[GInputStream], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr7[Ptr[GInputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr6[Ptr[GInputStream], _root_.sn.gnome.glib.internal.gsize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr5[Ptr[GInputStream], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GInputStreamClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def read_fn : CFuncPtr5[Ptr[GInputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize] = struct._2
      inline def read_fn_=(value: CFuncPtr5[Ptr[GInputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]): Unit = (!struct.at2 = value)
      inline def skip : CFuncPtr4[Ptr[GInputStream], _root_.sn.gnome.glib.internal.gsize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize] = struct._3
      inline def skip_=(value: CFuncPtr4[Ptr[GInputStream], _root_.sn.gnome.glib.internal.gsize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]): Unit = (!struct.at3 = value)
      inline def close_fn : CFuncPtr3[Ptr[GInputStream], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._4
      inline def close_fn_=(value: CFuncPtr3[Ptr[GInputStream], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at4 = value)
      inline def read_async : CFuncPtr7[Ptr[GInputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._5
      inline def read_async_=(value: CFuncPtr7[Ptr[GInputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at5 = value)
      inline def read_finish : CFuncPtr3[Ptr[GInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize] = struct._6
      inline def read_finish_=(value: CFuncPtr3[Ptr[GInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]): Unit = (!struct.at6 = value)
      inline def skip_async : CFuncPtr6[Ptr[GInputStream], _root_.sn.gnome.glib.internal.gsize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._7
      inline def skip_async_=(value: CFuncPtr6[Ptr[GInputStream], _root_.sn.gnome.glib.internal.gsize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at7 = value)
      inline def skip_finish : CFuncPtr3[Ptr[GInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize] = struct._8
      inline def skip_finish_=(value: CFuncPtr3[Ptr[GInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]): Unit = (!struct.at8 = value)
      inline def close_async : CFuncPtr5[Ptr[GInputStream], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._9
      inline def close_async_=(value: CFuncPtr5[Ptr[GInputStream], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at9 = value)
      inline def close_finish : CFuncPtr3[Ptr[GInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._10
      inline def close_finish_=(value: CFuncPtr3[Ptr[GInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at10 = value)
      inline def _g_reserved1 : CFuncPtr0[Unit] = struct._11
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at11 = value)
      inline def _g_reserved2 : CFuncPtr0[Unit] = struct._12
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at12 = value)
      inline def _g_reserved3 : CFuncPtr0[Unit] = struct._13
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at13 = value)
      inline def _g_reserved4 : CFuncPtr0[Unit] = struct._14
      inline def _g_reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at14 = value)
      inline def _g_reserved5 : CFuncPtr0[Unit] = struct._15
      inline def _g_reserved5_=(value: CFuncPtr0[Unit]): Unit = (!struct.at15 = value)
    end extension
  
  // Allocates _GInputStreamClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GInputStreamClass] = scala.scalanative.unsafe.alloc[_GInputStreamClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, read_fn : CFuncPtr5[Ptr[GInputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], skip : CFuncPtr4[Ptr[GInputStream], _root_.sn.gnome.glib.internal.gsize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], close_fn : CFuncPtr3[Ptr[GInputStream], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], read_async : CFuncPtr7[Ptr[GInputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], read_finish : CFuncPtr3[Ptr[GInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], skip_async : CFuncPtr6[Ptr[GInputStream], _root_.sn.gnome.glib.internal.gsize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], skip_finish : CFuncPtr3[Ptr[GInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], close_async : CFuncPtr5[Ptr[GInputStream], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], close_finish : CFuncPtr3[Ptr[GInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit], _g_reserved4 : CFuncPtr0[Unit], _g_reserved5 : CFuncPtr0[Unit])(using Zone): Ptr[_GInputStreamClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).read_fn = read_fn
    (!____ptr).skip = skip
    (!____ptr).close_fn = close_fn
    (!____ptr).read_async = read_async
    (!____ptr).read_finish = read_finish
    (!____ptr).skip_async = skip_async
    (!____ptr).skip_finish = skip_finish
    (!____ptr).close_async = close_async
    (!____ptr).close_finish = close_finish
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    (!____ptr)._g_reserved3 = _g_reserved3
    (!____ptr)._g_reserved4 = _g_reserved4
    (!____ptr)._g_reserved5 = _g_reserved5
    ____ptr