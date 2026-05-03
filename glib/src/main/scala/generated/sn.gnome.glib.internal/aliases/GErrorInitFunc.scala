package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GErrorInitFunc: : extended error
*/
opaque type GErrorInitFunc = CFuncPtr1[Ptr[GError], Unit]
object GErrorInitFunc:
  given _tag: Tag[GErrorInitFunc] = Tag.materializeCFuncPtr1[Ptr[GError], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GErrorInitFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GError], Unit]): GErrorInitFunc = o
  extension (v: GErrorInitFunc)
    inline def value: CFuncPtr1[Ptr[GError], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)