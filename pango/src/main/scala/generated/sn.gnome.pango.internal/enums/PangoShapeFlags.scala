package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoShapeFlags: _SHAPE_NONE: Default value _SHAPE_ROUND_POSITIONS: Round glyph positions and widths to whole device units This option should be set if the target renderer can't do subpixel positioning of glyphs
*/
opaque type PangoShapeFlags = CUnsignedInt
object PangoShapeFlags extends _BindgenEnumCUnsignedInt[PangoShapeFlags]:
  given _tag: Tag[PangoShapeFlags] = Tag.UInt
  inline def define(inline a: Long): PangoShapeFlags = a.toUInt
  val PANGO_SHAPE_NONE = define(0)
  val PANGO_SHAPE_ROUND_POSITIONS = define(1)
  def getName(value: PangoShapeFlags): Option[String] =
    value match
      case `PANGO_SHAPE_NONE` => Some("PANGO_SHAPE_NONE")
      case `PANGO_SHAPE_ROUND_POSITIONS` => Some("PANGO_SHAPE_ROUND_POSITIONS")
      case _ => _root_.scala.None
  extension (a: PangoShapeFlags)
    inline def &(b: PangoShapeFlags): PangoShapeFlags = a & b
    inline def |(b: PangoShapeFlags): PangoShapeFlags = a | b
    inline def is(b: PangoShapeFlags): Boolean = (a & b) == b