package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkContentSerializeFunc: : a `GdkContentSerializer`
*/
opaque type GdkContentSerializeFunc = CFuncPtr1[Ptr[GdkContentSerializer], Unit]
object GdkContentSerializeFunc:
  given _tag: Tag[GdkContentSerializeFunc] = Tag.materializeCFuncPtr1[Ptr[GdkContentSerializer], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GdkContentSerializeFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GdkContentSerializer], Unit]): GdkContentSerializeFunc = o
  extension (v: GdkContentSerializeFunc)
    inline def value: CFuncPtr1[Ptr[GdkContentSerializer], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)