package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.{ActionGroup, ActionMap, ApplicationFlags, Menu, MenuModel}
import sn.gnome.glib.internal.{gchar, gpointer, guint}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{ApplicationInhibitFlags, Window}
import sn.gnome.gtk4.internal.{GtkApplication, GtkWindow}
import sn.gnome.runtime.*
import sn.gnome.gio.Application as _Application

/** `GtkApplication` is a high-level API for writing applications.
  *
  * It supports many aspects of writing a GTK application in a convenient
  * fashion, without enforcing a one-size-fits-all model.
  *
  * Currently, `GtkApplication` handles GTK initialization, application
  * uniqueness, session management, provides some basic scriptability and
  * desktop shell integration by exporting actions and menus and manages a list
  * of toplevel windows whose life-cycle is automatically tied to the life-cycle
  * of your application.
  *
  * While `GtkApplication` works fine with plain [class@Gtk.Window]s, it is
  * recommended to use it together with [class@Gtk.ApplicationWindow].
  *
  * ## Automatic resources
  *
  * `GtkApplication` will automatically load menus from the `GtkBuilder`
  * resource located at "gtk/menus.ui", relative to the application's resource
  * base path (see [method@Gio.Application.set_resource_base_path]). The menu
  * with the ID "menubar" is taken as the application's menubar. Additional
  * menus (most interesting submenus) can be named and accessed via
  * [method@Gtk.Application.get_menu_by_id] which allows for dynamic population
  * of a part of the menu structure.
  *
  * Note that automatic resource loading uses the resource base path that is set
  * at construction time and will not work if the resource base path is changed
  * at a later time.
  *
  * It is also possible to provide the menubar manually using
  * [method@Gtk.Application.set_menubar].
  *
  * `GtkApplication` will also automatically setup an icon search path for the
  * default icon theme by appending "icons" to the resource base path. This
  * allows your application to easily store its icons as resources. See
  * [method@Gtk.IconTheme.add_resource_path] for more information.
  *
  * If there is a resource located at `gtk/help-overlay.ui` which defines a
  * [class@Gtk.ShortcutsWindow] with ID `help_overlay` then `GtkApplication`
  * associates an instance of this shortcuts window with each
  * [class@Gtk.ApplicationWindow] and sets up the keyboard accelerator
  * <kbd>Control</kbd>+<kbd>?</kbd> to open it. To create a menu item that
  * displays the shortcuts window, associate the item with the action
  * `win.show-help-overlay`.
  *
  * ## A simple application
  *
  * [A simple
  * example](https://gitlab.gnome.org/GNOME/gtk/tree/main/examples/bp/bloatpad.c)
  * is available in the GTK source code repository
  *
  * `GtkApplication` optionally registers with a session manager of the users
  * session (if you set the [property@Gtk.Application:register-session]
  * property) and offers various functionality related to the session
  * life-cycle.
  *
  * An application can block various ways to end the session with the
  * [method@Gtk.Application.inhibit] function. Typical use cases for this kind
  * of inhibiting are long-running, uninterruptible operations, such as burning
  * a CD or performing a disk backup. The session manager may not honor the
  * inhibitor, but it can be expected to inform the user about the negative
  * consequences of ending the session while inhibitors are present.
  *
  * ## See Also
  *
  * [HowDoI: Using
  * GtkApplication](https://wiki.gnome.org/HowDoI/GtkApplication), [Getting
  * Started with GTK: Basics](getting_started.html#basics)
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Application private[gnome] (raw: Ptr[GtkApplication])
    extends _Application(raw.asInstanceOf),
      ActionGroup,
      ActionMap:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a window to `application`.
    *
    * This call can only happen after the `application` has started; typically,
    * you should add new application windows in response to the emission of the
    * `GApplication::activate` signal.
    *
    * This call is equivalent to setting the [property@Gtk.Window:application]
    * property of `window` to `application`.
    *
    * Normally, the connection between the application and the window will
    * remain until the window is destroyed, but you can explicitly remove it
    * with [method@Gtk.Application.remove_window].
    *
    * GTK will keep the `application` running as long as it has any windows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addWindow(
      window: sn.gnome.gtk4.Window /* Some(Ptr[GtkWindow]) */
  )(using Runtime): Unit /* None */ =
    gtk_application_add_window(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkApplication]],
      window.getUnsafeRawPointer().asInstanceOf
    )
  end addWindow

  /** Gets the accelerators that are currently associated with the given action.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAccelsForAction(
      detailed_action_name: String /* Some(CString) */
  )(using Runtime): Array[String] /* None */ =
    MemoryRead
      .nullTerminatedPointerArray(
        gtk_application_get_accels_for_action(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkApplication]],
          summon[Runtime].inZone(toCString(detailed_action_name))
        )
      )
      .map(fromCString(_))
  end getAccelsForAction

  /** Returns the list of actions (possibly empty) that `accel` maps to.
    *
    * Each item in the list is a detailed action name in the usual form.
    *
    * This might be useful to discover if an accel already exists in order to
    * prevent installation of a conflicting accelerator (from an accelerator
    * editor or a plugin system, for example). Note that having more than one
    * action per accelerator may not be a bad thing and might make sense in
    * cases where the actions never appear in the same context.
    *
    * In case there are no actions for a given accelerator, an empty array is
    * returned. `NULL` is never returned.
    *
    * It is a programmer error to pass an invalid accelerator string.
    *
    * If you are unsure, check it with [func@Gtk.accelerator_parse] first.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActionsForAccel(
      accel: String /* Some(CString) */
  )(using Runtime): Array[String] /* None */ =
    MemoryRead
      .nullTerminatedPointerArray(
        gtk_application_get_actions_for_accel(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkApplication]],
          summon[Runtime].inZone(toCString(accel))
        )
      )
      .map(fromCString(_))
  end getActionsForAccel

  /** Gets the “active” window for the application.
    *
    * The active window is the one that was most recently focused (within the
    * application). This window may not have the focus at the moment if another
    * application has it — this is just the most recently-focused window within
    * this application.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActiveWindow()(using Runtime): sn.gnome.gtk4.Window /* None */ =
    sn.gnome.gtk4.Window.applyUnsafe(
      gtk_application_get_active_window(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkApplication]]
      ).asInstanceOf
    )
  end getActiveWindow

  /** Gets a menu from automatically loaded resources.
    *
    * See [the section on Automatic
    * resources](class.Application.html#automatic-resources) for more
    * information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMenuById(
      id: String /* Some(CString) */
  )(using Runtime): sn.gnome.gio.Menu /* None */ =
    sn.gnome.gio.Menu.applyUnsafe(
      gtk_application_get_menu_by_id(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkApplication]],
        summon[Runtime].inZone(toCString(id))
      ).asInstanceOf
    )
  end getMenuById

  /** Returns the menu model that has been set with
    * [method@Gtk.Application.set_menubar].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMenubar()(using Runtime): sn.gnome.gio.MenuModel /* None */ =
    sn.gnome.gio.MenuModel.applyUnsafe(
      gtk_application_get_menubar(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkApplication]]
      ).asInstanceOf
    )
  end getMenubar

  /** Returns the [class@Gtk.ApplicationWindow] with the given ID.
    *
    * The ID of a `GtkApplicationWindow` can be retrieved with
    * [method@Gtk.ApplicationWindow.get_id].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWindowById(
      id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Runtime): sn.gnome.gtk4.Window /* None */ =
    sn.gnome.gtk4.Window.applyUnsafe(
      gtk_application_get_window_by_id(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkApplication]],
        guint(id)
      ).asInstanceOf
    )
  end getWindowById

  /** Gets a list of the [class@Gtk.Window] instances associated with
    * `application`.
    *
    * The list is sorted by most recently focused window, such that the first
    * element is the currently focused window. (Useful for choosing a parent for
    * a transient window.)
    *
    * The list that is returned should not be modified in any way. It will only
    * remain valid until the next focus change or window creation or deletion.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_windows/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Window))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def getWindows__ = ???

  /** Inform the session manager that certain types of actions should be
    * inhibited.
    *
    * This is not guaranteed to work on all platforms and for all types of
    * actions.
    *
    * Applications should invoke this method when they begin an operation that
    * should not be interrupted, such as creating a CD or DVD. The types of
    * actions that may be blocked are specified by the `flags` parameter. When
    * the application completes the operation it should call
    * [method@Gtk.Application.uninhibit] to remove the inhibitor. Note that an
    * application can have multiple inhibitors, and all of them must be
    * individually removed. Inhibitors are also cleared when the application
    * exits.
    *
    * Applications should not expect that they will always be able to block the
    * action. In most cases, users will be given the option to force the action
    * to take place.
    *
    * The `reason` message should be short and to the point.
    *
    * If `window` is given, the session manager may point the user to this
    * window to find out more about why the action is inhibited.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def inhibit(
      window: Option[sn.gnome.gtk4.Window /* Some(Ptr[GtkWindow]) */ ],
      flags: ApplicationInhibitFlags /* Some(GtkApplicationInhibitFlags) */,
      reason: Option[String /* Some(CString) */ ]
  )(using Runtime): UInt /* None */ =
    gtk_application_inhibit(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkApplication]],
      window
        .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
      flags.raw,
      reason
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    ).value
  end inhibit

  /** Lists the detailed action names which have associated accelerators.
    *
    * See [method@Gtk.Application.set_accels_for_action].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def listActionDescriptions()(using Runtime): Array[String] /* None */ =
    MemoryRead
      .nullTerminatedPointerArray(
        gtk_application_list_action_descriptions(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkApplication]]
        )
      )
      .map(fromCString(_))
  end listActionDescriptions

  /** Remove a window from `application`.
    *
    * If `window` belongs to `application` then this call is equivalent to
    * setting the [property@Gtk.Window:application] property of `window` to
    * `NULL`.
    *
    * The application may stop running as a result of a call to this function,
    * if `window` was the last window of the `application`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeWindow(
      window: sn.gnome.gtk4.Window /* Some(Ptr[GtkWindow]) */
  )(using Runtime): Unit /* None */ =
    gtk_application_remove_window(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkApplication]],
      window.getUnsafeRawPointer().asInstanceOf
    )
  end removeWindow

  /** Sets zero or more keyboard accelerators that will trigger the given
    * action.
    *
    * The first item in `accels` will be the primary accelerator, which may be
    * displayed in the UI.
    *
    * To remove all accelerators for an action, use an empty, zero-terminated
    * array for `accels`.
    *
    * For the `detailed_action_name`, see `g_action_parse_detailed_name()` and
    * `g_action_print_detailed_name()`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_accels_for_action/<method parameters>/accels]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(char*)))),ListMap(@type -> DataRecord(const char* const*)))"
  )
  private def setAccelsForAction__ = ???

  /** Sets or unsets the menubar for windows of `application`.
    *
    * This is a menubar in the traditional sense.
    *
    * This can only be done in the primary instance of the application, after it
    * has been registered. `GApplication::startup` is a good place to call this.
    *
    * Depending on the desktop environment, this may appear at the top of each
    * window, or at the top of the screen. In some environments, if both the
    * application menu and the menubar are set, the application menu will be
    * presented as if it were the first item of the menubar. Other environments
    * treat the two as completely separate — for example, the application menu
    * may be rendered by the desktop shell while the menubar (if set) remains in
    * each individual window.
    *
    * Use the base `GActionMap` interface to add actions, to respond to the user
    * selecting these menu items.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMenubar(
      menubar: Option[
        sn.gnome.gio.MenuModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GMenuModel]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_application_set_menubar(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkApplication]],
      menubar
        .map[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]]
        )
    )
  end setMenubar

  /** Removes an inhibitor that has been previously established.
    *
    * See [method@Gtk.Application.inhibit].
    *
    * Inhibitors are also cleared when the application exits.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def uninhibit(
      cookie: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_application_uninhibit(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkApplication]],
      guint(cookie)
    )
  end uninhibit

  /** Emitted when the session manager is about to end the session.
    *
    * This signal is only emitted if [property@Gtk.Application:register-session]
    * is `TRUE`. Applications can connect to this signal and call
    * [method@Gtk.Application.inhibit] with `GTK_APPLICATION_INHIBIT_LOGOUT` to
    * delay the end of the session until state has been saved.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onQueryEnd(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkApplication],
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
    val signal = c"query-end"
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
  end onQueryEnd

  /** Emitted when a [class@Gtk.Window] is added to `application` through
    * [method@Gtk.Application.add_window].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onWindowAdded(handler: ((window: Window)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (window: Window), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkApplication],
          window: Ptr[GtkWindow] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (window = sr.runtime.get[Window](window.asInstanceOf[Ptr[Byte]]))
        )
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
    val signal = c"window-added"
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
  end onWindowAdded

  /** Emitted when a [class@Gtk.Window] is removed from `application`.
    *
    * This can happen as a side-effect of the window being destroyed or
    * explicitly through [method@Gtk.Application.remove_window].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onWindowRemoved(handler: ((window: Window)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (window: Window), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkApplication],
          window: Ptr[GtkWindow] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (window = sr.runtime.get[Window](window.asInstanceOf[Ptr[Byte]]))
        )
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
    val signal = c"window-removed"
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
  end onWindowRemoved
end Application

object Application:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkApplication])(using Runtime) =
    summon[Runtime].getOrCreate[Application](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new Application(ptr)
    )

  /** Creates a new `GtkApplication` instance.
    *
    * When using `GtkApplication`, it is not necessary to call [func@Gtk.init]
    * manually. It is called as soon as the application gets registered as the
    * primary instance.
    *
    * Concretely, [func@Gtk.init] is called in the default handler for the
    * `GApplication::startup` signal. Therefore, `GtkApplication` subclasses
    * should always chain up in their `GApplication::startup` handler before
    * using any GTK API.
    *
    * Note that commandline arguments are not passed to [func@Gtk.init].
    *
    * If `application_id` is not %NULL, then it must be valid. See
    * `g_application_id_is_valid()`.
    *
    * If no application ID is given then some features (most notably application
    * uniqueness) will be disabled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      application_id: Option[String /* Some(CString) */ ],
      flags: ApplicationFlags /* Some(_root_.sn.gnome.gio.internal.GApplicationFlags) */
  )(using Runtime): Application =
    val raw: Ptr[Byte] = gtk_application_new(
      application_id
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString]),
      flags.raw
    ).asInstanceOf
    summon[Runtime].getOrCreate[Application](
      raw,
      r => Application.applyUnsafe(r.asInstanceOf)
    )
  end apply
end Application
