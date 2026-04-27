package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait TlsFileDatabase:
  def getUnsafeRawPointer(): Ptr[Byte]
end TlsFileDatabase

object TlsFileDatabase:
  class Abstract(raw: Ptr[Byte]) extends TlsFileDatabase:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end TlsFileDatabase
