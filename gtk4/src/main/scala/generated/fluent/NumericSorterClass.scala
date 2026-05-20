package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.SorterClass
import sn.gnome.gtk4.internal.GtkNumericSorterClass

class NumericSorterClass private[gnome] (raw: Ptr[GtkNumericSorterClass]):

  def getUnsafeRawPointer(): Ptr[GtkNumericSorterClass] = this.raw

  def parentClass: sn.gnome.gtk4.SorterClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkSorterClass]
end NumericSorterClass

object NumericSorterClass:
  def fromRaw(ptr: Ptr[GtkNumericSorterClass]): NumericSorterClass =
    new NumericSorterClass(ptr)
end NumericSorterClass
