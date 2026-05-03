package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkCellRendererClass: _request_mode: Called to gets whether the cell renderer prefers a height-for-width layout or a width-for-height layout. _preferred_width: Called to get a renderer’s natural width. _preferred_height_for_width: Called to get a renderer’s natural height for width. _preferred_height: Called to get a renderer’s natural height. _preferred_width_for_height: Called to get a renderer’s natural width for height. _aligned_area: Called to get the aligned area used by inside _area. : Called to snapshot the content of the `GtkCellRenderer`. : Called to activate the content of the `GtkCellRenderer`. _editing: Called to initiate editing the content of the `GtkCellRenderer`. _canceled: Signal gets emitted when the user cancels the process of editing a cell. _started: Signal gets emitted when a cell starts to be edited.
*/
opaque type GtkCellRendererClass = CStruct13[_root_.sn.gnome.gobject.internal.GInitiallyUnownedClass, CFuncPtr1[Ptr[GtkCellRenderer], GtkSizeRequestMode], CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], GtkCellRendererState, Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Unit], CFuncPtr6[Ptr[GtkCellRenderer], Ptr[GtkSnapshot], Ptr[GtkWidget], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], GtkCellRendererState, Unit], CFuncPtr7[Ptr[GtkCellRenderer], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], Ptr[GtkWidget], CString, Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], GtkCellRendererState, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr7[Ptr[GtkCellRenderer], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], Ptr[GtkWidget], CString, Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], GtkCellRendererState, Ptr[GtkCellEditable]], CFuncPtr1[Ptr[GtkCellRenderer], Unit], CFuncPtr3[Ptr[GtkCellRenderer], Ptr[GtkCellEditable], CString, Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object GtkCellRendererClass:
  given _tag: Tag[GtkCellRendererClass] = Tag.materializeCStruct13Tag[_root_.sn.gnome.gobject.internal.GInitiallyUnownedClass, CFuncPtr1[Ptr[GtkCellRenderer], GtkSizeRequestMode], CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], GtkCellRendererState, Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Unit], CFuncPtr6[Ptr[GtkCellRenderer], Ptr[GtkSnapshot], Ptr[GtkWidget], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], GtkCellRendererState, Unit], CFuncPtr7[Ptr[GtkCellRenderer], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], Ptr[GtkWidget], CString, Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], GtkCellRendererState, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr7[Ptr[GtkCellRenderer], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], Ptr[GtkWidget], CString, Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], GtkCellRendererState, Ptr[GtkCellEditable]], CFuncPtr1[Ptr[GtkCellRenderer], Unit], CFuncPtr3[Ptr[GtkCellRenderer], Ptr[GtkCellEditable], CString, Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkCellRendererClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GInitiallyUnownedClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GInitiallyUnownedClass): Unit = (!struct.at1 = value)
      inline def get_request_mode : CFuncPtr1[Ptr[GtkCellRenderer], GtkSizeRequestMode] = struct._2
      inline def get_request_mode_=(value: CFuncPtr1[Ptr[GtkCellRenderer], GtkSizeRequestMode]): Unit = (!struct.at2 = value)
      inline def get_preferred_width : CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit] = struct._3
      inline def get_preferred_width_=(value: CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit]): Unit = (!struct.at3 = value)
      inline def get_preferred_height_for_width : CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit] = struct._4
      inline def get_preferred_height_for_width_=(value: CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit]): Unit = (!struct.at4 = value)
      inline def get_preferred_height : CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit] = struct._5
      inline def get_preferred_height_=(value: CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit]): Unit = (!struct.at5 = value)
      inline def get_preferred_width_for_height : CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit] = struct._6
      inline def get_preferred_width_for_height_=(value: CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit]): Unit = (!struct.at6 = value)
      inline def get_aligned_area : CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], GtkCellRendererState, Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Unit] = struct._7
      inline def get_aligned_area_=(value: CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], GtkCellRendererState, Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Unit]): Unit = (!struct.at7 = value)
      inline def snapshot : CFuncPtr6[Ptr[GtkCellRenderer], Ptr[GtkSnapshot], Ptr[GtkWidget], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], GtkCellRendererState, Unit] = struct._8
      inline def snapshot_=(value: CFuncPtr6[Ptr[GtkCellRenderer], Ptr[GtkSnapshot], Ptr[GtkWidget], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], GtkCellRendererState, Unit]): Unit = (!struct.at8 = value)
      inline def activate : CFuncPtr7[Ptr[GtkCellRenderer], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], Ptr[GtkWidget], CString, Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], GtkCellRendererState, _root_.sn.gnome.glib.internal.gboolean] = struct._9
      inline def activate_=(value: CFuncPtr7[Ptr[GtkCellRenderer], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], Ptr[GtkWidget], CString, Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], GtkCellRendererState, _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at9 = value)
      inline def start_editing : CFuncPtr7[Ptr[GtkCellRenderer], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], Ptr[GtkWidget], CString, Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], GtkCellRendererState, Ptr[GtkCellEditable]] = struct._10
      inline def start_editing_=(value: CFuncPtr7[Ptr[GtkCellRenderer], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], Ptr[GtkWidget], CString, Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], GtkCellRendererState, Ptr[GtkCellEditable]]): Unit = (!struct.at10 = value)
      inline def editing_canceled : CFuncPtr1[Ptr[GtkCellRenderer], Unit] = struct._11
      inline def editing_canceled_=(value: CFuncPtr1[Ptr[GtkCellRenderer], Unit]): Unit = (!struct.at11 = value)
      inline def editing_started : CFuncPtr3[Ptr[GtkCellRenderer], Ptr[GtkCellEditable], CString, Unit] = struct._12
      inline def editing_started_=(value: CFuncPtr3[Ptr[GtkCellRenderer], Ptr[GtkCellEditable], CString, Unit]): Unit = (!struct.at12 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._13
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at13 = value)
    end extension
  
  // Allocates GtkCellRendererClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkCellRendererClass] = scala.scalanative.unsafe.alloc[GtkCellRendererClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GInitiallyUnownedClass, get_request_mode : CFuncPtr1[Ptr[GtkCellRenderer], GtkSizeRequestMode], get_preferred_width : CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], get_preferred_height_for_width : CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], get_preferred_height : CFuncPtr4[Ptr[GtkCellRenderer], Ptr[GtkWidget], Ptr[CInt], Ptr[CInt], Unit], get_preferred_width_for_height : CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], CInt, Ptr[CInt], Ptr[CInt], Unit], get_aligned_area : CFuncPtr5[Ptr[GtkCellRenderer], Ptr[GtkWidget], GtkCellRendererState, Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Unit], snapshot : CFuncPtr6[Ptr[GtkCellRenderer], Ptr[GtkSnapshot], Ptr[GtkWidget], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], GtkCellRendererState, Unit], activate : CFuncPtr7[Ptr[GtkCellRenderer], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], Ptr[GtkWidget], CString, Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], GtkCellRendererState, _root_.sn.gnome.glib.internal.gboolean], start_editing : CFuncPtr7[Ptr[GtkCellRenderer], Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent], Ptr[GtkWidget], CString, Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], GtkCellRendererState, Ptr[GtkCellEditable]], editing_canceled : CFuncPtr1[Ptr[GtkCellRenderer], Unit], editing_started : CFuncPtr3[Ptr[GtkCellRenderer], Ptr[GtkCellEditable], CString, Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[GtkCellRendererClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_request_mode = get_request_mode
    (!____ptr).get_preferred_width = get_preferred_width
    (!____ptr).get_preferred_height_for_width = get_preferred_height_for_width
    (!____ptr).get_preferred_height = get_preferred_height
    (!____ptr).get_preferred_width_for_height = get_preferred_width_for_height
    (!____ptr).get_aligned_area = get_aligned_area
    (!____ptr).snapshot = snapshot
    (!____ptr).activate = activate
    (!____ptr).start_editing = start_editing
    (!____ptr).editing_canceled = editing_canceled
    (!____ptr).editing_started = editing_started
    (!____ptr).padding = padding
    ____ptr