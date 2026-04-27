package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait DebugController:
  def getUnsafeRawPointer(): Ptr[Byte]
end DebugController

object DebugController:
  class Abstract(raw: Ptr[Byte]) extends DebugController:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DebugController
