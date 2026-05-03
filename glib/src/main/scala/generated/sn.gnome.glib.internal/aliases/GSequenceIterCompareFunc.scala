package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSequenceIterCompareFunc = CFuncPtr3[Ptr[GSequenceIter], Ptr[GSequenceIter], gpointer, gint]
object GSequenceIterCompareFunc:
  given _tag: Tag[GSequenceIterCompareFunc] = Tag.materializeCFuncPtr3[Ptr[GSequenceIter], Ptr[GSequenceIter], gpointer, gint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GSequenceIterCompareFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GSequenceIter], Ptr[GSequenceIter], gpointer, gint]): GSequenceIterCompareFunc = o
  extension (v: GSequenceIterCompareFunc)
    inline def value: CFuncPtr3[Ptr[GSequenceIter], Ptr[GSequenceIter], gpointer, gint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)