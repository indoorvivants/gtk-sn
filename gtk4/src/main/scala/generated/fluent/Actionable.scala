package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait Actionable:
  def getUnsafeRawPointer(): Ptr[Byte]
end Actionable

object Actionable:
  class Abstract(raw: Ptr[Byte]) extends Actionable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Actionable
