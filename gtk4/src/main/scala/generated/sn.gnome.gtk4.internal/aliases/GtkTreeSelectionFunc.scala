package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTreeSelectionFunc: : A `GtkTreeSelection` : A `GtkTreeModel` being viewed : The `GtkTreePath` of the row in question _currently_selected: %TRUE, if the path is currently selected
*/
opaque type GtkTreeSelectionFunc = CFuncPtr5[Ptr[GtkTreeSelection], Ptr[GtkTreeModel], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkTreeSelectionFunc:
  given _tag: Tag[GtkTreeSelectionFunc] = Tag.materializeCFuncPtr5[Ptr[GtkTreeSelection], Ptr[GtkTreeModel], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeSelectionFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[GtkTreeSelection], Ptr[GtkTreeModel], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkTreeSelectionFunc = o
  extension (v: GtkTreeSelectionFunc)
    inline def value: CFuncPtr5[Ptr[GtkTreeSelection], Ptr[GtkTreeModel], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)