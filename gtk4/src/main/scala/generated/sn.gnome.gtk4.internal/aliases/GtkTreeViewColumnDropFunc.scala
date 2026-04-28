package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTreeViewColumnDropFunc: _view: A `GtkTreeView` : The `GtkTreeViewColumn` being dragged
*/
opaque type GtkTreeViewColumnDropFunc = CFuncPtr5[Ptr[GtkTreeView], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkTreeViewColumnDropFunc:
  given _tag: Tag[GtkTreeViewColumnDropFunc] = Tag.materializeCFuncPtr5[Ptr[GtkTreeView], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeViewColumnDropFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[GtkTreeView], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkTreeViewColumnDropFunc = o
  extension (v: GtkTreeViewColumnDropFunc)
    inline def value: CFuncPtr5[Ptr[GtkTreeView], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], Ptr[GtkTreeViewColumn], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)