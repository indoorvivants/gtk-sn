package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait TreeDragSource:
  def getUnsafeRawPointer(): Ptr[Byte]
end TreeDragSource

object TreeDragSource:
  class Abstract(raw: Ptr[Byte]) extends TreeDragSource:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end TreeDragSource
