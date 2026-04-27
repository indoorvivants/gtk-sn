package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GHookCheckFunc = CFuncPtr1[gpointer, gboolean]
object GHookCheckFunc:
  given _tag: Tag[GHookCheckFunc] = Tag.materializeCFuncPtr1[gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GHookCheckFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gpointer, gboolean]): GHookCheckFunc = o
  extension (v: GHookCheckFunc)
    inline def value: CFuncPtr1[gpointer, gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)