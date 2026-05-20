package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSocketListenerPrivate

class SocketListenerPrivate private[gnome] (raw: Ptr[GSocketListenerPrivate]):

  def getUnsafeRawPointer(): Ptr[GSocketListenerPrivate] = this.raw
end SocketListenerPrivate

object SocketListenerPrivate:
  def fromRaw(ptr: Ptr[GSocketListenerPrivate]): SocketListenerPrivate =
    new SocketListenerPrivate(ptr)
end SocketListenerPrivate
