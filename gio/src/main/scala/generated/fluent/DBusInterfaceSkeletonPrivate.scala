package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDBusInterfaceSkeletonPrivate

class DBusInterfaceSkeletonPrivate private[gnome] (
    raw: Ptr[GDBusInterfaceSkeletonPrivate]
):

  def getUnsafeRawPointer(): Ptr[GDBusInterfaceSkeletonPrivate] = this.raw
end DBusInterfaceSkeletonPrivate

object DBusInterfaceSkeletonPrivate:
  def fromRaw(
      ptr: Ptr[GDBusInterfaceSkeletonPrivate]
  ): DBusInterfaceSkeletonPrivate = new DBusInterfaceSkeletonPrivate(ptr)
end DBusInterfaceSkeletonPrivate
