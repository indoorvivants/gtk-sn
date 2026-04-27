package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait TlsBackend:
  def getUnsafeRawPointer(): Ptr[Byte]
end TlsBackend

object TlsBackend:
  class Abstract(raw: Ptr[Byte]) extends TlsBackend:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end TlsBackend
