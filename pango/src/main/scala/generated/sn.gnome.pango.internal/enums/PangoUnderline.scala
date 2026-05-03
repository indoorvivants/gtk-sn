package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoUnderline: _UNDERLINE_NONE: no underline should be drawn _UNDERLINE_SINGLE: a single underline should be drawn _UNDERLINE_DOUBLE: a double underline should be drawn _UNDERLINE_LOW: a single underline should be drawn at a position beneath the ink extents of the text being underlined. This should be used only for underlining single characters, such as for keyboard accelerators. %PANGO_UNDERLINE_SINGLE should be used for extended portions of text. _UNDERLINE_ERROR: an underline indicating an error should be drawn below. The exact style of rendering is up to the `PangoRenderer` in use, but typical styles include wavy or dotted lines. This underline is typically used to indicate an error such as a possible mispelling; in some cases a contrasting color may automatically be used. This type of underlining is available since Pango 1.4. _UNDERLINE_SINGLE_LINE: Like _UNDERLINE_SINGLE, but drawn continuously across multiple runs. This type of underlining is available since Pango 1.46. _UNDERLINE_DOUBLE_LINE: Like _UNDERLINE_DOUBLE, but drawn continuously across multiple runs. This type of underlining is available since Pango 1.46. _UNDERLINE_ERROR_LINE: Like _UNDERLINE_ERROR, but drawn continuously across multiple runs. This type of underlining is available since Pango 1.46.
*/
opaque type PangoUnderline = CUnsignedInt
object PangoUnderline extends _BindgenEnumCUnsignedInt[PangoUnderline]:
  given _tag: Tag[PangoUnderline] = Tag.UInt
  inline def define(inline a: Long): PangoUnderline = a.toUInt
  val PANGO_UNDERLINE_NONE = define(0)
  val PANGO_UNDERLINE_SINGLE = define(1)
  val PANGO_UNDERLINE_DOUBLE = define(2)
  val PANGO_UNDERLINE_LOW = define(3)
  val PANGO_UNDERLINE_ERROR = define(4)
  val PANGO_UNDERLINE_SINGLE_LINE = define(5)
  val PANGO_UNDERLINE_DOUBLE_LINE = define(6)
  val PANGO_UNDERLINE_ERROR_LINE = define(7)
  def getName(value: PangoUnderline): Option[String] =
    value match
      case `PANGO_UNDERLINE_NONE` => Some("PANGO_UNDERLINE_NONE")
      case `PANGO_UNDERLINE_SINGLE` => Some("PANGO_UNDERLINE_SINGLE")
      case `PANGO_UNDERLINE_DOUBLE` => Some("PANGO_UNDERLINE_DOUBLE")
      case `PANGO_UNDERLINE_LOW` => Some("PANGO_UNDERLINE_LOW")
      case `PANGO_UNDERLINE_ERROR` => Some("PANGO_UNDERLINE_ERROR")
      case `PANGO_UNDERLINE_SINGLE_LINE` => Some("PANGO_UNDERLINE_SINGLE_LINE")
      case `PANGO_UNDERLINE_DOUBLE_LINE` => Some("PANGO_UNDERLINE_DOUBLE_LINE")
      case `PANGO_UNDERLINE_ERROR_LINE` => Some("PANGO_UNDERLINE_ERROR_LINE")
      case _ => _root_.scala.None
  extension (a: PangoUnderline)
    inline def &(b: PangoUnderline): PangoUnderline = a & b
    inline def |(b: PangoUnderline): PangoUnderline = a | b
    inline def is(b: PangoUnderline): Boolean = (a & b) == b