package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_device_type_t: _DEVICE_TYPE_DRM: The device is of type Direct Render Manager, since 1.10 _DEVICE_TYPE_GL: The device is of type OpenGL, since 1.10 _DEVICE_TYPE_SCRIPT: The device is of type script, since 1.10 _DEVICE_TYPE_XCB: The device is of type xcb, since 1.10 _DEVICE_TYPE_XLIB: The device is of type xlib, since 1.10 _DEVICE_TYPE_XML: The device is of type XML, since 1.10 _DEVICE_TYPE_COGL: The device is of type cogl, since 1.12 _DEVICE_TYPE_WIN32: The device is of type win32, since 1.12 _DEVICE_TYPE_INVALID: The device is invalid, since 1.10
*/
opaque type _cairo_device_type = CInt
object _cairo_device_type extends _BindgenEnumCInt[_cairo_device_type]:
  given _tag: Tag[_cairo_device_type] = Tag.Int
  inline def define(inline a: CInt): _cairo_device_type = a
  val CAIRO_DEVICE_TYPE_DRM = define(0)
  val CAIRO_DEVICE_TYPE_GL = define(1)
  val CAIRO_DEVICE_TYPE_SCRIPT = define(2)
  val CAIRO_DEVICE_TYPE_XCB = define(3)
  val CAIRO_DEVICE_TYPE_XLIB = define(4)
  val CAIRO_DEVICE_TYPE_XML = define(5)
  val CAIRO_DEVICE_TYPE_COGL = define(6)
  val CAIRO_DEVICE_TYPE_WIN32 = define(7)
  val CAIRO_DEVICE_TYPE_INVALID = define(-1)
  def getName(value: _cairo_device_type): Option[String] =
    value match
      case `CAIRO_DEVICE_TYPE_DRM` => Some("CAIRO_DEVICE_TYPE_DRM")
      case `CAIRO_DEVICE_TYPE_GL` => Some("CAIRO_DEVICE_TYPE_GL")
      case `CAIRO_DEVICE_TYPE_SCRIPT` => Some("CAIRO_DEVICE_TYPE_SCRIPT")
      case `CAIRO_DEVICE_TYPE_XCB` => Some("CAIRO_DEVICE_TYPE_XCB")
      case `CAIRO_DEVICE_TYPE_XLIB` => Some("CAIRO_DEVICE_TYPE_XLIB")
      case `CAIRO_DEVICE_TYPE_XML` => Some("CAIRO_DEVICE_TYPE_XML")
      case `CAIRO_DEVICE_TYPE_COGL` => Some("CAIRO_DEVICE_TYPE_COGL")
      case `CAIRO_DEVICE_TYPE_WIN32` => Some("CAIRO_DEVICE_TYPE_WIN32")
      case `CAIRO_DEVICE_TYPE_INVALID` => Some("CAIRO_DEVICE_TYPE_INVALID")
      case _ => _root_.scala.None
  extension (a: _cairo_device_type)
    inline def &(b: _cairo_device_type): _cairo_device_type = a & b
    inline def |(b: _cairo_device_type): _cairo_device_type = a | b
    inline def is(b: _cairo_device_type): Boolean = (a & b) == b