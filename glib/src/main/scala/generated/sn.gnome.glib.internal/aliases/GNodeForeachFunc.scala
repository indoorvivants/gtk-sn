package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GNodeForeachFunc = CFuncPtr2[Ptr[GNode], gpointer, Unit]
object GNodeForeachFunc:
  given _tag: Tag[GNodeForeachFunc] = Tag.materializeCFuncPtr2[Ptr[GNode], gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GNodeForeachFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GNode], gpointer, Unit]): GNodeForeachFunc = o
  extension (v: GNodeForeachFunc)
    inline def value: CFuncPtr2[Ptr[GNode], gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)