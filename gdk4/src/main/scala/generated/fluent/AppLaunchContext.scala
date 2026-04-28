package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.internal.GdkAppLaunchContext
import sn.gnome.gio.fluent.Icon
import sn.gnome.glib.internal.guint32
import sn.gnome.gio.fluent.AppLaunchContext as _AppLaunchContext

class AppLaunchContext(raw: Ptr[GdkAppLaunchContext])
    extends _AppLaunchContext(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getDisplay(): Display = new Display(
    gdk_app_launch_context_get_display(this.raw.asInstanceOf).asInstanceOf
  )

  def setDesktop(desktop: Int): Unit =
    gdk_app_launch_context_set_desktop(this.raw.asInstanceOf, desktop)

  def setIcon(icon: Icon): Unit = gdk_app_launch_context_set_icon(
    this.raw.asInstanceOf,
    icon.getUnsafeRawPointer().asInstanceOf
  )

  def setIconName(icon_name: String | CString)(using Zone): Unit =
    gdk_app_launch_context_set_icon_name(
      this.raw.asInstanceOf,
      __sn_extract_string(icon_name)
    )

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
