package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.Display
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{Settings, StyleProvider}
import sn.gnome.gtk4.internal.GtkSettings

/** `GtkSettings` provides a mechanism to share global settings between
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Settings private[gnome] (raw: Ptr[GtkSettings])
    extends Object(raw.asInstanceOf),
      StyleProvider:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Undoes the effect of calling g_object_set() to install an
    * application-specific value for a setting.
    *
    * After this call, the setting will again follow the session-wide value for
    * this setting.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def resetProperty(
      name: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_settings_reset_property(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSettings]],
      toCString(name)
    )
  end resetProperty

end Settings

object Settings:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkSettings])(using Runtime) = summon[Runtime]
    .getOrCreate[Settings](ptr.asInstanceOf[Ptr[Byte]], p => new Settings(ptr))

  /** Gets the `GtkSettings` object for the default display, creating it if
    * necessary.
    *
    * See [func@Gtk.Settings.get_for_display].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefault()(using
      Runtime
  ): sn.gnome.gtk4.Settings /* Some(Ptr[GtkSettings]) */ =
    sn.gnome.gtk4.Settings.applyUnsafe(gtk_settings_get_default().asInstanceOf)

  /** Gets the `GtkSettings` object for @display, creating it if necessary.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getForDisplay(
      display: sn.gnome.gdk4.Display /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDisplay]) */
  )(using Runtime): sn.gnome.gtk4.Settings /* Some(Ptr[GtkSettings]) */ =
    sn.gnome.gtk4.Settings.applyUnsafe(
      gtk_settings_get_for_display(
        display.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

end Settings
