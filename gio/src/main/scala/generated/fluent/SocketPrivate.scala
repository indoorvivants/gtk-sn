package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSocketPrivate

class SocketPrivate private[gnome] (raw: Ptr[GSocketPrivate]):

  def getUnsafeRawPointer(): Ptr[GSocketPrivate] = this.raw
end SocketPrivate

object SocketPrivate:
  def fromRaw(ptr: Ptr[GSocketPrivate]): SocketPrivate = new SocketPrivate(ptr)
end SocketPrivate
