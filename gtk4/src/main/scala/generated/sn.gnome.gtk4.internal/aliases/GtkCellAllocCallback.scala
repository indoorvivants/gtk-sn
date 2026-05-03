package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkCellAllocCallback: : the cell renderer to operate on _area: the area allocated to inside the rectangle provided to gtk_cell_area_foreach_alloc(). _background: the background area for inside the background area provided to gtk_cell_area_foreach_alloc().
*/
opaque type GtkCellAllocCallback = CFuncPtr4[Ptr[GtkCellRenderer], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkCellAllocCallback:
  given _tag: Tag[GtkCellAllocCallback] = Tag.materializeCFuncPtr4[Ptr[GtkCellRenderer], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkCellAllocCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GtkCellRenderer], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkCellAllocCallback = o
  extension (v: GtkCellAllocCallback)
    inline def value: CFuncPtr4[Ptr[GtkCellRenderer], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)