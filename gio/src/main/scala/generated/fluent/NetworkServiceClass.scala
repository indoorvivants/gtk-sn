package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GNetworkServiceClass
import sn.gnome.gobject.ObjectClass

class NetworkServiceClass private[gnome] (raw: Ptr[GNetworkServiceClass]):

  def getUnsafeRawPointer(): Ptr[GNetworkServiceClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end NetworkServiceClass

object NetworkServiceClass:
  def fromRaw(ptr: Ptr[GNetworkServiceClass]): NetworkServiceClass =
    new NetworkServiceClass(ptr)
end NetworkServiceClass
