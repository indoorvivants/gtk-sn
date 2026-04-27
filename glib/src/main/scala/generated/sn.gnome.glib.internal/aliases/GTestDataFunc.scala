package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTestDataFunc = CFuncPtr1[gconstpointer, Unit]
object GTestDataFunc:
  given _tag: Tag[GTestDataFunc] = Tag.materializeCFuncPtr1[gconstpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GTestDataFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gconstpointer, Unit]): GTestDataFunc = o
  extension (v: GTestDataFunc)
    inline def value: CFuncPtr1[gconstpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)