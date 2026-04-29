package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GCompletionFunc = CFuncPtr1[gpointer, Ptr[gchar]]
object GCompletionFunc:
  given _tag: Tag[GCompletionFunc] = Tag.materializeCFuncPtr1[gpointer, Ptr[gchar]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GCompletionFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gpointer, Ptr[gchar]]): GCompletionFunc = o
  extension (v: GCompletionFunc)
    inline def value: CFuncPtr1[gpointer, Ptr[gchar]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)