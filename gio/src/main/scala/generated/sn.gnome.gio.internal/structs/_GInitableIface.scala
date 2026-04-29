package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GInitableIface: _iface: The parent interface. : Initializes the object.
*/
opaque type _GInitableIface = CStruct2[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr3[Ptr[GInitable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]

object _GInitableIface:
  given _tag: Tag[_GInitableIface] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr3[Ptr[GInitable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GInitableIface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def init : CFuncPtr3[Ptr[GInitable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def init_=(value: CFuncPtr3[Ptr[GInitable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GInitableIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GInitableIface] = scala.scalanative.unsafe.alloc[_GInitableIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, init : CFuncPtr3[Ptr[GInitable], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[_GInitableIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).init = init
    ____ptr