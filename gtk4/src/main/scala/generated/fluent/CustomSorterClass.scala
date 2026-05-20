package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.SorterClass
import sn.gnome.gtk4.internal.GtkCustomSorterClass

class CustomSorterClass private[gnome] (raw: Ptr[GtkCustomSorterClass]):

  def getUnsafeRawPointer(): Ptr[GtkCustomSorterClass] = this.raw

  def parentClass: sn.gnome.gtk4.SorterClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkSorterClass]
end CustomSorterClass

object CustomSorterClass:
  def fromRaw(ptr: Ptr[GtkCustomSorterClass]): CustomSorterClass =
    new CustomSorterClass(ptr)
end CustomSorterClass
