package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait DBusObjectManager:
  def getUnsafeRawPointer(): Ptr[Byte]
end DBusObjectManager

object DBusObjectManager:
  class Abstract(raw: Ptr[Byte]) extends DBusObjectManager:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DBusObjectManager
