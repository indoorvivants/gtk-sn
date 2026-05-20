package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkShortcutActionClass

class ShortcutActionClass private[gnome] (raw: Ptr[GtkShortcutActionClass]):

  def getUnsafeRawPointer(): Ptr[GtkShortcutActionClass] = this.raw
end ShortcutActionClass

object ShortcutActionClass:
  def fromRaw(ptr: Ptr[GtkShortcutActionClass]): ShortcutActionClass =
    new ShortcutActionClass(ptr)
end ShortcutActionClass
