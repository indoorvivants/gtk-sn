package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait Proxy:
  def getUnsafeRawPointer(): Ptr[Byte]
end Proxy

object Proxy:
  class Abstract(raw: Ptr[Byte]) extends Proxy:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Proxy
