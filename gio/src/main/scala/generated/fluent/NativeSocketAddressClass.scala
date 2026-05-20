package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.SocketAddressClass
import sn.gnome.gio.internal.GNativeSocketAddressClass

class NativeSocketAddressClass private[gnome] (
    raw: Ptr[GNativeSocketAddressClass]
):

  def getUnsafeRawPointer(): Ptr[GNativeSocketAddressClass] = this.raw

  def parentClass: sn.gnome.gio.SocketAddressClass /* None */ =
    (!raw).parent_class.asInstanceOf[GSocketAddressClass]
end NativeSocketAddressClass

object NativeSocketAddressClass:
  def fromRaw(ptr: Ptr[GNativeSocketAddressClass]): NativeSocketAddressClass =
    new NativeSocketAddressClass(ptr)
end NativeSocketAddressClass
