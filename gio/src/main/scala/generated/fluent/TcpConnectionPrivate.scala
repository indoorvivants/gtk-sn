package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GTcpConnectionPrivate

class TcpConnectionPrivate private[gnome] (raw: Ptr[GTcpConnectionPrivate]):

  def getUnsafeRawPointer(): Ptr[GTcpConnectionPrivate] = this.raw
end TcpConnectionPrivate

object TcpConnectionPrivate:
  def fromRaw(ptr: Ptr[GTcpConnectionPrivate]): TcpConnectionPrivate =
    new TcpConnectionPrivate(ptr)
end TcpConnectionPrivate
