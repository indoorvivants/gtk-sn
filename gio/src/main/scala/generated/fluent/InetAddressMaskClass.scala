package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GInetAddressMaskClass
import sn.gnome.gobject.ObjectClass

class InetAddressMaskClass private[gnome] (raw: Ptr[GInetAddressMaskClass]):

  def getUnsafeRawPointer(): Ptr[GInetAddressMaskClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end InetAddressMaskClass

object InetAddressMaskClass:
  def fromRaw(ptr: Ptr[GInetAddressMaskClass]): InetAddressMaskClass =
    new InetAddressMaskClass(ptr)
end InetAddressMaskClass
