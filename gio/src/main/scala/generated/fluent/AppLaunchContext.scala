package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AppInfo
import sn.gnome.gio.internal.GAppLaunchContext
import sn.gnome.glib.internal.GList
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Integrating the launch with the launching application. This is used to
  * handle for instance startup notification and launching the new application
  * on the same screen as the launching window.
  */
class AppLaunchContext(raw: Ptr[GAppLaunchContext])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the display string for the @context. This is used to ensure new
    * applications are started on the same display as the launching application,
    * by setting the `DISPLAY` environment variable.
    */
  def getDisplay(
      info: AppInfo /* Some(Ptr[GAppInfo]) */,
      files: Ptr[GList] /* Some(Ptr[_root_.sn.gnome.glib.internal.GList]) */
  )(using Zone): String /* None */ = fromCString(
    g_app_launch_context_get_display(
      this.raw.asInstanceOf,
      info.getUnsafeRawPointer().asInstanceOf,
      files
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the complete environment variable list to be passed to the child
    * process when @context is used to launch an application. This is a
    * %NULL-terminated array of strings, where each string has the form
    * `KEY=VALUE`.
    */
  def getEnvironment()(using Zone): Array[String] /* None */ =
    __decode_nullable_ptrs(
      g_app_launch_context_get_environment(this.raw.asInstanceOf)
    ).map(fromCString(_))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Initiates startup notification for the application and returns the
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
    */
  def getStartupNotifyId(
      info: AppInfo /* Some(Ptr[GAppInfo]) */,
      files: Ptr[GList] /* Some(Ptr[_root_.sn.gnome.glib.internal.GList]) */
  )(using Zone): String /* None */ = fromCString(
    g_app_launch_context_get_startup_notify_id(
      this.raw.asInstanceOf,
      info.getUnsafeRawPointer().asInstanceOf,
      files
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Called when an application has failed to launch, so that it can cancel the
    * application startup notification started in
    * g_app_launch_context_get_startup_notify_id().
    */
  def launchFailed(
      startup_notify_id: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_app_launch_context_launch_failed(
    this.raw.asInstanceOf,
    __sn_extract_string(startup_notify_id)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Arranges for @variable to be set to @value in the child's environment when @context
    * is used to launch an application.
    */
  def setenv(
      variable: String | CString /* Some(CString) */,
      value: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_app_launch_context_setenv(
    this.raw.asInstanceOf,
    __sn_extract_string(variable),
    __sn_extract_string(value)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Arranges for @variable to be unset in the child's environment when @context
    * is used to launch an application.
    */
  def unsetenv(
      variable: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = g_app_launch_context_unsetenv(
    this.raw.asInstanceOf,
    __sn_extract_string(variable)
  )

  private inline def __decode_nullable_ptrs[T](p: Ptr[Ptr[T]])(using
      ptag: Tag[T]
  ): Array[Ptr[T]] =
    val ab = Array.newBuilder[Ptr[T]]
    var offset = 0
    val tg = Tag.materializePtrTag(ptag)
    while p(offset)(using tg) != null do
      ab += p(offset)(using tg)
      offset += 1
    end while
    ab.result()
  end __decode_nullable_ptrs

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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new application launch context. This is not normally used,
    * instead you instantiate a subclass of this, such as #GdkAppLaunchContext.
    */
  def apply(): AppLaunchContext = new AppLaunchContext(
    g_app_launch_context_new().asInstanceOf
  )
end AppLaunchContext
