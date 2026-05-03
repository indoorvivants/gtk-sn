package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkSystemSetting

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Values that can be passed to the [vfunc@Gtk.Widget.system_setting_changed]
  * vfunc.
  *
  * The values indicate which system setting has changed. Widgets may need to
  * drop caches, or react otherwise.
  *
  * Most of the values correspond to [class@Settings] properties.
  *
  * More values may be added over time.
  */
enum SystemSetting(val raw: GtkSystemSetting):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the [property@Gtk.Settings:gtk-xft-dpi] setting has changed
    */
  case DPI extends SystemSetting(GtkSystemSetting.GTK_SYSTEM_SETTING_DPI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The [property@Gtk.Settings:gtk-font-name] setting has changed
    */
  case FONT_NAME
      extends SystemSetting(GtkSystemSetting.GTK_SYSTEM_SETTING_FONT_NAME)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The font configuration has changed in a way that requires text to be
    * redrawn. This can be any of the [property@Gtk.Settings:gtk-xft-antialias],
    * [property@Gtk.Settings:gtk-xft-hinting],
    * [property@Gtk.Settings:gtk-xft-hintstyle],
    * [property@Gtk.Settings:gtk-xft-rgba] or
    * [property@Gtk.Settings:gtk-fontconfig-timestamp] settings
    */
  case FONT_CONFIG
      extends SystemSetting(GtkSystemSetting.GTK_SYSTEM_SETTING_FONT_CONFIG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The display has changed
    */
  case DISPLAY
      extends SystemSetting(GtkSystemSetting.GTK_SYSTEM_SETTING_DISPLAY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The icon theme has changed in a way that requires icons to be looked up
    * again
    */
  case ICON_THEME
      extends SystemSetting(GtkSystemSetting.GTK_SYSTEM_SETTING_ICON_THEME)
end SystemSetting

object SystemSetting:
  def fromRaw(raw: GtkSystemSetting): SystemSetting =
    raw match
      case GtkSystemSetting.GTK_SYSTEM_SETTING_DPI       => SystemSetting.DPI
      case GtkSystemSetting.GTK_SYSTEM_SETTING_FONT_NAME =>
        SystemSetting.FONT_NAME
      case GtkSystemSetting.GTK_SYSTEM_SETTING_FONT_CONFIG =>
        SystemSetting.FONT_CONFIG
      case GtkSystemSetting.GTK_SYSTEM_SETTING_DISPLAY => SystemSetting.DISPLAY
      case GtkSystemSetting.GTK_SYSTEM_SETTING_ICON_THEME =>
        SystemSetting.ICON_THEME
  end fromRaw
end SystemSetting
