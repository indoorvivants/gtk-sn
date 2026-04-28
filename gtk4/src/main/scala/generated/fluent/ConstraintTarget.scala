package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait ConstraintTarget:
  def getUnsafeRawPointer(): Ptr[Byte]
end ConstraintTarget

object ConstraintTarget:
  class Abstract(raw: Ptr[Byte]) extends ConstraintTarget:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end ConstraintTarget
