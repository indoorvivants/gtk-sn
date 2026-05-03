package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoTabAlign: _TAB_LEFT: the text appears to the right of the tab stop position _TAB_RIGHT: the text appears to the left of the tab stop position until the available space is filled. Since: 1.50 _TAB_CENTER: the text is centered at the tab stop position until the available space is filled. Since: 1.50 _TAB_DECIMAL: text before the first occurrence of the decimal point character appears to the left of the tab stop position (until the available space is filled), the rest to the right. Since: 1.50
*/
opaque type PangoTabAlign = CUnsignedInt
object PangoTabAlign extends _BindgenEnumCUnsignedInt[PangoTabAlign]:
  given _tag: Tag[PangoTabAlign] = Tag.UInt
  inline def define(inline a: Long): PangoTabAlign = a.toUInt
  val PANGO_TAB_LEFT = define(0)
  val PANGO_TAB_RIGHT = define(1)
  val PANGO_TAB_CENTER = define(2)
  val PANGO_TAB_DECIMAL = define(3)
  def getName(value: PangoTabAlign): Option[String] =
    value match
      case `PANGO_TAB_LEFT` => Some("PANGO_TAB_LEFT")
      case `PANGO_TAB_RIGHT` => Some("PANGO_TAB_RIGHT")
      case `PANGO_TAB_CENTER` => Some("PANGO_TAB_CENTER")
      case `PANGO_TAB_DECIMAL` => Some("PANGO_TAB_DECIMAL")
      case _ => _root_.scala.None
  extension (a: PangoTabAlign)
    inline def &(b: PangoTabAlign): PangoTabAlign = a & b
    inline def |(b: PangoTabAlign): PangoTabAlign = a | b
    inline def is(b: PangoTabAlign): Boolean = (a & b) == b