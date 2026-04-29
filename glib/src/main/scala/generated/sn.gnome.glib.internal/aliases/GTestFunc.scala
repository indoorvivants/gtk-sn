package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTestFunc = CFuncPtr0[Unit]
object GTestFunc:
  given _tag: Tag[GTestFunc] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GTestFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): GTestFunc = o
  extension (v: GTestFunc)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)