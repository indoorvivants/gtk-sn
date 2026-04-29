package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_surface_observer_mode_t: _SURFACE_OBSERVER_NORMAL: no recording is done _SURFACE_OBSERVER_RECORD_OPERATIONS: operations are recorded
*/
opaque type cairo_surface_observer_mode_t = CUnsignedInt
object cairo_surface_observer_mode_t extends _BindgenEnumCUnsignedInt[cairo_surface_observer_mode_t]:
  given _tag: Tag[cairo_surface_observer_mode_t] = Tag.UInt
  inline def define(inline a: Long): cairo_surface_observer_mode_t = a.toUInt
  val CAIRO_SURFACE_OBSERVER_NORMAL = define(0)
  val CAIRO_SURFACE_OBSERVER_RECORD_OPERATIONS = define(1)
  def getName(value: cairo_surface_observer_mode_t): Option[String] =
    value match
      case `CAIRO_SURFACE_OBSERVER_NORMAL` => Some("CAIRO_SURFACE_OBSERVER_NORMAL")
      case `CAIRO_SURFACE_OBSERVER_RECORD_OPERATIONS` => Some("CAIRO_SURFACE_OBSERVER_RECORD_OPERATIONS")
      case _ => _root_.scala.None
  extension (a: cairo_surface_observer_mode_t)
    inline def &(b: cairo_surface_observer_mode_t): cairo_surface_observer_mode_t = a & b
    inline def |(b: cairo_surface_observer_mode_t): cairo_surface_observer_mode_t = a | b
    inline def is(b: cairo_surface_observer_mode_t): Boolean = (a & b) == b