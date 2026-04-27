package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSpawnChildSetupFunc:
*/
opaque type GSpawnChildSetupFunc = CFuncPtr1[gpointer, Unit]
object GSpawnChildSetupFunc:
  given _tag: Tag[GSpawnChildSetupFunc] = Tag.materializeCFuncPtr1[gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GSpawnChildSetupFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[gpointer, Unit]): GSpawnChildSetupFunc = o
  extension (v: GSpawnChildSetupFunc)
    inline def value: CFuncPtr1[gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)