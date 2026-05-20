package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GInetAddressMaskPrivate

class InetAddressMaskPrivate private[gnome] (raw: Ptr[GInetAddressMaskPrivate]):

  def getUnsafeRawPointer(): Ptr[GInetAddressMaskPrivate] = this.raw
end InetAddressMaskPrivate

object InetAddressMaskPrivate:
  def fromRaw(ptr: Ptr[GInetAddressMaskPrivate]): InetAddressMaskPrivate =
    new InetAddressMaskPrivate(ptr)
end InetAddressMaskPrivate
