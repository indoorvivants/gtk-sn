package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSocketClientPrivate

class SocketClientPrivate private[gnome] (raw: Ptr[GSocketClientPrivate]):

  def getUnsafeRawPointer(): Ptr[GSocketClientPrivate] = this.raw
end SocketClientPrivate

object SocketClientPrivate:
  def fromRaw(ptr: Ptr[GSocketClientPrivate]): SocketClientPrivate =
    new SocketClientPrivate(ptr)
end SocketClientPrivate
