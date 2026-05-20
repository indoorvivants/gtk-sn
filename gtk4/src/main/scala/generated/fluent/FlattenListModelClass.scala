package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkFlattenListModelClass

class FlattenListModelClass private[gnome] (raw: Ptr[GtkFlattenListModelClass]):

  def getUnsafeRawPointer(): Ptr[GtkFlattenListModelClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end FlattenListModelClass

object FlattenListModelClass:
  def fromRaw(ptr: Ptr[GtkFlattenListModelClass]): FlattenListModelClass =
    new FlattenListModelClass(ptr)
end FlattenListModelClass
