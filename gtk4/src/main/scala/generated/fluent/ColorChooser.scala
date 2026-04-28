package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait ColorChooser:
  def getUnsafeRawPointer(): Ptr[Byte]
end ColorChooser

object ColorChooser:
  class Abstract(raw: Ptr[Byte]) extends ColorChooser:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end ColorChooser
