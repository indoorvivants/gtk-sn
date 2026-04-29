package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GThreadFunc = CFuncPtr1[gpointer, gpointer]
object GThreadFunc:
  given _tag: Tag[GThreadFunc] = Tag.materializeCFuncPtr1[gpointer, gpointer]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GThreadFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gpointer, gpointer]): GThreadFunc = o
  extension (v: GThreadFunc)
    inline def value: CFuncPtr1[gpointer, gpointer] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)