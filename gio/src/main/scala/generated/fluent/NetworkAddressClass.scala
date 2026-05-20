package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GNetworkAddressClass
import sn.gnome.gobject.ObjectClass

class NetworkAddressClass private[gnome] (raw: Ptr[GNetworkAddressClass]):

  def getUnsafeRawPointer(): Ptr[GNetworkAddressClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end NetworkAddressClass

object NetworkAddressClass:
  def fromRaw(ptr: Ptr[GNetworkAddressClass]): NetworkAddressClass =
    new NetworkAddressClass(ptr)
end NetworkAddressClass
