package sn.gnome.gdkpixbuf.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkColorspace: _COLORSPACE_RGB: Indicates a red/green/blue additive color space.
*/
opaque type GdkColorspace = CUnsignedInt
object GdkColorspace extends _BindgenEnumCUnsignedInt[GdkColorspace]:
  given _tag: Tag[GdkColorspace] = Tag.UInt
  inline def define(inline a: Long): GdkColorspace = a.toUInt
  val GDK_COLORSPACE_RGB = define(0)
  def getName(value: GdkColorspace): Option[String] =
    value match
      case `GDK_COLORSPACE_RGB` => Some("GDK_COLORSPACE_RGB")
      case _ => _root_.scala.None
  extension (a: GdkColorspace)
    inline def &(b: GdkColorspace): GdkColorspace = a & b
    inline def |(b: GdkColorspace): GdkColorspace = a | b
    inline def is(b: GdkColorspace): Boolean = (a & b) == b