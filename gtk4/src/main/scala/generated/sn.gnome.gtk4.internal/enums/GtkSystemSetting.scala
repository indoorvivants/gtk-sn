package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkSystemSetting: _SYSTEM_SETTING_DPI: the [property.Settings:gtk-xft-dpi] setting has changed _SYSTEM_SETTING_FONT_NAME: The [property.Settings:gtk-font-name] setting has changed _SYSTEM_SETTING_FONT_CONFIG: The font configuration has changed in a way that requires text to be redrawn. This can be any of the [property.Settings:gtk-xft-antialias], [property.Settings:gtk-xft-hinting], [property.Settings:gtk-xft-hintstyle], [property.Settings:gtk-xft-rgba] or [property.Settings:gtk-fontconfig-timestamp] settings _SYSTEM_SETTING_DISPLAY: The display has changed _SYSTEM_SETTING_ICON_THEME: The icon theme has changed in a way that requires icons to be looked up again
*/
opaque type GtkSystemSetting = CUnsignedInt
object GtkSystemSetting extends _BindgenEnumCUnsignedInt[GtkSystemSetting]:
  given _tag: Tag[GtkSystemSetting] = Tag.UInt
  inline def define(inline a: Long): GtkSystemSetting = a.toUInt
  val GTK_SYSTEM_SETTING_DPI = define(0)
  val GTK_SYSTEM_SETTING_FONT_NAME = define(1)
  val GTK_SYSTEM_SETTING_FONT_CONFIG = define(2)
  val GTK_SYSTEM_SETTING_DISPLAY = define(3)
  val GTK_SYSTEM_SETTING_ICON_THEME = define(4)
  def getName(value: GtkSystemSetting): Option[String] =
    value match
      case `GTK_SYSTEM_SETTING_DPI` => Some("GTK_SYSTEM_SETTING_DPI")
      case `GTK_SYSTEM_SETTING_FONT_NAME` => Some("GTK_SYSTEM_SETTING_FONT_NAME")
      case `GTK_SYSTEM_SETTING_FONT_CONFIG` => Some("GTK_SYSTEM_SETTING_FONT_CONFIG")
      case `GTK_SYSTEM_SETTING_DISPLAY` => Some("GTK_SYSTEM_SETTING_DISPLAY")
      case `GTK_SYSTEM_SETTING_ICON_THEME` => Some("GTK_SYSTEM_SETTING_ICON_THEME")
      case _ => _root_.scala.None
  extension (a: GtkSystemSetting)
    inline def &(b: GtkSystemSetting): GtkSystemSetting = a & b
    inline def |(b: GtkSystemSetting): GtkSystemSetting = a | b
    inline def is(b: GtkSystemSetting): Boolean = (a & b) == b