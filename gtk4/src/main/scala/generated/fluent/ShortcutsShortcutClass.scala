package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkShortcutsShortcutClass

class ShortcutsShortcutClass private[gnome] (
    raw: Ptr[GtkShortcutsShortcutClass]
):

  def getUnsafeRawPointer(): Ptr[GtkShortcutsShortcutClass] = this.raw
end ShortcutsShortcutClass

object ShortcutsShortcutClass:
  def fromRaw(ptr: Ptr[GtkShortcutsShortcutClass]): ShortcutsShortcutClass =
    new ShortcutsShortcutClass(ptr)
end ShortcutsShortcutClass
