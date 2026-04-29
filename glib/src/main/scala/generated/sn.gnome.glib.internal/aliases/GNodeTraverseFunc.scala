package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GNodeTraverseFunc = CFuncPtr2[Ptr[GNode], gpointer, gboolean]
object GNodeTraverseFunc:
  given _tag: Tag[GNodeTraverseFunc] = Tag.materializeCFuncPtr2[Ptr[GNode], gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GNodeTraverseFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GNode], gpointer, gboolean]): GNodeTraverseFunc = o
  extension (v: GNodeTraverseFunc)
    inline def value: CFuncPtr2[Ptr[GNode], gpointer, gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)