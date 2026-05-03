package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkFontChooserLevel: _FONT_CHOOSER_LEVEL_FAMILY: Allow selecting a font family _FONT_CHOOSER_LEVEL_STYLE: Allow selecting a specific font face _FONT_CHOOSER_LEVEL_SIZE: Allow selecting a specific font size _FONT_CHOOSER_LEVEL_VARIATIONS: Allow changing OpenType font variation axes _FONT_CHOOSER_LEVEL_FEATURES: Allow selecting specific OpenType font features
*/
opaque type GtkFontChooserLevel = CUnsignedInt
object GtkFontChooserLevel extends _BindgenEnumCUnsignedInt[GtkFontChooserLevel]:
  given _tag: Tag[GtkFontChooserLevel] = Tag.UInt
  inline def define(inline a: Long): GtkFontChooserLevel = a.toUInt
  val GTK_FONT_CHOOSER_LEVEL_FAMILY = define(0)
  val GTK_FONT_CHOOSER_LEVEL_STYLE = define(1)
  val GTK_FONT_CHOOSER_LEVEL_SIZE = define(2)
  val GTK_FONT_CHOOSER_LEVEL_VARIATIONS = define(4)
  val GTK_FONT_CHOOSER_LEVEL_FEATURES = define(8)
  def getName(value: GtkFontChooserLevel): Option[String] =
    value match
      case `GTK_FONT_CHOOSER_LEVEL_FAMILY` => Some("GTK_FONT_CHOOSER_LEVEL_FAMILY")
      case `GTK_FONT_CHOOSER_LEVEL_STYLE` => Some("GTK_FONT_CHOOSER_LEVEL_STYLE")
      case `GTK_FONT_CHOOSER_LEVEL_SIZE` => Some("GTK_FONT_CHOOSER_LEVEL_SIZE")
      case `GTK_FONT_CHOOSER_LEVEL_VARIATIONS` => Some("GTK_FONT_CHOOSER_LEVEL_VARIATIONS")
      case `GTK_FONT_CHOOSER_LEVEL_FEATURES` => Some("GTK_FONT_CHOOSER_LEVEL_FEATURES")
      case _ => _root_.scala.None
  extension (a: GtkFontChooserLevel)
    inline def &(b: GtkFontChooserLevel): GtkFontChooserLevel = a & b
    inline def |(b: GtkFontChooserLevel): GtkFontChooserLevel = a | b
    inline def is(b: GtkFontChooserLevel): Boolean = (a & b) == b