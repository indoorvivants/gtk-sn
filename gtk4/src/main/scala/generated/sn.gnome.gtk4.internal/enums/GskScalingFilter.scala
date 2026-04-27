package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GskScalingFilter: _SCALING_FILTER_LINEAR: linear interpolation filter _SCALING_FILTER_NEAREST: nearest neighbor interpolation filter _SCALING_FILTER_TRILINEAR: linear interpolation along each axis, plus mipmap generation, with linear interpolation along the mipmap levels
*/
opaque type GskScalingFilter = CUnsignedInt
object GskScalingFilter extends _BindgenEnumCUnsignedInt[GskScalingFilter]:
  given _tag: Tag[GskScalingFilter] = Tag.UInt
  inline def define(inline a: Long): GskScalingFilter = a.toUInt
  val GSK_SCALING_FILTER_LINEAR = define(0)
  val GSK_SCALING_FILTER_NEAREST = define(1)
  val GSK_SCALING_FILTER_TRILINEAR = define(2)
  def getName(value: GskScalingFilter): Option[String] =
    value match
      case `GSK_SCALING_FILTER_LINEAR` => Some("GSK_SCALING_FILTER_LINEAR")
      case `GSK_SCALING_FILTER_NEAREST` => Some("GSK_SCALING_FILTER_NEAREST")
      case `GSK_SCALING_FILTER_TRILINEAR` => Some("GSK_SCALING_FILTER_TRILINEAR")
      case _ => _root_.scala.None
  extension (a: GskScalingFilter)
    inline def &(b: GskScalingFilter): GskScalingFilter = a & b
    inline def |(b: GskScalingFilter): GskScalingFilter = a | b
    inline def is(b: GskScalingFilter): Boolean = (a & b) == b