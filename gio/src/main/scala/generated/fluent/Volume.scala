package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait Volume:
  def getUnsafeRawPointer(): Ptr[Byte]
end Volume

object Volume:
  class Abstract(raw: Ptr[Byte]) extends Volume:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Volume
