package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkContentDeserializeFunc: : a `GdkContentDeserializer`
*/
opaque type GdkContentDeserializeFunc = CFuncPtr1[Ptr[GdkContentDeserializer], Unit]
object GdkContentDeserializeFunc:
  given _tag: Tag[GdkContentDeserializeFunc] = Tag.materializeCFuncPtr1[Ptr[GdkContentDeserializer], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GdkContentDeserializeFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GdkContentDeserializer], Unit]): GdkContentDeserializeFunc = o
  extension (v: GdkContentDeserializeFunc)
    inline def value: CFuncPtr1[Ptr[GdkContentDeserializer], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)