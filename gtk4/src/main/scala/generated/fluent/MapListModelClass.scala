package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkMapListModelClass

class MapListModelClass private[gnome] (raw: Ptr[GtkMapListModelClass]):

  def getUnsafeRawPointer(): Ptr[GtkMapListModelClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end MapListModelClass

object MapListModelClass:
  def fromRaw(ptr: Ptr[GtkMapListModelClass]): MapListModelClass =
    new MapListModelClass(ptr)
end MapListModelClass
