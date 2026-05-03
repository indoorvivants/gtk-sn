package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * _column_changed: Signal emitted when the sort column or sort order of sortable is changed. _sort_column_id: Fills in sort_column_id and order with the current sort column and the order.
*/
opaque type _GtkTreeSortableIface = CStruct7[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GtkTreeSortable], Unit], CFuncPtr3[Ptr[GtkTreeSortable], Ptr[CInt], Ptr[GtkSortType], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkTreeSortable], CInt, GtkSortType, Unit], CFuncPtr5[Ptr[GtkTreeSortable], CInt, GtkTreeIterCompareFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit], CFuncPtr4[Ptr[GtkTreeSortable], GtkTreeIterCompareFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit], CFuncPtr1[Ptr[GtkTreeSortable], _root_.sn.gnome.glib.internal.gboolean]]

object _GtkTreeSortableIface:
  given _tag: Tag[_GtkTreeSortableIface] = Tag.materializeCStruct7Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GtkTreeSortable], Unit], CFuncPtr3[Ptr[GtkTreeSortable], Ptr[CInt], Ptr[GtkSortType], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkTreeSortable], CInt, GtkSortType, Unit], CFuncPtr5[Ptr[GtkTreeSortable], CInt, GtkTreeIterCompareFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit], CFuncPtr4[Ptr[GtkTreeSortable], GtkTreeIterCompareFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit], CFuncPtr1[Ptr[GtkTreeSortable], _root_.sn.gnome.glib.internal.gboolean]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkTreeSortableIface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def sort_column_changed : CFuncPtr1[Ptr[GtkTreeSortable], Unit] = struct._2
      inline def sort_column_changed_=(value: CFuncPtr1[Ptr[GtkTreeSortable], Unit]): Unit = (!struct.at2 = value)
      inline def get_sort_column_id : CFuncPtr3[Ptr[GtkTreeSortable], Ptr[CInt], Ptr[GtkSortType], _root_.sn.gnome.glib.internal.gboolean] = struct._3
      inline def get_sort_column_id_=(value: CFuncPtr3[Ptr[GtkTreeSortable], Ptr[CInt], Ptr[GtkSortType], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at3 = value)
      inline def set_sort_column_id : CFuncPtr3[Ptr[GtkTreeSortable], CInt, GtkSortType, Unit] = struct._4
      inline def set_sort_column_id_=(value: CFuncPtr3[Ptr[GtkTreeSortable], CInt, GtkSortType, Unit]): Unit = (!struct.at4 = value)
      inline def set_sort_func : CFuncPtr5[Ptr[GtkTreeSortable], CInt, GtkTreeIterCompareFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit] = struct._5
      inline def set_sort_func_=(value: CFuncPtr5[Ptr[GtkTreeSortable], CInt, GtkTreeIterCompareFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit]): Unit = (!struct.at5 = value)
      inline def set_default_sort_func : CFuncPtr4[Ptr[GtkTreeSortable], GtkTreeIterCompareFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit] = struct._6
      inline def set_default_sort_func_=(value: CFuncPtr4[Ptr[GtkTreeSortable], GtkTreeIterCompareFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit]): Unit = (!struct.at6 = value)
      inline def has_default_sort_func : CFuncPtr1[Ptr[GtkTreeSortable], _root_.sn.gnome.glib.internal.gboolean] = struct._7
      inline def has_default_sort_func_=(value: CFuncPtr1[Ptr[GtkTreeSortable], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates _GtkTreeSortableIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkTreeSortableIface] = scala.scalanative.unsafe.alloc[_GtkTreeSortableIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, sort_column_changed : CFuncPtr1[Ptr[GtkTreeSortable], Unit], get_sort_column_id : CFuncPtr3[Ptr[GtkTreeSortable], Ptr[CInt], Ptr[GtkSortType], _root_.sn.gnome.glib.internal.gboolean], set_sort_column_id : CFuncPtr3[Ptr[GtkTreeSortable], CInt, GtkSortType, Unit], set_sort_func : CFuncPtr5[Ptr[GtkTreeSortable], CInt, GtkTreeIterCompareFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit], set_default_sort_func : CFuncPtr4[Ptr[GtkTreeSortable], GtkTreeIterCompareFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit], has_default_sort_func : CFuncPtr1[Ptr[GtkTreeSortable], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[_GtkTreeSortableIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).sort_column_changed = sort_column_changed
    (!____ptr).get_sort_column_id = get_sort_column_id
    (!____ptr).set_sort_column_id = set_sort_column_id
    (!____ptr).set_sort_func = set_sort_func
    (!____ptr).set_default_sort_func = set_default_sort_func
    (!____ptr).has_default_sort_func = has_default_sort_func
    ____ptr