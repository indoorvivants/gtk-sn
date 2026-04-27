package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait MemoryMonitor:
  def getUnsafeRawPointer(): Ptr[Byte]
end MemoryMonitor

object MemoryMonitor:
  class Abstract(raw: Ptr[Byte]) extends MemoryMonitor:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end MemoryMonitor
