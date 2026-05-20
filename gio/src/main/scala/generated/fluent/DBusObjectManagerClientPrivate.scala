package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDBusObjectManagerClientPrivate

class DBusObjectManagerClientPrivate private[gnome] (
    raw: Ptr[GDBusObjectManagerClientPrivate]
):

  def getUnsafeRawPointer(): Ptr[GDBusObjectManagerClientPrivate] = this.raw
end DBusObjectManagerClientPrivate

object DBusObjectManagerClientPrivate:
  def fromRaw(
      ptr: Ptr[GDBusObjectManagerClientPrivate]
  ): DBusObjectManagerClientPrivate = new DBusObjectManagerClientPrivate(ptr)
end DBusObjectManagerClientPrivate
