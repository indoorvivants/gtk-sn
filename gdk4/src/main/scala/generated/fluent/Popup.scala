package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait Popup:
  def getUnsafeRawPointer(): Ptr[Byte]
end Popup

object Popup:
  class Abstract(raw: Ptr[Byte]) extends Popup:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Popup
