package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait ListModel:
  def getUnsafeRawPointer(): Ptr[Byte]
end ListModel

object ListModel:
  class Abstract(raw: Ptr[Byte]) extends ListModel:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end ListModel
