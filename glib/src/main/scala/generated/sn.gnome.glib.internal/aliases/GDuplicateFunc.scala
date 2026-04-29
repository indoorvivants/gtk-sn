package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDuplicateFunc = CFuncPtr2[gpointer, gpointer, gpointer]
object GDuplicateFunc:
  given _tag: Tag[GDuplicateFunc] = Tag.materializeCFuncPtr2[gpointer, gpointer, gpointer]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GDuplicateFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[gpointer, gpointer, gpointer]): GDuplicateFunc = o
  extension (v: GDuplicateFunc)
    inline def value: CFuncPtr2[gpointer, gpointer, gpointer] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)