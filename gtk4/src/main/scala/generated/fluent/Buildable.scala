package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait Buildable:
  def getUnsafeRawPointer(): Ptr[Byte]
end Buildable

object Buildable:
  class Abstract(raw: Ptr[Byte]) extends Buildable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Buildable
