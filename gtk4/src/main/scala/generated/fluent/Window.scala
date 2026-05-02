package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.fluent.Monitor
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint32
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Application
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Native
import sn.gnome.gtk4.fluent.Root
import sn.gnome.gtk4.fluent.ShortcutManager
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.fluent.WindowGroup
import sn.gnome.gtk4.internal.GtkWindow

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkWindow` is a toplevel window which can contain other widgets.
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Requests that the window is closed.
    *
    * This is similar to what happens when a window manager close button is
    * clicked.
    *
    * This function can be used with close buttons in custom titlebars.
    */
  def close(): Unit /* None */ = gtk_window_close(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Drop the internal reference GTK holds on toplevel windows.
    */
  def destroy(): Unit /* None */ = gtk_window_destroy(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asks to place @window in the fullscreen state.
    *
    * Note that you shouldn’t assume the window is definitely fullscreen
    * afterward, because other entities (e.g. the user or window manager)
    * unfullscreen it again, and not all window managers honor requests to
    * fullscreen windows.
    *
    * You can track the result of this operation via the
    * [property@Gdk.Toplevel:state] property, or by listening to notifications
    * of the [property@Gtk.Window:fullscreened] property.
    */
  def fullscreen(): Unit /* None */ = gtk_window_fullscreen(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asks to place @window in the fullscreen state on the given @monitor.
    *
    * Note that you shouldn't assume the window is definitely fullscreen
    * afterward, or that the windowing system allows fullscreen windows on any
    * given monitor.
    *
    * You can track the result of this operation via the
    * [property@Gdk.Toplevel:state] property, or by listening to notifications
    * of the [property@Gtk.Window:fullscreened] property.
    */
  def fullscreenOnMonitor(
      monitor: Monitor /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkMonitor]) */
  ): Unit /* None */ = gtk_window_fullscreen_on_monitor(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    monitor.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GtkApplication` associated with the window.
    */
  def getApplication(): Application /* None */ = new Application(
    gtk_window_get_application(
      this.raw.asInstanceOf[Ptr[GtkWindow]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child widget of @window.
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_window_get_child(this.raw.asInstanceOf[Ptr[GtkWindow]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the window has been set to have decorations.
    */
  def getDecorated(): Boolean /* None */ =
    gtk_window_get_decorated(this.raw.asInstanceOf[Ptr[GtkWindow]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the default size of the window.
    *
    * A value of 0 for the width or height indicates that a default size has not
    * been explicitly set for that dimension, so the “natural” size of the
    * window will be used.
    *
    * This function is the recommended way for [saving window state across
    * restarts of
    * applications](https://developer.gnome.org/documentation/tutorials/save-state.html).
    */
  @annotation.compileTimeOnly(
    "Method get_default_size contains an OUT parameter, which is not supported yet"
  )
  private def getDefaultSize__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the default widget for @window.
    */
  def getDefaultWidget(): Widget /* None */ = new Widget(
    gtk_window_get_default_widget(
      this.raw.asInstanceOf[Ptr[GtkWindow]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the window has been set to have a close button.
    */
  def getDeletable(): Boolean /* None */ =
    gtk_window_get_deletable(this.raw.asInstanceOf[Ptr[GtkWindow]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the window will be destroyed with its transient parent.
    */
  def getDestroyWithParent(): Boolean /* None */ =
    gtk_window_get_destroy_with_parent(
      this.raw.asInstanceOf[Ptr[GtkWindow]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the current focused widget within the window.
    *
    * Note that this is the widget that would have the focus if the toplevel
    * window focused; if the toplevel window is not focused then
    * `gtk_widget_has_focus (widget)` will not be %TRUE for the widget.
    */
  def getFocus(): Widget /* None */ = new Widget(
    gtk_window_get_focus(this.raw.asInstanceOf[Ptr[GtkWindow]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether “focus rectangles” are supposed to be visible.
    */
  def getFocusVisible(): Boolean /* None */ = gtk_window_get_focus_visible(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the group for @window.
    *
    * If the window has no group, then the default group is returned.
    */
  def getGroup(): WindowGroup /* None */ = new WindowGroup(
    gtk_window_get_group(this.raw.asInstanceOf[Ptr[GtkWindow]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether this window reacts to F10 key presses by activating a
    * menubar it contains.
    */
  def getHandleMenubarAccel(): Boolean /* None */ =
    gtk_window_get_handle_menubar_accel(
      this.raw.asInstanceOf[Ptr[GtkWindow]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the window will be hidden when the close button is
    * clicked.
    */
  def getHideOnClose(): Boolean /* None */ = gtk_window_get_hide_on_close(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the name of the themed icon for the window.
    */
  def getIconName()(using Zone): String /* None */ = fromCString(
    gtk_window_get_icon_name(this.raw.asInstanceOf[Ptr[GtkWindow]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether mnemonics are supposed to be visible.
    */
  def getMnemonicsVisible(): Boolean /* None */ =
    gtk_window_get_mnemonics_visible(
      this.raw.asInstanceOf[Ptr[GtkWindow]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the window is modal.
    */
  def getModal(): Boolean /* None */ =
    gtk_window_get_modal(this.raw.asInstanceOf[Ptr[GtkWindow]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value set by gtk_window_set_resizable().
    */
  def getResizable(): Boolean /* None */ =
    gtk_window_get_resizable(this.raw.asInstanceOf[Ptr[GtkWindow]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the title of the window.
    */
  def getTitle()(using Zone): String /* None */ = fromCString(
    gtk_window_get_title(this.raw.asInstanceOf[Ptr[GtkWindow]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the custom titlebar that has been set with
    * gtk_window_set_titlebar().
    */
  def getTitlebar(): Widget /* None */ = new Widget(
    gtk_window_get_titlebar(this.raw.asInstanceOf[Ptr[GtkWindow]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the transient parent for this window.
    */
  def getTransientFor(): Window /* None */ = new Window(
    gtk_window_get_transient_for(
      this.raw.asInstanceOf[Ptr[GtkWindow]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether @window has an explicit window group.
    */
  def hasGroup(): Boolean /* None */ =
    gtk_window_has_group(this.raw.asInstanceOf[Ptr[GtkWindow]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the window is part of the current active toplevel.
    *
    * The active toplevel is the window receiving keystrokes.
    *
    * The return value is %TRUE if the window is active toplevel itself. You
    * might use this function if you wanted to draw a widget differently in an
    * active window from a widget in an inactive window.
    */
  def isActive(): Boolean /* None */ =
    gtk_window_is_active(this.raw.asInstanceOf[Ptr[GtkWindow]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the current fullscreen state of @window.
    *
    * Note that since fullscreening is ultimately handled by the window manager
    * and happens asynchronously to an application request, you shouldn’t assume
    * the return value of this function changing immediately (or at all), as an
    * effect of calling [method@Gtk.Window.fullscreen] or
    * [method@Gtk.Window.unfullscreen].
    *
    * If the window isn't yet mapped, the value returned will whether the
    * initial requested state is fullscreen.
    */
  def isFullscreen(): Boolean /* None */ =
    gtk_window_is_fullscreen(this.raw.asInstanceOf[Ptr[GtkWindow]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the current maximized state of @window.
    *
    * Note that since maximization is ultimately handled by the window manager
    * and happens asynchronously to an application request, you shouldn’t assume
    * the return value of this function changing immediately (or at all), as an
    * effect of calling [method@Gtk.Window.maximize] or
    * [method@Gtk.Window.unmaximize].
    *
    * If the window isn't yet mapped, the value returned will whether the
    * initial requested state is maximized.
    */
  def isMaximized(): Boolean /* None */ =
    gtk_window_is_maximized(this.raw.asInstanceOf[Ptr[GtkWindow]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the current suspended state of @window.
    *
    * A window being suspended means it's currently not visible to the user, for
    * example by being on a inactive workspace, minimized, obstructed.
    */
  def isSuspended(): Boolean /* None */ =
    gtk_window_is_suspended(this.raw.asInstanceOf[Ptr[GtkWindow]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asks to maximize @window, so that it fills the screen.
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
    */
  def maximize(): Unit /* None */ = gtk_window_maximize(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asks to minimize the specified @window.
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
    */
  def minimize(): Unit /* None */ = gtk_window_minimize(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Presents a window to the user.
    *
    * This may mean raising the window in the stacking order, unminimizing it,
    * moving it to the current desktop and/or giving it the keyboard focus
    * (possibly dependent on the user’s platform, window manager and
    * preferences).
    *
    * If @window is hidden, this function also makes it visible.
    */
  def present(): Unit /* None */ = gtk_window_present(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Presents a window to the user in response to an user interaction.
    *
    * See [method@Gtk.Window.present] for more details.
    *
    * The timestamp should be gathered when the window was requested to be shown
    * (when clicking a link for example), rather than once the window is ready
    * to be shown.
    */
  def presentWithTime(
      timestamp: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  ): Unit /* None */ = gtk_window_present_with_time(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    guint32(timestamp)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets or unsets the `GtkApplication` associated with the window.
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
    */
  def setApplication(
      application: Option[Application /* Some(Ptr[GtkApplication]) */ ]
  ): Unit /* None */ = gtk_window_set_application(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    application
      .map[Ptr[GtkApplication]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkApplication]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the child widget of @window.
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_window_set_child(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the window should be decorated.
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
    */
  def setDecorated(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_window_set_decorated(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the default size of a window.
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
    */
  def setDefaultSize(
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  ): Unit /* None */ = gtk_window_set_default_size(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    width,
    height
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the default widget.
    *
    * The default widget is the widget that is activated when the user presses
    * Enter in a dialog (for example).
    */
  def setDefaultWidget(
      default_widget: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_window_set_default_widget(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    default_widget
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the window should be deletable.
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
    */
  def setDeletable(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_window_set_deletable(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @setting is %TRUE, then destroying the transient parent of @window will
    * also destroy @window itself.
    *
    * This is useful for dialogs that shouldn’t persist beyond the lifetime of
    * the main window they are associated with, for example.
    */
  def setDestroyWithParent(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_window_set_destroy_with_parent(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GdkDisplay` where the @window is displayed.
    *
    * If the window is already mapped, it will be unmapped, and then remapped on
    * the new display.
    */
  def setDisplay(
      display: Display /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDisplay]) */
  ): Unit /* None */ = gtk_window_set_display(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    display.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the focus widget.
    *
    * If @focus is not the current focus widget, and is focusable, sets it as
    * the focus widget for the window. If @focus is %NULL, unsets the focus
    * widget for this window. To set the focus to a particular widget in the
    * toplevel, it is usually more convenient to use
    * [method@Gtk.Widget.grab_focus] instead of this function.
    */
  def setFocus(
      focus: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_window_set_focus(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    focus
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether “focus rectangles” are supposed to be visible.
    *
    * This property is maintained by GTK based on user input, and should not be
    * set by applications.
    */
  def setFocusVisible(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_window_set_focus_visible(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether this window should react to F10 key presses by activating a
    * menubar it contains.
    */
  def setHandleMenubarAccel(
      handle_menubar_accel: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_window_set_handle_menubar_accel(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    gboolean(gint((if handle_menubar_accel == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @setting is %TRUE, then clicking the close button on the window will
    * not destroy it, but only hide it.
    */
  def setHideOnClose(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_window_set_hide_on_close(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the icon for the window from a named themed icon.
    *
    * See the docs for [class@Gtk.IconTheme] for more details. On some
    * platforms, the window icon is not used at all.
    *
    * Note that this has nothing to do with the WM_ICON_NAME property which is
    * mentioned in the ICCCM.
    */
  def setIconName(
      name: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_window_set_icon_name(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    name
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether mnemonics are supposed to be visible.
    *
    * This property is maintained by GTK based on user input, and should not be
    * set by applications.
    */
  def setMnemonicsVisible(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_window_set_mnemonics_visible(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a window modal or non-modal.
    *
    * Modal windows prevent interaction with other windows in the same
    * application. To keep modal dialogs on top of main application windows, use
    * [method@Gtk.Window.set_transient_for] to make the dialog transient for the
    * parent; most window managers will then disallow lowering the dialog below
    * the parent.
    */
  def setModal(
      modal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_window_set_modal(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    gboolean(gint((if modal == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the user can resize a window.
    *
    * Windows are user resizable by default.
    */
  def setResizable(
      resizable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_window_set_resizable(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    gboolean(gint((if resizable == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the startup notification ID.
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
    */
  def setStartupId(
      startup_id: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_window_set_startup_id(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    __sn_extract_string(startup_id)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the title of the `GtkWindow`.
    *
    * The title of a window will be displayed in its title bar; on the X Window
    * System, the title bar is rendered by the window manager so exactly how the
    * title appears to users may vary according to a user’s exact configuration.
    * The title should help a user distinguish this window from other windows
    * they may have open. A good title might include the application name and
    * current document filename, for example.
    *
    * Passing %NULL does the same as setting the title to an empty string.
    */
  def setTitle(
      title: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_window_set_title(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    title
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a custom titlebar for @window.
    *
    * A typical widget used here is [class@Gtk.HeaderBar], as it provides
    * various features expected of a titlebar while allowing the addition of
    * child widgets to it.
    *
    * If you set a custom titlebar, GTK will do its best to convince the window
    * manager not to put its own titlebar on the window. Depending on the
    * system, this function may not work for a window that is already visible,
    * so you set the titlebar before calling [method@Gtk.Widget.show].
    */
  def setTitlebar(
      titlebar: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_window_set_titlebar(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    titlebar
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Dialog windows should be set transient for the main application window
    * they were spawned from. This allows window managers to e.g. keep the
    * dialog on top of the main window, or center the dialog over the main
    * window. [ctor@Gtk.Dialog.new_with_buttons] and other convenience functions
    * in GTK will sometimes call gtk_window_set_transient_for() on your behalf.
    *
    * Passing %NULL for @parent unsets the current transient window.
    *
    * On Windows, this function puts the child window on top of the parent, much
    * as the window manager would have done on X.
    */
  def setTransientFor(
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ]
  ): Unit /* None */ = gtk_window_set_transient_for(
    this.raw.asInstanceOf[Ptr[GtkWindow]],
    parent
      .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWindow]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asks to remove the fullscreen state for @window, and return to its
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
    */
  def unfullscreen(): Unit /* None */ = gtk_window_unfullscreen(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asks to unmaximize @window.
    *
    * Note that you shouldn’t assume the window is definitely unmaximized
    * afterward, because other entities (e.g. the user or window manager)
    * maximize it again, and not all window managers honor requests to
    * unmaximize.
    *
    * You can track the result of this operation via the
    * [property@Gdk.Toplevel:state] property, or by listening to notifications
    * on the [property@Gtk.Window:maximized] property.
    */
  def unmaximize(): Unit /* None */ = gtk_window_unmaximize(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asks to unminimize the specified @window.
    *
    * Note that you shouldn’t assume the window is definitely unminimized
    * afterward, because the windowing system might not support this
    * functionality; other entities (e.g. the user or the window manager) could
    * minimize it again, or there may not be a window manager in which case
    * minimization isn’t possible, etc.
    *
    * You can track result of this operation via the
    * [property@Gdk.Toplevel:state] property.
    */
  def unminimize(): Unit /* None */ = gtk_window_unminimize(
    this.raw.asInstanceOf[Ptr[GtkWindow]]
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

object Window:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkWindow`.
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
    */
  def apply(): Window = new Window(gtk_window_new().asInstanceOf)
end Window
