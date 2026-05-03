package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkSorterClass : Compare two items. See gtk_sorter_compare() for details. _order: Get the `GtkSorderOrder` that applies to the current sorter. If unimplemented, it returns %GTK_SORTER_ORDER_PARTIAL.
*/
opaque type _GtkSorterClass = CStruct11[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GtkSorter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, GtkOrdering], CFuncPtr1[Ptr[GtkSorter], GtkSorterOrder], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GtkSorterClass:
  given _tag: Tag[_GtkSorterClass] = Tag.materializeCStruct11Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GtkSorter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, GtkOrdering], CFuncPtr1[Ptr[GtkSorter], GtkSorterOrder], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkSorterClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def compare : CFuncPtr3[Ptr[GtkSorter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, GtkOrdering] = struct._2
      inline def compare_=(value: CFuncPtr3[Ptr[GtkSorter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, GtkOrdering]): Unit = (!struct.at2 = value)
      inline def get_order : CFuncPtr1[Ptr[GtkSorter], GtkSorterOrder] = struct._3
      inline def get_order_=(value: CFuncPtr1[Ptr[GtkSorter], GtkSorterOrder]): Unit = (!struct.at3 = value)
      inline def _gtk_reserved1 : CFuncPtr0[Unit] = struct._4
      inline def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at4 = value)
      inline def _gtk_reserved2 : CFuncPtr0[Unit] = struct._5
      inline def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at5 = value)
      inline def _gtk_reserved3 : CFuncPtr0[Unit] = struct._6
      inline def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at6 = value)
      inline def _gtk_reserved4 : CFuncPtr0[Unit] = struct._7
      inline def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at7 = value)
      inline def _gtk_reserved5 : CFuncPtr0[Unit] = struct._8
      inline def _gtk_reserved5_=(value: CFuncPtr0[Unit]): Unit = (!struct.at8 = value)
      inline def _gtk_reserved6 : CFuncPtr0[Unit] = struct._9
      inline def _gtk_reserved6_=(value: CFuncPtr0[Unit]): Unit = (!struct.at9 = value)
      inline def _gtk_reserved7 : CFuncPtr0[Unit] = struct._10
      inline def _gtk_reserved7_=(value: CFuncPtr0[Unit]): Unit = (!struct.at10 = value)
      inline def _gtk_reserved8 : CFuncPtr0[Unit] = struct._11
      inline def _gtk_reserved8_=(value: CFuncPtr0[Unit]): Unit = (!struct.at11 = value)
    end extension
  
  // Allocates _GtkSorterClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkSorterClass] = scala.scalanative.unsafe.alloc[_GtkSorterClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, compare : CFuncPtr3[Ptr[GtkSorter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, GtkOrdering], get_order : CFuncPtr1[Ptr[GtkSorter], GtkSorterOrder], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit], _gtk_reserved5 : CFuncPtr0[Unit], _gtk_reserved6 : CFuncPtr0[Unit], _gtk_reserved7 : CFuncPtr0[Unit], _gtk_reserved8 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkSorterClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).compare = compare
    (!____ptr).get_order = get_order
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    (!____ptr)._gtk_reserved5 = _gtk_reserved5
    (!____ptr)._gtk_reserved6 = _gtk_reserved6
    (!____ptr)._gtk_reserved7 = _gtk_reserved7
    (!____ptr)._gtk_reserved8 = _gtk_reserved8
    ____ptr