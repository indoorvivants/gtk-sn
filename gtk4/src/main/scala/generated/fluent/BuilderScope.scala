package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait BuilderScope:
  def getUnsafeRawPointer(): Ptr[Byte]
end BuilderScope

object BuilderScope:
  class Abstract(raw: Ptr[Byte]) extends BuilderScope:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end BuilderScope
