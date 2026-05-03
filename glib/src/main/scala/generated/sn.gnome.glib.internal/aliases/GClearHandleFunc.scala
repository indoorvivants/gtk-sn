package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GClearHandleFunc: _id: the handle ID to clear
*/
opaque type GClearHandleFunc = CFuncPtr1[guint, Unit]
object GClearHandleFunc:
  given _tag: Tag[GClearHandleFunc] = Tag.materializeCFuncPtr1[guint, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GClearHandleFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[guint, Unit]): GClearHandleFunc = o
  extension (v: GClearHandleFunc)
    inline def value: CFuncPtr1[guint, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)