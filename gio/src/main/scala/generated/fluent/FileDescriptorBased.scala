package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait FileDescriptorBased:
  def getUnsafeRawPointer(): Ptr[Byte]
end FileDescriptorBased

object FileDescriptorBased:
  class Abstract(raw: Ptr[Byte]) extends FileDescriptorBased:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end FileDescriptorBased
