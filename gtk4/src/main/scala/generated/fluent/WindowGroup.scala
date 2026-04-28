package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GList
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkWindowGroup

class WindowGroup(raw: Ptr[GtkWindowGroup]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addWindow(window: Window): Unit = gtk_window_group_add_window(
    this.raw.asInstanceOf,
    window.getUnsafeRawPointer().asInstanceOf
  )

  def listWindows(): Ptr[GList] = gtk_window_group_list_windows(
    this.raw.asInstanceOf
  )

  def removeWindow(window: Window): Unit = gtk_window_group_remove_window(
    this.raw.asInstanceOf,
    window.getUnsafeRawPointer().asInstanceOf
  )

end WindowGroup

object WindowGroup:
  def apply(): WindowGroup = new WindowGroup(
    gtk_window_group_new().asInstanceOf
  )
end WindowGroup
