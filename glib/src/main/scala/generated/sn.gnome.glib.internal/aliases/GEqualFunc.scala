package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GEqualFunc = CFuncPtr2[gconstpointer, gconstpointer, gboolean]
object GEqualFunc:
  given _tag: Tag[GEqualFunc] = Tag.materializeCFuncPtr2[gconstpointer, gconstpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GEqualFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[gconstpointer, gconstpointer, gboolean]): GEqualFunc = o
  extension (v: GEqualFunc)
    inline def value: CFuncPtr2[gconstpointer, gconstpointer, gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)