package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_destroy_func_t:
*/
opaque type cairo_destroy_func_t = CFuncPtr1[Ptr[Byte], Unit]
object cairo_destroy_func_t:
  given _tag: Tag[cairo_destroy_func_t] = Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): cairo_destroy_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[Byte], Unit]): cairo_destroy_func_t = o
  extension (v: cairo_destroy_func_t)
    inline def value: CFuncPtr1[Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)