package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GIOFunc = CFuncPtr3[Ptr[GIOChannel], GIOCondition, gpointer, gboolean]
object GIOFunc:
  given _tag: Tag[GIOFunc] = Tag.materializeCFuncPtr3[Ptr[GIOChannel], GIOCondition, gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GIOFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GIOChannel], GIOCondition, gpointer, gboolean]): GIOFunc = o
  extension (v: GIOFunc)
    inline def value: CFuncPtr3[Ptr[GIOChannel], GIOCondition, gpointer, gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)