package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypeValueCopyFunc: _value: the value to copy

 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
opaque type GTypeValueCopyFunc = CFuncPtr2[Ptr[GValue], Ptr[GValue], Unit]
object GTypeValueCopyFunc:
  given _tag: Tag[GTypeValueCopyFunc] = Tag.materializeCFuncPtr2[Ptr[GValue], Ptr[GValue], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GTypeValueCopyFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GValue], Ptr[GValue], Unit]): GTypeValueCopyFunc = o
  extension (v: GTypeValueCopyFunc)
    inline def value: CFuncPtr2[Ptr[GValue], Ptr[GValue], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)