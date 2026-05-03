package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkIconThemeError: _ICON_THEME_NOT_FOUND: The icon specified does not exist in the theme _ICON_THEME_FAILED: An unspecified error occurred.
*/
opaque type GtkIconThemeError = CUnsignedInt
object GtkIconThemeError extends _BindgenEnumCUnsignedInt[GtkIconThemeError]:
  given _tag: Tag[GtkIconThemeError] = Tag.UInt
  inline def define(inline a: Long): GtkIconThemeError = a.toUInt
  val GTK_ICON_THEME_NOT_FOUND = define(0)
  val GTK_ICON_THEME_FAILED = define(1)
  def getName(value: GtkIconThemeError): Option[String] =
    value match
      case `GTK_ICON_THEME_NOT_FOUND` => Some("GTK_ICON_THEME_NOT_FOUND")
      case `GTK_ICON_THEME_FAILED` => Some("GTK_ICON_THEME_FAILED")
      case _ => _root_.scala.None
  extension (a: GtkIconThemeError)
    inline def &(b: GtkIconThemeError): GtkIconThemeError = a & b
    inline def |(b: GtkIconThemeError): GtkIconThemeError = a | b
    inline def is(b: GtkIconThemeError): Boolean = (a & b) == b