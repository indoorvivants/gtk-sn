package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoOverline: _OVERLINE_NONE: no overline should be drawn _OVERLINE_SINGLE: Draw a single line above the ink extents of the text being underlined.
*/
opaque type PangoOverline = CUnsignedInt
object PangoOverline extends _BindgenEnumCUnsignedInt[PangoOverline]:
  given _tag: Tag[PangoOverline] = Tag.UInt
  inline def define(inline a: Long): PangoOverline = a.toUInt
  val PANGO_OVERLINE_NONE = define(0)
  val PANGO_OVERLINE_SINGLE = define(1)
  def getName(value: PangoOverline): Option[String] =
    value match
      case `PANGO_OVERLINE_NONE` => Some("PANGO_OVERLINE_NONE")
      case `PANGO_OVERLINE_SINGLE` => Some("PANGO_OVERLINE_SINGLE")
      case _ => _root_.scala.None
  extension (a: PangoOverline)
    inline def &(b: PangoOverline): PangoOverline = a & b
    inline def |(b: PangoOverline): PangoOverline = a | b
    inline def is(b: PangoOverline): Boolean = (a & b) == b