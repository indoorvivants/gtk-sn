package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTreeViewSearchEqualFunc: : the `GtkTreeModel` being searched : the search column set by gtk_tree_view_set_search_column() : the key string to compare with : a `GtkTreeIter` pointing the row of that should be compared with . _data: (closure): user data from gtk_tree_view_set_search_equal_func()
*/
opaque type GtkTreeViewSearchEqualFunc = CFuncPtr5[Ptr[GtkTreeModel], CInt, CString, Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkTreeViewSearchEqualFunc:
  given _tag: Tag[GtkTreeViewSearchEqualFunc] = Tag.materializeCFuncPtr5[Ptr[GtkTreeModel], CInt, CString, Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeViewSearchEqualFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[GtkTreeModel], CInt, CString, Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkTreeViewSearchEqualFunc = o
  extension (v: GtkTreeViewSearchEqualFunc)
    inline def value: CFuncPtr5[Ptr[GtkTreeModel], CInt, CString, Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)