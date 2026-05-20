package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDBusObjectManagerServerPrivate

class DBusObjectManagerServerPrivate private[gnome] (
    raw: Ptr[GDBusObjectManagerServerPrivate]
):

  def getUnsafeRawPointer(): Ptr[GDBusObjectManagerServerPrivate] = this.raw
end DBusObjectManagerServerPrivate

object DBusObjectManagerServerPrivate:
  def fromRaw(
      ptr: Ptr[GDBusObjectManagerServerPrivate]
  ): DBusObjectManagerServerPrivate = new DBusObjectManagerServerPrivate(ptr)
end DBusObjectManagerServerPrivate
