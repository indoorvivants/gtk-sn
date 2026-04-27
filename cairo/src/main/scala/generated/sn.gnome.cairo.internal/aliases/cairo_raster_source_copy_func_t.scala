package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_raster_source_copy_func_t: : the #cairo_pattern_t that was copied to : the #cairo_pattern_t being used as the source for the copy
*/
opaque type cairo_raster_source_copy_func_t = CFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_pattern_t], cairo_status_t]
object cairo_raster_source_copy_func_t:
  given _tag: Tag[cairo_raster_source_copy_func_t] = Tag.materializeCFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_pattern_t], cairo_status_t]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): cairo_raster_source_copy_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_pattern_t], cairo_status_t]): cairo_raster_source_copy_func_t = o
  extension (v: cairo_raster_source_copy_func_t)
    inline def value: CFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_pattern_t], cairo_status_t] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)