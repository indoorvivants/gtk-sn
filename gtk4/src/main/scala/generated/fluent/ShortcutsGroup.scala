package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Box
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.fluent.ShortcutsShortcut
import sn.gnome.gtk4.internal.GtkShortcutsGroup

class ShortcutsGroup(raw: Ptr[GtkShortcutsGroup])
    extends Box(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addShortcut(shortcut: ShortcutsShortcut): Unit =
    gtk_shortcuts_group_add_shortcut(
      this.raw.asInstanceOf,
      shortcut.getUnsafeRawPointer().asInstanceOf
    )

end ShortcutsGroup
