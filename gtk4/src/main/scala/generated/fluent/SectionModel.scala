package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait SectionModel:
  def getUnsafeRawPointer(): Ptr[Byte]
end SectionModel

object SectionModel:
  class Abstract(raw: Ptr[Byte]) extends SectionModel:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end SectionModel
