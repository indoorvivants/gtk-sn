package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Box
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.fluent.ShortcutsGroup
import sn.gnome.gtk4.internal.GtkShortcutsSection

class ShortcutsSection(raw: Ptr[GtkShortcutsSection])
    extends Box(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addGroup(group: ShortcutsGroup): Unit = gtk_shortcuts_section_add_group(
    this.raw.asInstanceOf,
    group.getUnsafeRawPointer().asInstanceOf
  )

end ShortcutsSection
