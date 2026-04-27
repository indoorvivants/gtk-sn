package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait Mount:
  def getUnsafeRawPointer(): Ptr[Byte]
end Mount

object Mount:
  class Abstract(raw: Ptr[Byte]) extends Mount:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Mount
