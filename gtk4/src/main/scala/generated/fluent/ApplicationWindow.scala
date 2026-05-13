package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.Display
import sn.gnome.gio.{ActionGroup, ActionMap}
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{
  Accessible,
  Application,
  Buildable,
  ConstraintTarget,
  Native,
  Root,
  ShortcutManager,
  ShortcutsWindow,
  Widget,
  Window
}
import sn.gnome.gtk4.internal.{
  GtkApplicationWindow,
  GtkNative,
  GtkRoot,
  GtkWindow
}

/** `GtkApplicationWindow` is a `GtkWindow` subclass that integrates with
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ApplicationWindow private[gnome] (raw: Ptr[GtkApplicationWindow])
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

  /** Returns the display that this `GtkRoot` is on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getDisplay()(using Runtime): sn.gnome.gdk4.Display /* None */ =
    sn.gnome.gdk4.Display.applyUnsafe(
      gtk_root_get_display(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRoot]]
      ).asInstanceOf
    )
  end getDisplay

  /** Retrieves the current focused widget within the window.
    *
    * Note that this is the widget that would have the focus if the toplevel
    * window focused; if the toplevel window is not focused then
    * `gtk_widget_has_focus (widget)` will not be %TRUE for the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getFocus()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_window_get_focus(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWindow]]
      ).asInstanceOf
    )
  end getFocus

  /** Gets the `GtkShortcutsWindow` that is associated with @window.
    *
    * See [method@Gtk.ApplicationWindow.set_help_overlay].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHelpOverlay()(using
      Runtime
  ): sn.gnome.gtk4.ShortcutsWindow /* None */ =
    sn.gnome.gtk4.ShortcutsWindow.applyUnsafe(
      gtk_application_window_get_help_overlay(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkApplicationWindow]]
      ).asInstanceOf
    )
  end getHelpOverlay

  /** Returns the unique ID of the window.
    *
    * If the window has not yet been added to a `GtkApplication`, returns `0`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getId(): UInt /* None */ =
    gtk_application_window_get_id(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkApplicationWindow]]
    ).value
  end getId

  /** Returns whether the window will display a menubar for the app menu and
    * menubar as needed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowMenubar(): Boolean /* None */ =
    gtk_application_window_get_show_menubar(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkApplicationWindow]]
    ).value.!=(0)
  end getShowMenubar

  /** Realizes a `GtkNative`.
    *
    * This should only be used by subclasses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def realize(): Unit /* None */ =
    gtk_native_realize(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNative]])
  end realize

  /** Sets the focus widget.
    *
    * If @focus is not the current focus widget, and is focusable, sets it as
    * the focus widget for the window. If @focus is %NULL, unsets the focus
    * widget for this window. To set the focus to a particular widget in the
    * toplevel, it is usually more convenient to use
    * [method@Gtk.Widget.grab_focus] instead of this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def setFocus(
      focus: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_window_set_focus(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWindow]],
      focus
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setFocus

  /** Associates a shortcuts window with the application window.
    *
    * Additionally, sets up an action with the name `win.show-help-overlay` to
    * present it.
    *
    * @window
    *   takes responsibility for destroying @help_overlay.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHelpOverlay(
      help_overlay: Option[
        sn.gnome.gtk4.ShortcutsWindow /* Some(Ptr[GtkShortcutsWindow]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_application_window_set_help_overlay(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkApplicationWindow]],
      help_overlay
        .map[Ptr[GtkShortcutsWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkShortcutsWindow]])
    )
  end setHelpOverlay

  /** Sets whether the window will display a menubar for the app menu and
    * menubar as needed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowMenubar(
      show_menubar: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_application_window_set_show_menubar(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkApplicationWindow]],
      gboolean(gint((if show_menubar == true then 1 else 0)))
    )
  end setShowMenubar

  /** Unrealizes a `GtkNative`.
    *
    * This should only be used by subclasses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def unrealize(): Unit /* None */ =
    gtk_native_unrealize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNative]]
    )
  end unrealize

end ApplicationWindow

object ApplicationWindow:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkApplicationWindow])(using Runtime) =
    summon[Runtime].getOrCreate[ApplicationWindow](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ApplicationWindow(ptr)
    )

  /** Creates a new `GtkApplicationWindow`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      application: sn.gnome.gtk4.Application /* Some(Ptr[GtkApplication]) */
  )(using Runtime): ApplicationWindow =
    val raw: Ptr[Byte] = gtk_application_window_new(
      application.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime].getOrCreate[ApplicationWindow](
      raw,
      r => ApplicationWindow.applyUnsafe(r.asInstanceOf)
    )
  end apply
end ApplicationWindow
