package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait SocketConnectable:
  def getUnsafeRawPointer(): Ptr[Byte]
end SocketConnectable

object SocketConnectable:
  class Abstract(raw: Ptr[Byte]) extends SocketConnectable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end SocketConnectable
