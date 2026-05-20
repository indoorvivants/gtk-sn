package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkListHeaderClass

class ListHeaderClass private[gnome] (raw: Ptr[GtkListHeaderClass]):

  def getUnsafeRawPointer(): Ptr[GtkListHeaderClass] = this.raw
end ListHeaderClass

object ListHeaderClass:
  def fromRaw(ptr: Ptr[GtkListHeaderClass]): ListHeaderClass =
    new ListHeaderClass(ptr)
end ListHeaderClass
