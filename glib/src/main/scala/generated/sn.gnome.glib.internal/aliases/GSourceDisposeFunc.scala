package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSourceDisposeFunc: : #GSource that is currently being disposed
*/
opaque type GSourceDisposeFunc = CFuncPtr1[Ptr[GSource], Unit]
object GSourceDisposeFunc:
  given _tag: Tag[GSourceDisposeFunc] = Tag.materializeCFuncPtr1[Ptr[GSource], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GSourceDisposeFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GSource], Unit]): GSourceDisposeFunc = o
  extension (v: GSourceDisposeFunc)
    inline def value: CFuncPtr1[Ptr[GSource], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)