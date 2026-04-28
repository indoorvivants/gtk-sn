package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait FileChooser:
  def getUnsafeRawPointer(): Ptr[Byte]
end FileChooser

object FileChooser:
  class Abstract(raw: Ptr[Byte]) extends FileChooser:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end FileChooser
