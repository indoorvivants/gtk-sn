package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait DesktopAppInfoLookup:
  def getUnsafeRawPointer(): Ptr[Byte]
end DesktopAppInfoLookup

object DesktopAppInfoLookup:
  class Abstract(raw: Ptr[Byte]) extends DesktopAppInfoLookup:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DesktopAppInfoLookup
