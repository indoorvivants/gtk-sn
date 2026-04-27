package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GProxyResolverInterface = CStruct5[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GProxyResolver], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], CFuncPtr5[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GProxyResolver], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]]

object _GProxyResolverInterface:
  given _tag: Tag[_GProxyResolverInterface] = Tag.materializeCStruct5Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GProxyResolver], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], CFuncPtr5[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr3[Ptr[GProxyResolver], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GProxyResolverInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def is_supported : CFuncPtr1[Ptr[GProxyResolver], _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def is_supported_=(value: CFuncPtr1[Ptr[GProxyResolver], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
      inline def lookup : CFuncPtr4[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = struct._3
      inline def lookup_=(value: CFuncPtr4[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]): Unit = (!struct.at3 = value)
      inline def lookup_async : CFuncPtr5[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._4
      inline def lookup_async_=(value: CFuncPtr5[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at4 = value)
      inline def lookup_finish : CFuncPtr3[Ptr[GProxyResolver], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = struct._5
      inline def lookup_finish_=(value: CFuncPtr3[Ptr[GProxyResolver], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates _GProxyResolverInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GProxyResolverInterface] = scala.scalanative.unsafe.alloc[_GProxyResolverInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, is_supported : CFuncPtr1[Ptr[GProxyResolver], _root_.sn.gnome.glib.internal.gboolean], lookup : CFuncPtr4[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], lookup_async : CFuncPtr5[Ptr[GProxyResolver], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], lookup_finish : CFuncPtr3[Ptr[GProxyResolver], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]])(using Zone): Ptr[_GProxyResolverInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).is_supported = is_supported
    (!____ptr).lookup = lookup
    (!____ptr).lookup_async = lookup_async
    (!____ptr).lookup_finish = lookup_finish
    ____ptr