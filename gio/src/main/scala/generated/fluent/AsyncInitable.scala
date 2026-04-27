package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait AsyncInitable:
  def getUnsafeRawPointer(): Ptr[Byte]
end AsyncInitable

object AsyncInitable:
  class Abstract(raw: Ptr[Byte]) extends AsyncInitable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end AsyncInitable
