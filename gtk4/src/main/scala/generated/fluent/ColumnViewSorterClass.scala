package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.SorterClass
import sn.gnome.gtk4.internal.GtkColumnViewSorterClass

class ColumnViewSorterClass private[gnome] (raw: Ptr[GtkColumnViewSorterClass]):

  def getUnsafeRawPointer(): Ptr[GtkColumnViewSorterClass] = this.raw

  def parentClass: sn.gnome.gtk4.SorterClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkSorterClass]
end ColumnViewSorterClass

object ColumnViewSorterClass:
  def fromRaw(ptr: Ptr[GtkColumnViewSorterClass]): ColumnViewSorterClass =
    new ColumnViewSorterClass(ptr)
end ColumnViewSorterClass
