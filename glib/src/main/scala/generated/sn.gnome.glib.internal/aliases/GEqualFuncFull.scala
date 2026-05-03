package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GEqualFuncFull: : a value : a value to compare with _data: user data provided by the caller
*/
opaque type GEqualFuncFull = CFuncPtr3[gconstpointer, gconstpointer, gpointer, gboolean]
object GEqualFuncFull:
  given _tag: Tag[GEqualFuncFull] = Tag.materializeCFuncPtr3[gconstpointer, gconstpointer, gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GEqualFuncFull = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[gconstpointer, gconstpointer, gpointer, gboolean]): GEqualFuncFull = o
  extension (v: GEqualFuncFull)
    inline def value: CFuncPtr3[gconstpointer, gconstpointer, gpointer, gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)