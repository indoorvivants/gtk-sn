package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait File:
  def getUnsafeRawPointer(): Ptr[Byte]
end File

object File:
  class Abstract(raw: Ptr[Byte]) extends File:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end File
