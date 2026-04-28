package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait Editable:
  def getUnsafeRawPointer(): Ptr[Byte]
end Editable

object Editable:
  class Abstract(raw: Ptr[Byte]) extends Editable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Editable
