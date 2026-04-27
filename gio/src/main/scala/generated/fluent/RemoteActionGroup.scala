package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait RemoteActionGroup:
  def getUnsafeRawPointer(): Ptr[Byte]
end RemoteActionGroup

object RemoteActionGroup:
  class Abstract(raw: Ptr[Byte]) extends RemoteActionGroup:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end RemoteActionGroup
