package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoFontsetForeachFunc: : a `PangoFontset` : a font from _data: callback data
*/
opaque type PangoFontsetForeachFunc = CFuncPtr3[Ptr[PangoFontset], Ptr[PangoFont], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object PangoFontsetForeachFunc:
  given _tag: Tag[PangoFontsetForeachFunc] = Tag.materializeCFuncPtr3[Ptr[PangoFontset], Ptr[PangoFont], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PangoFontsetForeachFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[PangoFontset], Ptr[PangoFont], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): PangoFontsetForeachFunc = o
  extension (v: PangoFontsetForeachFunc)
    inline def value: CFuncPtr3[Ptr[PangoFontset], Ptr[PangoFont], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)