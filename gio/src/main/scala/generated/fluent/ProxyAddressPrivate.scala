package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GProxyAddressPrivate

class ProxyAddressPrivate private[gnome] (raw: Ptr[GProxyAddressPrivate]):

  def getUnsafeRawPointer(): Ptr[GProxyAddressPrivate] = this.raw
end ProxyAddressPrivate

object ProxyAddressPrivate:
  def fromRaw(ptr: Ptr[GProxyAddressPrivate]): ProxyAddressPrivate =
    new ProxyAddressPrivate(ptr)
end ProxyAddressPrivate
