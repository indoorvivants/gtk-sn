package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_device_type_t: _DEVICE_TYPE_DRM: The device is of type Direct Render Manager, since 1.10 _DEVICE_TYPE_GL: The device is of type OpenGL, since 1.10 _DEVICE_TYPE_SCRIPT: The device is of type script, since 1.10 _DEVICE_TYPE_XCB: The device is of type xcb, since 1.10 _DEVICE_TYPE_XLIB: The device is of type xlib, since 1.10 _DEVICE_TYPE_XML: The device is of type XML, since 1.10 _DEVICE_TYPE_COGL: The device is of type cogl, since 1.12 _DEVICE_TYPE_WIN32: The device is of type win32, since 1.12 _DEVICE_TYPE_INVALID: The device is invalid, since 1.10
*/
type cairo_device_type_t = _cairo_device_type
object cairo_device_type_t:
  given _tag: Tag[cairo_device_type_t] = _cairo_device_type._tag
  inline def apply(inline o: _cairo_device_type): cairo_device_type_t = o
  extension (v: cairo_device_type_t)
    inline def value: _cairo_device_type = v