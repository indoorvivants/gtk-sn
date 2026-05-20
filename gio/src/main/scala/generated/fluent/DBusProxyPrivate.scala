package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDBusProxyPrivate

class DBusProxyPrivate private[gnome] (raw: Ptr[GDBusProxyPrivate]):

  def getUnsafeRawPointer(): Ptr[GDBusProxyPrivate] = this.raw
end DBusProxyPrivate

object DBusProxyPrivate:
  def fromRaw(ptr: Ptr[GDBusProxyPrivate]): DBusProxyPrivate =
    new DBusProxyPrivate(ptr)
end DBusProxyPrivate
