package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.SorterClass
import sn.gnome.gtk4.internal.GtkMultiSorterClass

class MultiSorterClass private[gnome] (raw: Ptr[GtkMultiSorterClass]):

  def getUnsafeRawPointer(): Ptr[GtkMultiSorterClass] = this.raw

  def parentClass: sn.gnome.gtk4.SorterClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkSorterClass]
end MultiSorterClass

object MultiSorterClass:
  def fromRaw(ptr: Ptr[GtkMultiSorterClass]): MultiSorterClass =
    new MultiSorterClass(ptr)
end MultiSorterClass
