package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkIconViewForeachFunc: _view: a `GtkIconView` : The `GtkTreePath` of a selected row
*/
opaque type GtkIconViewForeachFunc = CFuncPtr3[Ptr[GtkIconView], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkIconViewForeachFunc:
  given _tag: Tag[GtkIconViewForeachFunc] = Tag.materializeCFuncPtr3[Ptr[GtkIconView], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkIconViewForeachFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkIconView], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkIconViewForeachFunc = o
  extension (v: GtkIconViewForeachFunc)
    inline def value: CFuncPtr3[Ptr[GtkIconView], Ptr[GtkTreePath], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)