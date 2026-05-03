package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTestFixtureFunc = CFuncPtr2[gpointer, gconstpointer, Unit]
object GTestFixtureFunc:
  given _tag: Tag[GTestFixtureFunc] = Tag.materializeCFuncPtr2[gpointer, gconstpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GTestFixtureFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[gpointer, gconstpointer, Unit]): GTestFixtureFunc = o
  extension (v: GTestFixtureFunc)
    inline def value: CFuncPtr2[gpointer, gconstpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)