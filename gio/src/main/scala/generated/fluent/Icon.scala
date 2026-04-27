package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait Icon:
  def getUnsafeRawPointer(): Ptr[Byte]
end Icon

object Icon:
  class Abstract(raw: Ptr[Byte]) extends Icon:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Icon
