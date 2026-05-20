package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSocketServicePrivate

class SocketServicePrivate private[gnome] (raw: Ptr[GSocketServicePrivate]):

  def getUnsafeRawPointer(): Ptr[GSocketServicePrivate] = this.raw
end SocketServicePrivate

object SocketServicePrivate:
  def fromRaw(ptr: Ptr[GSocketServicePrivate]): SocketServicePrivate =
    new SocketServicePrivate(ptr)
end SocketServicePrivate
