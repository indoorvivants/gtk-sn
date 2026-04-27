package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait DtlsServerConnection:
  def getUnsafeRawPointer(): Ptr[Byte]
end DtlsServerConnection

object DtlsServerConnection:
  class Abstract(raw: Ptr[Byte]) extends DtlsServerConnection:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DtlsServerConnection
