package sn.gnome.gdkpixbuf.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkPixbufError: _PIXBUF_ERROR_CORRUPT_IMAGE: An image file was broken somehow. _PIXBUF_ERROR_INSUFFICIENT_MEMORY: Not enough memory. _PIXBUF_ERROR_BAD_OPTION: A bad option was passed to a pixbuf save module. _PIXBUF_ERROR_UNKNOWN_TYPE: Unknown image type. _PIXBUF_ERROR_UNSUPPORTED_OPERATION: Don't know how to perform the given operation on the type of image at hand. _PIXBUF_ERROR_FAILED: Generic failure code, something went wrong. _PIXBUF_ERROR_INCOMPLETE_ANIMATION: Only part of the animation was loaded.
*/
opaque type GdkPixbufError = CUnsignedInt
object GdkPixbufError extends _BindgenEnumCUnsignedInt[GdkPixbufError]:
  given _tag: Tag[GdkPixbufError] = Tag.UInt
  inline def define(inline a: Long): GdkPixbufError = a.toUInt
  val GDK_PIXBUF_ERROR_CORRUPT_IMAGE = define(0)
  val GDK_PIXBUF_ERROR_INSUFFICIENT_MEMORY = define(1)
  val GDK_PIXBUF_ERROR_BAD_OPTION = define(2)
  val GDK_PIXBUF_ERROR_UNKNOWN_TYPE = define(3)
  val GDK_PIXBUF_ERROR_UNSUPPORTED_OPERATION = define(4)
  val GDK_PIXBUF_ERROR_FAILED = define(5)
  val GDK_PIXBUF_ERROR_INCOMPLETE_ANIMATION = define(6)
  def getName(value: GdkPixbufError): Option[String] =
    value match
      case `GDK_PIXBUF_ERROR_CORRUPT_IMAGE` => Some("GDK_PIXBUF_ERROR_CORRUPT_IMAGE")
      case `GDK_PIXBUF_ERROR_INSUFFICIENT_MEMORY` => Some("GDK_PIXBUF_ERROR_INSUFFICIENT_MEMORY")
      case `GDK_PIXBUF_ERROR_BAD_OPTION` => Some("GDK_PIXBUF_ERROR_BAD_OPTION")
      case `GDK_PIXBUF_ERROR_UNKNOWN_TYPE` => Some("GDK_PIXBUF_ERROR_UNKNOWN_TYPE")
      case `GDK_PIXBUF_ERROR_UNSUPPORTED_OPERATION` => Some("GDK_PIXBUF_ERROR_UNSUPPORTED_OPERATION")
      case `GDK_PIXBUF_ERROR_FAILED` => Some("GDK_PIXBUF_ERROR_FAILED")
      case `GDK_PIXBUF_ERROR_INCOMPLETE_ANIMATION` => Some("GDK_PIXBUF_ERROR_INCOMPLETE_ANIMATION")
      case _ => _root_.scala.None
  extension (a: GdkPixbufError)
    inline def &(b: GdkPixbufError): GdkPixbufError = a & b
    inline def |(b: GdkPixbufError): GdkPixbufError = a | b
    inline def is(b: GdkPixbufError): Boolean = (a & b) == b