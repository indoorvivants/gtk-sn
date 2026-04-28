package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait FontChooser:
  def getUnsafeRawPointer(): Ptr[Byte]
end FontChooser

object FontChooser:
  class Abstract(raw: Ptr[Byte]) extends FontChooser:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end FontChooser
