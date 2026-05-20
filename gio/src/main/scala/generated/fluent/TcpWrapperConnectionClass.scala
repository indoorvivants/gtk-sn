package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.TcpConnectionClass
import sn.gnome.gio.internal.GTcpWrapperConnectionClass

class TcpWrapperConnectionClass private[gnome] (
    raw: Ptr[GTcpWrapperConnectionClass]
):

  def getUnsafeRawPointer(): Ptr[GTcpWrapperConnectionClass] = this.raw

  def parentClass: sn.gnome.gio.TcpConnectionClass /* None */ =
    (!raw).parent_class.asInstanceOf[GTcpConnectionClass]
end TcpWrapperConnectionClass

object TcpWrapperConnectionClass:
  def fromRaw(ptr: Ptr[GTcpWrapperConnectionClass]): TcpWrapperConnectionClass =
    new TcpWrapperConnectionClass(ptr)
end TcpWrapperConnectionClass
