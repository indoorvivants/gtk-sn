package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTreeViewMappingFunc: _view: A `GtkTreeView` : The path that’s expanded _data: user data
*/
opaque type GtkTreeViewMappingFunc = CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkTreeViewMappingFunc:
  given _tag: Tag[GtkTreeViewMappingFunc] = Tag.materializeCFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeViewMappingFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkTreeViewMappingFunc = o
  extension (v: GtkTreeViewMappingFunc)
    inline def value: CFuncPtr3[Ptr[GtkTreeView], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)