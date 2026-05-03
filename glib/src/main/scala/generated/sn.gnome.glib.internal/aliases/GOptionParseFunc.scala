package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GOptionParseFunc: : The active #GOptionContext : The group to which the function belongs
*/
opaque type GOptionParseFunc = CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], gboolean]
object GOptionParseFunc:
  given _tag: Tag[GOptionParseFunc] = Tag.materializeCFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GOptionParseFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], gboolean]): GOptionParseFunc = o
  extension (v: GOptionParseFunc)
    inline def value: CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)