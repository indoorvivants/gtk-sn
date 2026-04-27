package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait DBusInterface:
  def getUnsafeRawPointer(): Ptr[Byte]
end DBusInterface

object DBusInterface:
  class Abstract(raw: Ptr[Byte]) extends DBusInterface:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DBusInterface
