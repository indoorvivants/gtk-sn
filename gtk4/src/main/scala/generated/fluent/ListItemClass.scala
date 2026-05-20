package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkListItemClass

class ListItemClass private[gnome] (raw: Ptr[GtkListItemClass]):

  def getUnsafeRawPointer(): Ptr[GtkListItemClass] = this.raw
end ListItemClass

object ListItemClass:
  def fromRaw(ptr: Ptr[GtkListItemClass]): ListItemClass = new ListItemClass(
    ptr
  )
end ListItemClass
