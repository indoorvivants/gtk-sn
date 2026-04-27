package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait ProxyResolver:
  def getUnsafeRawPointer(): Ptr[Byte]
end ProxyResolver

object ProxyResolver:
  class Abstract(raw: Ptr[Byte]) extends ProxyResolver:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end ProxyResolver
