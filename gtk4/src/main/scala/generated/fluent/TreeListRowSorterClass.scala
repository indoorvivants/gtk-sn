package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.SorterClass
import sn.gnome.gtk4.internal.GtkTreeListRowSorterClass

class TreeListRowSorterClass private[gnome] (
    raw: Ptr[GtkTreeListRowSorterClass]
):

  def getUnsafeRawPointer(): Ptr[GtkTreeListRowSorterClass] = this.raw

  def parentClass: sn.gnome.gtk4.SorterClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkSorterClass]
end TreeListRowSorterClass

object TreeListRowSorterClass:
  def fromRaw(ptr: Ptr[GtkTreeListRowSorterClass]): TreeListRowSorterClass =
    new TreeListRowSorterClass(ptr)
end TreeListRowSorterClass
