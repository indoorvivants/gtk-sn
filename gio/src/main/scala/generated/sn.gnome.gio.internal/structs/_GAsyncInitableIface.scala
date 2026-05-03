package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GAsyncInitableIface: _iface: The parent interface. _async: Starts initialization of the object. _finish: Finishes initialization of the object.
*/
opaque type _GAsyncInitableIface = CStruct3[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr5[Ptr[GAsyncInitable], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GAsyncInitable], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]

object _GAsyncInitableIface:
  given _tag: Tag[_GAsyncInitableIface] = Tag.materializeCStruct3Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr5[Ptr[GAsyncInitable], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GAsyncInitable], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GAsyncInitableIface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def init_async : CFuncPtr5[Ptr[GAsyncInitable], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._2
      inline def init_async_=(value: CFuncPtr5[Ptr[GAsyncInitable], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at2 = value)
      inline def init_finish : CFuncPtr3[Ptr[GAsyncInitable], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._3
      inline def init_finish_=(value: CFuncPtr3[Ptr[GAsyncInitable], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GAsyncInitableIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GAsyncInitableIface] = scala.scalanative.unsafe.alloc[_GAsyncInitableIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, init_async : CFuncPtr5[Ptr[GAsyncInitable], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], init_finish : CFuncPtr3[Ptr[GAsyncInitable], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[_GAsyncInitableIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).init_async = init_async
    (!____ptr).init_finish = init_finish
    ____ptr