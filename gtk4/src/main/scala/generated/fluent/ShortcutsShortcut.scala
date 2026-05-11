package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{Accessible, Buildable, ConstraintTarget, Widget}
import sn.gnome.gtk4.internal.GtkShortcutsShortcut

/** A `GtkShortcutsShortcut` represents a single keyboard shortcut or gesture
  * with a short text.
  *
  * This widget is only meant to be used with `GtkShortcutsWindow`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ShortcutsShortcut private[gnome] (raw: Ptr[GtkShortcutsShortcut])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ShortcutsShortcut

object ShortcutsShortcut:
  def applyUnsafe(ptr: Ptr[GtkShortcutsShortcut])(using Runtime) =
    summon[Runtime].getOrCreate[ShortcutsShortcut](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ShortcutsShortcut(ptr)
    )

end ShortcutsShortcut
