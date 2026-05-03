package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkScaleFormatValueFunc: : The `GtkScale` : The numeric value to format _data: (closure): user data
*/
opaque type GtkScaleFormatValueFunc = CFuncPtr3[Ptr[GtkScale], Double, _root_.sn.gnome.glib.internal.gpointer, CString]
object GtkScaleFormatValueFunc:
  given _tag: Tag[GtkScaleFormatValueFunc] = Tag.materializeCFuncPtr3[Ptr[GtkScale], Double, _root_.sn.gnome.glib.internal.gpointer, CString]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkScaleFormatValueFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkScale], Double, _root_.sn.gnome.glib.internal.gpointer, CString]): GtkScaleFormatValueFunc = o
  extension (v: GtkScaleFormatValueFunc)
    inline def value: CFuncPtr3[Ptr[GtkScale], Double, _root_.sn.gnome.glib.internal.gpointer, CString] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)