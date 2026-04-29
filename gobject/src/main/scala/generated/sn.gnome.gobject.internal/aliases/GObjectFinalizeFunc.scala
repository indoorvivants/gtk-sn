package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GObjectFinalizeFunc: : the #GObject being finalized
*/
opaque type GObjectFinalizeFunc = CFuncPtr1[Ptr[GObject], Unit]
object GObjectFinalizeFunc:
  given _tag: Tag[GObjectFinalizeFunc] = Tag.materializeCFuncPtr1[Ptr[GObject], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GObjectFinalizeFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GObject], Unit]): GObjectFinalizeFunc = o
  extension (v: GObjectFinalizeFunc)
    inline def value: CFuncPtr1[Ptr[GObject], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)