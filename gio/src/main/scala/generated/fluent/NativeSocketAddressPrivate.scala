package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GNativeSocketAddressPrivate

class NativeSocketAddressPrivate private[gnome] (
    raw: Ptr[GNativeSocketAddressPrivate]
):

  def getUnsafeRawPointer(): Ptr[GNativeSocketAddressPrivate] = this.raw
end NativeSocketAddressPrivate

object NativeSocketAddressPrivate:
  def fromRaw(
      ptr: Ptr[GNativeSocketAddressPrivate]
  ): NativeSocketAddressPrivate = new NativeSocketAddressPrivate(ptr)
end NativeSocketAddressPrivate
