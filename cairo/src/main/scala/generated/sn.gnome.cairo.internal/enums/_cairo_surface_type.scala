package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_surface_type_t: _SURFACE_TYPE_IMAGE: The surface is of type image, since 1.2 _SURFACE_TYPE_PDF: The surface is of type pdf, since 1.2 _SURFACE_TYPE_PS: The surface is of type ps, since 1.2 _SURFACE_TYPE_XLIB: The surface is of type xlib, since 1.2 _SURFACE_TYPE_XCB: The surface is of type xcb, since 1.2 _SURFACE_TYPE_GLITZ: The surface is of type glitz, since 1.2, deprecated 1.18 (glitz support have been removed, this surface type will never be set by cairo) _SURFACE_TYPE_QUARTZ: The surface is of type quartz, since 1.2 _SURFACE_TYPE_WIN32: The surface is of type win32, since 1.2 _SURFACE_TYPE_BEOS: The surface is of type beos, since 1.2, deprecated 1.18 (beos support have been removed, this surface type will never be set by cairo) _SURFACE_TYPE_DIRECTFB: The surface is of type directfb, since 1.2, deprecated 1.18 (directfb support have been removed, this surface type will never be set by cairo) _SURFACE_TYPE_SVG: The surface is of type svg, since 1.2 _SURFACE_TYPE_OS2: The surface is of type os2, since 1.4, deprecated 1.18 (os2 support have been removed, this surface type will never be set by cairo) _SURFACE_TYPE_WIN32_PRINTING: The surface is a win32 printing surface, since 1.6 _SURFACE_TYPE_QUARTZ_IMAGE: The surface is of type quartz_image, since 1.6 _SURFACE_TYPE_SCRIPT: The surface is of type script, since 1.10 _SURFACE_TYPE_QT: The surface is of type Qt, since 1.10, deprecated 1.18 (Ot support have been removed, this surface type will never be set by cairo) _SURFACE_TYPE_RECORDING: The surface is of type recording, since 1.10 _SURFACE_TYPE_VG: The surface is a OpenVG surface, since 1.10, deprecated 1.18 (OpenVG support have been removed, this surface type will never be set by cairo) _SURFACE_TYPE_GL: The surface is of type OpenGL, since 1.10, deprecated 1.18 (OpenGL support have been removed, this surface type will never be set by cairo) _SURFACE_TYPE_DRM: The surface is of type Direct Render Manager, since 1.10, deprecated 1.18 (DRM support have been removed, this surface type will never be set by cairo) _SURFACE_TYPE_TEE: The surface is of type 'tee' (a multiplexing surface), since 1.10 _SURFACE_TYPE_XML: The surface is of type XML (for debugging), since 1.10 _SURFACE_TYPE_SKIA: The surface is of type Skia, since 1.10, deprecated 1.18 (Skia support have been removed, this surface type will never be set by cairo) _SURFACE_TYPE_SUBSURFACE: The surface is a subsurface created with cairo_surface_create_for_rectangle(), since 1.10 _SURFACE_TYPE_COGL: This surface is of type Cogl, since 1.12, deprecated 1.18 (Cogl support have been removed, this surface type will never be set by cairo)
*/
opaque type _cairo_surface_type = CUnsignedInt
object _cairo_surface_type extends _BindgenEnumCUnsignedInt[_cairo_surface_type]:
  given _tag: Tag[_cairo_surface_type] = Tag.UInt
  inline def define(inline a: Long): _cairo_surface_type = a.toUInt
  val CAIRO_SURFACE_TYPE_IMAGE = define(0)
  val CAIRO_SURFACE_TYPE_PDF = define(1)
  val CAIRO_SURFACE_TYPE_PS = define(2)
  val CAIRO_SURFACE_TYPE_XLIB = define(3)
  val CAIRO_SURFACE_TYPE_XCB = define(4)
  val CAIRO_SURFACE_TYPE_GLITZ = define(5)
  val CAIRO_SURFACE_TYPE_QUARTZ = define(6)
  val CAIRO_SURFACE_TYPE_WIN32 = define(7)
  val CAIRO_SURFACE_TYPE_BEOS = define(8)
  val CAIRO_SURFACE_TYPE_DIRECTFB = define(9)
  val CAIRO_SURFACE_TYPE_SVG = define(10)
  val CAIRO_SURFACE_TYPE_OS2 = define(11)
  val CAIRO_SURFACE_TYPE_WIN32_PRINTING = define(12)
  val CAIRO_SURFACE_TYPE_QUARTZ_IMAGE = define(13)
  val CAIRO_SURFACE_TYPE_SCRIPT = define(14)
  val CAIRO_SURFACE_TYPE_QT = define(15)
  val CAIRO_SURFACE_TYPE_RECORDING = define(16)
  val CAIRO_SURFACE_TYPE_VG = define(17)
  val CAIRO_SURFACE_TYPE_GL = define(18)
  val CAIRO_SURFACE_TYPE_DRM = define(19)
  val CAIRO_SURFACE_TYPE_TEE = define(20)
  val CAIRO_SURFACE_TYPE_XML = define(21)
  val CAIRO_SURFACE_TYPE_SKIA = define(22)
  val CAIRO_SURFACE_TYPE_SUBSURFACE = define(23)
  val CAIRO_SURFACE_TYPE_COGL = define(24)
  def getName(value: _cairo_surface_type): Option[String] =
    value match
      case `CAIRO_SURFACE_TYPE_IMAGE` => Some("CAIRO_SURFACE_TYPE_IMAGE")
      case `CAIRO_SURFACE_TYPE_PDF` => Some("CAIRO_SURFACE_TYPE_PDF")
      case `CAIRO_SURFACE_TYPE_PS` => Some("CAIRO_SURFACE_TYPE_PS")
      case `CAIRO_SURFACE_TYPE_XLIB` => Some("CAIRO_SURFACE_TYPE_XLIB")
      case `CAIRO_SURFACE_TYPE_XCB` => Some("CAIRO_SURFACE_TYPE_XCB")
      case `CAIRO_SURFACE_TYPE_GLITZ` => Some("CAIRO_SURFACE_TYPE_GLITZ")
      case `CAIRO_SURFACE_TYPE_QUARTZ` => Some("CAIRO_SURFACE_TYPE_QUARTZ")
      case `CAIRO_SURFACE_TYPE_WIN32` => Some("CAIRO_SURFACE_TYPE_WIN32")
      case `CAIRO_SURFACE_TYPE_BEOS` => Some("CAIRO_SURFACE_TYPE_BEOS")
      case `CAIRO_SURFACE_TYPE_DIRECTFB` => Some("CAIRO_SURFACE_TYPE_DIRECTFB")
      case `CAIRO_SURFACE_TYPE_SVG` => Some("CAIRO_SURFACE_TYPE_SVG")
      case `CAIRO_SURFACE_TYPE_OS2` => Some("CAIRO_SURFACE_TYPE_OS2")
      case `CAIRO_SURFACE_TYPE_WIN32_PRINTING` => Some("CAIRO_SURFACE_TYPE_WIN32_PRINTING")
      case `CAIRO_SURFACE_TYPE_QUARTZ_IMAGE` => Some("CAIRO_SURFACE_TYPE_QUARTZ_IMAGE")
      case `CAIRO_SURFACE_TYPE_SCRIPT` => Some("CAIRO_SURFACE_TYPE_SCRIPT")
      case `CAIRO_SURFACE_TYPE_QT` => Some("CAIRO_SURFACE_TYPE_QT")
      case `CAIRO_SURFACE_TYPE_RECORDING` => Some("CAIRO_SURFACE_TYPE_RECORDING")
      case `CAIRO_SURFACE_TYPE_VG` => Some("CAIRO_SURFACE_TYPE_VG")
      case `CAIRO_SURFACE_TYPE_GL` => Some("CAIRO_SURFACE_TYPE_GL")
      case `CAIRO_SURFACE_TYPE_DRM` => Some("CAIRO_SURFACE_TYPE_DRM")
      case `CAIRO_SURFACE_TYPE_TEE` => Some("CAIRO_SURFACE_TYPE_TEE")
      case `CAIRO_SURFACE_TYPE_XML` => Some("CAIRO_SURFACE_TYPE_XML")
      case `CAIRO_SURFACE_TYPE_SKIA` => Some("CAIRO_SURFACE_TYPE_SKIA")
      case `CAIRO_SURFACE_TYPE_SUBSURFACE` => Some("CAIRO_SURFACE_TYPE_SUBSURFACE")
      case `CAIRO_SURFACE_TYPE_COGL` => Some("CAIRO_SURFACE_TYPE_COGL")
      case _ => _root_.scala.None
  extension (a: _cairo_surface_type)
    inline def &(b: _cairo_surface_type): _cairo_surface_type = a & b
    inline def |(b: _cairo_surface_type): _cairo_surface_type = a | b
    inline def is(b: _cairo_surface_type): Boolean = (a & b) == b