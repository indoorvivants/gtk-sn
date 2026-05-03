package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkMapListModelMapFunc: : (type GObject) (transfer full): The item to map _data: user data
*/
opaque type GtkMapListModelMapFunc = CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer]
object GtkMapListModelMapFunc:
  given _tag: Tag[GtkMapListModelMapFunc] = Tag.materializeCFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkMapListModelMapFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer]): GtkMapListModelMapFunc = o
  extension (v: GtkMapListModelMapFunc)
    inline def value: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)