package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait TreeSortable:
  def getUnsafeRawPointer(): Ptr[Byte]
end TreeSortable

object TreeSortable:
  class Abstract(raw: Ptr[Byte]) extends TreeSortable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end TreeSortable
