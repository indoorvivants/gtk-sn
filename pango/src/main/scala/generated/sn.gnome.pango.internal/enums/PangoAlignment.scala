package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAlignment: _ALIGN_LEFT: Put all available space on the right _ALIGN_CENTER: Center the line within the available space _ALIGN_RIGHT: Put all available space on the left
*/
opaque type PangoAlignment = CUnsignedInt
object PangoAlignment extends _BindgenEnumCUnsignedInt[PangoAlignment]:
  given _tag: Tag[PangoAlignment] = Tag.UInt
  inline def define(inline a: Long): PangoAlignment = a.toUInt
  val PANGO_ALIGN_LEFT = define(0)
  val PANGO_ALIGN_CENTER = define(1)
  val PANGO_ALIGN_RIGHT = define(2)
  def getName(value: PangoAlignment): Option[String] =
    value match
      case `PANGO_ALIGN_LEFT` => Some("PANGO_ALIGN_LEFT")
      case `PANGO_ALIGN_CENTER` => Some("PANGO_ALIGN_CENTER")
      case `PANGO_ALIGN_RIGHT` => Some("PANGO_ALIGN_RIGHT")
      case _ => _root_.scala.None
  extension (a: PangoAlignment)
    inline def &(b: PangoAlignment): PangoAlignment = a & b
    inline def |(b: PangoAlignment): PangoAlignment = a | b
    inline def is(b: PangoAlignment): Boolean = (a & b) == b