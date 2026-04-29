package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GLogFunc = CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, Unit]
object GLogFunc:
  given _tag: Tag[GLogFunc] = Tag.materializeCFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLogFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, Unit]): GLogFunc = o
  extension (v: GLogFunc)
    inline def value: CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)