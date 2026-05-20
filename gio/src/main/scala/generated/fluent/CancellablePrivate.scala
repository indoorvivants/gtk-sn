package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GCancellablePrivate

class CancellablePrivate private[gnome] (raw: Ptr[GCancellablePrivate]):

  def getUnsafeRawPointer(): Ptr[GCancellablePrivate] = this.raw
end CancellablePrivate

object CancellablePrivate:
  def fromRaw(ptr: Ptr[GCancellablePrivate]): CancellablePrivate =
    new CancellablePrivate(ptr)
end CancellablePrivate
