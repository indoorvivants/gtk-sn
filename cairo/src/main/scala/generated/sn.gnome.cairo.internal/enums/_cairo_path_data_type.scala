package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_path_data_type_t: _PATH_MOVE_TO: A move-to operation, since 1.0 _PATH_LINE_TO: A line-to operation, since 1.0 _PATH_CURVE_TO: A curve-to operation, since 1.0 _PATH_CLOSE_PATH: A close-path operation, since 1.0
*/
opaque type _cairo_path_data_type = CUnsignedInt
object _cairo_path_data_type extends _BindgenEnumCUnsignedInt[_cairo_path_data_type]:
  given _tag: Tag[_cairo_path_data_type] = Tag.UInt
  inline def define(inline a: Long): _cairo_path_data_type = a.toUInt
  val CAIRO_PATH_MOVE_TO = define(0)
  val CAIRO_PATH_LINE_TO = define(1)
  val CAIRO_PATH_CURVE_TO = define(2)
  val CAIRO_PATH_CLOSE_PATH = define(3)
  def getName(value: _cairo_path_data_type): Option[String] =
    value match
      case `CAIRO_PATH_MOVE_TO` => Some("CAIRO_PATH_MOVE_TO")
      case `CAIRO_PATH_LINE_TO` => Some("CAIRO_PATH_LINE_TO")
      case `CAIRO_PATH_CURVE_TO` => Some("CAIRO_PATH_CURVE_TO")
      case `CAIRO_PATH_CLOSE_PATH` => Some("CAIRO_PATH_CLOSE_PATH")
      case _ => _root_.scala.None
  extension (a: _cairo_path_data_type)
    inline def &(b: _cairo_path_data_type): _cairo_path_data_type = a & b
    inline def |(b: _cairo_path_data_type): _cairo_path_data_type = a | b
    inline def is(b: _cairo_path_data_type): Boolean = (a & b) == b