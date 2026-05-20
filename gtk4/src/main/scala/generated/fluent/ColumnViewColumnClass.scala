package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkColumnViewColumnClass

class ColumnViewColumnClass private[gnome] (raw: Ptr[GtkColumnViewColumnClass]):

  def getUnsafeRawPointer(): Ptr[GtkColumnViewColumnClass] = this.raw
end ColumnViewColumnClass

object ColumnViewColumnClass:
  def fromRaw(ptr: Ptr[GtkColumnViewColumnClass]): ColumnViewColumnClass =
    new ColumnViewColumnClass(ptr)
end ColumnViewColumnClass
