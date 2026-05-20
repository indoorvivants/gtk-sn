package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkTreeStoreClass

class TreeStoreClass private[gnome] (raw: Ptr[GtkTreeStoreClass]):

  def getUnsafeRawPointer(): Ptr[GtkTreeStoreClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]

end TreeStoreClass

object TreeStoreClass:
  def fromRaw(ptr: Ptr[GtkTreeStoreClass]): TreeStoreClass = new TreeStoreClass(
    ptr
  )
end TreeStoreClass
