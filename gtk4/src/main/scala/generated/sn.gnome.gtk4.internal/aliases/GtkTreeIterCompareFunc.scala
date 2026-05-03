package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTreeIterCompareFunc: : The `GtkTreeModel` the comparison is within : A `GtkTreeIter` in : Another `GtkTreeIter` in _data: Data passed when the compare func is assigned e.g. by gtk_tree_sortable_set_sort_func()
*/
opaque type GtkTreeIterCompareFunc = CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, CInt]
object GtkTreeIterCompareFunc:
  given _tag: Tag[GtkTreeIterCompareFunc] = Tag.materializeCFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, CInt]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeIterCompareFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, CInt]): GtkTreeIterCompareFunc = o
  extension (v: GtkTreeIterCompareFunc)
    inline def value: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, CInt] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)