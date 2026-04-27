package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GHashFunc = CFuncPtr1[gconstpointer, guint]
object GHashFunc:
  given _tag: Tag[GHashFunc] = Tag.materializeCFuncPtr1[gconstpointer, guint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GHashFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gconstpointer, guint]): GHashFunc = o
  extension (v: GHashFunc)
    inline def value: CFuncPtr1[gconstpointer, guint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)