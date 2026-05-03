package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_raster_source_release_func_t: : the pattern being rendered from : the surface created during acquire
*/
opaque type cairo_raster_source_release_func_t = CFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Unit]
object cairo_raster_source_release_func_t:
  given _tag: Tag[cairo_raster_source_release_func_t] = Tag.materializeCFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): cairo_raster_source_release_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Unit]): cairo_raster_source_release_func_t = o
  extension (v: cairo_raster_source_release_func_t)
    inline def value: CFuncPtr3[Ptr[cairo_pattern_t], Ptr[Byte], Ptr[cairo_surface_t], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)