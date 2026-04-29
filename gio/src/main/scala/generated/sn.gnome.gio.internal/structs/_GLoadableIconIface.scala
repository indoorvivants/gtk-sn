package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GLoadableIconIface: _iface: The parent interface. : Loads an icon. _async: Loads an icon asynchronously. _finish: Finishes an asynchronous icon load.
*/
opaque type _GLoadableIconIface = CStruct4[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[CString], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]], CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr4[Ptr[GLoadableIcon], Ptr[GAsyncResult], Ptr[CString], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]]]

object _GLoadableIconIface:
  given _tag: Tag[_GLoadableIconIface] = Tag.materializeCStruct4Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[CString], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]], CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr4[Ptr[GLoadableIcon], Ptr[GAsyncResult], Ptr[CString], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GLoadableIconIface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def load : CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[CString], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]] = struct._2
      inline def load_=(value: CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[CString], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]]): Unit = (!struct.at2 = value)
      inline def load_async : CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._3
      inline def load_async_=(value: CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at3 = value)
      inline def load_finish : CFuncPtr4[Ptr[GLoadableIcon], Ptr[GAsyncResult], Ptr[CString], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]] = struct._4
      inline def load_finish_=(value: CFuncPtr4[Ptr[GLoadableIcon], Ptr[GAsyncResult], Ptr[CString], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GLoadableIconIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GLoadableIconIface] = scala.scalanative.unsafe.alloc[_GLoadableIconIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, load : CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[CString], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]], load_async : CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], load_finish : CFuncPtr4[Ptr[GLoadableIcon], Ptr[GAsyncResult], Ptr[CString], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]])(using Zone): Ptr[_GLoadableIconIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).load = load
    (!____ptr).load_async = load_async
    (!____ptr).load_finish = load_finish
    ____ptr