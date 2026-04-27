package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait PowerProfileMonitor:
  def getUnsafeRawPointer(): Ptr[Byte]
end PowerProfileMonitor

object PowerProfileMonitor:
  class Abstract(raw: Ptr[Byte]) extends PowerProfileMonitor:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end PowerProfileMonitor
