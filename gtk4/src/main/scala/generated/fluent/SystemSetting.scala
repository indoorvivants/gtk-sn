package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkSystemSetting

/** Values that can be passed to the [vfunc@Gtk.Widget.system_setting_changed]
  * vfunc.
  *
  * The values indicate which system setting has changed. Widgets may need to
  * drop caches, or react otherwise.
  *
  * Most of the values correspond to [class@Settings] properties.
  *
  * More values may be added over time.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum SystemSetting(val raw: GtkSystemSetting):
  /** the [property@Gtk.Settings:gtk-xft-dpi] setting has changed
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DPI extends SystemSetting(GtkSystemSetting.GTK_SYSTEM_SETTING_DPI)

  /** The [property@Gtk.Settings:gtk-font-name] setting has changed
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FONT_NAME
      extends SystemSetting(GtkSystemSetting.GTK_SYSTEM_SETTING_FONT_NAME)

  /** The font configuration has changed in a way that requires text to be
    * redrawn. This can be any of the [property@Gtk.Settings:gtk-xft-antialias],
    * [property@Gtk.Settings:gtk-xft-hinting],
    * [property@Gtk.Settings:gtk-xft-hintstyle],
    * [property@Gtk.Settings:gtk-xft-rgba] or
    * [property@Gtk.Settings:gtk-fontconfig-timestamp] settings
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FONT_CONFIG
      extends SystemSetting(GtkSystemSetting.GTK_SYSTEM_SETTING_FONT_CONFIG)

  /** The display has changed
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DISPLAY
      extends SystemSetting(GtkSystemSetting.GTK_SYSTEM_SETTING_DISPLAY)

  /** The icon theme has changed in a way that requires icons to be looked up
    * again
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
