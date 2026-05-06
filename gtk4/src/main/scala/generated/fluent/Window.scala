package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.{Display, Monitor}
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer, guint32}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Application,
  Buildable,
  ConstraintTarget,
  Native,
  Root,
  ShortcutManager,
  Widget,
  Window,
  WindowGroup
}
import sn.gnome.gtk4.internal.GtkWindow

/** A `GtkWindow` is a toplevel window which can contain other widgets.
  *
  * ![An example GtkWindow](window.png)
  *
  * Windows normally have decorations that are under the control of the
  * windowing system and allow the user to manipulate the window (resize it,
  * move it, close it,...).
  *
  * # GtkWindow as GtkBuildable
  *
  * The `GtkWindow` implementation of the [iface@Gtk.Buildable] interface
  * supports setting a child as the titlebar by specifying “titlebar” as the
  * “type” attribute of a `<child>` element.
  *
  * # CSS nodes
  *
  * ```
  * window.background [.csd / .solid-csd / .ssd] [.maximized / .fullscreen / .tiled]
  * ├── <child>
  * ╰── <titlebar child>.titlebar [.default-decoration]
  * ```
  *
  * `GtkWindow` has a main CSS node with name window and style class
  * .background.
  *
  * Style classes that are typically used with the main CSS node are .csd (when
  * client-side decorations are in use), .solid-csd (for client-side decorations
  * without invisible borders), .ssd (used by mutter when rendering server-side
  * decorations). GtkWindow also represents window states with the following
  * style classes on the main node: .maximized, .fullscreen, .tiled (when
  * supported, also .tiled-top, .tiled-left, .tiled-right, .tiled-bottom).
  *
  * `GtkWindow` subclasses often add their own discriminating style classes,
  * such as .dialog, .popup or .tooltip.
  *
  * Generally, some CSS properties don't make sense on the toplevel window node,
  * such as margins or padding. When client-side decorations without invisible
  * borders are in use (i.e. the .solid-csd style class is added to the main
  * window node), the CSS border of the toplevel window is used for resize
  * drags. In the .csd case, the shadow area outside of the window can be used
  * to resize it.
  *
  * `GtkWindow` adds the .titlebar and .default-decoration style classes to the
  * widget that is added as a titlebar child.
  *
  * # Accessibility
  *
  * Until GTK 4.10, `GtkWindow` used the `GTK_ACCESSIBLE_ROLE_WINDOW` role.
  *
  * Since GTK 4.12, `GtkWindow` uses the `GTK_ACCESSIBLE_ROLE_APPLICATION` role.
  *
  * # Actions
  *
  * `GtkWindow` defines a set of built-in actions:
  *   - `default.activate`: Activate the default widget.
  *   - `window.minimize`: Minimize the window.
  *   - `window.toggle-maximized`: Maximize or restore the window.
  *   - `window.close`: Close the window.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Window(raw: Ptr[GtkWindow])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      Root,
      ShortcutManager:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Requests that the window is closed.
    *
    * This is similar to what happens when a window manager close button is
    * clicked.
    *
    * This function can be used with close buttons in custom titlebars.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def close(): Unit /* None */ = gtk_window_close(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
  )

  /** Drop the internal reference GTK holds on toplevel windows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def destroy(): Unit /* None */ = gtk_window_destroy(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
  )

  /** Asks to place @window in the fullscreen state.
    *
    * Note that you shouldn’t assume the window is definitely fullscreen
    * afterward, because other entities (e.g. the user or window manager)
    * unfullscreen it again, and not all window managers honor requests to
    * fullscreen windows.
    *
    * You can track the result of this operation via the
    * [property@Gdk.Toplevel:state] property, or by listening to notifications
    * of the [property@Gtk.Window:fullscreened] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fullscreen(): Unit /* None */ = gtk_window_fullscreen(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
  )

  /** Asks to place @window in the fullscreen state on the given @monitor.
    *
    * Note that you shouldn't assume the window is definitely fullscreen
    * afterward, or that the windowing system allows fullscreen windows on any
    * given monitor.
    *
    * You can track the result of this operation via the
    * [property@Gdk.Toplevel:state] property, or by listening to notifications
    * of the [property@Gtk.Window:fullscreened] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fullscreenOnMonitor(
      monitor: Monitor /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkMonitor]) */
  ): Unit /* None */ = gtk_window_fullscreen_on_monitor(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    monitor.getUnsafeRawPointer().asInstanceOf
  )

  /** Gets the `GtkApplication` associated with the window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getApplication(): Application /* None */ = new Application(
    gtk_window_get_application(
      this.raw.asInstanceOf[Ptr[GtkWindow]]
    ).asInstanceOf
  )

  /** Gets the child widget of @window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_window_get_child(this.raw.asInstanceOf[Ptr[GtkWindow]]).asInstanceOf
  )

  /** Returns whether the window has been set to have decorations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDecorated(): Boolean /* None */ =
    gtk_window_get_decorated(this.raw.asInstanceOf[Ptr[GtkWindow]]).value.!=(0)

  /** Gets the default size of the window.
    *
    * A value of 0 for the width or height indicates that a default size has not
    * been explicitly set for that dimension, so the “natural” size of the
    * window will be used.
    *
    * This function is the recommended way for [saving window state across
    * restarts of
    * applications](https://developer.gnome.org/documentation/tutorials/save-state.html).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_default_size]: Method get_default_size contains an OUT parameter, which is not supported yet"
  )
  private def getDefaultSize__ = ???

  /** Returns the default widget for @window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefaultWidget(): Widget /* None */ = new Widget(
    gtk_window_get_default_widget(
      this.raw.asInstanceOf[Ptr[GtkWindow]]
    ).asInstanceOf
  )

  /** Returns whether the window has been set to have a close button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDeletable(): Boolean /* None */ =
    gtk_window_get_deletable(this.raw.asInstanceOf[Ptr[GtkWindow]]).value.!=(0)

  /** Returns whether the window will be destroyed with its transient parent.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDestroyWithParent(): Boolean /* None */ =
    gtk_window_get_destroy_with_parent(
      this.raw.asInstanceOf[Ptr[GtkWindow]]
    ).value.!=(0)

  /** Retrieves the current focused widget within the window.
    *
    * Note that this is the widget that would have the focus if the toplevel
    * window focused; if the toplevel window is not focused then
    * `gtk_widget_has_focus (widget)` will not be %TRUE for the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFocus(): Widget /* None */ = new Widget(
    gtk_window_get_focus(this.raw.asInstanceOf[Ptr[GtkWindow]]).asInstanceOf
  )

  /** Gets whether “focus rectangles” are supposed to be visible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFocusVisible(): Boolean /* None */ = gtk_window_get_focus_visible(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
  ).value.!=(0)

  /** Returns the group for @window.
    *
    * If the window has no group, then the default group is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getGroup(): WindowGroup /* None */ = new WindowGroup(
    gtk_window_get_group(this.raw.asInstanceOf[Ptr[GtkWindow]]).asInstanceOf
  )

  /** Returns whether this window reacts to F10 key presses by activating a
    * menubar it contains.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHandleMenubarAccel(): Boolean /* None */ =
    gtk_window_get_handle_menubar_accel(
      this.raw.asInstanceOf[Ptr[GtkWindow]]
    ).value.!=(0)

  /** Returns whether the window will be hidden when the close button is
    * clicked.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHideOnClose(): Boolean /* None */ = gtk_window_get_hide_on_close(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
  ).value.!=(0)

  /** Returns the name of the themed icon for the window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIconName()(using Zone): String /* None */ = fromCString(
    gtk_window_get_icon_name(this.raw.asInstanceOf[Ptr[GtkWindow]]).asInstanceOf
  )

  /** Gets whether mnemonics are supposed to be visible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMnemonicsVisible(): Boolean /* None */ =
    gtk_window_get_mnemonics_visible(
      this.raw.asInstanceOf[Ptr[GtkWindow]]
    ).value.!=(0)

  /** Returns whether the window is modal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModal(): Boolean /* None */ =
    gtk_window_get_modal(this.raw.asInstanceOf[Ptr[GtkWindow]]).value.!=(0)

  /** Gets the value set by gtk_window_set_resizable().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getResizable(): Boolean /* None */ =
    gtk_window_get_resizable(this.raw.asInstanceOf[Ptr[GtkWindow]]).value.!=(0)

  /** Retrieves the title of the window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTitle()(using Zone): String /* None */ = fromCString(
    gtk_window_get_title(this.raw.asInstanceOf[Ptr[GtkWindow]]).asInstanceOf
  )

  /** Returns the custom titlebar that has been set with
    * gtk_window_set_titlebar().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTitlebar(): Widget /* None */ = new Widget(
    gtk_window_get_titlebar(this.raw.asInstanceOf[Ptr[GtkWindow]]).asInstanceOf
  )

  /** Fetches the transient parent for this window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTransientFor(): Window /* None */ = new Window(
    gtk_window_get_transient_for(
      this.raw.asInstanceOf[Ptr[GtkWindow]]
    ).asInstanceOf
  )

  /** Returns whether @window has an explicit window group.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasGroup(): Boolean /* None */ =
    gtk_window_has_group(this.raw.asInstanceOf[Ptr[GtkWindow]]).value.!=(0)

  /** Returns whether the window is part of the current active toplevel.
    *
    * The active toplevel is the window receiving keystrokes.
    *
    * The return value is %TRUE if the window is active toplevel itself. You
    * might use this function if you wanted to draw a widget differently in an
    * active window from a widget in an inactive window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isActive(): Boolean /* None */ =
    gtk_window_is_active(this.raw.asInstanceOf[Ptr[GtkWindow]]).value.!=(0)

  /** Retrieves the current fullscreen state of @window.
    *
    * Note that since fullscreening is ultimately handled by the window manager
    * and happens asynchronously to an application request, you shouldn’t assume
    * the return value of this function changing immediately (or at all), as an
    * effect of calling [method@Gtk.Window.fullscreen] or
    * [method@Gtk.Window.unfullscreen].
    *
    * If the window isn't yet mapped, the value returned will whether the
    * initial requested state is fullscreen.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isFullscreen(): Boolean /* None */ =
    gtk_window_is_fullscreen(this.raw.asInstanceOf[Ptr[GtkWindow]]).value.!=(0)

  /** Retrieves the current maximized state of @window.
    *
    * Note that since maximization is ultimately handled by the window manager
    * and happens asynchronously to an application request, you shouldn’t assume
    * the return value of this function changing immediately (or at all), as an
    * effect of calling [method@Gtk.Window.maximize] or
    * [method@Gtk.Window.unmaximize].
    *
    * If the window isn't yet mapped, the value returned will whether the
    * initial requested state is maximized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isMaximized(): Boolean /* None */ =
    gtk_window_is_maximized(this.raw.asInstanceOf[Ptr[GtkWindow]]).value.!=(0)

  /** Retrieves the current suspended state of @window.
    *
    * A window being suspended means it's currently not visible to the user, for
    * example by being on a inactive workspace, minimized, obstructed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSuspended(): Boolean /* None */ =
    gtk_window_is_suspended(this.raw.asInstanceOf[Ptr[GtkWindow]]).value.!=(0)

  /** Asks to maximize @window, so that it fills the screen.
    *
    * Note that you shouldn’t assume the window is definitely maximized
    * afterward, because other entities (e.g. the user or window manager) could
    * unmaximize it again, and not all window managers support maximization.
    *
    * It’s permitted to call this function before showing a window, in which
    * case the window will be maximized when it appears onscreen initially.
    *
    * You can track the result of this operation via the
    * [property@Gdk.Toplevel:state] property, or by listening to notifications
    * on the [property@Gtk.Window:maximized] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def maximize(): Unit /* None */ = gtk_window_maximize(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
  )

  /** Asks to minimize the specified @window.
    *
    * Note that you shouldn’t assume the window is definitely minimized
    * afterward, because the windowing system might not support this
    * functionality; other entities (e.g. the user or the window manager) could
    * unminimize it again, or there may not be a window manager in which case
    * minimization isn’t possible, etc.
    *
    * It’s permitted to call this function before showing a window, in which
    * case the window will be minimized before it ever appears onscreen.
    *
    * You can track result of this operation via the
    * [property@Gdk.Toplevel:state] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def minimize(): Unit /* None */ = gtk_window_minimize(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
  )

  /** Presents a window to the user.
    *
    * This may mean raising the window in the stacking order, unminimizing it,
    * moving it to the current desktop and/or giving it the keyboard focus
    * (possibly dependent on the user’s platform, window manager and
    * preferences).
    *
    * If @window is hidden, this function also makes it visible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def present(): Unit /* None */ = gtk_window_present(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
  )

  /** Presents a window to the user in response to an user interaction.
    *
    * See [method@Gtk.Window.present] for more details.
    *
    * The timestamp should be gathered when the window was requested to be shown
    * (when clicking a link for example), rather than once the window is ready
    * to be shown.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def presentWithTime(
      timestamp: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  ): Unit /* None */ = gtk_window_present_with_time(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    guint32(timestamp)
  )

  /** Sets or unsets the `GtkApplication` associated with the window.
    *
    * The application will be kept alive for at least as long as it has any
    * windows associated with it (see g_application_hold() for a way to keep it
    * alive without windows).
    *
    * Normally, the connection between the application and the window will
    * remain until the window is destroyed, but you can explicitly remove it by
    * setting the @application to %NULL.
    *
    * This is equivalent to calling [method@Gtk.Application.remove_window]
    * and/or [method@Gtk.Application.add_window] on the old/new applications as
    * relevant.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setApplication(
      application: Option[Application /* Some(Ptr[GtkApplication]) */ ]
  ): Unit /* None */ = gtk_window_set_application(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    application
      .map[Ptr[GtkApplication]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkApplication]])
  )

  /** Sets the child widget of @window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_window_set_child(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** Sets whether the window should be decorated.
    *
    * By default, windows are decorated with a title bar, resize controls, etc.
    * Some window managers allow GTK to disable these decorations, creating a
    * borderless window. If you set the decorated property to %FALSE using this
    * function, GTK will do its best to convince the window manager not to
    * decorate the window. Depending on the system, this function may not have
    * any effect when called on a window that is already visible, so you should
    * call it before calling [method@Gtk.Widget.show].
    *
    * On Windows, this function always works, since there’s no window manager
    * policy involved.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDecorated(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_window_set_decorated(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** Sets the default size of a window.
    *
    * The default size of a window is the size that will be used if no other
    * constraints apply.
    *
    * The default size will be updated whenever the window is resized to reflect
    * the new size, unless the window is forced to a size, like when it is
    * maximized or fullscreened.
    *
    * If the window’s minimum size request is larger than the default, the
    * default will be ignored.
    *
    * Setting the default size to a value <= 0 will cause it to be ignored and
    * the natural size request will be used instead. It is possible to do this
    * while the window is showing to "reset" it to its initial size.
    *
    * Unlike [method@Gtk.Widget.set_size_request], which sets a size request for
    * a widget and thus would keep users from shrinking the window, this
    * function only sets the initial size, just as if the user had resized the
    * window themselves. Users can still shrink the window again as they
    * normally would. Setting a default size of -1 means to use the “natural”
    * default size (the size request of the window).
    *
    * If you use this function to reestablish a previously saved window size,
    * note that the appropriate size to save is the one returned by
    * [method@Gtk.Window.get_default_size]. Using the window allocation directly
    * will not work in all circumstances and can lead to growing or shrinking
    * windows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDefaultSize(
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  ): Unit /* None */ = gtk_window_set_default_size(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    width,
    height
  )

  /** Sets the default widget.
    *
    * The default widget is the widget that is activated when the user presses
    * Enter in a dialog (for example).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDefaultWidget(
      default_widget: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_window_set_default_widget(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    default_widget
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** Sets whether the window should be deletable.
    *
    * By default, windows have a close button in the window frame. Some window
    * managers allow GTK to disable this button. If you set the deletable
    * property to %FALSE using this function, GTK will do its best to convince
    * the window manager not to show a close button. Depending on the system,
    * this function may not have any effect when called on a window that is
    * already visible, so you should call it before calling
    * [method@Gtk.Widget.show].
    *
    * On Windows, this function always works, since there’s no window manager
    * policy involved.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDeletable(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_window_set_deletable(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** If @setting is %TRUE, then destroying the transient parent of @window will
    * also destroy @window itself.
    *
    * This is useful for dialogs that shouldn’t persist beyond the lifetime of
    * the main window they are associated with, for example.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDestroyWithParent(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_window_set_destroy_with_parent(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** Sets the `GdkDisplay` where the @window is displayed.
    *
    * If the window is already mapped, it will be unmapped, and then remapped on
    * the new display.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDisplay(
      display: Display /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDisplay]) */
  ): Unit /* None */ = gtk_window_set_display(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    display.getUnsafeRawPointer().asInstanceOf
  )

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
  def setFocus(
      focus: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_window_set_focus(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    focus
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** Sets whether “focus rectangles” are supposed to be visible.
    *
    * This property is maintained by GTK based on user input, and should not be
    * set by applications.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFocusVisible(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_window_set_focus_visible(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** Sets whether this window should react to F10 key presses by activating a
    * menubar it contains.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHandleMenubarAccel(
      handle_menubar_accel: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_window_set_handle_menubar_accel(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    gboolean(gint((if handle_menubar_accel == true then 1 else 0)))
  )

  /** If @setting is %TRUE, then clicking the close button on the window will
    * not destroy it, but only hide it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHideOnClose(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_window_set_hide_on_close(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** Sets the icon for the window from a named themed icon.
    *
    * See the docs for [class@Gtk.IconTheme] for more details. On some
    * platforms, the window icon is not used at all.
    *
    * Note that this has nothing to do with the WM_ICON_NAME property which is
    * mentioned in the ICCCM.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIconName(
      name: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_window_set_icon_name(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    name
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets whether mnemonics are supposed to be visible.
    *
    * This property is maintained by GTK based on user input, and should not be
    * set by applications.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMnemonicsVisible(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_window_set_mnemonics_visible(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** Sets a window modal or non-modal.
    *
    * Modal windows prevent interaction with other windows in the same
    * application. To keep modal dialogs on top of main application windows, use
    * [method@Gtk.Window.set_transient_for] to make the dialog transient for the
    * parent; most window managers will then disallow lowering the dialog below
    * the parent.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModal(
      modal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_window_set_modal(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    gboolean(gint((if modal == true then 1 else 0)))
  )

  /** Sets whether the user can resize a window.
    *
    * Windows are user resizable by default.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setResizable(
      resizable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_window_set_resizable(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    gboolean(gint((if resizable == true then 1 else 0)))
  )

  /** Sets the startup notification ID.
    *
    * Startup notification identifiers are used by desktop environment to track
    * application startup, to provide user feedback and other features. This
    * function changes the corresponding property on the underlying
    * `GdkSurface`.
    *
    * Normally, startup identifier is managed automatically and you should only
    * use this function in special cases like transferring focus from other
    * processes. You should use this function before calling
    * [method@Gtk.Window.present] or any equivalent function generating a window
    * map event.
    *
    * This function is only useful on X11, not with other GTK targets.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setStartupId(
      startup_id: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_window_set_startup_id(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    __sn_extract_string(startup_id)
  )

  /** Sets the title of the `GtkWindow`.
    *
    * The title of a window will be displayed in its title bar; on the X Window
    * System, the title bar is rendered by the window manager so exactly how the
    * title appears to users may vary according to a user’s exact configuration.
    * The title should help a user distinguish this window from other windows
    * they may have open. A good title might include the application name and
    * current document filename, for example.
    *
    * Passing %NULL does the same as setting the title to an empty string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTitle(
      title: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_window_set_title(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    title
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets a custom titlebar for @window.
    *
    * A typical widget used here is [class@Gtk.HeaderBar], as it provides
    * various features expected of a titlebar while allowing the addition of
    * child widgets to it.
    *
    * If you set a custom titlebar, GTK will do its best to convince the window
    * manager not to put its own titlebar on the window. Depending on the
    * system, this function may not work for a window that is already visible,
    * so you set the titlebar before calling [method@Gtk.Widget.show].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTitlebar(
      titlebar: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_window_set_titlebar(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    titlebar
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** Dialog windows should be set transient for the main application window
    * they were spawned from. This allows window managers to e.g. keep the
    * dialog on top of the main window, or center the dialog over the main
    * window. [ctor@Gtk.Dialog.new_with_buttons] and other convenience functions
    * in GTK will sometimes call gtk_window_set_transient_for() on your behalf.
    *
    * Passing %NULL for @parent unsets the current transient window.
    *
    * On Windows, this function puts the child window on top of the parent, much
    * as the window manager would have done on X.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTransientFor(
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ]
  ): Unit /* None */ = gtk_window_set_transient_for(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    parent
      .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWindow]])
  )

  /** Asks to remove the fullscreen state for @window, and return to its
    * previous state.
    *
    * Note that you shouldn’t assume the window is definitely not fullscreen
    * afterward, because other entities (e.g. the user or window manager) could
    * fullscreen it again, and not all window managers honor requests to
    * unfullscreen windows; normally the window will end up restored to its
    * normal state. Just don’t write code that crashes if not.
    *
    * You can track the result of this operation via the
    * [property@Gdk.Toplevel:state] property, or by listening to notifications
    * of the [property@Gtk.Window:fullscreened] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unfullscreen(): Unit /* None */ = gtk_window_unfullscreen(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
  )

  /** Asks to unmaximize @window.
    *
    * Note that you shouldn’t assume the window is definitely unmaximized
    * afterward, because other entities (e.g. the user or window manager)
    * maximize it again, and not all window managers honor requests to
    * unmaximize.
    *
    * You can track the result of this operation via the
    * [property@Gdk.Toplevel:state] property, or by listening to notifications
    * on the [property@Gtk.Window:maximized] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unmaximize(): Unit /* None */ = gtk_window_unmaximize(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
  )

  /** Asks to unminimize the specified @window.
    *
    * Note that you shouldn’t assume the window is definitely unminimized
    * afterward, because the windowing system might not support this
    * functionality; other entities (e.g. the user or the window manager) could
    * minimize it again, or there may not be a window manager in which case
    * minimization isn’t possible, etc.
    *
    * You can track result of this operation via the
    * [property@Gdk.Toplevel:state] property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unminimize(): Unit /* None */ = gtk_window_unminimize(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
  )

  /** Emitted when the user activates the default widget of @window.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivateDefault(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkWindow],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"activate-default"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onActivateDefault

  /** Emitted when the user activates the currently focused widget of @window.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivateFocus(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkWindow],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"activate-focus"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onActivateFocus

  /** Emitted when the user clicks on the close button of the window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onCloseRequest(handler: => Boolean)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Boolean]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkWindow],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"close-request"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onCloseRequest

  /** Emitted when the user enables or disables interactive debugging.
    *
    * When @toggle is %TRUE, interactive debugging is toggled on or off, when it
    * is %FALSE, the debugger will be pointed at the widget under the pointer.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The default bindings for this signal are Ctrl-Shift-I and Ctrl-Shift-D.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onEnableDebugging(handler: ((toggle: Boolean)) => Boolean)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (toggle: Boolean), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkWindow],
          toggle: Boolean /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((toggle = toggle))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"enable-debugging"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onEnableDebugging

  /** emitted when the set of accelerators or mnemonics that are associated with @window
    * changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onKeysChanged(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkWindow],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"keys-changed"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onKeysChanged

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Window

object Window:
  /** Creates a new `GtkWindow`.
    *
    * To get an undecorated window (no window borders), use
    * [method@Gtk.Window.set_decorated].
    *
    * All top-level windows created by gtk_window_new() are stored in an
    * internal top-level window list. This list can be obtained from
    * [func@Gtk.Window.list_toplevels]. Due to GTK keeping a reference to the
    * window internally, gtk_window_new() does not return a reference to the
    * caller.
    *
    * To delete a `GtkWindow`, call [method@Gtk.Window.destroy].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): Window = new Window(gtk_window_new().asInstanceOf)

  /** Returns the fallback icon name for windows.
    *
    * The returned string is owned by GTK and should not be modified. It is only
    * valid until the next call to [func@Gtk.Window.set_default_icon_name].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefaultIconName()(using Zone): String /* Some(CString) */ =
    fromCString(gtk_window_get_default_icon_name().asInstanceOf)

  /** Returns a list of all existing toplevel windows.
    *
    * If you want to iterate through the list and perform actions involving
    * callbacks that might destroy the widgets or add new ones, be aware that
    * the list of toplevels will change and emit the "items-changed" signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getToplevels()
      : ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */ =
    new ListModel.Abstract(gtk_window_get_toplevels().asInstanceOf)

  /** Returns a list of all existing toplevel windows.
    *
    * The widgets in the list are not individually referenced. If you want to
    * iterate through the list and perform actions involving callbacks that
    * might destroy the widgets, you must call
    * `g_list_foreach (result, (GFunc)g_object_ref, NULL)` first, and then unref
    * all the widgets afterwards.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[<return type>]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Widget))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def listToplevels() = ???

  /** Sets whether the window should request startup notification.
    *
    * By default, after showing the first `GtkWindow`, GTK calls
    * [method@Gdk.Toplevel.set_startup_id]. Call this function to disable the
    * automatic startup notification. You might do this if your first window is
    * a splash screen, and you want to delay notification until after your real
    * main window has been shown, for example.
    *
    * In that example, you would disable startup notification temporarily, show
    * your splash screen, then re-enable it so that showing the main window
    * would automatically result in notification.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAutoStartupNotification(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* Some(Unit) */ = gtk_window_set_auto_startup_notification(
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** Sets an icon to be used as fallback.
    *
    * The fallback icon is used for windows that haven't had
    * [method@Gtk.Window.set_icon_name] called on them.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDefaultIconName(
      name: String | CString /* Some(CString) */
  )(using Zone): Unit /* Some(Unit) */ = gtk_window_set_default_icon_name(
    __sn_extract_string(name)
  )

  /** Opens or closes the [interactive
    * debugger](running.html#interactive-debugging).
    *
    * The debugger offers access to the widget hierarchy of the application and
    * to useful debugging tools.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInteractiveDebugging(
      enable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* Some(Unit) */ = gtk_window_set_interactive_debugging(
    gboolean(gint((if enable == true then 1 else 0)))
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Window
