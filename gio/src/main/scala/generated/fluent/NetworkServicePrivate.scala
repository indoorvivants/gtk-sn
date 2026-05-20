package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GNetworkServicePrivate

class NetworkServicePrivate private[gnome] (raw: Ptr[GNetworkServicePrivate]):

  def getUnsafeRawPointer(): Ptr[GNetworkServicePrivate] = this.raw
end NetworkServicePrivate

object NetworkServicePrivate:
  def fromRaw(ptr: Ptr[GNetworkServicePrivate]): NetworkServicePrivate =
    new NetworkServicePrivate(ptr)
end NetworkServicePrivate
