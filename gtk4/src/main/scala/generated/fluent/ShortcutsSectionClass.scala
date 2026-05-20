package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkShortcutsSectionClass

class ShortcutsSectionClass private[gnome] (raw: Ptr[GtkShortcutsSectionClass]):

  def getUnsafeRawPointer(): Ptr[GtkShortcutsSectionClass] = this.raw
end ShortcutsSectionClass

object ShortcutsSectionClass:
  def fromRaw(ptr: Ptr[GtkShortcutsSectionClass]): ShortcutsSectionClass =
    new ShortcutsSectionClass(ptr)
end ShortcutsSectionClass
