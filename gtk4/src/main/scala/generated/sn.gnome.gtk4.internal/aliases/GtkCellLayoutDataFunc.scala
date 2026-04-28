package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkCellLayoutDataFunc: _layout: a `GtkCellLayout` : the cell renderer whose value is to be set _model: the model : a `GtkTreeIter` indicating the row to set the value for
*/
opaque type GtkCellLayoutDataFunc = CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkCellLayoutDataFunc:
  given _tag: Tag[GtkCellLayoutDataFunc] = Tag.materializeCFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkCellLayoutDataFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkCellLayoutDataFunc = o
  extension (v: GtkCellLayoutDataFunc)
    inline def value: CFuncPtr5[Ptr[GtkCellLayout], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)