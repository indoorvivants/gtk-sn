package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_read_func_t: : the input closure
*/
opaque type cairo_read_func_t = CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CUnsignedInt, cairo_status_t]
object cairo_read_func_t:
  given _tag: Tag[cairo_read_func_t] = Tag.materializeCFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CUnsignedInt, cairo_status_t]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): cairo_read_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CUnsignedInt, cairo_status_t]): cairo_read_func_t = o
  extension (v: cairo_read_func_t)
    inline def value: CFuncPtr3[Ptr[Byte], Ptr[CUnsignedChar], CUnsignedInt, cairo_status_t] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)