package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GAppLaunchContext
import sn.gnome.glib.internal.{gchar, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** Integrating the launch with the launching application. This is used to
  * handle for instance startup notification and launching the new application
  * on the same screen as the launching window.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AppLaunchContext(raw: Ptr[GAppLaunchContext])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the display string for the @context. This is used to ensure new
    * applications are started on the same display as the launching application,
    * by setting the `DISPLAY` environment variable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_display/<method parameters>/files]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(File))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def getDisplay__ = ???

  /** Gets the complete environment variable list to be passed to the child
    * process when @context is used to launch an application. This is a
    * %NULL-terminated array of strings, where each string has the form
    * `KEY=VALUE`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEnvironment()(using Zone): Array[String] /* None */ = MemoryRead
    .nullTerminatedPointerArray(
      g_app_launch_context_get_environment(
        this.raw.asInstanceOf[Ptr[GAppLaunchContext]]
      )
    )
    .map(fromCString(_))

  /** Initiates startup notification for the application and returns the
    * `XDG_ACTIVATION_TOKEN` or `DESKTOP_STARTUP_ID` for the launched operation,
    * if supported.
    *
    * The returned token may be referred to equivalently as an ‘activation
    * token’ (using Wayland terminology) or a ‘startup sequence ID’ (using X11
    * terminology). The two [are
    * interoperable](https://gitlab.freedesktop.org/wayland/wayland-protocols/-/blob/main/staging/xdg-activation/x11-interoperation.rst).
    *
    * Activation tokens are defined in the [XDG Activation
    * Protocol](https://wayland.app/protocols/xdg-activation-v1), and startup
    * notification IDs are defined in the [freedesktop.org Startup Notification
    * Protocol](http://standards.freedesktop.org/startup-notification-spec/startup-notification-latest.txt).
    *
    * Support for the XDG Activation Protocol was added in GLib 2.76.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_startup_notify_id/<method parameters>/files]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(File))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def getStartupNotifyId__ = ???

  /** Called when an application has failed to launch, so that it can cancel the
    * application startup notification started in
    * g_app_launch_context_get_startup_notify_id().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def launchFailed(
      startup_notify_id: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_app_launch_context_launch_failed(
    this.raw.asInstanceOf[Ptr[GAppLaunchContext]],
    __sn_extract_string(startup_notify_id)
  )

  /** Arranges for @variable to be set to @value in the child's environment when @context
    * is used to launch an application.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setenv(
      variable: String | CString /* Some(CString) */,
      value: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_app_launch_context_setenv(
    this.raw.asInstanceOf[Ptr[GAppLaunchContext]],
    __sn_extract_string(variable),
    __sn_extract_string(value)
  )

  /** Arranges for @variable to be unset in the child's environment when @context
    * is used to launch an application.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unsetenv(
      variable: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_app_launch_context_unsetenv(
    this.raw.asInstanceOf[Ptr[GAppLaunchContext]],
    __sn_extract_string(variable)
  )

  /** The #GAppLaunchContext::launch-failed signal is emitted when a #GAppInfo
    * launch fails. The startup notification id is provided, so that the
    * launcher can cancel the startup notification.
    *
    * Because a launch operation may involve spawning multiple instances of the
    * target application, you should expect this signal to be emitted multiple
    * times, one for each spawned instance.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onLaunchFailed(handler: ((startupNotifyId: String)) => Unit)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (startupNotifyId: String), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GAppLaunchContext],
          startupNotifyId: CString /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((startupNotifyId = fromCString(startupNotifyId)))
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
    val signal = c"launch-failed"
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
  end onLaunchFailed

  /** The #GAppLaunchContext::launch-started signal is emitted when a #GAppInfo
    * is about to be launched. If non-null the @platform_data is an GVariant
    * dictionary mapping strings to variants (ie `a{sv}`), which contains
    * additional, platform-specific data about this launch. On UNIX, at least
    * the `startup-notification-id` keys will be present.
    *
    * The value of the `startup-notification-id` key (type `s`) is a startup
    * notification ID corresponding to the format from the [startup-notification
    * specification](https://specifications.freedesktop.org/startup-notification-spec/startup-notification-0.1.txt).
    * It allows tracking the progress of the launchee through startup.
    *
    * It is guaranteed that this signal is followed by either a
    * #GAppLaunchContext::launched or #GAppLaunchContext::launch-failed signal.
    *
    * Because a launch operation may involve spawning multiple instances of the
    * target application, you should expect this signal to be emitted multiple
    * times, one for each spawned instance.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal launch-started]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(AppInfo)))"
  )
  private def onLaunchStarted = ???

  /** The #GAppLaunchContext::launched signal is emitted when a #GAppInfo is
    * successfully launched.
    *
    * Because a launch operation may involve spawning multiple instances of the
    * target application, you should expect this signal to be emitted multiple
    * times, one time for each spawned instance.
    *
    * The @platform_data is an GVariant dictionary mapping strings to variants
    * (ie `a{sv}`), which contains additional, platform-specific data about this
    * launch. On UNIX, at least the `pid` and `startup-notification-id` keys
    * will be present.
    *
    * Since 2.72 the `pid` may be 0 if the process id wasn't known (for example
    * if the process was launched via D-Bus). The `pid` may not be set at all in
    * subsequent releases.
    *
    * On Windows, `pid` is guaranteed to be valid only for the duration of the
    * #GAppLaunchContext::launched signal emission; after the signal is emitted,
    * GLib will call g_spawn_close_pid(). If you need to keep the #GPid after
    * the signal has been emitted, then you can duplicate `pid` using
    * `DuplicateHandle()`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal launched]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(AppInfo)))"
  )
  private def onLaunched = ???

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end AppLaunchContext

object AppLaunchContext:
  /** Creates a new application launch context. This is not normally used,
    * instead you instantiate a subclass of this, such as #GdkAppLaunchContext.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): AppLaunchContext =
    val raw: Ptr[Byte] = g_app_launch_context_new().asInstanceOf
    summon[Runtime].getOrCreate[AppLaunchContext](
      raw,
      r => new AppLaunchContext(r.asInstanceOf)
    )
  end apply
end AppLaunchContext
