package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoShowFlags: _SHOW_NONE: No special treatment for invisible characters _SHOW_SPACES: Render spaces, tabs and newlines visibly _SHOW_LINE_BREAKS: Render line breaks visibly _SHOW_IGNORABLES: Render default-ignorable Unicode characters visibly
*/
opaque type PangoShowFlags = CUnsignedInt
object PangoShowFlags extends _BindgenEnumCUnsignedInt[PangoShowFlags]:
  given _tag: Tag[PangoShowFlags] = Tag.UInt
  inline def define(inline a: Long): PangoShowFlags = a.toUInt
  val PANGO_SHOW_NONE = define(0)
  val PANGO_SHOW_SPACES = define(1)
  val PANGO_SHOW_LINE_BREAKS = define(2)
  val PANGO_SHOW_IGNORABLES = define(4)
  def getName(value: PangoShowFlags): Option[String] =
    value match
      case `PANGO_SHOW_NONE` => Some("PANGO_SHOW_NONE")
      case `PANGO_SHOW_SPACES` => Some("PANGO_SHOW_SPACES")
      case `PANGO_SHOW_LINE_BREAKS` => Some("PANGO_SHOW_LINE_BREAKS")
      case `PANGO_SHOW_IGNORABLES` => Some("PANGO_SHOW_IGNORABLES")
      case _ => _root_.scala.None
  extension (a: PangoShowFlags)
    inline def &(b: PangoShowFlags): PangoShowFlags = a & b
    inline def |(b: PangoShowFlags): PangoShowFlags = a | b
    inline def is(b: PangoShowFlags): Boolean = (a & b) == b