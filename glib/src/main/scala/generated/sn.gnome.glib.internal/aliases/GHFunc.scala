package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GHFunc = CFuncPtr3[gpointer, gpointer, gpointer, Unit]
object GHFunc:
  given _tag: Tag[GHFunc] = Tag.materializeCFuncPtr3[gpointer, gpointer, gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GHFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[gpointer, gpointer, gpointer, Unit]): GHFunc = o
  extension (v: GHFunc)
    inline def value: CFuncPtr3[gpointer, gpointer, gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)