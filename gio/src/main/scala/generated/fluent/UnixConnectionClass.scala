package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.SocketConnectionClass
import sn.gnome.gio.internal.GUnixConnectionClass

class UnixConnectionClass private[gnome] (raw: Ptr[GUnixConnectionClass]):

  def getUnsafeRawPointer(): Ptr[GUnixConnectionClass] = this.raw

  def parentClass: sn.gnome.gio.SocketConnectionClass /* None */ =
    (!raw).parent_class.asInstanceOf[GSocketConnectionClass]
end UnixConnectionClass

object UnixConnectionClass:
  def fromRaw(ptr: Ptr[GUnixConnectionClass]): UnixConnectionClass =
    new UnixConnectionClass(ptr)
end UnixConnectionClass
