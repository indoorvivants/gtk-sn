package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkFontFilterFunc: : a `PangoFontFamily` : a `PangoFontFace` belonging to
*/
opaque type GtkFontFilterFunc = CFuncPtr3[Ptr[_root_.sn.gnome.pango.internal.PangoFontFamily], Ptr[_root_.sn.gnome.pango.internal.PangoFontFace], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkFontFilterFunc:
  given _tag: Tag[GtkFontFilterFunc] = Tag.materializeCFuncPtr3[Ptr[_root_.sn.gnome.pango.internal.PangoFontFamily], Ptr[_root_.sn.gnome.pango.internal.PangoFontFace], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkFontFilterFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[_root_.sn.gnome.pango.internal.PangoFontFamily], Ptr[_root_.sn.gnome.pango.internal.PangoFontFace], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkFontFilterFunc = o
  extension (v: GtkFontFilterFunc)
    inline def value: CFuncPtr3[Ptr[_root_.sn.gnome.pango.internal.PangoFontFamily], Ptr[_root_.sn.gnome.pango.internal.PangoFontFace], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)