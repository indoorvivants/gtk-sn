package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoStretch: _STRETCH_ULTRA_CONDENSED: ultra condensed width _STRETCH_EXTRA_CONDENSED: extra condensed width _STRETCH_CONDENSED: condensed width _STRETCH_SEMI_CONDENSED: semi condensed width _STRETCH_NORMAL: the normal width _STRETCH_SEMI_EXPANDED: semi expanded width _STRETCH_EXPANDED: expanded width _STRETCH_EXTRA_EXPANDED: extra expanded width _STRETCH_ULTRA_EXPANDED: ultra expanded width
*/
opaque type PangoStretch = CUnsignedInt
object PangoStretch extends _BindgenEnumCUnsignedInt[PangoStretch]:
  given _tag: Tag[PangoStretch] = Tag.UInt
  inline def define(inline a: Long): PangoStretch = a.toUInt
  val PANGO_STRETCH_ULTRA_CONDENSED = define(0)
  val PANGO_STRETCH_EXTRA_CONDENSED = define(1)
  val PANGO_STRETCH_CONDENSED = define(2)
  val PANGO_STRETCH_SEMI_CONDENSED = define(3)
  val PANGO_STRETCH_NORMAL = define(4)
  val PANGO_STRETCH_SEMI_EXPANDED = define(5)
  val PANGO_STRETCH_EXPANDED = define(6)
  val PANGO_STRETCH_EXTRA_EXPANDED = define(7)
  val PANGO_STRETCH_ULTRA_EXPANDED = define(8)
  def getName(value: PangoStretch): Option[String] =
    value match
      case `PANGO_STRETCH_ULTRA_CONDENSED` => Some("PANGO_STRETCH_ULTRA_CONDENSED")
      case `PANGO_STRETCH_EXTRA_CONDENSED` => Some("PANGO_STRETCH_EXTRA_CONDENSED")
      case `PANGO_STRETCH_CONDENSED` => Some("PANGO_STRETCH_CONDENSED")
      case `PANGO_STRETCH_SEMI_CONDENSED` => Some("PANGO_STRETCH_SEMI_CONDENSED")
      case `PANGO_STRETCH_NORMAL` => Some("PANGO_STRETCH_NORMAL")
      case `PANGO_STRETCH_SEMI_EXPANDED` => Some("PANGO_STRETCH_SEMI_EXPANDED")
      case `PANGO_STRETCH_EXPANDED` => Some("PANGO_STRETCH_EXPANDED")
      case `PANGO_STRETCH_EXTRA_EXPANDED` => Some("PANGO_STRETCH_EXTRA_EXPANDED")
      case `PANGO_STRETCH_ULTRA_EXPANDED` => Some("PANGO_STRETCH_ULTRA_EXPANDED")
      case _ => _root_.scala.None
  extension (a: PangoStretch)
    inline def &(b: PangoStretch): PangoStretch = a & b
    inline def |(b: PangoStretch): PangoStretch = a | b
    inline def is(b: PangoStretch): Boolean = (a & b) == b