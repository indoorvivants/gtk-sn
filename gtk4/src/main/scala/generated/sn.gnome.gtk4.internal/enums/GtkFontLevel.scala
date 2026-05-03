package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkFontLevel: _FONT_LEVEL_FAMILY: Select a font family _FONT_LEVEL_FACE: Select a font face (i.e. a family and a style) _FONT_LEVEL_FONT: Select a font (i.e. a face with a size, and possibly font variations) _FONT_LEVEL_FEATURES: Select a font and font features
*/
opaque type GtkFontLevel = CUnsignedInt
object GtkFontLevel extends _BindgenEnumCUnsignedInt[GtkFontLevel]:
  given _tag: Tag[GtkFontLevel] = Tag.UInt
  inline def define(inline a: Long): GtkFontLevel = a.toUInt
  val GTK_FONT_LEVEL_FAMILY = define(0)
  val GTK_FONT_LEVEL_FACE = define(1)
  val GTK_FONT_LEVEL_FONT = define(2)
  val GTK_FONT_LEVEL_FEATURES = define(3)
  def getName(value: GtkFontLevel): Option[String] =
    value match
      case `GTK_FONT_LEVEL_FAMILY` => Some("GTK_FONT_LEVEL_FAMILY")
      case `GTK_FONT_LEVEL_FACE` => Some("GTK_FONT_LEVEL_FACE")
      case `GTK_FONT_LEVEL_FONT` => Some("GTK_FONT_LEVEL_FONT")
      case `GTK_FONT_LEVEL_FEATURES` => Some("GTK_FONT_LEVEL_FEATURES")
      case _ => _root_.scala.None
  extension (a: GtkFontLevel)
    inline def &(b: GtkFontLevel): GtkFontLevel = a & b
    inline def |(b: GtkFontLevel): GtkFontLevel = a | b
    inline def is(b: GtkFontLevel): Boolean = (a & b) == b