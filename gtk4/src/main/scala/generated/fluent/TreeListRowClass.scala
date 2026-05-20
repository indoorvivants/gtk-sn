package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkTreeListRowClass

class TreeListRowClass private[gnome] (raw: Ptr[GtkTreeListRowClass]):

  def getUnsafeRawPointer(): Ptr[GtkTreeListRowClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end TreeListRowClass

object TreeListRowClass:
  def fromRaw(ptr: Ptr[GtkTreeListRowClass]): TreeListRowClass =
    new TreeListRowClass(ptr)
end TreeListRowClass
