package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GCompareDataFunc = CFuncPtr3[gconstpointer, gconstpointer, gpointer, gint]
object GCompareDataFunc:
  given _tag: Tag[GCompareDataFunc] = Tag.materializeCFuncPtr3[gconstpointer, gconstpointer, gpointer, gint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GCompareDataFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[gconstpointer, gconstpointer, gpointer, gint]): GCompareDataFunc = o
  extension (v: GCompareDataFunc)
    inline def value: CFuncPtr3[gconstpointer, gconstpointer, gpointer, gint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)