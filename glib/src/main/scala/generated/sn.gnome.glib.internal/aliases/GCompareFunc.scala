package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GCompareFunc = CFuncPtr2[gconstpointer, gconstpointer, gint]
object GCompareFunc:
  given _tag: Tag[GCompareFunc] = Tag.materializeCFuncPtr2[gconstpointer, gconstpointer, gint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GCompareFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[gconstpointer, gconstpointer, gint]): GCompareFunc = o
  extension (v: GCompareFunc)
    inline def value: CFuncPtr2[gconstpointer, gconstpointer, gint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)