package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoBaselineShift: _BASELINE_SHIFT_NONE: Leave the baseline unchanged _BASELINE_SHIFT_SUPERSCRIPT: Shift the baseline to the superscript position, relative to the previous run _BASELINE_SHIFT_SUBSCRIPT: Shift the baseline to the subscript position, relative to the previous run
*/
opaque type PangoBaselineShift = CUnsignedInt
object PangoBaselineShift extends _BindgenEnumCUnsignedInt[PangoBaselineShift]:
  given _tag: Tag[PangoBaselineShift] = Tag.UInt
  inline def define(inline a: Long): PangoBaselineShift = a.toUInt
  val PANGO_BASELINE_SHIFT_NONE = define(0)
  val PANGO_BASELINE_SHIFT_SUPERSCRIPT = define(1)
  val PANGO_BASELINE_SHIFT_SUBSCRIPT = define(2)
  def getName(value: PangoBaselineShift): Option[String] =
    value match
      case `PANGO_BASELINE_SHIFT_NONE` => Some("PANGO_BASELINE_SHIFT_NONE")
      case `PANGO_BASELINE_SHIFT_SUPERSCRIPT` => Some("PANGO_BASELINE_SHIFT_SUPERSCRIPT")
      case `PANGO_BASELINE_SHIFT_SUBSCRIPT` => Some("PANGO_BASELINE_SHIFT_SUBSCRIPT")
      case _ => _root_.scala.None
  extension (a: PangoBaselineShift)
    inline def &(b: PangoBaselineShift): PangoBaselineShift = a & b
    inline def |(b: PangoBaselineShift): PangoBaselineShift = a | b
    inline def is(b: PangoBaselineShift): Boolean = (a & b) == b