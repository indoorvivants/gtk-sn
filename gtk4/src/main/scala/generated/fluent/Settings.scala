package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Display
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.{Settings, StyleProvider}
import sn.gnome.gtk4.internal.GtkSettings

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkSettings` provides a mechanism to share global settings between
  * applications.
  *
  * On the X window system, this sharing is realized by an
  * [XSettings](http://www.freedesktop.org/wiki/Specifications/xsettings-spec)
  * manager that is usually part of the desktop environment, along with
  * utilities that let the user change these settings.
  *
  * On Wayland, the settings are obtained either via a settings portal, or by
  * reading desktop settings from DConf.
  *
  * In the absence of these sharing mechanisms, GTK reads default values for
  * settings from `settings.ini` files in `/etc/gtk-4.0`,
  * `$XDG_CONFIG_DIRS/gtk-4.0` and `$XDG_CONFIG_HOME/gtk-4.0`. These files must
  * be valid key files (see `GKeyFile`), and have a section called Settings.
  * Themes can also provide default values for settings by installing a
  * `settings.ini` file next to their `gtk.css` file.
  *
  * Applications can override system-wide settings by setting the property of
  * the `GtkSettings` object with g_object_set(). This should be restricted to
  * special cases though; `GtkSettings` are not meant as an application
  * configuration facility.
  *
  * There is one `GtkSettings` instance per display. It can be obtained with
  * [func@Gtk.Settings.get_for_display], but in many cases, it is more
  * convenient to use [method@Gtk.Widget.get_settings].
  */
class Settings(raw: Ptr[GtkSettings])
    extends Object(raw.asInstanceOf),
      StyleProvider:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Undoes the effect of calling g_object_set() to install an
    * application-specific value for a setting.
    *
    * After this call, the setting will again follow the session-wide value for
    * this setting.
    */
  def resetProperty(
      name: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_settings_reset_property(
    this.raw.asInstanceOf[Ptr[GtkSettings]],
    __sn_extract_string(name)
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Settings

object Settings:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GtkSettings` object for the default display, creating it if
    * necessary.
    *
    * See [func@Gtk.Settings.get_for_display].
    */
  def getDefault(): Settings /* Some(Ptr[GtkSettings]) */ = new Settings(
    gtk_settings_get_default().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GtkSettings` object for @display, creating it if necessary.
    */
  def getForDisplay(
      display: Display /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDisplay]) */
  ): Settings /* Some(Ptr[GtkSettings]) */ = new Settings(
    gtk_settings_get_for_display(
      display.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

end Settings
