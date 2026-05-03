package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSourceFunc: _data: data passed to the function, set when the source was created with one of the above functions
*/
opaque type GSourceFunc = CFuncPtr1[gpointer, gboolean]
object GSourceFunc:
  given _tag: Tag[GSourceFunc] = Tag.materializeCFuncPtr1[gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GSourceFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gpointer, gboolean]): GSourceFunc = o
  extension (v: GSourceFunc)
    inline def value: CFuncPtr1[gpointer, gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)