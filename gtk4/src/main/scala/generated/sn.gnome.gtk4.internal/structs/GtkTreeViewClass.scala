package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeViewClass = CStruct17[GtkWidgetClass, CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], Ptr[GtkTreeViewColumn], Unit], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit], CFuncPtr1[Ptr[GtkTreeView], Unit], CFuncPtr1[Ptr[GtkTreeView], Unit], CFuncPtr5[Ptr[GtkTreeView], GtkMovementStep, CInt, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._6]]]

object GtkTreeViewClass:
  given _tag: Tag[GtkTreeViewClass] = Tag.materializeCStruct17Tag[GtkWidgetClass, CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], Ptr[GtkTreeViewColumn], Unit], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit], CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit], CFuncPtr1[Ptr[GtkTreeView], Unit], CFuncPtr1[Ptr[GtkTreeView], Unit], CFuncPtr5[Ptr[GtkTreeView], GtkMovementStep, CInt, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr4[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._6]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkTreeViewClass)
      inline def parent_class : GtkWidgetClass = struct._1
      inline def parent_class_=(value: GtkWidgetClass): Unit = (!struct.at1 = value)
      inline def row_activated : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], Ptr[GtkTreeViewColumn], Unit] = struct._2
      inline def row_activated_=(value: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], Ptr[GtkTreeViewColumn], Unit]): Unit = (!struct.at2 = value)
      inline def test_expand_row : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean] = struct._3
      inline def test_expand_row_=(value: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at3 = value)
      inline def test_collapse_row : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean] = struct._4
      inline def test_collapse_row_=(value: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at4 = value)
      inline def row_expanded : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit] = struct._5
      inline def row_expanded_=(value: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit]): Unit = (!struct.at5 = value)
      inline def row_collapsed : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit] = struct._6
      inline def row_collapsed_=(value: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit]): Unit = (!struct.at6 = value)
      inline def columns_changed : CFuncPtr1[Ptr[GtkTreeView], Unit] = struct._7
      inline def columns_changed_=(value: CFuncPtr1[Ptr[GtkTreeView], Unit]): Unit = (!struct.at7 = value)
      inline def cursor_changed : CFuncPtr1[Ptr[GtkTreeView], Unit] = struct._8
      inline def cursor_changed_=(value: CFuncPtr1[Ptr[GtkTreeView], Unit]): Unit = (!struct.at8 = value)
      inline def move_cursor : CFuncPtr5[Ptr[GtkTreeView], GtkMovementStep, CInt, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean] = struct._9
      inline def move_cursor_=(value: CFuncPtr5[Ptr[GtkTreeView], GtkMovementStep, CInt, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at9 = value)
      inline def select_all : CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean] = struct._10
      inline def select_all_=(value: CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at10 = value)
      inline def unselect_all : CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean] = struct._11
      inline def unselect_all_=(value: CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at11 = value)
      inline def select_cursor_row : CFuncPtr2[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean] = struct._12
      inline def select_cursor_row_=(value: CFuncPtr2[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at12 = value)
      inline def toggle_cursor_row : CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean] = struct._13
      inline def toggle_cursor_row_=(value: CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at13 = value)
      inline def expand_collapse_cursor_row : CFuncPtr4[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean] = struct._14
      inline def expand_collapse_cursor_row_=(value: CFuncPtr4[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at14 = value)
      inline def select_cursor_parent : CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean] = struct._15
      inline def select_cursor_parent_=(value: CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at15 = value)
      inline def start_interactive_search : CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean] = struct._16
      inline def start_interactive_search_=(value: CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at16 = value)
      inline def _reserved : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._6]] = struct._17
      inline def _reserved_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._6]]): Unit = (!struct.at17 = value)
    end extension
  
  // Allocates GtkTreeViewClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkTreeViewClass] = scala.scalanative.unsafe.alloc[GtkTreeViewClass](1)
  def apply(parent_class : GtkWidgetClass, row_activated : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], Ptr[GtkTreeViewColumn], Unit], test_expand_row : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean], test_collapse_row : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean], row_expanded : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit], row_collapsed : CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreeIter], Ptr[GtkTreePath], Unit], columns_changed : CFuncPtr1[Ptr[GtkTreeView], Unit], cursor_changed : CFuncPtr1[Ptr[GtkTreeView], Unit], move_cursor : CFuncPtr5[Ptr[GtkTreeView], GtkMovementStep, CInt, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean], select_all : CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean], unselect_all : CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean], select_cursor_row : CFuncPtr2[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean], toggle_cursor_row : CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean], expand_collapse_cursor_row : CFuncPtr4[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean], select_cursor_parent : CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean], start_interactive_search : CFuncPtr1[Ptr[GtkTreeView], _root_.sn.gnome.glib.internal.gboolean], _reserved : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._6]])(using Zone): Ptr[GtkTreeViewClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).row_activated = row_activated
    (!____ptr).test_expand_row = test_expand_row
    (!____ptr).test_collapse_row = test_collapse_row
    (!____ptr).row_expanded = row_expanded
    (!____ptr).row_collapsed = row_collapsed
    (!____ptr).columns_changed = columns_changed
    (!____ptr).cursor_changed = cursor_changed
    (!____ptr).move_cursor = move_cursor
    (!____ptr).select_all = select_all
    (!____ptr).unselect_all = unselect_all
    (!____ptr).select_cursor_row = select_cursor_row
    (!____ptr).toggle_cursor_row = toggle_cursor_row
    (!____ptr).expand_collapse_cursor_row = expand_collapse_cursor_row
    (!____ptr).select_cursor_parent = select_cursor_parent
    (!____ptr).start_interactive_search = start_interactive_search
    (!____ptr)._reserved = _reserved
    ____ptr