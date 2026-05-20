package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDBusObjectProxyPrivate

class DBusObjectProxyPrivate private[gnome] (raw: Ptr[GDBusObjectProxyPrivate]):

  def getUnsafeRawPointer(): Ptr[GDBusObjectProxyPrivate] = this.raw
end DBusObjectProxyPrivate

object DBusObjectProxyPrivate:
  def fromRaw(ptr: Ptr[GDBusObjectProxyPrivate]): DBusObjectProxyPrivate =
    new DBusObjectProxyPrivate(ptr)
end DBusObjectProxyPrivate
