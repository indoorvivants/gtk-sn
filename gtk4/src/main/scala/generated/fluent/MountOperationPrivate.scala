package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkMountOperationPrivate

class MountOperationPrivate private[gnome] (raw: Ptr[GtkMountOperationPrivate]):

  def getUnsafeRawPointer(): Ptr[GtkMountOperationPrivate] = this.raw
end MountOperationPrivate

object MountOperationPrivate:
  def fromRaw(ptr: Ptr[GtkMountOperationPrivate]): MountOperationPrivate =
    new MountOperationPrivate(ptr)
end MountOperationPrivate
