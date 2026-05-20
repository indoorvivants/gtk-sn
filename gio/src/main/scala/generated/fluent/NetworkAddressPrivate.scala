package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GNetworkAddressPrivate

class NetworkAddressPrivate private[gnome] (raw: Ptr[GNetworkAddressPrivate]):

  def getUnsafeRawPointer(): Ptr[GNetworkAddressPrivate] = this.raw
end NetworkAddressPrivate

object NetworkAddressPrivate:
  def fromRaw(ptr: Ptr[GNetworkAddressPrivate]): NetworkAddressPrivate =
    new NetworkAddressPrivate(ptr)
end NetworkAddressPrivate
