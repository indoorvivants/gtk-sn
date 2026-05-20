package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSocketControlMessagePrivate

class SocketControlMessagePrivate private[gnome] (
    raw: Ptr[GSocketControlMessagePrivate]
):

  def getUnsafeRawPointer(): Ptr[GSocketControlMessagePrivate] = this.raw
end SocketControlMessagePrivate

object SocketControlMessagePrivate:
  def fromRaw(
      ptr: Ptr[GSocketControlMessagePrivate]
  ): SocketControlMessagePrivate = new SocketControlMessagePrivate(ptr)
end SocketControlMessagePrivate
