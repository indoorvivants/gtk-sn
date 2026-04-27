package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait AppInfo:
  def getUnsafeRawPointer(): Ptr[Byte]
end AppInfo

object AppInfo:
  class Abstract(raw: Ptr[Byte]) extends AppInfo:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end AppInfo
