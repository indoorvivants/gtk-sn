package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkTreeListModelClass

class TreeListModelClass private[gnome] (raw: Ptr[GtkTreeListModelClass]):

  def getUnsafeRawPointer(): Ptr[GtkTreeListModelClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end TreeListModelClass

object TreeListModelClass:
  def fromRaw(ptr: Ptr[GtkTreeListModelClass]): TreeListModelClass =
    new TreeListModelClass(ptr)
end TreeListModelClass
