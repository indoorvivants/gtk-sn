package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GProxyResolverInterface = CArray[CChar, Nat.Digit2[Nat._4, Nat._8]]

object GProxyResolverInterface:
  given _tag: Tag[GProxyResolverInterface] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._8]](Tag.Byte, Tag.Digit2[Nat._4, Nat._8](Tag.Nat4, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GProxyResolverInterface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def is_supported: CFuncPtr1[Ptr[GProxyResolver], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GProxyResolver], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def is_supported_=(value: CFuncPtr1[Ptr[GProxyResolver], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GProxyResolver], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def lookup: CFuncPtr4[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]]]
      inline def lookup_=(value: CFuncPtr4[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]]] = value
      inline def lookup_async: CFuncPtr5[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def lookup_async_=(value: CFuncPtr5[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def lookup_finish: CFuncPtr3[Ptr[GProxyResolver], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GProxyResolver], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]]]
      inline def lookup_finish_=(value: CFuncPtr3[Ptr[GProxyResolver], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GProxyResolver], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]]] = value
    end extension
  
  // Allocates GProxyResolverInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GProxyResolverInterface] = scala.scalanative.unsafe.alloc[GProxyResolverInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, is_supported : CFuncPtr1[Ptr[GProxyResolver], _root_.sn.gnome.glib.internal.gboolean], lookup : CFuncPtr4[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], lookup_async : CFuncPtr5[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], lookup_finish : CFuncPtr3[Ptr[GProxyResolver], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]])(using Zone): Ptr[GProxyResolverInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).is_supported = is_supported
    (!____ptr).lookup = lookup
    (!____ptr).lookup_async = lookup_async
    (!____ptr).lookup_finish = lookup_finish
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
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr1[Ptr[GProxyResolver], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GProxyResolver], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr4[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr4[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]].toInt, alignmentof[CFuncPtr5[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr5[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GProxyResolver], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]].toInt)
    res
  end offsets