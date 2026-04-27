package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GErrorCopyFunc: _error: source extended error
*/
opaque type GErrorCopyFunc = CFuncPtr2[Ptr[GError], Ptr[GError], Unit]
object GErrorCopyFunc:
  given _tag: Tag[GErrorCopyFunc] = Tag.materializeCFuncPtr2[Ptr[GError], Ptr[GError], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GErrorCopyFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GError], Ptr[GError], Unit]): GErrorCopyFunc = o
  extension (v: GErrorCopyFunc)
    inline def value: CFuncPtr2[Ptr[GError], Ptr[GError], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)