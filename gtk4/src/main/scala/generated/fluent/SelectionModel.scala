package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait SelectionModel:
  def getUnsafeRawPointer(): Ptr[Byte]
end SelectionModel

object SelectionModel:
  class Abstract(raw: Ptr[Byte]) extends SelectionModel:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end SelectionModel
