package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSourceOnceFunc: _data: data passed to the function, set when the source was created
*/
opaque type GSourceOnceFunc = CFuncPtr1[gpointer, Unit]
object GSourceOnceFunc:
  given _tag: Tag[GSourceOnceFunc] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GSourceOnceFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GSourceOnceFunc = o
  extension (v: GSourceOnceFunc)
    inline def value: CFuncPtr1[gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)