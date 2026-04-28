package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkCellEditableIface: _done: Signal is a sign for the cell renderer to update its value from the cell_editable. _widget: Signal is meant to indicate that the cell is finished editing, and the widget may now be destroyed. _editing: Begins editing on a cell_editable.
*/
opaque type _GtkCellEditableIface = CStruct4[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GtkCellEditable], Unit], CFuncPtr1[Ptr[GtkCellEditable], Unit], CFuncPtr2[Ptr[GtkCellEditable], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], Unit]]

object _GtkCellEditableIface:
  given _tag: Tag[_GtkCellEditableIface] = Tag.materializeCStruct4Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GtkCellEditable], Unit], CFuncPtr1[Ptr[GtkCellEditable], Unit], CFuncPtr2[Ptr[GtkCellEditable], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkCellEditableIface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def editing_done : CFuncPtr1[Ptr[GtkCellEditable], Unit] = struct._2
      inline def editing_done_=(value: CFuncPtr1[Ptr[GtkCellEditable], Unit]): Unit = (!struct.at2 = value)
      inline def remove_widget : CFuncPtr1[Ptr[GtkCellEditable], Unit] = struct._3
      inline def remove_widget_=(value: CFuncPtr1[Ptr[GtkCellEditable], Unit]): Unit = (!struct.at3 = value)
      inline def start_editing : CFuncPtr2[Ptr[GtkCellEditable], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], Unit] = struct._4
      inline def start_editing_=(value: CFuncPtr2[Ptr[GtkCellEditable], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], Unit]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GtkCellEditableIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkCellEditableIface] = scala.scalanative.unsafe.alloc[_GtkCellEditableIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, editing_done : CFuncPtr1[Ptr[GtkCellEditable], Unit], remove_widget : CFuncPtr1[Ptr[GtkCellEditable], Unit], start_editing : CFuncPtr2[Ptr[GtkCellEditable], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], Unit])(using Zone): Ptr[_GtkCellEditableIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).editing_done = editing_done
    (!____ptr).remove_widget = remove_widget
    (!____ptr).start_editing = start_editing
    ____ptr