package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_text_cluster_flags_t: _TEXT_CLUSTER_FLAG_BACKWARD: The clusters in the cluster array map to glyphs in the glyph array from end to start. (Since 1.8)
*/
opaque type _cairo_text_cluster_flags = CUnsignedInt
object _cairo_text_cluster_flags extends _BindgenEnumCUnsignedInt[_cairo_text_cluster_flags]:
  given _tag: Tag[_cairo_text_cluster_flags] = Tag.UInt
  inline def define(inline a: Long): _cairo_text_cluster_flags = a.toUInt
  val CAIRO_TEXT_CLUSTER_FLAG_BACKWARD = define(1)
  def getName(value: _cairo_text_cluster_flags): Option[String] =
    value match
      case `CAIRO_TEXT_CLUSTER_FLAG_BACKWARD` => Some("CAIRO_TEXT_CLUSTER_FLAG_BACKWARD")
      case _ => _root_.scala.None
  extension (a: _cairo_text_cluster_flags)
    inline def &(b: _cairo_text_cluster_flags): _cairo_text_cluster_flags = a & b
    inline def |(b: _cairo_text_cluster_flags): _cairo_text_cluster_flags = a | b
    inline def is(b: _cairo_text_cluster_flags): Boolean = (a & b) == b