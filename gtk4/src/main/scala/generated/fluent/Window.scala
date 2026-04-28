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

class Window(raw: Ptr[GtkWindow])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      Root,
      ShortcutManager:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def close(): Unit = gtk_window_close(this.raw.asInstanceOf)

  def destroy(): Unit = gtk_window_destroy(this.raw.asInstanceOf)

  def fullscreen(): Unit = gtk_window_fullscreen(this.raw.asInstanceOf)

  def fullscreenOnMonitor(monitor: Monitor): Unit =
    gtk_window_fullscreen_on_monitor(
      this.raw.asInstanceOf,
      monitor.getUnsafeRawPointer().asInstanceOf
    )

  def getApplication(): Application = new Application(
    gtk_window_get_application(this.raw.asInstanceOf).asInstanceOf
  )

  def getChild(): Widget = new Widget(
    gtk_window_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getDecorated(): Boolean =
    gtk_window_get_decorated(this.raw.asInstanceOf).value.!=(0)

  // Method get_default_size contains an OUT parameter, which is not supported yet

  def getDefaultWidget(): Widget = new Widget(
    gtk_window_get_default_widget(this.raw.asInstanceOf).asInstanceOf
  )

  def getDeletable(): Boolean =
    gtk_window_get_deletable(this.raw.asInstanceOf).value.!=(0)

  def getDestroyWithParent(): Boolean =
    gtk_window_get_destroy_with_parent(this.raw.asInstanceOf).value.!=(0)

  def getFocus(): Widget = new Widget(
    gtk_window_get_focus(this.raw.asInstanceOf).asInstanceOf
  )

  def getFocusVisible(): Boolean =
    gtk_window_get_focus_visible(this.raw.asInstanceOf).value.!=(0)

  def getGroup(): WindowGroup = new WindowGroup(
    gtk_window_get_group(this.raw.asInstanceOf).asInstanceOf
  )

  def getHandleMenubarAccel(): Boolean =
    gtk_window_get_handle_menubar_accel(this.raw.asInstanceOf).value.!=(0)

  def getHideOnClose(): Boolean =
    gtk_window_get_hide_on_close(this.raw.asInstanceOf).value.!=(0)

  def getIconName()(using Zone): String = fromCString(
    gtk_window_get_icon_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getMnemonicsVisible(): Boolean =
    gtk_window_get_mnemonics_visible(this.raw.asInstanceOf).value.!=(0)

  def getModal(): Boolean =
    gtk_window_get_modal(this.raw.asInstanceOf).value.!=(0)

  def getResizable(): Boolean =
    gtk_window_get_resizable(this.raw.asInstanceOf).value.!=(0)

  def getTitle()(using Zone): String = fromCString(
    gtk_window_get_title(this.raw.asInstanceOf).asInstanceOf
  )

  def getTitlebar(): Widget = new Widget(
    gtk_window_get_titlebar(this.raw.asInstanceOf).asInstanceOf
  )

  def getTransientFor(): Window = new Window(
    gtk_window_get_transient_for(this.raw.asInstanceOf).asInstanceOf
  )

  def hasGroup(): Boolean =
    gtk_window_has_group(this.raw.asInstanceOf).value.!=(0)

  def isActive(): Boolean =
    gtk_window_is_active(this.raw.asInstanceOf).value.!=(0)

  def isFullscreen(): Boolean =
    gtk_window_is_fullscreen(this.raw.asInstanceOf).value.!=(0)

  def isMaximized(): Boolean =
    gtk_window_is_maximized(this.raw.asInstanceOf).value.!=(0)

  def isSuspended(): Boolean =
    gtk_window_is_suspended(this.raw.asInstanceOf).value.!=(0)

  def maximize(): Unit = gtk_window_maximize(this.raw.asInstanceOf)

  def minimize(): Unit = gtk_window_minimize(this.raw.asInstanceOf)

  def present(): Unit = gtk_window_present(this.raw.asInstanceOf)

  def presentWithTime(timestamp: UInt): Unit =
    gtk_window_present_with_time(this.raw.asInstanceOf, guint32(timestamp))

  def setApplication(application: Application): Unit =
    gtk_window_set_application(
      this.raw.asInstanceOf,
      application.getUnsafeRawPointer().asInstanceOf
    )

  def setChild(child: Widget): Unit = gtk_window_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setDecorated(setting: Boolean): Unit = gtk_window_set_decorated(
    this.raw.asInstanceOf,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  def setDefaultSize(width: Int, height: Int): Unit =
    gtk_window_set_default_size(this.raw.asInstanceOf, width, height)

  def setDefaultWidget(default_widget: Widget): Unit =
    gtk_window_set_default_widget(
      this.raw.asInstanceOf,
      default_widget.getUnsafeRawPointer().asInstanceOf
    )

  def setDeletable(setting: Boolean): Unit = gtk_window_set_deletable(
    this.raw.asInstanceOf,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  def setDestroyWithParent(setting: Boolean): Unit =
    gtk_window_set_destroy_with_parent(
      this.raw.asInstanceOf,
      gboolean(gint((if setting == true then 1 else 0)))
    )

  def setDisplay(display: Display): Unit = gtk_window_set_display(
    this.raw.asInstanceOf,
    display.getUnsafeRawPointer().asInstanceOf
  )

  def setFocus(focus: Widget): Unit = gtk_window_set_focus(
    this.raw.asInstanceOf,
    focus.getUnsafeRawPointer().asInstanceOf
  )

  def setFocusVisible(setting: Boolean): Unit = gtk_window_set_focus_visible(
    this.raw.asInstanceOf,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  def setHandleMenubarAccel(handle_menubar_accel: Boolean): Unit =
    gtk_window_set_handle_menubar_accel(
      this.raw.asInstanceOf,
      gboolean(gint((if handle_menubar_accel == true then 1 else 0)))
    )

  def setHideOnClose(setting: Boolean): Unit = gtk_window_set_hide_on_close(
    this.raw.asInstanceOf,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  def setIconName(name: String | CString)(using Zone): Unit =
    gtk_window_set_icon_name(this.raw.asInstanceOf, __sn_extract_string(name))

  def setMnemonicsVisible(setting: Boolean): Unit =
    gtk_window_set_mnemonics_visible(
      this.raw.asInstanceOf,
      gboolean(gint((if setting == true then 1 else 0)))
    )

  def setModal(modal: Boolean): Unit = gtk_window_set_modal(
    this.raw.asInstanceOf,
    gboolean(gint((if modal == true then 1 else 0)))
  )

  def setResizable(resizable: Boolean): Unit = gtk_window_set_resizable(
    this.raw.asInstanceOf,
    gboolean(gint((if resizable == true then 1 else 0)))
  )

  def setStartupId(startup_id: String | CString)(using Zone): Unit =
    gtk_window_set_startup_id(
      this.raw.asInstanceOf,
      __sn_extract_string(startup_id)
    )

  def setTitle(title: String | CString)(using Zone): Unit =
    gtk_window_set_title(this.raw.asInstanceOf, __sn_extract_string(title))

  def setTitlebar(titlebar: Widget): Unit = gtk_window_set_titlebar(
    this.raw.asInstanceOf,
    titlebar.getUnsafeRawPointer().asInstanceOf
  )

  def setTransientFor(parent: Window): Unit = gtk_window_set_transient_for(
    this.raw.asInstanceOf,
    parent.getUnsafeRawPointer().asInstanceOf
  )

  def unfullscreen(): Unit = gtk_window_unfullscreen(this.raw.asInstanceOf)

  def unmaximize(): Unit = gtk_window_unmaximize(this.raw.asInstanceOf)

  def unminimize(): Unit = gtk_window_unminimize(this.raw.asInstanceOf)

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
  def apply(): Window = new Window(gtk_window_new().asInstanceOf)
end Window
