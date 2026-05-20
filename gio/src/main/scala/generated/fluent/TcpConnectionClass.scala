package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.SocketConnectionClass
import sn.gnome.gio.internal.GTcpConnectionClass

class TcpConnectionClass private[gnome] (raw: Ptr[GTcpConnectionClass]):

  def getUnsafeRawPointer(): Ptr[GTcpConnectionClass] = this.raw

  def parentClass: sn.gnome.gio.SocketConnectionClass /* None */ =
    (!raw).parent_class.asInstanceOf[GSocketConnectionClass]
end TcpConnectionClass

object TcpConnectionClass:
  def fromRaw(ptr: Ptr[GTcpConnectionClass]): TcpConnectionClass =
    new TcpConnectionClass(ptr)
end TcpConnectionClass
