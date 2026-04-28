package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait Paintable:
  def getUnsafeRawPointer(): Ptr[Byte]
end Paintable

object Paintable:
  class Abstract(raw: Ptr[Byte]) extends Paintable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Paintable
