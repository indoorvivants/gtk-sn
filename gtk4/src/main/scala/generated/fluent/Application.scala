package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ActionGroup
import sn.gnome.gio.fluent.ActionMap
import sn.gnome.gio.fluent.Menu
import sn.gnome.gio.fluent.MenuModel
import sn.gnome.gio.internal.GApplicationFlags
import sn.gnome.glib.internal.GList
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkApplication
import sn.gnome.gtk4.internal.GtkApplicationInhibitFlags
import sn.gnome.gio.fluent.Application as _Application

class Application(raw: Ptr[GtkApplication])
    extends _Application(raw.asInstanceOf),
      ActionGroup,
      ActionMap:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addWindow(window: Window): Unit = gtk_application_add_window(
    this.raw.asInstanceOf,
    window.getUnsafeRawPointer().asInstanceOf
  )

  def getActiveWindow(): Window = new Window(
    gtk_application_get_active_window(this.raw.asInstanceOf).asInstanceOf
  )

  def getMenuById(id: String | CString)(using Zone): Menu = new Menu(
    gtk_application_get_menu_by_id(
      this.raw.asInstanceOf,
      __sn_extract_string(id)
    ).asInstanceOf
  )

  def getMenubar(): MenuModel = new MenuModel(
    gtk_application_get_menubar(this.raw.asInstanceOf).asInstanceOf
  )

  def getWindowById(id: UInt): Window = new Window(
    gtk_application_get_window_by_id(
      this.raw.asInstanceOf,
      guint(id)
    ).asInstanceOf
  )

  def getWindows(): Ptr[GList] = gtk_application_get_windows(
    this.raw.asInstanceOf
  )

  def inhibit(
      window: Window,
      flags: GtkApplicationInhibitFlags,
      reason: String | CString
  )(using Zone): UInt = gtk_application_inhibit(
    this.raw.asInstanceOf,
    window.getUnsafeRawPointer().asInstanceOf,
    flags,
    __sn_extract_string(reason)
  ).value

  def removeWindow(window: Window): Unit = gtk_application_remove_window(
    this.raw.asInstanceOf,
    window.getUnsafeRawPointer().asInstanceOf
  )

  // Method set_accels_for_action contains an array parameter, which is not supported yet

  def setMenubar(menubar: MenuModel): Unit = gtk_application_set_menubar(
    this.raw.asInstanceOf,
    menubar.getUnsafeRawPointer().asInstanceOf
  )

  def uninhibit(cookie: UInt): Unit =
    gtk_application_uninhibit(this.raw.asInstanceOf, guint(cookie))

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Application

object Application:
  def apply(application_id: String | CString, flags: GApplicationFlags)(using
      Zone
  ): Application = new Application(
    gtk_application_new(__sn_extract_string(application_id), flags).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Application
