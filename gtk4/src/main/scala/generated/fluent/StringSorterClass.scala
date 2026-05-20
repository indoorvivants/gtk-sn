package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.SorterClass
import sn.gnome.gtk4.internal.GtkStringSorterClass

class StringSorterClass private[gnome] (raw: Ptr[GtkStringSorterClass]):

  def getUnsafeRawPointer(): Ptr[GtkStringSorterClass] = this.raw

  def parentClass: sn.gnome.gtk4.SorterClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkSorterClass]
end StringSorterClass

object StringSorterClass:
  def fromRaw(ptr: Ptr[GtkStringSorterClass]): StringSorterClass =
    new StringSorterClass(ptr)
end StringSorterClass
