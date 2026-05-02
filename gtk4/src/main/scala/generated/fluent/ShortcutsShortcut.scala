package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkShortcutsShortcut

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkShortcutsShortcut` represents a single keyboard shortcut or gesture
  * with a short text.
  *
  * This widget is only meant to be used with `GtkShortcutsWindow`.
  */
class ShortcutsShortcut(raw: Ptr[GtkShortcutsShortcut])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ShortcutsShortcut
