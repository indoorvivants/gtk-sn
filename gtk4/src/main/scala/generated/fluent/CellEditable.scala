package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait CellEditable:
  def getUnsafeRawPointer(): Ptr[Byte]
end CellEditable

object CellEditable:
  class Abstract(raw: Ptr[Byte]) extends CellEditable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end CellEditable
