package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.SocketAddressClass
import sn.gnome.gio.internal.GInetSocketAddressClass

class InetSocketAddressClass private[gnome] (raw: Ptr[GInetSocketAddressClass]):

  def getUnsafeRawPointer(): Ptr[GInetSocketAddressClass] = this.raw

  def parentClass: sn.gnome.gio.SocketAddressClass /* None */ =
    (!raw).parent_class.asInstanceOf[GSocketAddressClass]
end InetSocketAddressClass

object InetSocketAddressClass:
  def fromRaw(ptr: Ptr[GInetSocketAddressClass]): InetSocketAddressClass =
    new InetSocketAddressClass(ptr)
end InetSocketAddressClass
