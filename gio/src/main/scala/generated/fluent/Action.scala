package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait Action:
  def getUnsafeRawPointer(): Ptr[Byte]
end Action

object Action:
  class Abstract(raw: Ptr[Byte]) extends Action:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Action
