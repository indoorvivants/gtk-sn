package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait ShortcutManager:
  def getUnsafeRawPointer(): Ptr[Byte]
end ShortcutManager

object ShortcutManager:
  class Abstract(raw: Ptr[Byte]) extends ShortcutManager:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end ShortcutManager
