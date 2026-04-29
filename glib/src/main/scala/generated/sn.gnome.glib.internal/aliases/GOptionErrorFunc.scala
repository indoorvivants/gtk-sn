package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GOptionErrorFunc: : The active #GOptionContext : The group to which the function belongs
*/
opaque type GOptionErrorFunc = CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], Unit]
object GOptionErrorFunc:
  given _tag: Tag[GOptionErrorFunc] = Tag.materializeCFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GOptionErrorFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], Unit]): GOptionErrorFunc = o
  extension (v: GOptionErrorFunc)
    inline def value: CFuncPtr4[Ptr[GOptionContext], Ptr[GOptionGroup], gpointer, Ptr[Ptr[GError]], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)