package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSocketAddressEnumeratorClass: : Virtual method for g_socket_address_enumerator_next(). _async: Virtual method for g_socket_address_enumerator_next_async(). _finish: Virtual method for g_socket_address_enumerator_next_finish().
*/
opaque type _GSocketAddressEnumeratorClass = CStruct4[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]], CFuncPtr4[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]]]

object _GSocketAddressEnumeratorClass:
  given _tag: Tag[_GSocketAddressEnumeratorClass] = Tag.materializeCStruct4Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]], CFuncPtr4[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GSocketAddressEnumeratorClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def next : CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]] = struct._2
      inline def next_=(value: CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]]): Unit = (!struct.at2 = value)
      inline def next_async : CFuncPtr4[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._3
      inline def next_async_=(value: CFuncPtr4[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at3 = value)
      inline def next_finish : CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]] = struct._4
      inline def next_finish_=(value: CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GSocketAddressEnumeratorClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GSocketAddressEnumeratorClass] = scala.scalanative.unsafe.alloc[_GSocketAddressEnumeratorClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, next : CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]], next_async : CFuncPtr4[Ptr[GSocketAddressEnumerator], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], next_finish : CFuncPtr3[Ptr[GSocketAddressEnumerator], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GSocketAddress]])(using Zone): Ptr[_GSocketAddressEnumeratorClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).next = next
    (!____ptr).next_async = next_async
    (!____ptr).next_finish = next_finish
    ____ptr