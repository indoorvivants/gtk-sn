package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTreeModelForeachFunc: : the `GtkTreeModel` being iterated : the current `GtkTreePath` : the current `GtkTreeIter`
*/
opaque type GtkTreeModelForeachFunc = CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkTreeModelForeachFunc:
  given _tag: Tag[GtkTreeModelForeachFunc] = Tag.materializeCFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeModelForeachFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkTreeModelForeachFunc = o
  extension (v: GtkTreeModelForeachFunc)
    inline def value: CFuncPtr4[Ptr[GtkTreeModel], Ptr[GtkTreePath], Ptr[GtkTreeIter], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)