package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GHookMarshaller = CFuncPtr2[Ptr[GHook], gpointer, Unit]
object GHookMarshaller:
  given _tag: Tag[GHookMarshaller] = Tag.materializeCFuncPtr2[Ptr[GHook], gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GHookMarshaller = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GHook], gpointer, Unit]): GHookMarshaller = o
  extension (v: GHookMarshaller)
    inline def value: CFuncPtr2[Ptr[GHook], gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)