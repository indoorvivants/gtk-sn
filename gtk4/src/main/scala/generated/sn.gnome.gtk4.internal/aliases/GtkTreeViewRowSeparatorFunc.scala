package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTreeViewRowSeparatorFunc: : the `GtkTreeModel` : a `GtkTreeIter` pointing at a row in
*/
opaque type GtkTreeViewRowSeparatorFunc = CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkTreeViewRowSeparatorFunc:
  given _tag: Tag[GtkTreeViewRowSeparatorFunc] = Tag.materializeCFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeViewRowSeparatorFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkTreeViewRowSeparatorFunc = o
  extension (v: GtkTreeViewRowSeparatorFunc)
    inline def value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)