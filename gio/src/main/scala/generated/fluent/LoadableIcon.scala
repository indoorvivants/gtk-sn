package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait LoadableIcon:
  def getUnsafeRawPointer(): Ptr[Byte]
end LoadableIcon

object LoadableIcon:
  class Abstract(raw: Ptr[Byte]) extends LoadableIcon:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end LoadableIcon
