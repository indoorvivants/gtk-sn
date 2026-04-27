package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait Seekable:
  def getUnsafeRawPointer(): Ptr[Byte]
end Seekable

object Seekable:
  class Abstract(raw: Ptr[Byte]) extends Seekable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Seekable
