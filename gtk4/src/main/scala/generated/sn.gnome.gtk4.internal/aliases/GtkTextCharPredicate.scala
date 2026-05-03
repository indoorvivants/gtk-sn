package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTextCharPredicate: : a Unicode code point _data: data passed to the callback
*/
opaque type GtkTextCharPredicate = CFuncPtr2[_root_.sn.gnome.glib.internal.gunichar, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkTextCharPredicate:
  given _tag: Tag[GtkTextCharPredicate] = Tag.materializeCFuncPtr2[_root_.sn.gnome.glib.internal.gunichar, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTextCharPredicate = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[_root_.sn.gnome.glib.internal.gunichar, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkTextCharPredicate = o
  extension (v: GtkTextCharPredicate)
    inline def value: CFuncPtr2[_root_.sn.gnome.glib.internal.gunichar, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)