package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait Converter:
  def getUnsafeRawPointer(): Ptr[Byte]
end Converter

object Converter:
  class Abstract(raw: Ptr[Byte]) extends Converter:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Converter
