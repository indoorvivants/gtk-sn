package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GMountOperationPrivate

class MountOperationPrivate private[gnome] (raw: Ptr[GMountOperationPrivate]):

  def getUnsafeRawPointer(): Ptr[GMountOperationPrivate] = this.raw
end MountOperationPrivate

object MountOperationPrivate:
  def fromRaw(ptr: Ptr[GMountOperationPrivate]): MountOperationPrivate =
    new MountOperationPrivate(ptr)
end MountOperationPrivate
