package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GHRFunc = CFuncPtr3[gpointer, gpointer, gpointer, gboolean]
object GHRFunc:
  given _tag: Tag[GHRFunc] = Tag.materializeCFuncPtr3[gpointer, gpointer, gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GHRFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[gpointer, gpointer, gpointer, gboolean]): GHRFunc = o
  extension (v: GHRFunc)
    inline def value: CFuncPtr3[gpointer, gpointer, gpointer, gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)