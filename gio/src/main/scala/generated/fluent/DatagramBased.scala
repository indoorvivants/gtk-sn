package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait DatagramBased:
  def getUnsafeRawPointer(): Ptr[Byte]
end DatagramBased

object DatagramBased:
  class Abstract(raw: Ptr[Byte]) extends DatagramBased:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DatagramBased
