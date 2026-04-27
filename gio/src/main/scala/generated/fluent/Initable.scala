package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait Initable:
  def getUnsafeRawPointer(): Ptr[Byte]
end Initable

object Initable:
  class Abstract(raw: Ptr[Byte]) extends Initable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Initable
