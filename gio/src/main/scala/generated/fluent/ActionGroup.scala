package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait ActionGroup:
  def getUnsafeRawPointer(): Ptr[Byte]
end ActionGroup

object ActionGroup:
  class Abstract(raw: Ptr[Byte]) extends ActionGroup:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end ActionGroup
