package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkCellLayoutIface: _start: Packs the cell into the beginning of cell_layout. _end: Adds the cell to the end of cell_layout. : Unsets all the mappings on all renderers on cell_layout and removes all renderers from cell_layout. _attribute: Adds an attribute mapping to the list in cell_layout.
*/
opaque type _GtkCellLayoutIface = CStruct10[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.sn.gnome.glib.internal.gboolean, Unit], CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.sn.gnome.glib.internal.gboolean, Unit], CFuncPtr1[Ptr[GtkCellLayout], Unit], CFuncPtr4[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CString, CInt, Unit], CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], GtkCellLayoutDataFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit], CFuncPtr2[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Unit], CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CInt, Unit], CFuncPtr1[Ptr[GtkCellLayout], Ptr[Byte]], CFuncPtr1[Ptr[GtkCellLayout], Ptr[GtkCellArea]]]

object _GtkCellLayoutIface:
  given _tag: Tag[_GtkCellLayoutIface] = Tag.materializeCStruct10Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.sn.gnome.glib.internal.gboolean, Unit], CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.sn.gnome.glib.internal.gboolean, Unit], CFuncPtr1[Ptr[GtkCellLayout], Unit], CFuncPtr4[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CString, CInt, Unit], CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], GtkCellLayoutDataFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit], CFuncPtr2[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Unit], CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CInt, Unit], CFuncPtr1[Ptr[GtkCellLayout], Ptr[Byte]], CFuncPtr1[Ptr[GtkCellLayout], Ptr[GtkCellArea]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkCellLayoutIface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def pack_start : CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.sn.gnome.glib.internal.gboolean, Unit] = struct._2
      inline def pack_start_=(value: CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.sn.gnome.glib.internal.gboolean, Unit]): Unit = (!struct.at2 = value)
      inline def pack_end : CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.sn.gnome.glib.internal.gboolean, Unit] = struct._3
      inline def pack_end_=(value: CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.sn.gnome.glib.internal.gboolean, Unit]): Unit = (!struct.at3 = value)
      inline def clear : CFuncPtr1[Ptr[GtkCellLayout], Unit] = struct._4
      inline def clear_=(value: CFuncPtr1[Ptr[GtkCellLayout], Unit]): Unit = (!struct.at4 = value)
      inline def add_attribute : CFuncPtr4[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CString, CInt, Unit] = struct._5
      inline def add_attribute_=(value: CFuncPtr4[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CString, CInt, Unit]): Unit = (!struct.at5 = value)
      inline def set_cell_data_func : CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], GtkCellLayoutDataFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit] = struct._6
      inline def set_cell_data_func_=(value: CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], GtkCellLayoutDataFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit]): Unit = (!struct.at6 = value)
      inline def clear_attributes : CFuncPtr2[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Unit] = struct._7
      inline def clear_attributes_=(value: CFuncPtr2[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Unit]): Unit = (!struct.at7 = value)
      inline def reorder : CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CInt, Unit] = struct._8
      inline def reorder_=(value: CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CInt, Unit]): Unit = (!struct.at8 = value)
      inline def get_cells : CFuncPtr1[Ptr[GtkCellLayout], Ptr[_root_.sn.gnome.glib.internal.GList]] = struct._9.asInstanceOf[CFuncPtr1[Ptr[GtkCellLayout], Ptr[_root_.sn.gnome.glib.internal.GList]]]
      inline def get_cells_=(value: CFuncPtr1[Ptr[GtkCellLayout], Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = (!struct.at9 = value.asInstanceOf[CFuncPtr1[Ptr[GtkCellLayout], Ptr[Byte]]])
      inline def get_area : CFuncPtr1[Ptr[GtkCellLayout], Ptr[GtkCellArea]] = struct._10
      inline def get_area_=(value: CFuncPtr1[Ptr[GtkCellLayout], Ptr[GtkCellArea]]): Unit = (!struct.at10 = value)
    end extension
  
  // Allocates _GtkCellLayoutIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkCellLayoutIface] = scala.scalanative.unsafe.alloc[_GtkCellLayoutIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, pack_start : CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.sn.gnome.glib.internal.gboolean, Unit], pack_end : CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], _root_.sn.gnome.glib.internal.gboolean, Unit], clear : CFuncPtr1[Ptr[GtkCellLayout], Unit], add_attribute : CFuncPtr4[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CString, CInt, Unit], set_cell_data_func : CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], GtkCellLayoutDataFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit], clear_attributes : CFuncPtr2[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Unit], reorder : CFuncPtr3[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], CInt, Unit], get_cells : CFuncPtr1[Ptr[GtkCellLayout], Ptr[_root_.sn.gnome.glib.internal.GList]], get_area : CFuncPtr1[Ptr[GtkCellLayout], Ptr[GtkCellArea]])(using Zone): Ptr[_GtkCellLayoutIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).pack_start = pack_start
    (!____ptr).pack_end = pack_end
    (!____ptr).clear = clear
    (!____ptr).add_attribute = add_attribute
    (!____ptr).set_cell_data_func = set_cell_data_func
    (!____ptr).clear_attributes = clear_attributes
    (!____ptr).reorder = reorder
    (!____ptr).get_cells = get_cells
    (!____ptr).get_area = get_area
    ____ptr