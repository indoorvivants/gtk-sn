package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GInetSocketAddressPrivate

class InetSocketAddressPrivate private[gnome] (
    raw: Ptr[GInetSocketAddressPrivate]
):

  def getUnsafeRawPointer(): Ptr[GInetSocketAddressPrivate] = this.raw
end InetSocketAddressPrivate

object InetSocketAddressPrivate:
  def fromRaw(ptr: Ptr[GInetSocketAddressPrivate]): InetSocketAddressPrivate =
    new InetSocketAddressPrivate(ptr)
end InetSocketAddressPrivate
