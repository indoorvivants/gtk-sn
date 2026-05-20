package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDBusObjectSkeletonPrivate

class DBusObjectSkeletonPrivate private[gnome] (
    raw: Ptr[GDBusObjectSkeletonPrivate]
):

  def getUnsafeRawPointer(): Ptr[GDBusObjectSkeletonPrivate] = this.raw
end DBusObjectSkeletonPrivate

object DBusObjectSkeletonPrivate:
  def fromRaw(ptr: Ptr[GDBusObjectSkeletonPrivate]): DBusObjectSkeletonPrivate =
    new DBusObjectSkeletonPrivate(ptr)
end DBusObjectSkeletonPrivate
