package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GOutputStreamClass = CStruct21[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr5[Ptr[GOutputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr5[Ptr[GOutputStream], Ptr[GInputStream], GOutputStreamSpliceFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr3[Ptr[GOutputStream], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GOutputStream], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr7[Ptr[GOutputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr7[Ptr[GOutputStream], Ptr[GInputStream], GOutputStreamSpliceFlags, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr5[Ptr[GOutputStream], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr5[Ptr[GOutputStream], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr6[Ptr[GOutputStream], Ptr[GOutputVector], _root_.sn.gnome.glib.internal.gsize, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr7[Ptr[GOutputStream], Ptr[GOutputVector], _root_.sn.gnome.glib.internal.gsize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr4[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GOutputStreamClass:
  given _tag: Tag[_GOutputStreamClass] = Tag.materializeCStruct21Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr5[Ptr[GOutputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr5[Ptr[GOutputStream], Ptr[GInputStream], GOutputStreamSpliceFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr3[Ptr[GOutputStream], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GOutputStream], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr7[Ptr[GOutputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr7[Ptr[GOutputStream], Ptr[GInputStream], GOutputStreamSpliceFlags, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr5[Ptr[GOutputStream], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr5[Ptr[GOutputStream], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr6[Ptr[GOutputStream], Ptr[GOutputVector], _root_.sn.gnome.glib.internal.gsize, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr7[Ptr[GOutputStream], Ptr[GOutputVector], _root_.sn.gnome.glib.internal.gsize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr4[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GOutputStreamClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def write_fn : CFuncPtr5[Ptr[GOutputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize] = struct._2
      inline def write_fn_=(value: CFuncPtr5[Ptr[GOutputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]): Unit = (!struct.at2 = value)
      inline def splice : CFuncPtr5[Ptr[GOutputStream], Ptr[GInputStream], GOutputStreamSpliceFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize] = struct._3
      inline def splice_=(value: CFuncPtr5[Ptr[GOutputStream], Ptr[GInputStream], GOutputStreamSpliceFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]): Unit = (!struct.at3 = value)
      inline def flush : CFuncPtr3[Ptr[GOutputStream], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._4
      inline def flush_=(value: CFuncPtr3[Ptr[GOutputStream], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at4 = value)
      inline def close_fn : CFuncPtr3[Ptr[GOutputStream], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._5
      inline def close_fn_=(value: CFuncPtr3[Ptr[GOutputStream], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at5 = value)
      inline def write_async : CFuncPtr7[Ptr[GOutputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._6
      inline def write_async_=(value: CFuncPtr7[Ptr[GOutputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at6 = value)
      inline def write_finish : CFuncPtr3[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize] = struct._7
      inline def write_finish_=(value: CFuncPtr3[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]): Unit = (!struct.at7 = value)
      inline def splice_async : CFuncPtr7[Ptr[GOutputStream], Ptr[GInputStream], GOutputStreamSpliceFlags, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._8
      inline def splice_async_=(value: CFuncPtr7[Ptr[GOutputStream], Ptr[GInputStream], GOutputStreamSpliceFlags, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at8 = value)
      inline def splice_finish : CFuncPtr3[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize] = struct._9
      inline def splice_finish_=(value: CFuncPtr3[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]): Unit = (!struct.at9 = value)
      inline def flush_async : CFuncPtr5[Ptr[GOutputStream], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._10
      inline def flush_async_=(value: CFuncPtr5[Ptr[GOutputStream], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at10 = value)
      inline def flush_finish : CFuncPtr3[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._11
      inline def flush_finish_=(value: CFuncPtr3[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at11 = value)
      inline def close_async : CFuncPtr5[Ptr[GOutputStream], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._12
      inline def close_async_=(value: CFuncPtr5[Ptr[GOutputStream], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at12 = value)
      inline def close_finish : CFuncPtr3[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._13
      inline def close_finish_=(value: CFuncPtr3[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at13 = value)
      inline def writev_fn : CFuncPtr6[Ptr[GOutputStream], Ptr[GOutputVector], _root_.sn.gnome.glib.internal.gsize, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._14
      inline def writev_fn_=(value: CFuncPtr6[Ptr[GOutputStream], Ptr[GOutputVector], _root_.sn.gnome.glib.internal.gsize, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at14 = value)
      inline def writev_async : CFuncPtr7[Ptr[GOutputStream], Ptr[GOutputVector], _root_.sn.gnome.glib.internal.gsize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._15
      inline def writev_async_=(value: CFuncPtr7[Ptr[GOutputStream], Ptr[GOutputVector], _root_.sn.gnome.glib.internal.gsize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at15 = value)
      inline def writev_finish : CFuncPtr4[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._16
      inline def writev_finish_=(value: CFuncPtr4[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at16 = value)
      inline def _g_reserved4 : CFuncPtr0[Unit] = struct._17
      inline def _g_reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at17 = value)
      inline def _g_reserved5 : CFuncPtr0[Unit] = struct._18
      inline def _g_reserved5_=(value: CFuncPtr0[Unit]): Unit = (!struct.at18 = value)
      inline def _g_reserved6 : CFuncPtr0[Unit] = struct._19
      inline def _g_reserved6_=(value: CFuncPtr0[Unit]): Unit = (!struct.at19 = value)
      inline def _g_reserved7 : CFuncPtr0[Unit] = struct._20
      inline def _g_reserved7_=(value: CFuncPtr0[Unit]): Unit = (!struct.at20 = value)
      inline def _g_reserved8 : CFuncPtr0[Unit] = struct._21
      inline def _g_reserved8_=(value: CFuncPtr0[Unit]): Unit = (!struct.at21 = value)
    end extension
  
  // Allocates _GOutputStreamClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GOutputStreamClass] = scala.scalanative.unsafe.alloc[_GOutputStreamClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, write_fn : CFuncPtr5[Ptr[GOutputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], splice : CFuncPtr5[Ptr[GOutputStream], Ptr[GInputStream], GOutputStreamSpliceFlags, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], flush : CFuncPtr3[Ptr[GOutputStream], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], close_fn : CFuncPtr3[Ptr[GOutputStream], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], write_async : CFuncPtr7[Ptr[GOutputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], write_finish : CFuncPtr3[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], splice_async : CFuncPtr7[Ptr[GOutputStream], Ptr[GInputStream], GOutputStreamSpliceFlags, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], splice_finish : CFuncPtr3[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], flush_async : CFuncPtr5[Ptr[GOutputStream], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], flush_finish : CFuncPtr3[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], close_async : CFuncPtr5[Ptr[GOutputStream], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], close_finish : CFuncPtr3[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], writev_fn : CFuncPtr6[Ptr[GOutputStream], Ptr[GOutputVector], _root_.sn.gnome.glib.internal.gsize, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], writev_async : CFuncPtr7[Ptr[GOutputStream], Ptr[GOutputVector], _root_.sn.gnome.glib.internal.gsize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], writev_finish : CFuncPtr4[Ptr[GOutputStream], Ptr[GAsyncResult], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], _g_reserved4 : CFuncPtr0[Unit], _g_reserved5 : CFuncPtr0[Unit], _g_reserved6 : CFuncPtr0[Unit], _g_reserved7 : CFuncPtr0[Unit], _g_reserved8 : CFuncPtr0[Unit])(using Zone): Ptr[_GOutputStreamClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).write_fn = write_fn
    (!____ptr).splice = splice
    (!____ptr).flush = flush
    (!____ptr).close_fn = close_fn
    (!____ptr).write_async = write_async
    (!____ptr).write_finish = write_finish
    (!____ptr).splice_async = splice_async
    (!____ptr).splice_finish = splice_finish
    (!____ptr).flush_async = flush_async
    (!____ptr).flush_finish = flush_finish
    (!____ptr).close_async = close_async
    (!____ptr).close_finish = close_finish
    (!____ptr).writev_fn = writev_fn
    (!____ptr).writev_async = writev_async
    (!____ptr).writev_finish = writev_finish
    (!____ptr)._g_reserved4 = _g_reserved4
    (!____ptr)._g_reserved5 = _g_reserved5
    (!____ptr)._g_reserved6 = _g_reserved6
    (!____ptr)._g_reserved7 = _g_reserved7
    (!____ptr)._g_reserved8 = _g_reserved8
    ____ptr