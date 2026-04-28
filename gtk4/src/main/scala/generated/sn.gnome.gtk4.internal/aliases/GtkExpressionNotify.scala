package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkExpressionNotify: _data: data passed to gtk_expression_watch()
*/
opaque type GtkExpressionNotify = CFuncPtr1[_root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkExpressionNotify:
  given _tag: Tag[GtkExpressionNotify] = Tag.materializeCFuncPtr1[_root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkExpressionNotify = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[_root_.sn.gnome.glib.internal.gpointer, Unit]): GtkExpressionNotify = o
  extension (v: GtkExpressionNotify)
    inline def value: CFuncPtr1[_root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)