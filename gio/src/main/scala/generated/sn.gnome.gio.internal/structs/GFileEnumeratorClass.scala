package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GFileEnumeratorClass = CArray[CChar, Nat.Digit3[Nat._2, Nat._4, Nat._0]]

object GFileEnumeratorClass:
  given _tag: Tag[GFileEnumeratorClass] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._4, Nat._0]](Tag.Byte, Tag.Digit3[Nat._2, Nat._4, Nat._0](Tag.Nat2, Tag.Nat4, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GFileEnumeratorClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def next_file: CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]]]]
      inline def next_file_=(value: CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]]]] = value
      inline def close_fn: CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def close_fn_=(value: CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def next_files_async: CFuncPtr6[Ptr[GFileEnumerator], CInt, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GFileEnumerator], CInt, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def next_files_async_=(value: CFuncPtr6[Ptr[GFileEnumerator], CInt, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GFileEnumerator], CInt, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def next_files_finish: CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[_root_.sn.gnome.glib.internal.GList]] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[_root_.sn.gnome.glib.internal.GList]]]]
      inline def next_files_finish_=(value: CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[_root_.sn.gnome.glib.internal.GList]]]] = value
      inline def close_async: CFuncPtr5[Ptr[GFileEnumerator], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GFileEnumerator], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def close_async_=(value: CFuncPtr5[Ptr[GFileEnumerator], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GFileEnumerator], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def close_finish: CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def close_finish_=(value: CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def _g_reserved1: CFuncPtr0[Unit] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved2: CFuncPtr0[Unit] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved3: CFuncPtr0[Unit] = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved4: CFuncPtr0[Unit] = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved5: CFuncPtr0[Unit] = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved6: CFuncPtr0[Unit] = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved6_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved7: CFuncPtr0[Unit] = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved7_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
    end extension
  
  // Allocates GFileEnumeratorClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GFileEnumeratorClass] = scala.scalanative.unsafe.alloc[GFileEnumeratorClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, next_file : CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]], close_fn : CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], next_files_async : CFuncPtr6[Ptr[GFileEnumerator], CInt, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], next_files_finish : CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[_root_.sn.gnome.glib.internal.GList]], close_async : CFuncPtr5[Ptr[GFileEnumerator], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], close_finish : CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit], _g_reserved4 : CFuncPtr0[Unit], _g_reserved5 : CFuncPtr0[Unit], _g_reserved6 : CFuncPtr0[Unit], _g_reserved7 : CFuncPtr0[Unit])(using Zone): Ptr[GFileEnumeratorClass] =
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
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](14)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]]].toInt, alignmentof[CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr3[Ptr[GFileEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr6[Ptr[GFileEnumerator], CInt, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr6[Ptr[GFileEnumerator], CInt, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[_root_.sn.gnome.glib.internal.GList]]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[_root_.sn.gnome.glib.internal.GList]]].toInt, alignmentof[CFuncPtr5[Ptr[GFileEnumerator], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr5[Ptr[GFileEnumerator], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr3[Ptr[GFileEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(8) = align(res(7) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(9) = align(res(8) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(10) = align(res(9) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(11) = align(res(10) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(12) = align(res(11) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(13) = align(res(12) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res
  end offsets