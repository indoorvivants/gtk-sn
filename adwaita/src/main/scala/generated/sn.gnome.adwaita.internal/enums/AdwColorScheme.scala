package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-style-manager.h
*/
opaque type AdwColorScheme = CUnsignedInt
object AdwColorScheme extends _BindgenEnumCUnsignedInt[AdwColorScheme]:
  given _tag: Tag[AdwColorScheme] = Tag.UInt
  inline def define(inline a: Long): AdwColorScheme = a.toUInt
  val ADW_COLOR_SCHEME_DEFAULT = define(0)
  val ADW_COLOR_SCHEME_FORCE_LIGHT = define(1)
  val ADW_COLOR_SCHEME_PREFER_LIGHT = define(2)
  val ADW_COLOR_SCHEME_PREFER_DARK = define(3)
  val ADW_COLOR_SCHEME_FORCE_DARK = define(4)
  def getName(value: AdwColorScheme): Option[String] =
    value match
      case `ADW_COLOR_SCHEME_DEFAULT` => Some("ADW_COLOR_SCHEME_DEFAULT")
      case `ADW_COLOR_SCHEME_FORCE_LIGHT` => Some("ADW_COLOR_SCHEME_FORCE_LIGHT")
      case `ADW_COLOR_SCHEME_PREFER_LIGHT` => Some("ADW_COLOR_SCHEME_PREFER_LIGHT")
      case `ADW_COLOR_SCHEME_PREFER_DARK` => Some("ADW_COLOR_SCHEME_PREFER_DARK")
      case `ADW_COLOR_SCHEME_FORCE_DARK` => Some("ADW_COLOR_SCHEME_FORCE_DARK")
      case _ => _root_.scala.None
  extension (a: AdwColorScheme)
    inline def &(b: AdwColorScheme): AdwColorScheme = a & b
    inline def |(b: AdwColorScheme): AdwColorScheme = a | b
    inline def is(b: AdwColorScheme): Boolean = (a & b) == b