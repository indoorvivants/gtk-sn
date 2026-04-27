package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkListBoxUpdateHeaderFunc: : the row to update : (nullable): the row before , or %NULL if it is first _data: (closure): user data
*/
opaque type GtkListBoxUpdateHeaderFunc = CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkListBoxUpdateHeaderFunc:
  given _tag: Tag[GtkListBoxUpdateHeaderFunc] = Tag.materializeCFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkListBoxUpdateHeaderFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkListBoxUpdateHeaderFunc = o
  extension (v: GtkListBoxUpdateHeaderFunc)
    inline def value: CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)