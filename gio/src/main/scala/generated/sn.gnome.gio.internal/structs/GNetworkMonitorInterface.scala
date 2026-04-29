package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GNetworkMonitorInterface = CArray[CChar, Nat.Digit2[Nat._4, Nat._8]]

object GNetworkMonitorInterface:
  given _tag: Tag[GNetworkMonitorInterface] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._8]](Tag.Byte, Tag.Digit2[Nat._4, Nat._8](Tag.Nat4, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GNetworkMonitorInterface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def network_changed: CFuncPtr2[Ptr[GNetworkMonitor], _root_.sn.gnome.glib.internal.gboolean, Unit] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GNetworkMonitor], _root_.sn.gnome.glib.internal.gboolean, Unit]]]
      inline def network_changed_=(value: CFuncPtr2[Ptr[GNetworkMonitor], _root_.sn.gnome.glib.internal.gboolean, Unit]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GNetworkMonitor], _root_.sn.gnome.glib.internal.gboolean, Unit]]] = value
      inline def can_reach: CFuncPtr4[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def can_reach_=(value: CFuncPtr4[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def can_reach_async: CFuncPtr5[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def can_reach_async_=(value: CFuncPtr5[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def can_reach_finish: CFuncPtr3[Ptr[GNetworkMonitor], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GNetworkMonitor], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def can_reach_finish_=(value: CFuncPtr3[Ptr[GNetworkMonitor], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GNetworkMonitor], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
    end extension
  
  // Allocates GNetworkMonitorInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GNetworkMonitorInterface] = scala.scalanative.unsafe.alloc[GNetworkMonitorInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, network_changed : CFuncPtr2[Ptr[GNetworkMonitor], _root_.sn.gnome.glib.internal.gboolean, Unit], can_reach : CFuncPtr4[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], can_reach_async : CFuncPtr5[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], can_reach_finish : CFuncPtr3[Ptr[GNetworkMonitor], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[GNetworkMonitorInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).network_changed = network_changed
    (!____ptr).can_reach = can_reach
    (!____ptr).can_reach_async = can_reach_async
    (!____ptr).can_reach_finish = can_reach_finish
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](5)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr2[Ptr[GNetworkMonitor], _root_.sn.gnome.glib.internal.gboolean, Unit]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr2[Ptr[GNetworkMonitor], _root_.sn.gnome.glib.internal.gboolean, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr4[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr5[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr5[Ptr[GNetworkMonitor], Ptr[GSocketConnectable], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GNetworkMonitor], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res
  end offsets