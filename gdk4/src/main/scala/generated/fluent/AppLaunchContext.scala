package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.internal.GdkAppLaunchContext
import sn.gnome.gio.fluent.Icon
import sn.gnome.glib.internal.guint32
import sn.gnome.gio.fluent.AppLaunchContext as _AppLaunchContext

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GdkAppLaunchContext` handles launching an application in a graphical
  * context.
  *
  * It is an implementation of `GAppLaunchContext` that provides startup
  * notification and allows to launch applications on a specific workspace.
  *
  * ## Launching an application
  *
  * ```c
  * GdkAppLaunchContext *context;
  *
  * context = gdk_display_get_app_launch_context (display);
  *
  * gdk_app_launch_context_set_timestamp (gdk_event_get_time (event));
  *
  * if (!g_app_info_launch_default_for_uri ("http://www.gtk.org", context, &error))
  *   g_warning ("Launching failed: %s\n", error->message);
  *
  * g_object_unref (context);
  * ```
  */
class AppLaunchContext(raw: Ptr[GdkAppLaunchContext])
    extends _AppLaunchContext(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GdkDisplay` that @context is for.
    */
  def getDisplay(): Display = new Display(
    gdk_app_launch_context_get_display(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the workspace on which applications will be launched.
    *
    * This only works when running under a window manager that supports multiple
    * workspaces, as described in the [Extended Window Manager
    * Hints](http://www.freedesktop.org/Standards/wm-spec). Specifically this
    * sets the `_NET_WM_DESKTOP` property described in that spec.
    *
    * This only works when using the X11 backend.
    *
    * When the workspace is not specified or @desktop is set to -1, it is up to
    * the window manager to pick one, typically it will be the current
    * workspace.
    */
  def setDesktop(desktop: Int): Unit =
    gdk_app_launch_context_set_desktop(this.raw.asInstanceOf, desktop)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the icon for applications that are launched with this context.
    *
    * Window Managers can use this information when displaying startup
    * notification.
    *
    * See also [method@Gdk.AppLaunchContext.set_icon_name].
    */
  def setIcon(icon: Icon): Unit = gdk_app_launch_context_set_icon(
    this.raw.asInstanceOf,
    icon.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the icon for applications that are launched with this context.
    *
    * The @icon_name will be interpreted in the same way as the Icon field in
    * desktop files. See also [method@Gdk.AppLaunchContext.set_icon].
    *
    * If both @icon and @icon_name are set, the @icon_name takes priority. If
    * neither @icon or @icon_name is set, the icon is taken from either the file
    * that is passed to launched application or from the `GAppInfo` for the
    * launched application itself.
    */
  def setIconName(icon_name: String | CString)(using Zone): Unit =
    gdk_app_launch_context_set_icon_name(
      this.raw.asInstanceOf,
      __sn_extract_string(icon_name)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the timestamp of @context.
    *
    * The timestamp should ideally be taken from the event that triggered the
    * launch.
    *
    * Window managers can use this information to avoid moving the focus to the
    * newly launched application when the user is busy typing in another window.
    * This is also known as 'focus stealing prevention'.
    */
  def setTimestamp(timestamp: UInt): Unit =
    gdk_app_launch_context_set_timestamp(
      this.raw.asInstanceOf,
      guint32(timestamp)
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end AppLaunchContext
