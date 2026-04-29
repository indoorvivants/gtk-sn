package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDestroyNotify = CFuncPtr1[gpointer, Unit]
object GDestroyNotify:
  given _tag: Tag[GDestroyNotify] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GDestroyNotify = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GDestroyNotify = o
  extension (v: GDestroyNotify)
    inline def value: CFuncPtr1[gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)