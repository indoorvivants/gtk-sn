package sn.gnome.cairo.fluent

import _root_.sn.gnome.cairo.internal.cairo_surface_type_t

enum SurfaceType(val raw: cairo_surface_type_t):
  case IMAGE extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_IMAGE)
  case PDF extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_PDF)
  case PS extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_PS)
  case XLIB extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_XLIB)
  case XCB extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_XCB)
  case GLITZ extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_GLITZ)
  case QUARTZ
      extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_QUARTZ)
  case WIN32 extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_WIN32)
  case BEOS extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_BEOS)
  case DIRECTFB
      extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_DIRECTFB)
  case SVG extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_SVG)
  case OS2 extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_OS2)
  case WIN32_PRINTING
      extends SurfaceType(
        cairo_surface_type_t.CAIRO_SURFACE_TYPE_WIN32_PRINTING
      )
  case QUARTZ_IMAGE
      extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_QUARTZ_IMAGE)
  case SCRIPT
      extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_SCRIPT)
  case QT extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_QT)
  case RECORDING
      extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_RECORDING)
  case VG extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_VG)
  case GL extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_GL)
  case DRM extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_DRM)
  case TEE extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_TEE)
  case XML extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_XML)
  case SKIA extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_SKIA)
  case SUBSURFACE
      extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_SUBSURFACE)
  case COGL extends SurfaceType(cairo_surface_type_t.CAIRO_SURFACE_TYPE_COGL)
end SurfaceType

object SurfaceType:
  def fromRaw(raw: cairo_surface_type_t): SurfaceType =
    raw match
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_IMAGE  => SurfaceType.IMAGE
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_PDF    => SurfaceType.PDF
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_PS     => SurfaceType.PS
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_XLIB   => SurfaceType.XLIB
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_XCB    => SurfaceType.XCB
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_GLITZ  => SurfaceType.GLITZ
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_QUARTZ => SurfaceType.QUARTZ
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_WIN32  => SurfaceType.WIN32
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_BEOS   => SurfaceType.BEOS
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_DIRECTFB =>
        SurfaceType.DIRECTFB
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_SVG => SurfaceType.SVG
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_OS2 => SurfaceType.OS2
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_WIN32_PRINTING =>
        SurfaceType.WIN32_PRINTING
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_QUARTZ_IMAGE =>
        SurfaceType.QUARTZ_IMAGE
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_SCRIPT => SurfaceType.SCRIPT
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_QT     => SurfaceType.QT
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_RECORDING =>
        SurfaceType.RECORDING
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_VG   => SurfaceType.VG
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_GL   => SurfaceType.GL
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_DRM  => SurfaceType.DRM
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_TEE  => SurfaceType.TEE
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_XML  => SurfaceType.XML
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_SKIA => SurfaceType.SKIA
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_SUBSURFACE =>
        SurfaceType.SUBSURFACE
      case cairo_surface_type_t.CAIRO_SURFACE_TYPE_COGL => SurfaceType.COGL
  end fromRaw
end SurfaceType
