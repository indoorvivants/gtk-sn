package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait DtlsClientConnection:
  def getUnsafeRawPointer(): Ptr[Byte]
end DtlsClientConnection

object DtlsClientConnection:
  class Abstract(raw: Ptr[Byte]) extends DtlsClientConnection:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DtlsClientConnection
