package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_raster_source_acquire_func_t: : the pattern being rendered from : the rendering target surface : rectangular region of interest in pixels in sample space
*/
opaque type cairo_raster_source_acquire_func_t = CFuncPtr4[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Ptr[cairo_rectangle_int_t], Ptr[cairo_surface_t]]
object cairo_raster_source_acquire_func_t:
  given _tag: Tag[cairo_raster_source_acquire_func_t] = Tag.materializeCFuncPtr4[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Ptr[cairo_rectangle_int_t], Ptr[cairo_surface_t]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): cairo_raster_source_acquire_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Ptr[cairo_rectangle_int_t], Ptr[cairo_surface_t]]): cairo_raster_source_acquire_func_t = o
  extension (v: cairo_raster_source_acquire_func_t)
    inline def value: CFuncPtr4[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Ptr[cairo_rectangle_int_t], Ptr[cairo_surface_t]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)