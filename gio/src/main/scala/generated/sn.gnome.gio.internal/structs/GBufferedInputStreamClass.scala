package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GBufferedInputStreamClass = CArray[CChar, Nat.Digit3[Nat._3, Nat._3, Nat._6]]

object GBufferedInputStreamClass:
  given _tag: Tag[GBufferedInputStreamClass] = Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._3, Nat._6]](Tag.Byte, Tag.Digit3[Nat._3, Nat._3, Nat._6](Tag.Nat3, Tag.Nat3, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GBufferedInputStreamClass)
      inline def parent_class: GFilterInputStreamClass = !struct.at(offsets(0)).asInstanceOf[Ptr[GFilterInputStreamClass]]
      inline def parent_class_=(value: GFilterInputStreamClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GFilterInputStreamClass]] = value
      inline def fill: CFuncPtr4[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]]]
      inline def fill_=(value: CFuncPtr4[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]]] = value
      inline def fill_async: CFuncPtr6[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def fill_async_=(value: CFuncPtr6[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def fill_finish: CFuncPtr3[Ptr[GBufferedInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GBufferedInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]]]
      inline def fill_finish_=(value: CFuncPtr3[Ptr[GBufferedInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GBufferedInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]]] = value
      inline def _g_reserved1: CFuncPtr0[Unit] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved2: CFuncPtr0[Unit] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved3: CFuncPtr0[Unit] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved4: CFuncPtr0[Unit] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved5: CFuncPtr0[Unit] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
    end extension
  
  // Allocates GBufferedInputStreamClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GBufferedInputStreamClass] = scala.scalanative.unsafe.alloc[GBufferedInputStreamClass](1)
  def apply(parent_class : GFilterInputStreamClass, fill : CFuncPtr4[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], fill_async : CFuncPtr6[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], fill_finish : CFuncPtr3[Ptr[GBufferedInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit], _g_reserved4 : CFuncPtr0[Unit], _g_reserved5 : CFuncPtr0[Unit])(using Zone): Ptr[GBufferedInputStreamClass] =
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
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](9)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[GFilterInputStreamClass].toInt)
    res(1) = align(res(0) + sizeof[GFilterInputStreamClass].toInt, alignmentof[CFuncPtr4[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr4[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]].toInt, alignmentof[CFuncPtr6[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr6[Ptr[GBufferedInputStream], _root_.sn.gnome.glib.internal.gssize, CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GBufferedInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr3[Ptr[GBufferedInputStream], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(8) = align(res(7) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res
  end offsets