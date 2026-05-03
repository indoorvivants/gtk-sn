package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GCallback:
*/
opaque type GCallback = CFuncPtr0[Unit]
object GCallback:
  given _tag: Tag[GCallback] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): GCallback = o
  extension (v: GCallback)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)