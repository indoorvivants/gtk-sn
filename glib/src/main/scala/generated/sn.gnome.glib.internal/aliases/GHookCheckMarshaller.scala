package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GHookCheckMarshaller = CFuncPtr2[Ptr[GHook], gpointer, gboolean]
object GHookCheckMarshaller:
  given _tag: Tag[GHookCheckMarshaller] = Tag.materializeCFuncPtr2[Ptr[GHook], gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GHookCheckMarshaller = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GHook], gpointer, gboolean]): GHookCheckMarshaller = o
  extension (v: GHookCheckMarshaller)
    inline def value: CFuncPtr2[Ptr[GHook], gpointer, gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)