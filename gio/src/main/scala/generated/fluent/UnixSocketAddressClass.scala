package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.SocketAddressClass
import sn.gnome.gio.internal.GUnixSocketAddressClass

class UnixSocketAddressClass private[gnome] (raw: Ptr[GUnixSocketAddressClass]):

  def getUnsafeRawPointer(): Ptr[GUnixSocketAddressClass] = this.raw

  def parentClass: sn.gnome.gio.SocketAddressClass /* None */ =
    (!raw).parent_class.asInstanceOf[GSocketAddressClass]
end UnixSocketAddressClass

object UnixSocketAddressClass:
  def fromRaw(ptr: Ptr[GUnixSocketAddressClass]): UnixSocketAddressClass =
    new UnixSocketAddressClass(ptr)
end UnixSocketAddressClass
