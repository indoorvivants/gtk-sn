package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkTreeModelSortClass

class TreeModelSortClass private[gnome] (raw: Ptr[GtkTreeModelSortClass]):

  def getUnsafeRawPointer(): Ptr[GtkTreeModelSortClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]

end TreeModelSortClass

object TreeModelSortClass:
  def fromRaw(ptr: Ptr[GtkTreeModelSortClass]): TreeModelSortClass =
    new TreeModelSortClass(ptr)
end TreeModelSortClass
