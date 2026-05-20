package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GListStoreClass
import sn.gnome.gobject.ObjectClass

class ListStoreClass private[gnome] (raw: Ptr[GListStoreClass]):

  def getUnsafeRawPointer(): Ptr[GListStoreClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end ListStoreClass

object ListStoreClass:
  def fromRaw(ptr: Ptr[GListStoreClass]): ListStoreClass = new ListStoreClass(
    ptr
  )
end ListStoreClass
