package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.AppLaunchContext
import sn.gnome.gdk4.fluent.Clipboard
import sn.gnome.gdk4.fluent.Device
import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.fluent.GLContext
import sn.gnome.gdk4.fluent.Monitor
import sn.gnome.gdk4.fluent.Seat
import sn.gnome.gdk4.fluent.Surface
import sn.gnome.gdk4.internal.GdkDisplay
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GList
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GValue

class Display(raw: Ptr[GdkDisplay]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def beep(): Unit = gdk_display_beep(this.raw.asInstanceOf)

  def close(): Unit = gdk_display_close(this.raw.asInstanceOf)

  def createGlContext(): GResult[GLContext] = GResult.wrap(__errorPtr =>
    new GLContext(
      gdk_display_create_gl_context(
        this.raw.asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  def deviceIsGrabbed(device: Device): Boolean = gdk_display_device_is_grabbed(
    this.raw.asInstanceOf,
    device.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def flush(): Unit = gdk_display_flush(this.raw.asInstanceOf)

  def getAppLaunchContext(): AppLaunchContext = new AppLaunchContext(
    gdk_display_get_app_launch_context(this.raw.asInstanceOf).asInstanceOf
  )

  def getClipboard(): Clipboard = new Clipboard(
    gdk_display_get_clipboard(this.raw.asInstanceOf).asInstanceOf
  )

  def getDefaultSeat(): Seat = new Seat(
    gdk_display_get_default_seat(this.raw.asInstanceOf).asInstanceOf
  )

  def getMonitorAtSurface(surface: Surface): Monitor = new Monitor(
    gdk_display_get_monitor_at_surface(
      this.raw.asInstanceOf,
      surface.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  def getMonitors(): ListModel = new ListModel.Abstract(
    gdk_display_get_monitors(this.raw.asInstanceOf).asInstanceOf
  )

  def getName()(using Zone): String = fromCString(
    gdk_display_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getPrimaryClipboard(): Clipboard = new Clipboard(
    gdk_display_get_primary_clipboard(this.raw.asInstanceOf).asInstanceOf
  )

  def getSetting(name: String | CString, value: Ptr[GValue])(using
      Zone
  ): Boolean = gdk_display_get_setting(
    this.raw.asInstanceOf,
    __sn_extract_string(name),
    value
  ).value.!=(0)

  def getStartupNotificationId()(using Zone): String = fromCString(
    gdk_display_get_startup_notification_id(this.raw.asInstanceOf).asInstanceOf
  )

  def isClosed(): Boolean =
    gdk_display_is_closed(this.raw.asInstanceOf).value.!=(0)

  def isComposited(): Boolean =
    gdk_display_is_composited(this.raw.asInstanceOf).value.!=(0)

  def isRgba(): Boolean = gdk_display_is_rgba(this.raw.asInstanceOf).value.!=(0)

  def listSeats(): Ptr[GList] = gdk_display_list_seats(this.raw.asInstanceOf)

  // Method map_keycode contains an array parameter, which is not supported yet

  // Method map_keyval contains an array parameter, which is not supported yet

  def notifyStartupComplete(startup_id: String | CString)(using Zone): Unit =
    gdk_display_notify_startup_complete(
      this.raw.asInstanceOf,
      __sn_extract_string(startup_id)
    )

  def prepareGl(): GResult[Boolean] = GResult.wrap(__errorPtr =>
    gdk_display_prepare_gl(this.raw.asInstanceOf, __errorPtr).value.!=(0)
  )

  def putEvent(event: Event): Unit = gdk_display_put_event(
    this.raw.asInstanceOf,
    event.getUnsafeRawPointer().asInstanceOf
  )

  def supportsInputShapes(): Boolean =
    gdk_display_supports_input_shapes(this.raw.asInstanceOf).value.!=(0)

  def sync(): Unit = gdk_display_sync(this.raw.asInstanceOf)

  // Method translate_key contains an OUT parameter, which is not supported yet

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Display
