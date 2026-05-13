package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.{
  AppLaunchContext,
  Clipboard,
  Device,
  Display,
  Event,
  GLContext,
  Monitor,
  Seat,
  Surface
}
import sn.gnome.gdk4.internal.{GdkDisplay, GdkSeat}
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** `GdkDisplay` objects are the GDK representation of a workstation.
  *
  * Their purpose are two-fold:
  *
  *   - To manage and provide information about input devices (pointers,
  *     keyboards, etc)
  *   - To manage and provide information about output devices (monitors,
  *     projectors, etc)
  *
  * Most of the input device handling has been factored out into separate
  * [class@Gdk.Seat] objects. Every display has a one or more seats, which can
  * be accessed with [method@Gdk.Display.get_default_seat] and
  * [method@Gdk.Display.list_seats].
  *
  * Output devices are represented by [class@Gdk.Monitor] objects, which can be
  * accessed with [method@Gdk.Display.get_monitor_at_surface] and similar APIs.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Display private[gnome] (raw: Ptr[GdkDisplay])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Emits a short beep on @display
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def beep(): Unit /* None */ =
    gdk_display_beep(this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplay]])
  end beep

  /** Closes the connection to the windowing system for the given display.
    *
    * This cleans up associated resources.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def close(): Unit /* None */ =
    gdk_display_close(this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplay]])
  end close

  /** Creates a new `GdkGLContext` for the `GdkDisplay`.
    *
    * The context is disconnected from any particular surface or surface and
    * cannot be used to draw to any surface. It can only be used to draw to
    * non-surface framebuffers like textures.
    *
    * If the creation of the `GdkGLContext` failed, @error will be set. Before
    * using the returned `GdkGLContext`, you will need to call
    * [method@Gdk.GLContext.make_current] or [method@Gdk.GLContext.realize].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def createGlContext()(using
      Runtime
  ): GResult[sn.gnome.gdk4.fluent.GLContext /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gdk4.fluent.GLContext.applyUnsafe(
        gdk_display_create_gl_context(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplay]],
          __errorPtr
        ).asInstanceOf
      )
    )
  end createGlContext

  /** Returns %TRUE if there is an ongoing grab on @device for @display.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def deviceIsGrabbed(
      device: sn.gnome.gdk4.fluent.Device /* Some(Ptr[GdkDevice]) */
  )(using Runtime): Boolean /* None */ =
    gdk_display_device_is_grabbed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplay]],
      device.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end deviceIsGrabbed

  /** Flushes any requests queued for the windowing system.
    *
    * This happens automatically when the main loop blocks waiting for new
    * events, but if your application is drawing without returning control to
    * the main loop, you may need to call this function explicitly. A common
    * case where this function needs to be called is when an application is
    * executing drawing commands from a thread other than the thread where the
    * main loop is running.
    *
    * This is most useful for X11. On windowing systems where requests are
    * handled synchronously, this function will do nothing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flush(): Unit /* None */ =
    gdk_display_flush(this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplay]])
  end flush

  /** Returns a `GdkAppLaunchContext` suitable for launching applications on the
    * given display.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAppLaunchContext()(using
      Runtime
  ): sn.gnome.gdk4.fluent.AppLaunchContext /* None */ =
    sn.gnome.gdk4.fluent.AppLaunchContext.applyUnsafe(
      gdk_display_get_app_launch_context(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplay]]
      ).asInstanceOf
    )
  end getAppLaunchContext

  /** Gets the clipboard used for copy/paste operations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getClipboard()(using Runtime): sn.gnome.gdk4.fluent.Clipboard /* None */ =
    sn.gnome.gdk4.fluent.Clipboard.applyUnsafe(
      gdk_display_get_clipboard(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplay]]
      ).asInstanceOf
    )
  end getClipboard

  /** Returns the default `GdkSeat` for this display.
    *
    * Note that a display may not have a seat. In this case, this function will
    * return %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefaultSeat()(using Runtime): sn.gnome.gdk4.fluent.Seat /* None */ =
    sn.gnome.gdk4.fluent.Seat.applyUnsafe(
      gdk_display_get_default_seat(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplay]]
      ).asInstanceOf
    )
  end getDefaultSeat

  /** Gets the monitor in which the largest area of @surface resides.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMonitorAtSurface(
      surface: sn.gnome.gdk4.fluent.Surface /* Some(Ptr[GdkSurface]) */
  )(using Runtime): sn.gnome.gdk4.fluent.Monitor /* None */ =
    sn.gnome.gdk4.fluent.Monitor.applyUnsafe(
      gdk_display_get_monitor_at_surface(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplay]],
        surface.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end getMonitorAtSurface

  /** Gets the list of monitors associated with this display.
    *
    * Subsequent calls to this function will always return the same list for the
    * same display.
    *
    * You can listen to the GListModel::items-changed signal on this list to
    * monitor changes to the monitor of this display.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMonitors(): ListModel /* None */ =
    new ListModel.Abstract(
      gdk_display_get_monitors(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplay]]
      ).asInstanceOf
    )
  end getMonitors

  /** Gets the name of the display.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName()(using Zone): String /* None */ =
    fromCString(
      gdk_display_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplay]]
      ).asInstanceOf
    )
  end getName

  /** Gets the clipboard used for the primary selection.
    *
    * On backends where the primary clipboard is not supported natively, GDK
    * emulates this clipboard locally.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPrimaryClipboard()(using
      Runtime
  ): sn.gnome.gdk4.fluent.Clipboard /* None */ =
    sn.gnome.gdk4.fluent.Clipboard.applyUnsafe(
      gdk_display_get_primary_clipboard(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplay]]
      ).asInstanceOf
    )
  end getPrimaryClipboard

  /** Retrieves a desktop-wide setting such as double-click time for the @display.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_setting/<method parameters>/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(GValue*)))"
  )
  private def getSetting__ = ???

  /** Gets the startup notification ID for a Wayland display, or %NULL if no ID
    * has been defined.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStartupNotificationId()(using Zone): String /* None */ =
    fromCString(
      gdk_display_get_startup_notification_id(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplay]]
      ).asInstanceOf
    )
  end getStartupNotificationId

  /** Finds out if the display has been closed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isClosed(): Boolean /* None */ =
    gdk_display_is_closed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplay]]
    ).value.!=(0)
  end isClosed

  /** Returns whether surfaces can reasonably be expected to have their alpha
    * channel drawn correctly on the screen.
    *
    * Check [method@Gdk.Display.is_rgba] for whether the display supports an
    * alpha channel.
    *
    * On X11 this function returns whether a compositing manager is compositing
    * on @display.
    *
    * On modern displays, this value is always %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isComposited(): Boolean /* None */ =
    gdk_display_is_composited(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplay]]
    ).value.!=(0)
  end isComposited

  /** Returns whether surfaces on this @display are created with an alpha
    * channel.
    *
    * Even if a %TRUE is returned, it is possible that the surface’s alpha
    * channel won’t be honored when displaying the surface on the screen: in
    * particular, for X an appropriate windowing manager and compositing manager
    * must be running to provide appropriate display. Use
    * [method@Gdk.Display.is_composited] to check if that is the case.
    *
    * On modern displays, this value is always %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isRgba(): Boolean /* None */ =
    gdk_display_is_rgba(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplay]]
    ).value.!=(0)
  end isRgba

  /** Returns the list of seats known to @display.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method list_seats/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Seat))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def listSeats__ = ???

  /** Returns the keyvals bound to @keycode.
    *
    * The Nth `GdkKeymapKey` in @keys is bound to the Nth keyval in @keyvals.
    *
    * When a keycode is pressed by the user, the keyval from this list of
    * entries is selected by considering the effective keyboard group and level.
    *
    * Free the returned arrays with g_free().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method map_keycode]: Method map_keycode contains an OUT parameter, which is not supported yet"
  )
  private def mapKeycode__ = ???

  /** Obtains a list of keycode/group/level combinations that will generate @keyval.
    *
    * Groups and levels are two kinds of keyboard mode; in general, the level
    * determines whether the top or bottom symbol on a key is used, and the
    * group determines whether the left or right symbol is used.
    *
    * On US keyboards, the shift key changes the keyboard level, and there are
    * no groups. A group switch key might convert a keyboard between Hebrew to
    * English modes, for example.
    *
    * `GdkEventKey` contains a %group field that indicates the active keyboard
    * group. The level is computed from the modifier mask.
    *
    * The returned array should be freed with g_free().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method map_keyval]: Method map_keyval contains an OUT parameter, which is not supported yet"
  )
  private def mapKeyval__ = ???

  /** Indicates to the GUI environment that the application has finished
    * loading, using a given identifier.
    *
    * GTK will call this function automatically for [class@Gtk.Window] with
    * custom startup-notification identifier unless
    * [method@Gtk.Window.set_auto_startup_notification] is called to disable
    * that feature.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def notifyStartupComplete(
      startup_id: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gdk_display_notify_startup_complete(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplay]],
      toCString(startup_id)
    )
  end notifyStartupComplete

  /** Checks that OpenGL is available for @self and ensures that it is properly
    * initialized. When this fails, an @error will be set describing the error
    * and this function returns %FALSE.
    *
    * Note that even if this function succeeds, creating a `GdkGLContext` may
    * still fail.
    *
    * This function is idempotent. Calling it multiple times will just return
    * the same value or error.
    *
    * You never need to call this function, GDK will call it automatically as
    * needed. But you can use it as a check when setting up code that might make
    * use of OpenGL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prepareGl(): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      gdk_display_prepare_gl(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplay]],
        __errorPtr
      ).value.!=(0)
    )
  end prepareGl

  /** Adds the given event to the event queue for @display.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def putEvent(
      event: sn.gnome.gdk4.fluent.Event /* Some(Ptr[GdkEvent]) */
  )(using Runtime): Unit /* None */ =
    gdk_display_put_event(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplay]],
      event.getUnsafeRawPointer().asInstanceOf
    )
  end putEvent

  /** Returns %TRUE if the display supports input shapes.
    *
    * This means that [method@Gdk.Surface.set_input_region] can be used to
    * modify the input shape of surfaces on @display.
    *
    * On modern displays, this value is always %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def supportsInputShapes(): Boolean /* None */ =
    gdk_display_supports_input_shapes(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplay]]
    ).value.!=(0)
  end supportsInputShapes

  /** Flushes any requests queued for the windowing system and waits until all
    * requests have been handled.
    *
    * This is often used for making sure that the display is synchronized with
    * the current state of the program. Calling [method@Gdk.Display.sync] before
    * [method@GdkX11.Display.error_trap_pop] makes sure that any errors
    * generated from earlier requests are handled before the error trap is
    * removed.
    *
    * This is most useful for X11. On windowing systems where requests are
    * handled synchronously, this function will do nothing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sync(): Unit /* None */ =
    gdk_display_sync(this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDisplay]])
  end sync

  /** Translates the contents of a `GdkEventKey` into a keyval, effective group,
    * and level.
    *
    * Modifiers that affected the translation and are thus unavailable for
    * application use are returned in @consumed_modifiers.
    *
    * The @effective_group is the group that was actually used for the
    * translation; some keys such as Enter are not affected by the active
    * keyboard group. The @level is derived from @state.
    *
    * @consumed_modifiers
    *   gives modifiers that should be masked out from @state when comparing
    *   this key press to a keyboard shortcut. For instance, on a US keyboard,
    *   the `plus` symbol is shifted, so when comparing a key press to a
    *   `<Control>plus` accelerator `<Shift>` should be masked out.
    *
    * This function should rarely be needed, since `GdkEventKey` already
    * contains the translated keyval. It is exported for the benefit of
    * virtualized test environments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method translate_key]: Method translate_key contains an OUT parameter, which is not supported yet"
  )
  private def translateKey__ = ???

  /** Emitted when the connection to the windowing system for @display is
    * closed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onClosed(handler: ((isError: Boolean)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (isError: Boolean), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GdkDisplay],
          isError: Boolean /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((isError = isError))
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
    val signal = c"closed"
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
  end onClosed

  /** Emitted when the connection to the windowing system for @display is
    * opened.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onOpened(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GdkDisplay],
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
    val signal = c"opened"
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
  end onOpened

  /** Emitted whenever a new seat is made known to the windowing system.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onSeatAdded(handler: ((seat: Seat)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (seat: Seat), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GdkDisplay],
          seat: Ptr[GdkSeat] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((seat = sr.runtime.get[Seat](seat.asInstanceOf[Ptr[Byte]])))
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
    val signal = c"seat-added"
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
  end onSeatAdded

  /** Emitted whenever a seat is removed by the windowing system.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onSeatRemoved(handler: ((seat: Seat)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (seat: Seat), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GdkDisplay],
          seat: Ptr[GdkSeat] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((seat = sr.runtime.get[Seat](seat.asInstanceOf[Ptr[Byte]])))
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
    val signal = c"seat-removed"
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
  end onSeatRemoved

  /** Emitted whenever a setting changes its value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onSettingChanged(handler: ((setting: String)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (setting: String), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GdkDisplay],
          setting: CString /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((setting = fromCString(setting)))
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
    val signal = c"setting-changed"
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
  end onSettingChanged
end Display

object Display:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkDisplay])(using Runtime) = summon[Runtime]
    .getOrCreate[Display](ptr.asInstanceOf[Ptr[Byte]], p => new Display(ptr))

  /** Gets the default `GdkDisplay`.
    *
    * This is a convenience function for:
    *
    * gdk_display_manager_get_default_display (gdk_display_manager_get ())
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefault()(using
      Runtime
  ): sn.gnome.gdk4.fluent.Display /* Some(Ptr[GdkDisplay]) */ =
    sn.gnome.gdk4.fluent.Display
      .applyUnsafe(gdk_display_get_default().asInstanceOf)

  /** Opens a display.
    *
    * If opening the display fails, `NULL` is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def open(display_name: Option[String /* Some(CString) */ ])(using
      Zone,
      Runtime
  ): sn.gnome.gdk4.fluent.Display /* Some(Ptr[GdkDisplay]) */ =
    sn.gnome.gdk4.fluent.Display.applyUnsafe(
      gdk_display_open(
        display_name
          .map[CString](o => toCString(o))
          .getOrElse(null.asInstanceOf[CString])
      ).asInstanceOf
    )

end Display
