package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkDmabufError: _DMABUF_ERROR_NOT_AVAILABLE: Dmabuf support is not available, because the OS is not Linux, or it was explicitly disabled at compile- or runtime _DMABUF_ERROR_UNSUPPORTED_FORMAT: The requested format is not supported _DMABUF_ERROR_CREATION_FAILED: GTK failed to create the resource for other reasons
*/
opaque type GdkDmabufError = CUnsignedInt
object GdkDmabufError extends _BindgenEnumCUnsignedInt[GdkDmabufError]:
  given _tag: Tag[GdkDmabufError] = Tag.UInt
  inline def define(inline a: Long): GdkDmabufError = a.toUInt
  val GDK_DMABUF_ERROR_NOT_AVAILABLE = define(0)
  val GDK_DMABUF_ERROR_UNSUPPORTED_FORMAT = define(1)
  val GDK_DMABUF_ERROR_CREATION_FAILED = define(2)
  def getName(value: GdkDmabufError): Option[String] =
    value match
      case `GDK_DMABUF_ERROR_NOT_AVAILABLE` => Some("GDK_DMABUF_ERROR_NOT_AVAILABLE")
      case `GDK_DMABUF_ERROR_UNSUPPORTED_FORMAT` => Some("GDK_DMABUF_ERROR_UNSUPPORTED_FORMAT")
      case `GDK_DMABUF_ERROR_CREATION_FAILED` => Some("GDK_DMABUF_ERROR_CREATION_FAILED")
      case _ => _root_.scala.None
  extension (a: GdkDmabufError)
    inline def &(b: GdkDmabufError): GdkDmabufError = a & b
    inline def |(b: GdkDmabufError): GdkDmabufError = a | b
    inline def is(b: GdkDmabufError): Boolean = (a & b) == b