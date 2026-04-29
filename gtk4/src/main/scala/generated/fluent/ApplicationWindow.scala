package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ActionGroup
import sn.gnome.gio.fluent.ActionMap
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Application
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Native
import sn.gnome.gtk4.fluent.Root
import sn.gnome.gtk4.fluent.ShortcutManager
import sn.gnome.gtk4.fluent.ShortcutsWindow
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkApplicationWindow

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkApplicationWindow` is a `GtkWindow` subclass that integrates with
  * `GtkApplication`.
  *
  * Notably, `GtkApplicationWindow` can handle an application menubar.
  *
  * This class implements the `GActionGroup` and `GActionMap` interfaces, to let
  * you add window-specific actions that will be exported by the associated
  * [class@Gtk.Application], together with its application-wide actions.
  * Window-specific actions are prefixed with the “win.” prefix and
  * application-wide actions are prefixed with the “app.” prefix. Actions must
  * be addressed with the prefixed name when referring to them from a
  * `GMenuModel`.
  *
  * Note that widgets that are placed inside a `GtkApplicationWindow` can also
  * activate these actions, if they implement the [iface@Gtk.Actionable]
  * interface.
  *
  * The settings [property@Gtk.Settings:gtk-shell-shows-app-menu] and
  * [property@Gtk.Settings:gtk-shell-shows-menubar] tell GTK whether the desktop
  * environment is showing the application menu and menubar models outside the
  * application as part of the desktop shell. For instance, on OS X, both menus
  * will be displayed remotely; on Windows neither will be.
  *
  * If the desktop environment does not display the menubar, then
  * `GtkApplicationWindow` will automatically show a menubar for it. This
  * behaviour can be overridden with the
  * [property@Gtk.ApplicationWindow:show-menubar] property. If the desktop
  * environment does not display the application menu, then it will
  * automatically be included in the menubar or in the windows client-side
  * decorations.
  *
  * See [class@Gtk.PopoverMenu] for information about the XML language used by
  * `GtkBuilder` for menu models.
  *
  * See also: [method@Gtk.Application.set_menubar].
  *
  * ## A GtkApplicationWindow with a menubar
  *
  * The code sample below shows how to set up a `GtkApplicationWindow` with a
  * menu bar defined on the [class@Gtk.Application]:
  *
  * ```c
  * GtkApplication *app = gtk_application_new ("org.gtk.test", 0);
  *
  * GtkBuilder *builder = gtk_builder_new_from_string (
  *     "<interface>"
  *     "  <menu id='menubar'>"
  *     "    <submenu>"
  *     "      <attribute name='label' translatable='yes'>_Edit</attribute>"
  *     "      <item>"
  *     "        <attribute name='label' translatable='yes'>_Copy</attribute>"
  *     "        <attribute name='action'>win.copy</attribute>"
  *     "      </item>"
  *     "      <item>"
  *     "        <attribute name='label' translatable='yes'>_Paste</attribute>"
  *     "        <attribute name='action'>win.paste</attribute>"
  *     "      </item>"
  *     "    </submenu>"
  *     "  </menu>"
  *     "</interface>",
  *     -1);
  *
  * GMenuModel *menubar = G_MENU_MODEL (gtk_builder_get_object (builder, "menubar"));
  * gtk_application_set_menubar (GTK_APPLICATION (app), menubar);
  * g_object_unref (builder);
  *
  * // ...
  *
  * GtkWidget *window = gtk_application_window_new (app);
  * ```
  */
class ApplicationWindow(raw: Ptr[GtkApplicationWindow])
    extends Window(raw.asInstanceOf),
      ActionGroup,
      ActionMap,
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      Root,
      ShortcutManager:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GtkShortcutsWindow` that is associated with @window.
    *
    * See [method@Gtk.ApplicationWindow.set_help_overlay].
    */
  def getHelpOverlay(): ShortcutsWindow = new ShortcutsWindow(
    gtk_application_window_get_help_overlay(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the unique ID of the window.
    *
    * If the window has not yet been added to a `GtkApplication`, returns `0`.
    */
  def getId(): UInt = gtk_application_window_get_id(this.raw.asInstanceOf).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the window will display a menubar for the app menu and
    * menubar as needed.
    */
  def getShowMenubar(): Boolean =
    gtk_application_window_get_show_menubar(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Associates a shortcuts window with the application window.
    *
    * Additionally, sets up an action with the name `win.show-help-overlay` to
    * present it.
    *
    * @window
    *   takes responsibility for destroying @help_overlay.
    */
  def setHelpOverlay(help_overlay: ShortcutsWindow): Unit =
    gtk_application_window_set_help_overlay(
      this.raw.asInstanceOf,
      help_overlay.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the window will display a menubar for the app menu and
    * menubar as needed.
    */
  def setShowMenubar(show_menubar: Boolean): Unit =
    gtk_application_window_set_show_menubar(
      this.raw.asInstanceOf,
      gboolean(gint((if show_menubar == true then 1 else 0)))
    )

end ApplicationWindow

object ApplicationWindow:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkApplicationWindow`.
    */
  def apply(application: Application): ApplicationWindow =
    new ApplicationWindow(
      gtk_application_window_new(
        application.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
end ApplicationWindow
