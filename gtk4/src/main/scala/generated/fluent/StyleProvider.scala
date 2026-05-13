package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait StyleProvider:
  def getUnsafeRawPointer(): Ptr[Byte]
end StyleProvider

object StyleProvider:
  class Abstract(raw: Ptr[Byte]) extends StyleProvider:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end StyleProvider
