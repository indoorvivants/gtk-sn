package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GInetAddressPrivate

class InetAddressPrivate private[gnome] (raw: Ptr[GInetAddressPrivate]):

  def getUnsafeRawPointer(): Ptr[GInetAddressPrivate] = this.raw
end InetAddressPrivate

object InetAddressPrivate:
  def fromRaw(ptr: Ptr[GInetAddressPrivate]): InetAddressPrivate =
    new InetAddressPrivate(ptr)
end InetAddressPrivate
