package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GProxyInterface: _iface: The parent interface. : Connect to proxy server and wrap (if required) the #connection to handle payload. _async: Same as connect() but asynchronous. _finish: Returns the result of connect_async() _hostname: Returns whether the proxy supports hostname lookups.
*/
opaque type GProxyInterface = CArray[CChar, Nat.Digit2[Nat._4, Nat._8]]

object GProxyInterface:
  given _tag: Tag[GProxyInterface] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._8]](Tag.Byte, Tag.Digit2[Nat._4, Nat._8](Tag.Nat4, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GProxyInterface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def connect: CFuncPtr5[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]]]]
      inline def connect_=(value: CFuncPtr5[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]]]] = value
      inline def connect_async: CFuncPtr6[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def connect_async_=(value: CFuncPtr6[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def connect_finish: CFuncPtr3[Ptr[GProxy], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GProxy], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]]]]
      inline def connect_finish_=(value: CFuncPtr3[Ptr[GProxy], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GProxy], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]]]] = value
      inline def supports_hostname: CFuncPtr1[Ptr[GProxy], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GProxy], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def supports_hostname_=(value: CFuncPtr1[Ptr[GProxy], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GProxy], _root_.sn.gnome.glib.internal.gboolean]]] = value
    end extension
  
  // Allocates GProxyInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GProxyInterface] = scala.scalanative.unsafe.alloc[GProxyInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, connect : CFuncPtr5[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]], connect_async : CFuncPtr6[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], connect_finish : CFuncPtr3[Ptr[GProxy], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]], supports_hostname : CFuncPtr1[Ptr[GProxy], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[GProxyInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).connect = connect
    (!____ptr).connect_async = connect_async
    (!____ptr).connect_finish = connect_finish
    (!____ptr).supports_hostname = supports_hostname
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
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr5[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr5[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]]].toInt, alignmentof[CFuncPtr6[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr6[Ptr[GProxy], Ptr[GIOStream], Ptr[GProxyAddress], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GProxy], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr3[Ptr[GProxy], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GIOStream]]].toInt, alignmentof[CFuncPtr1[Ptr[GProxy], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res
  end offsets