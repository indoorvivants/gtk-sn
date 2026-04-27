package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_surface_observer_callback_t: : the #cairo_surface_observer_t : the observed surface
*/
opaque type cairo_surface_observer_callback_t = CFuncPtr3[Ptr[cairo_surface_t], Ptr[cairo_surface_t], Ptr[Byte], Unit]
object cairo_surface_observer_callback_t:
  given _tag: Tag[cairo_surface_observer_callback_t] = Tag.materializeCFuncPtr3[Ptr[cairo_surface_t], Ptr[cairo_surface_t], Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): cairo_surface_observer_callback_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[cairo_surface_t], Ptr[cairo_surface_t], Ptr[Byte], Unit]): cairo_surface_observer_callback_t = o
  extension (v: cairo_surface_observer_callback_t)
    inline def value: CFuncPtr3[Ptr[cairo_surface_t], Ptr[cairo_surface_t], Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)