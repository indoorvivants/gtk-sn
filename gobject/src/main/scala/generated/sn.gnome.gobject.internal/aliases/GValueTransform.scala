package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GValueTransform: _value: Source value.

 * [bindgen] header: /usr/include/glib-2.0/gobject/gvalue.h
*/
opaque type GValueTransform = CFuncPtr2[Ptr[GValue], Ptr[GValue], Unit]
object GValueTransform:
  given _tag: Tag[GValueTransform] = Tag.materializeCFuncPtr2[Ptr[GValue], Ptr[GValue], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GValueTransform = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GValue], Ptr[GValue], Unit]): GValueTransform = o
  extension (v: GValueTransform)
    inline def value: CFuncPtr2[Ptr[GValue], Ptr[GValue], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)