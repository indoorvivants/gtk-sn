package sn.gnome.gdkpixbuf.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkInterpType: _INTERP_NEAREST: Nearest neighbor sampling; this is the fastest and lowest quality mode. Quality is normally unacceptable when scaling down, but may be OK when scaling up. _INTERP_TILES: This is an accurate simulation of the PostScript image operator without any interpolation enabled. Each pixel is rendered as a tiny parallelogram of solid color, the edges of which are implemented with antialiasing. It resembles nearest neighbor for enlargement, and bilinear for reduction. _INTERP_BILINEAR: Best quality/speed balance; use this mode by default. Bilinear interpolation. For enlargement, it is equivalent to point-sampling the ideal bilinear-interpolated image. For reduction, it is equivalent to laying down small tiles and integrating over the coverage area. _INTERP_HYPER: This is the slowest and highest quality reconstruction function. It is derived from the hyperbolic filters in Wolberg's "Digital Image Warping", and is formally defined as the hyperbolic-filter sampling the ideal hyperbolic-filter interpolated image (the filter is designed to be idempotent for 1:1 pixel mapping). **Deprecated**: this interpolation filter is deprecated, as in reality it has a lower quality than the _INTERP_BILINEAR filter (Since: 2.38)
*/
opaque type GdkInterpType = CUnsignedInt
object GdkInterpType extends _BindgenEnumCUnsignedInt[GdkInterpType]:
  given _tag: Tag[GdkInterpType] = Tag.UInt
  inline def define(inline a: Long): GdkInterpType = a.toUInt
  val GDK_INTERP_NEAREST = define(0)
  val GDK_INTERP_TILES = define(1)
  val GDK_INTERP_BILINEAR = define(2)
  val GDK_INTERP_HYPER = define(3)
  def getName(value: GdkInterpType): Option[String] =
    value match
      case `GDK_INTERP_NEAREST` => Some("GDK_INTERP_NEAREST")
      case `GDK_INTERP_TILES` => Some("GDK_INTERP_TILES")
      case `GDK_INTERP_BILINEAR` => Some("GDK_INTERP_BILINEAR")
      case `GDK_INTERP_HYPER` => Some("GDK_INTERP_HYPER")
      case _ => _root_.scala.None
  extension (a: GdkInterpType)
    inline def &(b: GdkInterpType): GdkInterpType = a & b
    inline def |(b: GdkInterpType): GdkInterpType = a | b
    inline def is(b: GdkInterpType): Boolean = (a & b) == b