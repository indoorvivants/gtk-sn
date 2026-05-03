package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GNetworkMonitorInterface = CStruct5[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GNetworkMonitor], _root_.sn.gnome.glib.internal.gboolean, Unit], CFuncPtr4[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr5[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GNetworkMonitor], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]

object _GNetworkMonitorInterface:
  given _tag: Tag[_GNetworkMonitorInterface] = Tag.materializeCStruct5Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GNetworkMonitor], _root_.sn.gnome.glib.internal.gboolean, Unit], CFuncPtr4[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr5[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GNetworkMonitor], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GNetworkMonitorInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def network_changed : CFuncPtr2[Ptr[GNetworkMonitor], _root_.sn.gnome.glib.internal.gboolean, Unit] = struct._2
      inline def network_changed_=(value: CFuncPtr2[Ptr[GNetworkMonitor], _root_.sn.gnome.glib.internal.gboolean, Unit]): Unit = (!struct.at2 = value)
      inline def can_reach : CFuncPtr4[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._3
      inline def can_reach_=(value: CFuncPtr4[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at3 = value)
      inline def can_reach_async : CFuncPtr5[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._4
      inline def can_reach_async_=(value: CFuncPtr5[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at4 = value)
      inline def can_reach_finish : CFuncPtr3[Ptr[GNetworkMonitor], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._5
      inline def can_reach_finish_=(value: CFuncPtr3[Ptr[GNetworkMonitor], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates _GNetworkMonitorInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GNetworkMonitorInterface] = scala.scalanative.unsafe.alloc[_GNetworkMonitorInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, network_changed : CFuncPtr2[Ptr[GNetworkMonitor], _root_.sn.gnome.glib.internal.gboolean, Unit], can_reach : CFuncPtr4[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], can_reach_async : CFuncPtr5[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], can_reach_finish : CFuncPtr3[Ptr[GNetworkMonitor], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[_GNetworkMonitorInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).network_changed = network_changed
    (!____ptr).can_reach = can_reach
    (!____ptr).can_reach_async = can_reach_async
    (!____ptr).can_reach_finish = can_reach_finish
    ____ptr