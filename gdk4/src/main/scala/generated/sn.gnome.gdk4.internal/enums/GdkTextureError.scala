package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkTextureError: _TEXTURE_ERROR_TOO_LARGE: Not enough memory to handle this image _TEXTURE_ERROR_CORRUPT_IMAGE: The image data appears corrupted _TEXTURE_ERROR_UNSUPPORTED_CONTENT: The image contains features that cannot be loaded _TEXTURE_ERROR_UNSUPPORTED_FORMAT: The image format is not supported
*/
opaque type GdkTextureError = CUnsignedInt
object GdkTextureError extends _BindgenEnumCUnsignedInt[GdkTextureError]:
  given _tag: Tag[GdkTextureError] = Tag.UInt
  inline def define(inline a: Long): GdkTextureError = a.toUInt
  val GDK_TEXTURE_ERROR_TOO_LARGE = define(0)
  val GDK_TEXTURE_ERROR_CORRUPT_IMAGE = define(1)
  val GDK_TEXTURE_ERROR_UNSUPPORTED_CONTENT = define(2)
  val GDK_TEXTURE_ERROR_UNSUPPORTED_FORMAT = define(3)
  def getName(value: GdkTextureError): Option[String] =
    value match
      case `GDK_TEXTURE_ERROR_TOO_LARGE` => Some("GDK_TEXTURE_ERROR_TOO_LARGE")
      case `GDK_TEXTURE_ERROR_CORRUPT_IMAGE` => Some("GDK_TEXTURE_ERROR_CORRUPT_IMAGE")
      case `GDK_TEXTURE_ERROR_UNSUPPORTED_CONTENT` => Some("GDK_TEXTURE_ERROR_UNSUPPORTED_CONTENT")
      case `GDK_TEXTURE_ERROR_UNSUPPORTED_FORMAT` => Some("GDK_TEXTURE_ERROR_UNSUPPORTED_FORMAT")
      case _ => _root_.scala.None
  extension (a: GdkTextureError)
    inline def &(b: GdkTextureError): GdkTextureError = a & b
    inline def |(b: GdkTextureError): GdkTextureError = a | b
    inline def is(b: GdkTextureError): Boolean = (a & b) == b