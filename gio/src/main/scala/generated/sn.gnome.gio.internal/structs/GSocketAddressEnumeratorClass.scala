package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSocketAddressEnumeratorClass: : Virtual method for g_socket_address_enumerator_next(). _async: Virtual method for g_socket_address_enumerator_next_async(). _finish: Virtual method for g_socket_address_enumerator_next_finish().
*/
opaque type GSocketAddressEnumeratorClass = CArray[CChar, Nat.Digit3[Nat._1, Nat._6, Nat._0]]

object GSocketAddressEnumeratorClass:
  given _tag: Tag[GSocketAddressEnumeratorClass] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._6, Nat._0]](Tag.Byte, Tag.Digit3[Nat._1, Nat._6, Nat._0](Tag.Nat1, Tag.Nat6, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GSocketAddressEnumeratorClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def next: CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]]]]
      inline def next_=(value: CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]]]] = value
      inline def next_async: CFuncPtr4[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def next_async_=(value: CFuncPtr4[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def next_finish: CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]]]]
      inline def next_finish_=(value: CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]]]] = value
    end extension
  
  // Allocates GSocketAddressEnumeratorClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GSocketAddressEnumeratorClass] = scala.scalanative.unsafe.alloc[GSocketAddressEnumeratorClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, next : CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]], next_async : CFuncPtr4[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], next_finish : CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]])(using Zone): Ptr[GSocketAddressEnumeratorClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).next = next
    (!____ptr).next_async = next_async
    (!____ptr).next_finish = next_finish
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](4)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]]].toInt, alignmentof[CFuncPtr4[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr4[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]]].toInt)
    res
  end offsets