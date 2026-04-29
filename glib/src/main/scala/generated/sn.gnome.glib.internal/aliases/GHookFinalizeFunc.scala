package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GHookFinalizeFunc = CFuncPtr2[Ptr[GHookList], Ptr[GHook], Unit]
object GHookFinalizeFunc:
  given _tag: Tag[GHookFinalizeFunc] = Tag.materializeCFuncPtr2[Ptr[GHookList], Ptr[GHook], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GHookFinalizeFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GHookList], Ptr[GHook], Unit]): GHookFinalizeFunc = o
  extension (v: GHookFinalizeFunc)
    inline def value: CFuncPtr2[Ptr[GHookList], Ptr[GHook], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)