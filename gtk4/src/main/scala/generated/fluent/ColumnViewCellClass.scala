package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkColumnViewCellClass

class ColumnViewCellClass private[gnome] (raw: Ptr[GtkColumnViewCellClass]):

  def getUnsafeRawPointer(): Ptr[GtkColumnViewCellClass] = this.raw
end ColumnViewCellClass

object ColumnViewCellClass:
  def fromRaw(ptr: Ptr[GtkColumnViewCellClass]): ColumnViewCellClass =
    new ColumnViewCellClass(ptr)
end ColumnViewCellClass
