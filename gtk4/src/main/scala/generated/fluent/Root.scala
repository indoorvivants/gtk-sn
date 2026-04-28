package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait Root:
  def getUnsafeRawPointer(): Ptr[Byte]
end Root

object Root:
  class Abstract(raw: Ptr[Byte]) extends Root:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Root
