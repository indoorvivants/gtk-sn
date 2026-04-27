package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkListBoxSortFunc: : the first row : the second row _data: (closure): user data
*/
opaque type GtkListBoxSortFunc = CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, CInt]
object GtkListBoxSortFunc:
  given _tag: Tag[GtkListBoxSortFunc] = Tag.materializeCFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, CInt]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkListBoxSortFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, CInt]): GtkListBoxSortFunc = o
  extension (v: GtkListBoxSortFunc)
    inline def value: CFuncPtr3[Ptr[GtkListBoxRow], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, CInt] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)