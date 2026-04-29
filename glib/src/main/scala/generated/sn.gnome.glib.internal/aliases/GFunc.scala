package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GFunc = CFuncPtr2[gpointer, gpointer, Unit]
object GFunc:
  given _tag: Tag[GFunc] = Tag.materializeCFuncPtr2[gpointer, gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[gpointer, gpointer, Unit]): GFunc = o
  extension (v: GFunc)
    inline def value: CFuncPtr2[gpointer, gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)