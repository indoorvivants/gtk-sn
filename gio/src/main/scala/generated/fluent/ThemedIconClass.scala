package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GThemedIconClass

class ThemedIconClass private[gnome] (raw: Ptr[GThemedIconClass]):

  def getUnsafeRawPointer(): Ptr[GThemedIconClass] = this.raw
end ThemedIconClass

object ThemedIconClass:
  def fromRaw(ptr: Ptr[GThemedIconClass]): ThemedIconClass =
    new ThemedIconClass(ptr)
end ThemedIconClass
