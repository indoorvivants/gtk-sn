package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GProxyAddressEnumeratorPrivate

class ProxyAddressEnumeratorPrivate private[gnome] (
    raw: Ptr[GProxyAddressEnumeratorPrivate]
):

  def getUnsafeRawPointer(): Ptr[GProxyAddressEnumeratorPrivate] = this.raw
end ProxyAddressEnumeratorPrivate

object ProxyAddressEnumeratorPrivate:
  def fromRaw(
      ptr: Ptr[GProxyAddressEnumeratorPrivate]
  ): ProxyAddressEnumeratorPrivate = new ProxyAddressEnumeratorPrivate(ptr)
end ProxyAddressEnumeratorPrivate
