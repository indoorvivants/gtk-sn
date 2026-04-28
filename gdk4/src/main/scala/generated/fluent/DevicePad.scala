package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait DevicePad:
  def getUnsafeRawPointer(): Ptr[Byte]
end DevicePad

object DevicePad:
  class Abstract(raw: Ptr[Byte]) extends DevicePad:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DevicePad
