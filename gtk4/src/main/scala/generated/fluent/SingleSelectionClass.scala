package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkSingleSelectionClass

class SingleSelectionClass private[gnome] (raw: Ptr[GtkSingleSelectionClass]):

  def getUnsafeRawPointer(): Ptr[GtkSingleSelectionClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end SingleSelectionClass

object SingleSelectionClass:
  def fromRaw(ptr: Ptr[GtkSingleSelectionClass]): SingleSelectionClass =
    new SingleSelectionClass(ptr)
end SingleSelectionClass
