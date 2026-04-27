package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GHookCompareFunc = CFuncPtr2[Ptr[GHook], Ptr[GHook], gint]
object GHookCompareFunc:
  given _tag: Tag[GHookCompareFunc] = Tag.materializeCFuncPtr2[Ptr[GHook], Ptr[GHook], gint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GHookCompareFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GHook], Ptr[GHook], gint]): GHookCompareFunc = o
  extension (v: GHookCompareFunc)
    inline def value: CFuncPtr2[Ptr[GHook], Ptr[GHook], gint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)