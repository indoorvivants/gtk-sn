package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkFilterListModelClass

class FilterListModelClass private[gnome] (raw: Ptr[GtkFilterListModelClass]):

  def getUnsafeRawPointer(): Ptr[GtkFilterListModelClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end FilterListModelClass

object FilterListModelClass:
  def fromRaw(ptr: Ptr[GtkFilterListModelClass]): FilterListModelClass =
    new FilterListModelClass(ptr)
end FilterListModelClass
