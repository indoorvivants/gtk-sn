package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkShortcutsGroupClass

class ShortcutsGroupClass private[gnome] (raw: Ptr[GtkShortcutsGroupClass]):

  def getUnsafeRawPointer(): Ptr[GtkShortcutsGroupClass] = this.raw
end ShortcutsGroupClass

object ShortcutsGroupClass:
  def fromRaw(ptr: Ptr[GtkShortcutsGroupClass]): ShortcutsGroupClass =
    new ShortcutsGroupClass(ptr)
end ShortcutsGroupClass
