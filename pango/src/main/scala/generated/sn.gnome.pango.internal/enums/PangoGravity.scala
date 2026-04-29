package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoGravity: _GRAVITY_SOUTH: Glyphs stand upright (default) _GRAVITY_EAST: Glyphs are rotated 90 degrees counter-clockwise. _GRAVITY_NORTH: Glyphs are upside-down. _GRAVITY_WEST: Glyphs are rotated 90 degrees clockwise. _GRAVITY_AUTO: Gravity is resolved from the context matrix
*/
opaque type PangoGravity = CUnsignedInt
object PangoGravity extends _BindgenEnumCUnsignedInt[PangoGravity]:
  given _tag: Tag[PangoGravity] = Tag.UInt
  inline def define(inline a: Long): PangoGravity = a.toUInt
  val PANGO_GRAVITY_SOUTH = define(0)
  val PANGO_GRAVITY_EAST = define(1)
  val PANGO_GRAVITY_NORTH = define(2)
  val PANGO_GRAVITY_WEST = define(3)
  val PANGO_GRAVITY_AUTO = define(4)
  def getName(value: PangoGravity): Option[String] =
    value match
      case `PANGO_GRAVITY_SOUTH` => Some("PANGO_GRAVITY_SOUTH")
      case `PANGO_GRAVITY_EAST` => Some("PANGO_GRAVITY_EAST")
      case `PANGO_GRAVITY_NORTH` => Some("PANGO_GRAVITY_NORTH")
      case `PANGO_GRAVITY_WEST` => Some("PANGO_GRAVITY_WEST")
      case `PANGO_GRAVITY_AUTO` => Some("PANGO_GRAVITY_AUTO")
      case _ => _root_.scala.None
  extension (a: PangoGravity)
    inline def &(b: PangoGravity): PangoGravity = a & b
    inline def |(b: PangoGravity): PangoGravity = a | b
    inline def is(b: PangoGravity): Boolean = (a & b) == b