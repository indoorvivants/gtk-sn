package sn.gnome.cairo.fluent

import _root_.sn.gnome.cairo.internal.cairo_device_type_t

enum DeviceType(val raw: cairo_device_type_t):
  case DRM extends DeviceType(cairo_device_type_t.CAIRO_DEVICE_TYPE_DRM)
  case GL extends DeviceType(cairo_device_type_t.CAIRO_DEVICE_TYPE_GL)
  case SCRIPT extends DeviceType(cairo_device_type_t.CAIRO_DEVICE_TYPE_SCRIPT)
  case XCB extends DeviceType(cairo_device_type_t.CAIRO_DEVICE_TYPE_XCB)
  case XLIB extends DeviceType(cairo_device_type_t.CAIRO_DEVICE_TYPE_XLIB)
  case XML extends DeviceType(cairo_device_type_t.CAIRO_DEVICE_TYPE_XML)
  case COGL extends DeviceType(cairo_device_type_t.CAIRO_DEVICE_TYPE_COGL)
  case WIN32 extends DeviceType(cairo_device_type_t.CAIRO_DEVICE_TYPE_WIN32)
  case INVALID extends DeviceType(cairo_device_type_t.CAIRO_DEVICE_TYPE_INVALID)
end DeviceType

object DeviceType:
  def fromRaw(raw: cairo_device_type_t): DeviceType =
    raw match
      case cairo_device_type_t.CAIRO_DEVICE_TYPE_DRM     => DeviceType.DRM
      case cairo_device_type_t.CAIRO_DEVICE_TYPE_GL      => DeviceType.GL
      case cairo_device_type_t.CAIRO_DEVICE_TYPE_SCRIPT  => DeviceType.SCRIPT
      case cairo_device_type_t.CAIRO_DEVICE_TYPE_XCB     => DeviceType.XCB
      case cairo_device_type_t.CAIRO_DEVICE_TYPE_XLIB    => DeviceType.XLIB
      case cairo_device_type_t.CAIRO_DEVICE_TYPE_XML     => DeviceType.XML
      case cairo_device_type_t.CAIRO_DEVICE_TYPE_COGL    => DeviceType.COGL
      case cairo_device_type_t.CAIRO_DEVICE_TYPE_WIN32   => DeviceType.WIN32
      case cairo_device_type_t.CAIRO_DEVICE_TYPE_INVALID => DeviceType.INVALID
  end fromRaw
end DeviceType
