package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait Accessible:
  def getUnsafeRawPointer(): Ptr[Byte]
end Accessible

object Accessible:
  class Abstract(raw: Ptr[Byte]) extends Accessible:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Accessible
