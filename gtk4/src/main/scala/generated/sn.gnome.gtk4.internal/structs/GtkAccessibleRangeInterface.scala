package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkAccessibleRangeInterface = CStruct2[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GtkAccessibleRange], Double, _root_.sn.gnome.glib.internal.gboolean]]

object GtkAccessibleRangeInterface:
  given _tag: Tag[GtkAccessibleRangeInterface] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GtkAccessibleRange], Double, _root_.sn.gnome.glib.internal.gboolean]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkAccessibleRangeInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def set_current_value : CFuncPtr2[Ptr[GtkAccessibleRange], Double, _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def set_current_value_=(value: CFuncPtr2[Ptr[GtkAccessibleRange], Double, _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GtkAccessibleRangeInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkAccessibleRangeInterface] = scala.scalanative.unsafe.alloc[GtkAccessibleRangeInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, set_current_value : CFuncPtr2[Ptr[GtkAccessibleRange], Double, _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[GtkAccessibleRangeInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).set_current_value = set_current_value
    ____ptr