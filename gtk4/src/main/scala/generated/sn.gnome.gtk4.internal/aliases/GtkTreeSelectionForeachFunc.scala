package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTreeSelectionForeachFunc: : The `GtkTreeModel` being viewed : The `GtkTreePath` of a selected row : A `GtkTreeIter` pointing to a selected row
*/
opaque type GtkTreeSelectionForeachFunc = CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkTreeSelectionForeachFunc:
  given _tag: Tag[GtkTreeSelectionForeachFunc] = Tag.materializeCFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeSelectionForeachFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkTreeSelectionForeachFunc = o
  extension (v: GtkTreeSelectionForeachFunc)
    inline def value: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)