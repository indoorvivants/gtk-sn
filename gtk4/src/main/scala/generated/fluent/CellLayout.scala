package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait CellLayout:
  def getUnsafeRawPointer(): Ptr[Byte]
end CellLayout

object CellLayout:
  class Abstract(raw: Ptr[Byte]) extends CellLayout:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end CellLayout
