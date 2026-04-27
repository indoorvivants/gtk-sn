package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypeValueInitFunc: : the value to initialize
*/
opaque type GTypeValueInitFunc = CFuncPtr1[Ptr[GValue], Unit]
object GTypeValueInitFunc:
  given _tag: Tag[GTypeValueInitFunc] = Tag.materializeCFuncPtr1[Ptr[GValue], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GTypeValueInitFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GValue], Unit]): GTypeValueInitFunc = o
  extension (v: GTypeValueInitFunc)
    inline def value: CFuncPtr1[Ptr[GValue], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)