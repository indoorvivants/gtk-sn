package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GCopyFunc: : (not nullable): A pointer to the data which should be copied
*/
opaque type GCopyFunc = CFuncPtr2[gconstpointer, gpointer, gpointer]
object GCopyFunc:
  given _tag: Tag[GCopyFunc] = Tag.materializeCFuncPtr2[gconstpointer, gpointer, gpointer]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GCopyFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[gconstpointer, gpointer, gpointer]): GCopyFunc = o
  extension (v: GCopyFunc)
    inline def value: CFuncPtr2[gconstpointer, gpointer, gpointer] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)