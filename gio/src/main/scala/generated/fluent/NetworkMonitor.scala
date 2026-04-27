package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait NetworkMonitor:
  def getUnsafeRawPointer(): Ptr[Byte]
end NetworkMonitor

object NetworkMonitor:
  class Abstract(raw: Ptr[Byte]) extends NetworkMonitor:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end NetworkMonitor
