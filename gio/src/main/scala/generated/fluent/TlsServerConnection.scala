package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait TlsServerConnection:
  def getUnsafeRawPointer(): Ptr[Byte]
end TlsServerConnection

object TlsServerConnection:
  class Abstract(raw: Ptr[Byte]) extends TlsServerConnection:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end TlsServerConnection
