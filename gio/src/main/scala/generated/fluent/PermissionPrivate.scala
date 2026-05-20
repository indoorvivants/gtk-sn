package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GPermissionPrivate

class PermissionPrivate private[gnome] (raw: Ptr[GPermissionPrivate]):

  def getUnsafeRawPointer(): Ptr[GPermissionPrivate] = this.raw
end PermissionPrivate

object PermissionPrivate:
  def fromRaw(ptr: Ptr[GPermissionPrivate]): PermissionPrivate =
    new PermissionPrivate(ptr)
end PermissionPrivate
