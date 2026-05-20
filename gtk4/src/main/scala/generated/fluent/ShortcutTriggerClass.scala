package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkShortcutTriggerClass

class ShortcutTriggerClass private[gnome] (raw: Ptr[GtkShortcutTriggerClass]):

  def getUnsafeRawPointer(): Ptr[GtkShortcutTriggerClass] = this.raw
end ShortcutTriggerClass

object ShortcutTriggerClass:
  def fromRaw(ptr: Ptr[GtkShortcutTriggerClass]): ShortcutTriggerClass =
    new ShortcutTriggerClass(ptr)
end ShortcutTriggerClass
