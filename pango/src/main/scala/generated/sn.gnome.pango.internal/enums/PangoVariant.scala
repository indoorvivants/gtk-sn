package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoVariant: _VARIANT_NORMAL: A normal font. _VARIANT_SMALL_CAPS: A font with the lower case characters replaced by smaller variants of the capital characters. _VARIANT_ALL_SMALL_CAPS: A font with all characters replaced by smaller variants of the capital characters. Since: 1.50 _VARIANT_PETITE_CAPS: A font with the lower case characters replaced by smaller variants of the capital characters. Petite Caps can be even smaller than Small Caps. Since: 1.50 _VARIANT_ALL_PETITE_CAPS: A font with all characters replaced by smaller variants of the capital characters. Petite Caps can be even smaller than Small Caps. Since: 1.50 _VARIANT_UNICASE: A font with the upper case characters replaced by smaller variants of the capital letters. Since: 1.50 _VARIANT_TITLE_CAPS: A font with capital letters that are more suitable for all-uppercase titles. Since: 1.50
*/
opaque type PangoVariant = CUnsignedInt
object PangoVariant extends _BindgenEnumCUnsignedInt[PangoVariant]:
  given _tag: Tag[PangoVariant] = Tag.UInt
  inline def define(inline a: Long): PangoVariant = a.toUInt
  val PANGO_VARIANT_NORMAL = define(0)
  val PANGO_VARIANT_SMALL_CAPS = define(1)
  val PANGO_VARIANT_ALL_SMALL_CAPS = define(2)
  val PANGO_VARIANT_PETITE_CAPS = define(3)
  val PANGO_VARIANT_ALL_PETITE_CAPS = define(4)
  val PANGO_VARIANT_UNICASE = define(5)
  val PANGO_VARIANT_TITLE_CAPS = define(6)
  def getName(value: PangoVariant): Option[String] =
    value match
      case `PANGO_VARIANT_NORMAL` => Some("PANGO_VARIANT_NORMAL")
      case `PANGO_VARIANT_SMALL_CAPS` => Some("PANGO_VARIANT_SMALL_CAPS")
      case `PANGO_VARIANT_ALL_SMALL_CAPS` => Some("PANGO_VARIANT_ALL_SMALL_CAPS")
      case `PANGO_VARIANT_PETITE_CAPS` => Some("PANGO_VARIANT_PETITE_CAPS")
      case `PANGO_VARIANT_ALL_PETITE_CAPS` => Some("PANGO_VARIANT_ALL_PETITE_CAPS")
      case `PANGO_VARIANT_UNICASE` => Some("PANGO_VARIANT_UNICASE")
      case `PANGO_VARIANT_TITLE_CAPS` => Some("PANGO_VARIANT_TITLE_CAPS")
      case _ => _root_.scala.None
  extension (a: PangoVariant)
    inline def &(b: PangoVariant): PangoVariant = a & b
    inline def |(b: PangoVariant): PangoVariant = a | b
    inline def is(b: PangoVariant): Boolean = (a & b) == b