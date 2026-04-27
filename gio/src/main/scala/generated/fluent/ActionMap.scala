package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait ActionMap:
  def getUnsafeRawPointer(): Ptr[Byte]
end ActionMap

object ActionMap:
  class Abstract(raw: Ptr[Byte]) extends ActionMap:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end ActionMap
