package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GUnixSocketAddressPrivate

class UnixSocketAddressPrivate private[gnome] (
    raw: Ptr[GUnixSocketAddressPrivate]
):

  def getUnsafeRawPointer(): Ptr[GUnixSocketAddressPrivate] = this.raw
end UnixSocketAddressPrivate

object UnixSocketAddressPrivate:
  def fromRaw(ptr: Ptr[GUnixSocketAddressPrivate]): UnixSocketAddressPrivate =
    new UnixSocketAddressPrivate(ptr)
end UnixSocketAddressPrivate
