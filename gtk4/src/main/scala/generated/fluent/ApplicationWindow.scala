package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ActionGroup
import sn.gnome.gio.fluent.ActionMap
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Application
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Native
import sn.gnome.gtk4.fluent.Root
import sn.gnome.gtk4.fluent.ShortcutManager
import sn.gnome.gtk4.fluent.ShortcutsWindow
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkApplicationWindow

class ApplicationWindow(raw: Ptr[GtkApplicationWindow])
    extends Window(raw.asInstanceOf),
      ActionGroup,
      ActionMap,
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      Root,
      ShortcutManager:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getHelpOverlay(): ShortcutsWindow = new ShortcutsWindow(
    gtk_application_window_get_help_overlay(this.raw.asInstanceOf).asInstanceOf
  )

  def getId(): UInt = gtk_application_window_get_id(this.raw.asInstanceOf).value

  def getShowMenubar(): Boolean =
    gtk_application_window_get_show_menubar(this.raw.asInstanceOf).value.!=(0)

  def setHelpOverlay(help_overlay: ShortcutsWindow): Unit =
    gtk_application_window_set_help_overlay(
      this.raw.asInstanceOf,
      help_overlay.getUnsafeRawPointer().asInstanceOf
    )

  def setShowMenubar(show_menubar: Boolean): Unit =
    gtk_application_window_set_show_menubar(
      this.raw.asInstanceOf,
      gboolean(gint((if show_menubar == true then 1 else 0)))
    )

end ApplicationWindow

object ApplicationWindow:
  def apply(application: Application): ApplicationWindow =
    new ApplicationWindow(
      gtk_application_window_new(
        application.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
end ApplicationWindow
