package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AppInfo
import sn.gnome.gio.internal.GAppLaunchContext
import sn.gnome.glib.internal.GList
import sn.gnome.gobject.fluent.Object

class AppLaunchContext(raw: Ptr[GAppLaunchContext])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getDisplay(info: AppInfo, files: Ptr[GList])(using Zone): String =
    fromCString(
      g_app_launch_context_get_display(
        this.raw.asInstanceOf,
        info.getUnsafeRawPointer().asInstanceOf,
        files
      ).asInstanceOf
    )

  def getStartupNotifyId(info: AppInfo, files: Ptr[GList])(using Zone): String =
    fromCString(
      g_app_launch_context_get_startup_notify_id(
        this.raw.asInstanceOf,
        info.getUnsafeRawPointer().asInstanceOf,
        files
      ).asInstanceOf
    )

  def launchFailed(startup_notify_id: String | CString)(using Zone): Unit =
    g_app_launch_context_launch_failed(
      this.raw.asInstanceOf,
      __sn_extract_string(startup_notify_id)
    )

  def setenv(variable: String | CString, value: String | CString)(using
      Zone
  ): Unit = g_app_launch_context_setenv(
    this.raw.asInstanceOf,
    __sn_extract_string(variable),
    __sn_extract_string(value)
  )

  def unsetenv(variable: String | CString)(using Zone): Unit =
    g_app_launch_context_unsetenv(
      this.raw.asInstanceOf,
      __sn_extract_string(variable)
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

object AppLaunchContext:
  def apply(): AppLaunchContext = new AppLaunchContext(
    g_app_launch_context_new().asInstanceOf
  )
end AppLaunchContext
