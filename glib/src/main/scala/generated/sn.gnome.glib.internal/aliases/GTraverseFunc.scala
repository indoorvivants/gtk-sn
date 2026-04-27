package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTraverseFunc = CFuncPtr3[gpointer, gpointer, gpointer, gboolean]
object GTraverseFunc:
  given _tag: Tag[GTraverseFunc] = Tag.materializeCFuncPtr3[gpointer, gpointer, gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GTraverseFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[gpointer, gpointer, gpointer, gboolean]): GTraverseFunc = o
  extension (v: GTraverseFunc)
    inline def value: CFuncPtr3[gpointer, gpointer, gpointer, gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)