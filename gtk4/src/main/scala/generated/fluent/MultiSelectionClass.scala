package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkMultiSelectionClass

class MultiSelectionClass private[gnome] (raw: Ptr[GtkMultiSelectionClass]):

  def getUnsafeRawPointer(): Ptr[GtkMultiSelectionClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end MultiSelectionClass

object MultiSelectionClass:
  def fromRaw(ptr: Ptr[GtkMultiSelectionClass]): MultiSelectionClass =
    new MultiSelectionClass(ptr)
end MultiSelectionClass
