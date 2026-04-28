package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Native
import sn.gnome.gtk4.fluent.Root
import sn.gnome.gtk4.fluent.ShortcutManager
import sn.gnome.gtk4.fluent.ShortcutsSection
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkShortcutsWindow

class ShortcutsWindow(raw: Ptr[GtkShortcutsWindow])
    extends Window(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      Root,
      ShortcutManager:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addSection(section: ShortcutsSection): Unit =
    gtk_shortcuts_window_add_section(
      this.raw.asInstanceOf,
      section.getUnsafeRawPointer().asInstanceOf
    )

end ShortcutsWindow
