package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkSelectionModelInterface: _selection_in_range: Return a bitset with all currently selected items in the given range. By default, this function will call `GtkSelectionModel::is_selected()` on all items in the given range. _item: Select the item in the given position. If the operation is known to fail, return %FALSE. _item: Unselect the item in the given position. If the operation is known to fail, return %FALSE. _range: Select all items in the given range. If the operation is unsupported or known to fail for all items, return %FALSE. _range: Unselect all items in the given range. If the operation is unsupported or known to fail for all items, return %FALSE. _all: Select all items in the model. If the operation is unsupported or known to fail for all items, return %FALSE. _all: Unselect all items in the model. If the operation is unsupported or known to fail for all items, return %FALSE.
*/
opaque type _GtkSelectionModelInterface = CStruct10[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Ptr[GtkBitset]], CFuncPtr3[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkSelectionModel], Ptr[GtkBitset], Ptr[GtkBitset], _root_.sn.gnome.glib.internal.gboolean]]

object _GtkSelectionModelInterface:
  given _tag: Tag[_GtkSelectionModelInterface] = Tag.materializeCStruct10Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Ptr[GtkBitset]], CFuncPtr3[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkSelectionModel], Ptr[GtkBitset], Ptr[GtkBitset], _root_.sn.gnome.glib.internal.gboolean]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkSelectionModelInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def is_selected : CFuncPtr2[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def is_selected_=(value: CFuncPtr2[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
      inline def get_selection_in_range : CFuncPtr3[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Ptr[GtkBitset]] = struct._3
      inline def get_selection_in_range_=(value: CFuncPtr3[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Ptr[GtkBitset]]): Unit = (!struct.at3 = value)
      inline def select_item : CFuncPtr3[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean] = struct._4
      inline def select_item_=(value: CFuncPtr3[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at4 = value)
      inline def unselect_item : CFuncPtr2[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean] = struct._5
      inline def unselect_item_=(value: CFuncPtr2[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at5 = value)
      inline def select_range : CFuncPtr4[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean] = struct._6
      inline def select_range_=(value: CFuncPtr4[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at6 = value)
      inline def unselect_range : CFuncPtr3[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean] = struct._7
      inline def unselect_range_=(value: CFuncPtr3[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at7 = value)
      inline def select_all : CFuncPtr1[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.gboolean] = struct._8
      inline def select_all_=(value: CFuncPtr1[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at8 = value)
      inline def unselect_all : CFuncPtr1[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.gboolean] = struct._9
      inline def unselect_all_=(value: CFuncPtr1[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at9 = value)
      inline def set_selection : CFuncPtr3[Ptr[GtkSelectionModel], Ptr[GtkBitset], Ptr[GtkBitset], _root_.sn.gnome.glib.internal.gboolean] = struct._10
      inline def set_selection_=(value: CFuncPtr3[Ptr[GtkSelectionModel], Ptr[GtkBitset], Ptr[GtkBitset], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at10 = value)
    end extension
  
  // Allocates _GtkSelectionModelInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkSelectionModelInterface] = scala.scalanative.unsafe.alloc[_GtkSelectionModelInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, is_selected : CFuncPtr2[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean], get_selection_in_range : CFuncPtr3[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Ptr[GtkBitset]], select_item : CFuncPtr3[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean], unselect_item : CFuncPtr2[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean], select_range : CFuncPtr4[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean], unselect_range : CFuncPtr3[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gboolean], select_all : CFuncPtr1[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.gboolean], unselect_all : CFuncPtr1[Ptr[GtkSelectionModel], _root_.sn.gnome.glib.internal.gboolean], set_selection : CFuncPtr3[Ptr[GtkSelectionModel], Ptr[GtkBitset], Ptr[GtkBitset], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[_GtkSelectionModelInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).is_selected = is_selected
    (!____ptr).get_selection_in_range = get_selection_in_range
    (!____ptr).select_item = select_item
    (!____ptr).unselect_item = unselect_item
    (!____ptr).select_range = select_range
    (!____ptr).unselect_range = unselect_range
    (!____ptr).select_all = select_all
    (!____ptr).unselect_all = unselect_all
    (!____ptr).set_selection = set_selection
    ____ptr