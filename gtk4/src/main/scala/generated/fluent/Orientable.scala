package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait Orientable:
  def getUnsafeRawPointer(): Ptr[Byte]
end Orientable

object Orientable:
  class Abstract(raw: Ptr[Byte]) extends Orientable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Orientable
