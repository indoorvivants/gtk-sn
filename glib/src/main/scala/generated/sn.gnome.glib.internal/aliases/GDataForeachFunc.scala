package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDataForeachFunc = CFuncPtr3[GQuark, gpointer, gpointer, Unit]
object GDataForeachFunc:
  given _tag: Tag[GDataForeachFunc] = Tag.materializeCFuncPtr3[GQuark, gpointer, gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GDataForeachFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GQuark, gpointer, gpointer, Unit]): GDataForeachFunc = o
  extension (v: GDataForeachFunc)
    inline def value: CFuncPtr3[GQuark, gpointer, gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)