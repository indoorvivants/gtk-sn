package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GConverterIface: _iface: The parent interface. : Converts data. : Reverts the internal state of the converter to its initial state.
*/
opaque type _GConverterIface = CStruct3[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr9[Ptr[GConverter], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, GConverterFlags, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GConverterResult], CFuncPtr1[Ptr[GConverter], Unit]]

object _GConverterIface:
  given _tag: Tag[_GConverterIface] = Tag.materializeCStruct3Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr9[Ptr[GConverter], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, GConverterFlags, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GConverterResult], CFuncPtr1[Ptr[GConverter], Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GConverterIface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def convert : CFuncPtr9[Ptr[GConverter], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, GConverterFlags, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GConverterResult] = struct._2
      inline def convert_=(value: CFuncPtr9[Ptr[GConverter], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, GConverterFlags, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GConverterResult]): Unit = (!struct.at2 = value)
      inline def reset : CFuncPtr1[Ptr[GConverter], Unit] = struct._3
      inline def reset_=(value: CFuncPtr1[Ptr[GConverter], Unit]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GConverterIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GConverterIface] = scala.scalanative.unsafe.alloc[_GConverterIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, convert : CFuncPtr9[Ptr[GConverter], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, GConverterFlags, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GConverterResult], reset : CFuncPtr1[Ptr[GConverter], Unit])(using Zone): Ptr[_GConverterIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).convert = convert
    (!____ptr).reset = reset
    ____ptr