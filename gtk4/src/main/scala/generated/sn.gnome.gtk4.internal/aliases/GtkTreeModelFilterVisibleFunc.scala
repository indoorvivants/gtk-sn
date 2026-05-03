package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTreeModelFilterVisibleFunc: : the child model of the `GtkTreeModelFilter` : a `GtkTreeIter` pointing to the row in whose visibility is determined
*/
opaque type GtkTreeModelFilterVisibleFunc = CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkTreeModelFilterVisibleFunc:
  given _tag: Tag[GtkTreeModelFilterVisibleFunc] = Tag.materializeCFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeModelFilterVisibleFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkTreeModelFilterVisibleFunc = o
  extension (v: GtkTreeModelFilterVisibleFunc)
    inline def value: CFuncPtr3[Ptr[GtkTreeModel], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)