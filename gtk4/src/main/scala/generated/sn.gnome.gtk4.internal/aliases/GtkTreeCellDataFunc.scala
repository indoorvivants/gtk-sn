package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTreeCellDataFunc: _column: A `GtkTreeViewColumn` : The `GtkCellRenderer` that is being rendered by _column _model: The `GtkTreeModel` being rendered : A `GtkTreeIter` of the current row rendered
*/
opaque type GtkTreeCellDataFunc = CFuncPtr5[Ptr[GtkTreeViewColumn], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkTreeCellDataFunc:
  given _tag: Tag[GtkTreeCellDataFunc] = Tag.materializeCFuncPtr5[Ptr[GtkTreeViewColumn], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeCellDataFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[GtkTreeViewColumn], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkTreeCellDataFunc = o
  extension (v: GtkTreeCellDataFunc)
    inline def value: CFuncPtr5[Ptr[GtkTreeViewColumn], Ptr[GtkCellRenderer], Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)