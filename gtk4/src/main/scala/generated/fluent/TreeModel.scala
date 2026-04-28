package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait TreeModel:
  def getUnsafeRawPointer(): Ptr[Byte]
end TreeModel

object TreeModel:
  class Abstract(raw: Ptr[Byte]) extends TreeModel:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end TreeModel
