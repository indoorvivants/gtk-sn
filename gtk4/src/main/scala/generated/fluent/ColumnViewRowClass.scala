package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkColumnViewRowClass

class ColumnViewRowClass private[gnome] (raw: Ptr[GtkColumnViewRowClass]):

  def getUnsafeRawPointer(): Ptr[GtkColumnViewRowClass] = this.raw
end ColumnViewRowClass

object ColumnViewRowClass:
  def fromRaw(ptr: Ptr[GtkColumnViewRowClass]): ColumnViewRowClass =
    new ColumnViewRowClass(ptr)
end ColumnViewRowClass
