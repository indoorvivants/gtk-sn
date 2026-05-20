package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkShortcutLabelClass

class ShortcutLabelClass private[gnome] (raw: Ptr[GtkShortcutLabelClass]):

  def getUnsafeRawPointer(): Ptr[GtkShortcutLabelClass] = this.raw
end ShortcutLabelClass

object ShortcutLabelClass:
  def fromRaw(ptr: Ptr[GtkShortcutLabelClass]): ShortcutLabelClass =
    new ShortcutLabelClass(ptr)
end ShortcutLabelClass
