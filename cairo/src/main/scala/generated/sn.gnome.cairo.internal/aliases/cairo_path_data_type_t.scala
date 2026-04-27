package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_path_data_type_t: _PATH_MOVE_TO: A move-to operation, since 1.0 _PATH_LINE_TO: A line-to operation, since 1.0 _PATH_CURVE_TO: A curve-to operation, since 1.0 _PATH_CLOSE_PATH: A close-path operation, since 1.0
*/
type cairo_path_data_type_t = _cairo_path_data_type
object cairo_path_data_type_t:
  given _tag: Tag[cairo_path_data_type_t] = _cairo_path_data_type._tag
  inline def apply(inline o: _cairo_path_data_type): cairo_path_data_type_t = o
  extension (v: cairo_path_data_type_t)
    inline def value: _cairo_path_data_type = v