package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GCompletionStrncmpFunc = CFuncPtr3[Ptr[gchar], Ptr[gchar], gsize, gint]
object GCompletionStrncmpFunc:
  given _tag: Tag[GCompletionStrncmpFunc] = Tag.materializeCFuncPtr3[Ptr[gchar], Ptr[gchar], gsize, gint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GCompletionStrncmpFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[gchar], Ptr[gchar], gsize, gint]): GCompletionStrncmpFunc = o
  extension (v: GCompletionStrncmpFunc)
    inline def value: CFuncPtr3[Ptr[gchar], Ptr[gchar], gsize, gint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)