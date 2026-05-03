package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GHookFindFunc = CFuncPtr2[Ptr[GHook], gpointer, gboolean]
object GHookFindFunc:
  given _tag: Tag[GHookFindFunc] = Tag.materializeCFuncPtr2[Ptr[GHook], gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GHookFindFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GHook], gpointer, gboolean]): GHookFindFunc = o
  extension (v: GHookFindFunc)
    inline def value: CFuncPtr2[Ptr[GHook], gpointer, gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)