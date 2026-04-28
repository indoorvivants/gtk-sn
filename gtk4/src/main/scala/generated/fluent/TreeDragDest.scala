package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait TreeDragDest:
  def getUnsafeRawPointer(): Ptr[Byte]
end TreeDragDest

object TreeDragDest:
  class Abstract(raw: Ptr[Byte]) extends TreeDragDest:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end TreeDragDest
