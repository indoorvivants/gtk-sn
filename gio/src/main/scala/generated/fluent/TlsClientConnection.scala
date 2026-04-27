package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait TlsClientConnection:
  def getUnsafeRawPointer(): Ptr[Byte]
end TlsClientConnection

object TlsClientConnection:
  class Abstract(raw: Ptr[Byte]) extends TlsClientConnection:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end TlsClientConnection
