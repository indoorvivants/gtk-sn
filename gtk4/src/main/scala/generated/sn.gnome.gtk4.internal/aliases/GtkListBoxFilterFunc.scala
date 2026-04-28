package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkListBoxFilterFunc: : the row that may be filtered _data: (closure): user data
*/
opaque type GtkListBoxFilterFunc = CFuncPtr2[Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkListBoxFilterFunc:
  given _tag: Tag[GtkListBoxFilterFunc] = Tag.materializeCFuncPtr2[Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkListBoxFilterFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkListBoxFilterFunc = o
  extension (v: GtkListBoxFilterFunc)
    inline def value: CFuncPtr2[Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)