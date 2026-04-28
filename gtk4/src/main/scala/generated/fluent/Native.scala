package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait Native:
  def getUnsafeRawPointer(): Ptr[Byte]
end Native

object Native:
  class Abstract(raw: Ptr[Byte]) extends Native:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Native
