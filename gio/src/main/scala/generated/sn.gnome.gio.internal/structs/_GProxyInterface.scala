package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GProxyInterface: _iface: The parent interface. : Connect to proxy server and wrap (if required) the #connection to handle payload. _async: Same as connect() but asynchronous. _finish: Returns the result of connect_async() _hostname: Returns whether the proxy supports hostname lookups.
*/
opaque type _GProxyInterface = CStruct5[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr5[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]], CFuncPtr6[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GProxy], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]], CFuncPtr1[Ptr[GProxy], _root_.sn.gnome.glib.internal.gboolean]]

object _GProxyInterface:
  given _tag: Tag[_GProxyInterface] = Tag.materializeCStruct5Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr5[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]], CFuncPtr6[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GProxy], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]], CFuncPtr1[Ptr[GProxy], _root_.sn.gnome.glib.internal.gboolean]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GProxyInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def connect : CFuncPtr5[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]] = struct._2
      inline def connect_=(value: CFuncPtr5[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]]): Unit = (!struct.at2 = value)
      inline def connect_async : CFuncPtr6[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._3
      inline def connect_async_=(value: CFuncPtr6[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at3 = value)
      inline def connect_finish : CFuncPtr3[Ptr[GProxy], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]] = struct._4
      inline def connect_finish_=(value: CFuncPtr3[Ptr[GProxy], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]]): Unit = (!struct.at4 = value)
      inline def supports_hostname : CFuncPtr1[Ptr[GProxy], _root_.sn.gnome.glib.internal.gboolean] = struct._5
      inline def supports_hostname_=(value: CFuncPtr1[Ptr[GProxy], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates _GProxyInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GProxyInterface] = scala.scalanative.unsafe.alloc[_GProxyInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, connect : CFuncPtr5[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]], connect_async : CFuncPtr6[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], connect_finish : CFuncPtr3[Ptr[GProxy], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]], supports_hostname : CFuncPtr1[Ptr[GProxy], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[_GProxyInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).connect = connect
    (!____ptr).connect_async = connect_async
    (!____ptr).connect_finish = connect_finish
    (!____ptr).supports_hostname = supports_hostname
    ____ptr