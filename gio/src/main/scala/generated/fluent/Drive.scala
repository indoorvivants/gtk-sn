package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait Drive:
  def getUnsafeRawPointer(): Ptr[Byte]
end Drive

object Drive:
  class Abstract(raw: Ptr[Byte]) extends Drive:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Drive
