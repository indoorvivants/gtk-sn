package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_region_overlap_t: _REGION_OVERLAP_IN: The contents are entirely inside the region. (Since 1.10) _REGION_OVERLAP_OUT: The contents are entirely outside the region. (Since 1.10) _REGION_OVERLAP_PART: The contents are partially inside and partially outside the region. (Since 1.10)
*/
opaque type _cairo_region_overlap = CUnsignedInt
object _cairo_region_overlap extends _BindgenEnumCUnsignedInt[_cairo_region_overlap]:
  given _tag: Tag[_cairo_region_overlap] = Tag.UInt
  inline def define(inline a: Long): _cairo_region_overlap = a.toUInt
  val CAIRO_REGION_OVERLAP_IN = define(0)
  val CAIRO_REGION_OVERLAP_OUT = define(1)
  val CAIRO_REGION_OVERLAP_PART = define(2)
  def getName(value: _cairo_region_overlap): Option[String] =
    value match
      case `CAIRO_REGION_OVERLAP_IN` => Some("CAIRO_REGION_OVERLAP_IN")
      case `CAIRO_REGION_OVERLAP_OUT` => Some("CAIRO_REGION_OVERLAP_OUT")
      case `CAIRO_REGION_OVERLAP_PART` => Some("CAIRO_REGION_OVERLAP_PART")
      case _ => _root_.scala.None
  extension (a: _cairo_region_overlap)
    inline def &(b: _cairo_region_overlap): _cairo_region_overlap = a & b
    inline def |(b: _cairo_region_overlap): _cairo_region_overlap = a | b
    inline def is(b: _cairo_region_overlap): Boolean = (a & b) == b