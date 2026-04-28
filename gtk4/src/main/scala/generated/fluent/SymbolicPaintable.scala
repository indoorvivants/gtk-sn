package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait SymbolicPaintable:
  def getUnsafeRawPointer(): Ptr[Byte]
end SymbolicPaintable

object SymbolicPaintable:
  class Abstract(raw: Ptr[Byte]) extends SymbolicPaintable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end SymbolicPaintable
