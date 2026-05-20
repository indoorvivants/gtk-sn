package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.Display
import sn.gnome.gdk4.internal.GdkAppLaunchContext
import sn.gnome.gio.Icon
import sn.gnome.glib.internal.guint32
import sn.gnome.gobject.runtime.*
import sn.gnome.gio.AppLaunchContext as _AppLaunchContext

/** `GdkAppLaunchContext` handles launching an application in a graphical
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AppLaunchContext private[gnome] (raw: Ptr[GdkAppLaunchContext])
    extends _AppLaunchContext(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the `GdkDisplay` that @context is for.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDisplay()(using Runtime): sn.gnome.gdk4.Display /* None */ =
    sn.gnome.gdk4.Display.applyUnsafe(
      gdk_app_launch_context_get_display(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkAppLaunchContext]]
      ).asInstanceOf
    )
  end getDisplay

  /** Sets the workspace on which applications will be launched.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDesktop(desktop: Int /* Some(CInt) */ ): Unit /* None */ =
    gdk_app_launch_context_set_desktop(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkAppLaunchContext]],
      desktop
    )
  end setDesktop

  /** Sets the icon for applications that are launched with this context.
    *
    * Window Managers can use this information when displaying startup
    * notification.
    *
    * See also [method@Gdk.AppLaunchContext.set_icon_name].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIcon(
      icon: Option[
        sn.gnome.gio.Icon /* Some(Ptr[_root_.sn.gnome.gio.internal.GIcon]) */
      ]
  ): Unit /* None */ =
    gdk_app_launch_context_set_icon(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkAppLaunchContext]],
      icon
        .map[Ptr[_root_.sn.gnome.gio.internal.GIcon]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GIcon]])
    )
  end setIcon

  /** Sets the icon for applications that are launched with this context.
    *
    * The @icon_name will be interpreted in the same way as the Icon field in
    * desktop files. See also [method@Gdk.AppLaunchContext.set_icon].
    *
    * If both @icon and @icon_name are set, the @icon_name takes priority. If
    * neither @icon or @icon_name is set, the icon is taken from either the file
    * that is passed to launched application or from the `GAppInfo` for the
    * launched application itself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIconName(icon_name: Option[scala.Predef.String /* Some(CString) */ ])(
      using Runtime
  ): Unit /* None */ =
    gdk_app_launch_context_set_icon_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkAppLaunchContext]],
      icon_name
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setIconName

  /** Sets the timestamp of @context.
    *
    * The timestamp should ideally be taken from the event that triggered the
    * launch.
    *
    * Window managers can use this information to avoid moving the focus to the
    * newly launched application when the user is busy typing in another window.
    * This is also known as 'focus stealing prevention'.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTimestamp(
      timestamp: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  ): Unit /* None */ =
    gdk_app_launch_context_set_timestamp(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkAppLaunchContext]],
      guint32(timestamp)
    )
  end setTimestamp

end AppLaunchContext

object AppLaunchContext:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkAppLaunchContext])(using Runtime) =
    summon[Runtime].getOrCreate[AppLaunchContext](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new AppLaunchContext(ptr)
    )

end AppLaunchContext
