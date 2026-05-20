package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkListItemFactoryClass

class ListItemFactoryClass private[gnome] (raw: Ptr[GtkListItemFactoryClass]):

  def getUnsafeRawPointer(): Ptr[GtkListItemFactoryClass] = this.raw
end ListItemFactoryClass

object ListItemFactoryClass:
  def fromRaw(ptr: Ptr[GtkListItemFactoryClass]): ListItemFactoryClass =
    new ListItemFactoryClass(ptr)
end ListItemFactoryClass
