package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait DtlsConnection:
  def getUnsafeRawPointer(): Ptr[Byte]
end DtlsConnection

object DtlsConnection:
  class Abstract(raw: Ptr[Byte]) extends DtlsConnection:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DtlsConnection
