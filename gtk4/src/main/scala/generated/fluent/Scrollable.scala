package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait Scrollable:
  def getUnsafeRawPointer(): Ptr[Byte]
end Scrollable

object Scrollable:
  class Abstract(raw: Ptr[Byte]) extends Scrollable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Scrollable
