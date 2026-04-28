package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait AccessibleRange:
  def getUnsafeRawPointer(): Ptr[Byte]
end AccessibleRange

object AccessibleRange:
  class Abstract(raw: Ptr[Byte]) extends AccessibleRange:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end AccessibleRange
