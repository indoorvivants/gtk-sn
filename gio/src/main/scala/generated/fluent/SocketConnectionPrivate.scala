package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSocketConnectionPrivate

class SocketConnectionPrivate private[gnome] (
    raw: Ptr[GSocketConnectionPrivate]
):

  def getUnsafeRawPointer(): Ptr[GSocketConnectionPrivate] = this.raw
end SocketConnectionPrivate

object SocketConnectionPrivate:
  def fromRaw(ptr: Ptr[GSocketConnectionPrivate]): SocketConnectionPrivate =
    new SocketConnectionPrivate(ptr)
end SocketConnectionPrivate
