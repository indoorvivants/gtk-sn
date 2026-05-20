package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkShortcutControllerClass

class ShortcutControllerClass private[gnome] (
    raw: Ptr[GtkShortcutControllerClass]
):

  def getUnsafeRawPointer(): Ptr[GtkShortcutControllerClass] = this.raw
end ShortcutControllerClass

object ShortcutControllerClass:
  def fromRaw(ptr: Ptr[GtkShortcutControllerClass]): ShortcutControllerClass =
    new ShortcutControllerClass(ptr)
end ShortcutControllerClass
