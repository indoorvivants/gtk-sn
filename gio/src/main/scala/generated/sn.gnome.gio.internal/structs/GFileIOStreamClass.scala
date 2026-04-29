package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GFileIOStreamClass = CArray[CChar, Nat.Digit3[Nat._3, Nat._6, Nat._8]]

object GFileIOStreamClass:
  given _tag: Tag[GFileIOStreamClass] = Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._6, Nat._8]](Tag.Byte, Tag.Digit3[Nat._3, Nat._6, Nat._8](Tag.Nat3, Tag.Nat6, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GFileIOStreamClass)
      inline def parent_class: GIOStreamClass = !struct.at(offsets(0)).asInstanceOf[Ptr[GIOStreamClass]]
      inline def parent_class_=(value: GIOStreamClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GIOStreamClass]] = value
      inline def tell: CFuncPtr1[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.goffset] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.goffset]]]
      inline def tell_=(value: CFuncPtr1[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.goffset]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.goffset]]] = value
      inline def can_seek: CFuncPtr1[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def can_seek_=(value: CFuncPtr1[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def seek: CFuncPtr5[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def seek_=(value: CFuncPtr5[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def can_truncate: CFuncPtr1[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def can_truncate_=(value: CFuncPtr1[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def truncate_fn: CFuncPtr4[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.goffset, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.goffset, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def truncate_fn_=(value: CFuncPtr4[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.goffset, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.goffset, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def query_info: CFuncPtr4[Ptr[GFileIOStream], CString, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GFileIOStream], CString, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]]]]
      inline def query_info_=(value: CFuncPtr4[Ptr[GFileIOStream], CString, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GFileIOStream], CString, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]]]] = value
      inline def query_info_async: CFuncPtr6[Ptr[GFileIOStream], CString, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GFileIOStream], CString, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def query_info_async_=(value: CFuncPtr6[Ptr[GFileIOStream], CString, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GFileIOStream], CString, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def query_info_finish: CFuncPtr3[Ptr[GFileIOStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GFileIOStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]]]]
      inline def query_info_finish_=(value: CFuncPtr3[Ptr[GFileIOStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GFileIOStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]]]] = value
      inline def get_etag: CFuncPtr1[Ptr[GFileIOStream], CString] = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GFileIOStream], CString]]]
      inline def get_etag_=(value: CFuncPtr1[Ptr[GFileIOStream], CString]): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GFileIOStream], CString]]] = value
      inline def _g_reserved1: CFuncPtr0[Unit] = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved2: CFuncPtr0[Unit] = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved3: CFuncPtr0[Unit] = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved4: CFuncPtr0[Unit] = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved5: CFuncPtr0[Unit] = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
    end extension
  
  // Allocates GFileIOStreamClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GFileIOStreamClass] = scala.scalanative.unsafe.alloc[GFileIOStreamClass](1)
  def apply(parent_class : GIOStreamClass, tell : CFuncPtr1[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.goffset], can_seek : CFuncPtr1[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.gboolean], seek : CFuncPtr5[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], can_truncate : CFuncPtr1[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.gboolean], truncate_fn : CFuncPtr4[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.goffset, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], query_info : CFuncPtr4[Ptr[GFileIOStream], CString, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]], query_info_async : CFuncPtr6[Ptr[GFileIOStream], CString, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], query_info_finish : CFuncPtr3[Ptr[GFileIOStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]], get_etag : CFuncPtr1[Ptr[GFileIOStream], CString], _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit], _g_reserved4 : CFuncPtr0[Unit], _g_reserved5 : CFuncPtr0[Unit])(using Zone): Ptr[GFileIOStreamClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).tell = tell
    (!____ptr).can_seek = can_seek
    (!____ptr).seek = seek
    (!____ptr).can_truncate = can_truncate
    (!____ptr).truncate_fn = truncate_fn
    (!____ptr).query_info = query_info
    (!____ptr).query_info_async = query_info_async
    (!____ptr).query_info_finish = query_info_finish
    (!____ptr).get_etag = get_etag
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    (!____ptr)._g_reserved3 = _g_reserved3
    (!____ptr)._g_reserved4 = _g_reserved4
    (!____ptr)._g_reserved5 = _g_reserved5
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](15)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[GIOStreamClass].toInt)
    res(1) = align(res(0) + sizeof[GIOStreamClass].toInt, alignmentof[CFuncPtr1[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.goffset]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.goffset]].toInt, alignmentof[CFuncPtr1[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr5[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr5[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.GSeekType, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr1[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr4[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.goffset, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr4[Ptr[GFileIOStream], _root_.sn.gnome.glib.internal.goffset, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr4[Ptr[GFileIOStream], CString, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr4[Ptr[GFileIOStream], CString, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]]].toInt, alignmentof[CFuncPtr6[Ptr[GFileIOStream], CString, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(8) = align(res(7) + sizeof[CFuncPtr6[Ptr[GFileIOStream], CString, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GFileIOStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]]].toInt)
    res(9) = align(res(8) + sizeof[CFuncPtr3[Ptr[GFileIOStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GFileInfo]]].toInt, alignmentof[CFuncPtr1[Ptr[GFileIOStream], CString]].toInt)
    res(10) = align(res(9) + sizeof[CFuncPtr1[Ptr[GFileIOStream], CString]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(11) = align(res(10) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(12) = align(res(11) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(13) = align(res(12) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(14) = align(res(13) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res
  end offsets